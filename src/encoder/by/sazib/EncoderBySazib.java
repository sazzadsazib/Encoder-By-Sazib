/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encoder.by.sazib;

/**
 *
 * @author Sazib
 */
public class EncoderBySazib extends javax.swing.JFrame {

    /**
     * Creates new form EncoderBySazib
     */
    public EncoderBySazib() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        decode = new javax.swing.JButton();
        encode = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(692, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        decode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encoder/by/sazib/decodebutton.png"))); // NOI18N
        decode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeActionPerformed(evt);
            }
        });
        getContentPane().add(decode);
        decode.setBounds(500, 310, 150, 40);

        encode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encoder/by/sazib/encodebutton.png"))); // NOI18N
        encode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeActionPerformed(evt);
            }
        });
        getContentPane().add(encode);
        encode.setBounds(500, 210, 150, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encoder/by/sazib/clickdecode.png"))); // NOI18N
        jLabel2.setText("   ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 240, 309, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encoder/by/sazib/clickencode.png"))); // NOI18N
        jLabel1.setText("  ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 150, 302, 66);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encoder/by/sazib/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 700, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeActionPerformed
         encoderrr e=new encoderrr();
         e.setVisible(true);
         dispose();
    }//GEN-LAST:event_encodeActionPerformed

    private void decodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeActionPerformed
            decoderr d=new decoderr();
            d.setVisible(true);
            dispose();
    }//GEN-LAST:event_decodeActionPerformed

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
            java.util.logging.Logger.getLogger(EncoderBySazib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncoderBySazib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncoderBySazib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncoderBySazib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncoderBySazib().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decode;
    private javax.swing.JButton encode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}