/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Usuário
 */
public class telariangulo extends javax.swing.JFrame {

    /**
     * Creates new form telariangulo
     */
    public telariangulo() {
        initComponents();
        
        panRes.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sliA = new javax.swing.JSlider();
        sliB = new javax.swing.JSlider();
        sliC = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        panRes = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("classes/Bundle"); // NOI18N
        jLabel1.setText(bundle.getString("telariangulo.jLabel1.text")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText(bundle.getString("telariangulo.jLabel2.text")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 61, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("telariangulo.jLabel3.text")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 99, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText(bundle.getString("telariangulo.jLabel4.text")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 23, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText(bundle.getString("telariangulo.jLabel5.text")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 61, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText(bundle.getString("telariangulo.jLabel6.text")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 99, -1, -1));

        sliA.setMaximum(50);
        sliA.setValue(0);
        sliA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliAStateChanged(evt);
            }
        });
        getContentPane().add(sliA, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 32, 157, -1));

        sliB.setMaximum(50);
        sliB.setValue(0);
        sliB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliBStateChanged(evt);
            }
        });
        getContentPane().add(sliB, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 70, 156, -1));

        sliC.setMaximum(50);
        sliC.setValue(0);
        sliC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliCStateChanged(evt);
            }
        });
        getContentPane().add(sliC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 108, 158, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/triangulo_abc.png"))); // NOI18N
        jLabel7.setText(bundle.getString("telariangulo.jLabel7.text")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        lblA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblA.setForeground(new java.awt.Color(0, 51, 153));
        lblA.setText(bundle.getString("telariangulo.lblA.text")); // NOI18N
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        lblB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblB.setForeground(new java.awt.Color(0, 51, 153));
        lblB.setText(bundle.getString("telariangulo.lblB.text")); // NOI18N
        getContentPane().add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 20));

        lblC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblC.setForeground(new java.awt.Color(0, 51, 153));
        lblC.setText(bundle.getString("telariangulo.lblC.text")); // NOI18N
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatus.setText(bundle.getString("telariangulo.lblStatus.text")); // NOI18N

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipo.setText(bundle.getString("telariangulo.lblTipo.text")); // NOI18N

        javax.swing.GroupLayout panResLayout = new javax.swing.GroupLayout(panRes);
        panRes.setLayout(panResLayout);
        panResLayout.setHorizontalGroup(
            panResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResLayout.createSequentialGroup()
                .addGroup(panResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panResLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblTipo))
                    .addGroup(panResLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblStatus)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panResLayout.setVerticalGroup(
            panResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblStatus)
                .addGap(18, 18, 18)
                .addComponent(lblTipo)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(panRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 200, 150));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText(bundle.getString("telariangulo.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panRes.setVisible(true);
        
        int a = sliA.getValue();
        int b = sliB.getValue();
        int c = sliC.getValue();
        
        
        
        if(a<b+c && b<a+c && c<a+b){
            lblStatus.setText("Forma um triângulo!");
            if(a == b && b == c){
                lblTipo.setText("Equilátero");
            } else if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a)){
                lblTipo.setText("Isóceles");
            } else{
                lblTipo.setText("Escaleno");
            }
        } else {
            lblStatus.setText("Não é um triângulo...");
            lblTipo.setText("-");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sliAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliAStateChanged
        // TODO add your handling code here:
        lblA.setText(Integer.toString(sliA.getValue()));
    }//GEN-LAST:event_sliAStateChanged

    private void sliBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliBStateChanged
        // TODO add your handling code here:
        lblB.setText(Integer.toString(sliB.getValue()));
    }//GEN-LAST:event_sliBStateChanged

    private void sliCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliCStateChanged
        // TODO add your handling code here:
        lblC.setText(Integer.toString(sliC.getValue()));
    }//GEN-LAST:event_sliCStateChanged

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
            java.util.logging.Logger.getLogger(telariangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telariangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telariangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telariangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telariangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panRes;
    private javax.swing.JSlider sliA;
    private javax.swing.JSlider sliB;
    private javax.swing.JSlider sliC;
    // End of variables declaration//GEN-END:variables
}
