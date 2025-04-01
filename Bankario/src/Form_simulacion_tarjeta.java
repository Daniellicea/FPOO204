
public class Form_simulacion_tarjeta extends javax.swing.JFrame {

    public Form_simulacion_tarjeta() {
        initComponents();
    }
    
    private int idUsuario;
    public Form_simulacion_tarjeta(int idUsuario) {
            initComponents();
            this.idUsuario = idUsuario;
            String nombre = new Usuario().obtenerNombreUsuario(idUsuario);
             txt_usuario.setText(nombre);             
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_usuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_cv = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_no_tarjeta = new javax.swing.JLabel();
        txt_titular = new javax.swing.JLabel();
        txt_fecha_vencimiento = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_realizar_retiro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        btn_crear = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logo.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("BANKario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1576, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        txt_usuario.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario.setText("Usuario");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Simulacion");

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel7.setText("CV:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 265, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/tarjeta_credito_letras.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 421, 270));

        txt_cv.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jPanel3.add(txt_cv, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, 40));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel16.setText("Titular:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/tarjeta_credito.png"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 421, 270));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel19.setText("No. tarjeta:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txt_no_tarjeta.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jPanel3.add(txt_no_tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 350, 40));

        txt_titular.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jPanel3.add(txt_titular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 430, 40));

        txt_fecha_vencimiento.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jPanel3.add(txt_fecha_vencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 180, 40));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel20.setText("Fecha de vencimiento:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¡Aprendamos a usar una tarjeta!");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 20, 1190, -1));

        jPanel4.setBackground(new java.awt.Color(36, 36, 36));

        btn_realizar_retiro.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn_realizar_retiro.setForeground(new java.awt.Color(242, 242, 242));
        btn_realizar_retiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_realizar_retiro.setText("Empezar simulacion");
        btn_realizar_retiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_realizar_retiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_realizar_retiroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_realizar_retiro, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_realizar_retiro, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 360, 60));

        jSeparator1.setForeground(new java.awt.Color(36, 36, 36));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 490, 10));

        jSeparator2.setForeground(new java.awt.Color(36, 36, 36));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 440, 10));

        jSeparator3.setForeground(new java.awt.Color(36, 36, 36));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 360, 10));

        jSeparator4.setForeground(new java.awt.Color(36, 36, 36));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 200, 10));

        jPanel5.setBackground(new java.awt.Color(36, 36, 36));

        btn_crear.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn_crear.setForeground(new java.awt.Color(242, 242, 242));
        btn_crear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_crear.setText("Crear tarjeta");
        btn_crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_crear, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_crear, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 260, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icono regreso.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Usuario:");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/barra de busqueda.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(112, 112, 112)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(5, 5, 5)
                .addComponent(txt_usuario)
                .addGap(285, 285, 285))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_usuario)
                                .addComponent(jLabel15))
                            .addComponent(jLabel17))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1410, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String generarNumeroTarjeta() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append((int) (Math.random() * 10));
            if ((i + 1) % 4 == 0 && i != 15) { // Formatear en bloques de 4
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    
    
    private String generarFechaVencimiento() {
        int mes = (int) (Math.random() * 12 + 1); // Mes entre 1 y 12
        int anio = (int) (Math.random() * 10 + 25); // Año entre 2025 y 2034
        return String.format("%02d/%02d", mes, anio);
    }
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Menu_principal nuevoFormulario = new Menu_principal(idUsuario);
        nuevoFormulario.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearMouseClicked
        // TODO add your handling code here:
        String numeroTarjeta = generarNumeroTarjeta();
        String cvv = String.valueOf((int) (Math.random() * 900 + 100)); // CVV de 3 dígitos
        
        Usuario usuario = new Usuario();
        String nombreUsuario = usuario.obtenerNombreUsuario(this.idUsuario);
        
        String fechaVencimiento = generarFechaVencimiento();

        // Asignar datos a las etiquetas
        txt_no_tarjeta.setText(numeroTarjeta);
        txt_cv.setText(cvv);
        txt_titular.setText(nombreUsuario);
        txt_fecha_vencimiento.setText(fechaVencimiento);
        
    }//GEN-LAST:event_btn_crearMouseClicked

    private void btn_realizar_retiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_realizar_retiroMouseClicked
        // TODO add your handling code here:
        Form_opciones_tarjeta nuevoFormulario = new Form_opciones_tarjeta(this.idUsuario);
        
        nuevoFormulario.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_realizar_retiroMouseClicked

    
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
            java.util.logging.Logger.getLogger(Form_simulacion_tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_simulacion_tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_simulacion_tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_simulacion_tarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_simulacion_tarjeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_crear;
    private javax.swing.JLabel btn_realizar_retiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel txt_cv;
    private javax.swing.JLabel txt_fecha_vencimiento;
    private javax.swing.JLabel txt_no_tarjeta;
    private javax.swing.JLabel txt_titular;
    private javax.swing.JLabel txt_usuario;
    // End of variables declaration//GEN-END:variables
}
