/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author raquel
 */
public class Matematicos extends javax.swing.JFrame {

    /**
     * Creates new form Matematicos
     */
    public Matematicos() {
        initComponents();
        grupo.add(radioA);
        grupo.add(radioB);
        grupo.add(radioC);
        grupo.add(radioD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        radioD = new javax.swing.JRadioButton();
        radioC = new javax.swing.JRadioButton();
        radioB = new javax.swing.JRadioButton();
        radioA = new javax.swing.JRadioButton();
        jbnCon = new javax.swing.JButton();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matemáticos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 69));

        radioD.setText("Pitágoras");
        radioD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDActionPerformed(evt);
            }
        });
        getContentPane().add(radioD, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 150, 90, -1));

        radioC.setText("Baskhara");
        getContentPane().add(radioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 80, -1));

        radioB.setText("Carl Gauss");
        getContentPane().add(radioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        radioA.setText("Albert Einstein");
        getContentPane().add(radioA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jbnCon.setText("Comfirmar");
        jbnCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnConActionPerformed(evt);
            }
        });
        getContentPane().add(jbnCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDActionPerformed

    private void jbnConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnConActionPerformed

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
            java.util.logging.Logger.getLogger(Matematicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matematicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matematicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matematicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matematicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbnCon;
    private javax.swing.JRadioButton radioA;
    private javax.swing.JRadioButton radioB;
    private javax.swing.JRadioButton radioC;
    private javax.swing.JRadioButton radioD;
    // End of variables declaration//GEN-END:variables
}