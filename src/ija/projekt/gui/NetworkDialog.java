/**
 * IJA - projekt 2013
 * soubor: NetworkDialog.java
 * Dialog pro vytvoreni sitove hry
 * 
 * Autori:
 *         @author Michal Dobes (xdobes13)
 *         @author Jan Kalina   (xkalin03)
 */

package ija.projekt.gui;
import ija.projekt.base.*;
import ija.projekt.network.*;

/**
 * Dialog pro zahájení síťové hry
 * @author Jan Kalina <xkalin03@stud.fit.vutbr.cz>
 * @author Michal Dobes <xdobes13@stud.fit.vutbr.cz>
 */
public class NetworkDialog extends javax.swing.JDialog {
    
    private NetConnect netconnect;
    private Desk mydesk;
    
    /**
     * Konstruktor dialogu
     * @param parent Rodičovské okno dialogu
     * @param modal Zdali je dialog modální
     * @param desk Hrací plocha (pro NetConnect)
     */
    public NetworkDialog(java.awt.Frame parent, boolean modal, Desk desk) {
        super(parent, modal);
        netconnect = new NetConnect(desk,this);
        initComponents();
        this.mydesk = desk;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonConnect1 = new javax.swing.JButton();
        RG_color = new javax.swing.ButtonGroup();
        textInPort = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textOutHost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textOutPort = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        buttonConnect = new javax.swing.JButton();
        buttonAllow = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        RB_white = new javax.swing.JRadioButton();
        rb_black = new javax.swing.JRadioButton();

        buttonConnect1.setText("Připojit");
        buttonConnect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConnect1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textInPort.setText("1234");

        jLabel1.setText("Port:");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel2.setText("Umožnit připojení jiného hráče k této šachovnici");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel3.setText("Připojit se k jinému hráči");

        textOutHost.setText("localhost");

        jLabel4.setText("Počítač:");

        textOutPort.setText("1234");

        jLabel5.setText("Port:");

        buttonConnect.setText("Připojit");
        buttonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConnectActionPerformed(evt);
            }
        });

        buttonAllow.setText("Umožnit připojení");
        buttonAllow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAllowActionPerformed(evt);
            }
        });

        jLabel6.setText("Místní hráč má");

        RG_color.add(RB_white);
        RB_white.setSelected(true);
        RB_white.setText("bílé");

        RG_color.add(rb_black);
        rb_black.setText("černé");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(textInPort, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textOutPort, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textOutHost, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RB_white)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_black)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAllow)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textInPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RB_white)
                    .addComponent(rb_black)
                    .addComponent(buttonAllow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textOutHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textOutPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConnect))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConnectActionPerformed
        netconnect.startClient(textOutHost.getText(),Integer.parseInt(textOutPort.getText()));
    }//GEN-LAST:event_buttonConnectActionPerformed

    private void buttonConnect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConnect1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonConnect1ActionPerformed

    private void buttonAllowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAllowActionPerformed
        buttonAllow.setEnabled(false);
        buttonConnect.setEnabled(false);
        netconnect.startServerThread(Integer.parseInt(textInPort.getText()), RB_white.isSelected());
    }//GEN-LAST:event_buttonAllowActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RB_white;
    private javax.swing.ButtonGroup RG_color;
    private javax.swing.JButton buttonAllow;
    private javax.swing.JButton buttonConnect;
    private javax.swing.JButton buttonConnect1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rb_black;
    private javax.swing.JTextField textInPort;
    private javax.swing.JTextField textOutHost;
    private javax.swing.JTextField textOutPort;
    // End of variables declaration//GEN-END:variables
}
