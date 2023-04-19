/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Gonçalves
 */
public class TelaPerg2 extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame1
     */
    public TelaPerg2() {
        initComponents();
        this.setTitle("Casa Aberta 2018");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOpcC = new javax.swing.JButton();
        btnOpcF = new javax.swing.JButton();
        btnOpcF2 = new javax.swing.JButton();
        lblPerg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 203, 203));

        btnOpcC.setBackground(new java.awt.Color(255, 255, 255));
        btnOpcC.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnOpcC.setText("Um tipo de memória RAM");
        btnOpcC.setFocusPainted(false);
        btnOpcC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcCActionPerformed(evt);
            }
        });

        btnOpcF.setBackground(new java.awt.Color(255, 255, 255));
        btnOpcF.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnOpcF.setText("Um tipo de processador");
        btnOpcF.setFocusPainted(false);
        btnOpcF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcFActionPerformed(evt);
            }
        });

        btnOpcF2.setBackground(new java.awt.Color(255, 255, 255));
        btnOpcF2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnOpcF2.setText("Um tipo de disco rígido");
        btnOpcF2.setFocusPainted(false);
        btnOpcF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcF2ActionPerformed(evt);
            }
        });

        lblPerg.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblPerg.setForeground(new java.awt.Color(0, 0, 0));
        lblPerg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerg.setText("O que é um SSD?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPerg, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOpcF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcC, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblPerg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnOpcC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOpcF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOpcF2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcF2ActionPerformed
///        
        JOptionPane.showMessageDialog(null, "Parabens, você acertou!");
        new TelaPerg3().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOpcF2ActionPerformed

    private void btnOpcFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcFActionPerformed
       
        JOptionPane.showMessageDialog(null, "Você errou :(");
        new TelaPerg3().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOpcFActionPerformed

    private void btnOpcCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcCActionPerformed

        JOptionPane.showMessageDialog(null, "Você errou :(");
        new TelaPerg3().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnOpcCActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPerg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerg2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerg2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpcC;
    private javax.swing.JButton btnOpcF;
    private javax.swing.JButton btnOpcF2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPerg;
    // End of variables declaration//GEN-END:variables
}
