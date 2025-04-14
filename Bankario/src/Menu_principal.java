
import javax.swing.ImageIcon;


public class Menu_principal extends javax.swing.JFrame {
    ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("com/images/Logo.png"));

    
    public Menu_principal() {
        initComponents();
        this.setResizable(false);
        this.dispose();
        this.setIconImage(img.getImage());
    }
    
    private int idUsuario; // Variable para almacenar el ID
    
    public Menu_principal(int idUsuario) {
        initComponents();
        // Guarda el ID para usarlo en otros métodos
        this.idUsuario = idUsuario;
    
    
        String nombre = new Usuario().obtener_nombre_completo(idUsuario);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_soporte_tecnico = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_simulacion = new javax.swing.JLabel();
        btn_actualizar_datos = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel4.setBackground(new java.awt.Color(80, 80, 80));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORO Y COMUNIDAD");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 420, 60));

        jPanel12.setBackground(new java.awt.Color(80, 80, 80));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ASESORAMIENTO");
        jPanel12.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 420, 60));

        btn_soporte_tecnico.setBackground(new java.awt.Color(80, 80, 80));
        btn_soporte_tecnico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_soporte_tecnico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_soporte_tecnicoMouseClicked(evt);
            }
        });
        btn_soporte_tecnico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("SOPORTE TECNICO");
        btn_soporte_tecnico.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        jPanel2.add(btn_soporte_tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 420, 60));

        jPanel5.setBackground(new java.awt.Color(80, 80, 80));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_simulacion.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn_simulacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_simulacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_simulacion.setText("SIMULACION");
        jPanel5.add(btn_simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 420, 60));

        btn_actualizar_datos.setBackground(new java.awt.Color(80, 80, 80));
        btn_actualizar_datos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizar_datosMouseClicked(evt);
            }
        });
        btn_actualizar_datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ACTUALIZAR DATOS");
        btn_actualizar_datos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        jPanel2.add(btn_actualizar_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 420, 60));

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CERRAR SESION");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, 420, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1510, 810));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/barra de busqueda.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("BANKario");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 59, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logo.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1505, 767));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
        
                
    
    
        
        
    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        Form_foro_y_comunidad nuevoFormulario = new Form_foro_y_comunidad(this.idUsuario);        
        nuevoFormulario.setVisible(true);      
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        Form_asesoramiento nuevoFormulario = new Form_asesoramiento(this.idUsuario);        
        nuevoFormulario.setVisible(true);      
        this.dispose();
    }//GEN-LAST:event_jPanel12MouseClicked

    private void btn_soporte_tecnicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_soporte_tecnicoMouseClicked
        Form_soporte nuevoFormulario = new Form_soporte(this.idUsuario);
        nuevoFormulario.setVisible(true);
        
        this.dispose();        this.dispose();    }//GEN-LAST:event_btn_soporte_tecnicoMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        Form_simulacion_tarjeta nuevoFormulario = new Form_simulacion_tarjeta(this.idUsuario);        
        nuevoFormulario.setVisible(true);       
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void btn_actualizar_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizar_datosMouseClicked
        Form_actualizar nuevoFormulario = new Form_actualizar(this.idUsuario);
        nuevoFormulario.setVisible(true);
                     this.dispose();    }//GEN-LAST:event_btn_actualizar_datosMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        Form_inicio nuevoFormulario = new Form_inicio();
        nuevoFormulario.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

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
    private javax.swing.JPanel btn_actualizar_datos;
    private javax.swing.JLabel btn_simulacion;
    private javax.swing.JPanel btn_soporte_tecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel txt_usuario;
    // End of variables declaration//GEN-END:variables
}
