package ac.rs.singidunum.kriptologija2;

import ac.rs.singidunum.kriptologija2.ciphers.AES;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.telnet.TelnetClient;
import org.apache.commons.net.telnet.TelnetNotificationHandler;
import org.apache.commons.net.telnet.EchoOptionHandler;
import org.apache.commons.net.telnet.TerminalTypeOptionHandler;
import org.apache.commons.net.telnet.SuppressGAOptionHandler;
import org.apache.commons.net.telnet.InvalidTelnetOptionException;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Telnet implements Runnable, TelnetNotificationHandler {

    private static TelnetClient tc = null;

    public void start() throws IOException {
        FileOutputStream fout = null;

        String remoteip = JOptionPane.showInputDialog("Enter IP address", "localhost");

        String remoteportStr = JOptionPane.showInputDialog("Enter port");

        int remoteport = Integer.parseInt(remoteportStr);

        try {
            fout = new FileOutputStream("spy.log", true);
        } catch (FileNotFoundException e) {
            System.err.println(
                    "Exception while opening the spy file: "
                    + e.getMessage());
        }

        tc = new TelnetClient();

        TerminalTypeOptionHandler ttopt = new TerminalTypeOptionHandler("VT100", false, false, true, false);
        EchoOptionHandler echoopt = new EchoOptionHandler(true, false, true, false);
        SuppressGAOptionHandler gaopt = new SuppressGAOptionHandler(true, true, true, true);

        try {
            tc.addOptionHandler(ttopt);
            tc.addOptionHandler(echoopt);
            tc.addOptionHandler(gaopt);
        } catch (InvalidTelnetOptionException e) {
            System.err.println("Error registering option handlers: " + e.getMessage());
        }

        while (true) {
            boolean end_loop = false;
            try {
                tc.connect(remoteip, remoteport);

                Thread reader = new Thread(new Telnet());
                tc.registerNotifHandler(new Telnet());
                System.out.println("Welcome to Telnet Client");
                System.out.println("");

                reader.start();
                OutputStream outstr = tc.getOutputStream();

                byte[] buff = new byte[1024];
                int ret_read = 0;

                do {
                    try {
                        ret_read = System.in.read(buff);
                        //ret_read = System.in.read();
                        if (ret_read > 0) {
                            if (new String(buff, 0, ret_read).equals("quit\n")) {
                                outstr.write(buff, 0, ret_read);
                                outstr.flush();
                                System.out.println("Disconnected...");
                                end_loop = true;
                                return;
                            } else {
                                try {
                                    outstr.write(buff, 0, ret_read);

                                    outstr.flush();
                                } catch (IOException e) {
                                    end_loop = true;
                                } catch (Exception ex) {
                                    Logger.getLogger(Telnet.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }

                    } catch (IOException e) {
                        System.err.println("Exception while reading keyboard:" + e.getMessage());
                        end_loop = true;
                    }
                } while ((ret_read > 0) && (end_loop == false));

                try {
                    tc.disconnect();
                } catch (IOException e) {
                    System.err.println("Exception while connecting:" + e.getMessage());
                }
            } catch (IOException e) {
                System.err.println("Exception while connecting:" + e.getMessage());
                System.exit(1);
            }
        }
    }

    /**
     * *
     * Callback method called when TelnetClient receives an option negotiation
     * command.
     * <p>
     * @param negotiation_code - type of negotiation command received
     * (RECEIVED_DO, RECEIVED_DONT, RECEIVED_WILL, RECEIVED_WONT)
     * <p>
     * @param option_code - code of the option negotiated
     * <p>
     **
     */
    @Override
    public void receivedNegotiation(int negotiation_code, int option_code) {
        String command = null;
        switch (negotiation_code) {
            case TelnetNotificationHandler.RECEIVED_DO:
                command = "DO";
                break;
            case TelnetNotificationHandler.RECEIVED_DONT:
                command = "DONT";
                break;
            case TelnetNotificationHandler.RECEIVED_WILL:
                command = "WILL";
                break;
            case TelnetNotificationHandler.RECEIVED_WONT:
                command = "WONT";
                break;
            default:
                break;
        }
        System.out.println("Received " + command + " for option code " + option_code);
    }

    /**
     * *
     * Reader thread. Reads lines from the TelnetClient and echoes them on the
     * screen. *
     */
    @Override
    public void run() {
        InputStream instr = tc.getInputStream();
        try {
            byte[] k = instr.readNBytes(32);
            byte[] iv = instr.readNBytes(16);
            AES.setKEY(k);
            AES.setIV(iv);
            System.out.println("KEY " + Arrays.toString(AES.getKEY()));
            System.out.println("IV " + Arrays.toString(AES.getIV()));
            System.out.println();
        } catch (IOException ex) {
            Logger.getLogger(Telnet.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            byte[] buff = new byte[1024];
            int ret_read = 0;
            do {
                ret_read = instr.read(buff);
                if (ret_read > 0) {
                    String encrString = new String(buff, 0, ret_read, "UTF-8");
                    System.out.println(encrString);
                    //byte[] decr = AES.decrypt(encrString.getBytes("UTF-8"));
                    //System.out.print(new String(decr));
                }
            } while (ret_read >= 0);
        } catch (IOException e) {
            System.err.println("Exception while reading socket:" + e.getMessage());
        }

        try {
            tc.disconnect();
        } catch (IOException e) {
            System.err.println("Exception while closing telnet:" + e.getMessage());
        }

    }
}
