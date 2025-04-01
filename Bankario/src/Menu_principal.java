
public class Menu_principal extends javax.swing.JFrame {

    
    public Menu_principal() {
        initComponents();
    }
    
    private int idUsuario; // Variable para almacenar el ID
    
    public Menu_principal(int idUsuario) {
        initComponents();
        // Guarda el ID para usarlo en otros métodos
        this.idUsuario = idUsuario;
    
    
        String nombre = new Usuario().obtenerNombreUsuario(idUsuario);
        txt_usuario.setText(nombre);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Lb_usuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_actualizar = new javax.swing.JButton();
        btn_foro_y_comunidad = new javax.swing.JButton();
        btn_asesoramiento = new javax.swing.JButton();
        btn_soporte_tecnico = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_simulacion_tarjeta1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1452, 39, -1, -1));

        Lb_usuario.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        getContentPane().add(Lb_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1397, 45, -1, -1));

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 14, -1, -1));

        txt_usuario.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario.setText("Usuario");
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 50, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_actualizar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn_actualizar.setText("Actualizar datos");
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 417, -1));

        btn_foro_y_comunidad.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn_foro_y_comunidad.setText("Foro y comunidad");
        btn_foro_y_comunidad.setBorder(null);
        btn_foro_y_comunidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_foro_y_comunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_foro_y_comunidadActionPerformed(evt);
            }
        });
        jPanel2.add(btn_foro_y_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 417, -1));

        btn_asesoramiento.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn_asesoramiento.setText("Asesoramiento");
        btn_asesoramiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_asesoramiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asesoramientoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_asesoramiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 417, -1));

        btn_soporte_tecnico.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn_soporte_tecnico.setText("Soporte técnico");
        btn_soporte_tecnico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_soporte_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_soporte_tecnicoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_soporte_tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 417, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel7.setText("¿Que aprenderemos hoy?");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel9.setText("¿Sabias que?....");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 60, 303, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setText("La bolsa de valores surgió ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 143, 303, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setText("de la Revolución Francesa");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 237, 303, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setText("hace 400 años, después");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 183, 303, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, 670));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Imagen_menu.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        btn_simulacion_tarjeta1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn_simulacion_tarjeta1.setText("Simulación de tarjeta");
        btn_simulacion_tarjeta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_simulacion_tarjeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simulacion_tarjeta1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_simulacion_tarjeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 417, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1510, 810));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 30, 80, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/barra de busqueda.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("BANKario");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 59, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logo.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1505, 767));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_soporte_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_soporte_tecnicoActionPerformed
        // TODO add your handling code here:
        Form_soporte nuevoFormulario = new Form_soporte(this.idUsuario);
        nuevoFormulario.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_soporte_tecnicoActionPerformed
    
    private void btn_asesoramientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asesoramientoActionPerformed
        // TODO add your handling code here:
        Form_asesoramiento nuevoFormulario = new Form_asesoramiento(this.idUsuario);
        nuevoFormulario.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_asesoramientoActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        Form_actualizar nuevoFormulario = new Form_actualizar(this.idUsuario);
        nuevoFormulario.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_foro_y_comunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_foro_y_comunidadActionPerformed
        // TODO add your handling code here
        Form_foro_y_comunidad nuevoFormulario = new Form_foro_y_comunidad(this.idUsuario);
        
        nuevoFormulario.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_foro_y_comunidadActionPerformed

    private void btn_simulacion_tarjeta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simulacion_tarjeta1ActionPerformed
        // TODO add your handling code here:
        Form_simulacion_tarjeta nuevoFormulario = new Form_simulacion_tarjeta(this.idUsuario);
        
        nuevoFormulario.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_simulacion_tarjeta1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_usuario;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_asesoramiento;
    private javax.swing.JButton btn_foro_y_comunidad;
    private javax.swing.JButton btn_simulacion_tarjeta1;
    private javax.swing.JButton btn_soporte_tecnico;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txt_usuario;
    // End of variables declaration//GEN-END:variables
}
