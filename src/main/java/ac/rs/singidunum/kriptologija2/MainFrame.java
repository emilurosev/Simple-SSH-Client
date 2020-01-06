/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.rs.singidunum.kriptologija2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emil
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private KeyGen keyGen = null;
    private KeyExchange keyExchange = null;
    private Shell shell = null;
    private UserAuthPubKey userAuthPubKey = null;
    private Sftp sftp = null;
    private Terminal terminal = null;

    public MainFrame() {
        initComponents();

        keyGen = new KeyGen();
        keyExchange = new KeyExchange();
        shell = new Shell();
        userAuthPubKey = new UserAuthPubKey();
        sftp = new Sftp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonShell = new javax.swing.JButton();
        jButtonUserAuthPubKey = new javax.swing.JButton();
        jButtonSftp = new javax.swing.JButton();
        jButtonKeyGen = new javax.swing.JButton();
        jButtonKeyExchange = new javax.swing.JButton();
        jButtonPermissions = new javax.swing.JButton();
        jButtonConfig = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jButtonTelnet = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuEdit = new javax.swing.JMenu();
        jMenuTools = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenu();
        jMenuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple SSH Client by Emil Urosev");

        jButtonShell.setText("SSH with password authentication");
        jButtonShell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShellActionPerformed(evt);
            }
        });

        jButtonUserAuthPubKey.setText("SSH with digital signature authentication");
        jButtonUserAuthPubKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserAuthPubKeyActionPerformed(evt);
            }
        });

        jButtonSftp.setText("SFTP with digital signature authentication");
        jButtonSftp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSftpActionPerformed(evt);
            }
        });

        jButtonKeyGen.setText("Generate auth asymmetric key pair");
        jButtonKeyGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeyGenActionPerformed(evt);
            }
        });

        jButtonKeyExchange.setText("Exchange public authentication key");
        jButtonKeyExchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeyExchangeActionPerformed(evt);
            }
        });

        jButtonPermissions.setText("Set correct permissions");
        jButtonPermissions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPermissionsActionPerformed(evt);
            }
        });

        jButtonConfig.setText("Set security configuration");

        jLabel1.setText("Connection status:");

        jLabelStatus.setText("Not connected!");

        jButtonTelnet.setText("Telnet with AES");
        jButtonTelnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelnetActionPerformed(evt);
            }
        });

        jMenuFile.setText("File");
        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Edit");
        jMenuBar1.add(jMenuEdit);

        jMenuTools.setText("Tools");
        jMenuBar1.add(jMenuTools);

        jMenuAbout.setText("About");
        jMenuBar1.add(jMenuAbout);

        jMenuHelp.setText("Help");
        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonShell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUserAuthPubKey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSftp, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(jButtonKeyGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonKeyExchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPermissions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelStatus))
                    .addComponent(jButtonTelnet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonShell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUserAuthPubKey)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSftp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonKeyGen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonKeyExchange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPermissions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTelnet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShellActionPerformed
        shell.shell();
        if (shell.isConnected()) {
            jLabelStatus.setText("Connected!");
        }
    }//GEN-LAST:event_jButtonShellActionPerformed

    private void jButtonUserAuthPubKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserAuthPubKeyActionPerformed
        userAuthPubKey.authPubKey();
        if (userAuthPubKey.isConnected()) {
            jLabelStatus.setText("Connected!");
        }
    }//GEN-LAST:event_jButtonUserAuthPubKeyActionPerformed

    private void jButtonSftpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSftpActionPerformed
        sftp.connect();
    }//GEN-LAST:event_jButtonSftpActionPerformed

    private void jButtonKeyGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeyGenActionPerformed
        keyGen.generate();
    }//GEN-LAST:event_jButtonKeyGenActionPerformed

    private void jButtonKeyExchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeyExchangeActionPerformed
        keyExchange.exchange();
    }//GEN-LAST:event_jButtonKeyExchangeActionPerformed

    private void jButtonPermissionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPermissionsActionPerformed
        Permissions.setPermissions();
    }//GEN-LAST:event_jButtonPermissionsActionPerformed

    private void jButtonTelnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelnetActionPerformed
        try {
            Telnet telnet = new Telnet();
            telnet.start();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonTelnetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        MainFrame mainFrame = new MainFrame();

        mainFrame.getRootPane().requestFocus();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setResizable(false);
                mainFrame.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfig;
    private javax.swing.JButton jButtonKeyExchange;
    private javax.swing.JButton jButtonKeyGen;
    private javax.swing.JButton jButtonPermissions;
    private javax.swing.JButton jButtonSftp;
    private javax.swing.JButton jButtonShell;
    private javax.swing.JButton jButtonTelnet;
    private javax.swing.JButton jButtonUserAuthPubKey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenu jMenuTools;
    // End of variables declaration//GEN-END:variables
}
