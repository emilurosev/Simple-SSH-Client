/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.rs.singidunum.kriptologija2;

import java.io.PrintStream;

/**
 *
 * @author emil
 */
public class Terminal extends javax.swing.JPanel {

    /**
     * Creates new form Terminal
     */
    public Terminal() {
        initComponents();

        jTextAreaTerminal.setEditable(false);
        /*
        TextAreaOutputStream taos = new TextAreaOutputStream(jTextAreaTerminal);
        PrintStream out = new PrintStream(taos);
        System.setOut(out);
        System.setErr(out);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTerminal = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButtonEnter = new javax.swing.JButton();
        jButtonDisconnect = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        jTextAreaTerminal.setColumns(20);
        jTextAreaTerminal.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTerminal);

        jButtonEnter.setText("Enter");

        jButtonDisconnect.setText("Disconnect");

        jButtonClear.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEnter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDisconnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClear)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEnter)
                    .addComponent(jButtonDisconnect)
                    .addComponent(jButtonClear))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDisconnect;
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTerminal;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
