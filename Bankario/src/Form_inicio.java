
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Form_inicio extends javax.swing.JFrame {

    ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("com/images/Logo.png"));
    
    public Form_inicio() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setIconImage(img.getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        lb_correo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_contrasenia = new javax.swing.JPasswordField();
        lb_olvido_contraseña = new javax.swing.JLabel();
        btn_iniciar_sesion = new javax.swing.JPanel();
        lb_iniciar_sesion = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 36, 36));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(857, 411, -1, -1));

        jPanel4.setBackground(new java.awt.Color(36, 36, 36));
        jPanel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo grande.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 272, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BANKario");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 230, -1));

        jPanel5.setBackground(new java.awt.Color(80, 80, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 171, 9));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 171, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIO DE ");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SESION");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        txt_correo.setBackground(new java.awt.Color(80, 80, 80));
        txt_correo.setForeground(new java.awt.Color(255, 255, 255));
        txt_correo.setBorder(null);
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        jPanel5.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 140, 190, 20));

        lb_correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_correo.setForeground(new java.awt.Color(255, 255, 255));
        lb_correo.setText("Ingrese su correo");
        jPanel5.add(lb_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese su contraseña");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        txt_contrasenia.setBackground(new java.awt.Color(80, 80, 80));
        txt_contrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txt_contrasenia.setBorder(null);
        txt_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseniaActionPerformed(evt);
            }
        });
        jPanel5.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 211, 20));

        lb_olvido_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        lb_olvido_contraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_olvido_contraseña.setText("¿Olvidaste tu contraseña?");
        lb_olvido_contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_olvido_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_olvido_contraseñaMouseClicked(evt);
            }
        });
        jPanel5.add(lb_olvido_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 220, -1));

        btn_iniciar_sesion.setBackground(new java.awt.Color(36, 36, 36));
        btn_iniciar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciar_sesionMouseClicked(evt);
            }
        });

        lb_iniciar_sesion.setBackground(new java.awt.Color(255, 255, 255));
        lb_iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        lb_iniciar_sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_iniciar_sesion.setText("Iniciar sesion");

        javax.swing.GroupLayout btn_iniciar_sesionLayout = new javax.swing.GroupLayout(btn_iniciar_sesion);
        btn_iniciar_sesion.setLayout(btn_iniciar_sesionLayout);
        btn_iniciar_sesionLayout.setHorizontalGroup(
            btn_iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_iniciar_sesion, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btn_iniciar_sesionLayout.setVerticalGroup(
            btn_iniciar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_iniciar_sesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(btn_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, 30));

        btn_registrar.setBackground(new java.awt.Color(36, 36, 36));
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registar Usuario");

        javax.swing.GroupLayout btn_registrarLayout = new javax.swing.GroupLayout(btn_registrar);
        btn_registrar.setLayout(btn_registrarLayout);
        btn_registrarLayout.setHorizontalGroup(
            btn_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_registrarLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        btn_registrarLayout.setVerticalGroup(
            btn_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_registrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 100, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 40, 340, 320));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 860, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseniaActionPerformed
        

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void lb_olvido_contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_olvido_contraseñaMouseClicked
        Form_olvido_contraseña menu = new Form_olvido_contraseña();
        menu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_lb_olvido_contraseñaMouseClicked

    private void btn_iniciar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciar_sesionMouseClicked
        String cor = txt_correo.getText();
        String con = new String(txt_contrasenia.getPassword());
        
        if (!cor.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(this, "Formato de correo electrónico inválido","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //verificamos campos vacios
        if (cor.isEmpty() || con.isEmpty()){
            JOptionPane.showMessageDialog(this,"Todos los campos son obligatorios","Error",JOptionPane.ERROR_MESSAGE );
            return ;       
    }//GEN-LAST:event_btn_iniciar_sesionMouseClicked
       try {        
        Usuario usuario = new Usuario();
        
        boolean credencialesValidas = usuario.verificar_inicio_sesion(cor, con);
        
        if (credencialesValidas) {            
            int idUsuario = usuario.obtener_id_usuario(cor);
            
            if (idUsuario > 0) {                
                
                Menu_principal menu = new Menu_principal( idUsuario);
                menu.setVisible(true);
                this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this,"Error al obtener ID de usuario","Error",JOptionPane.ERROR_MESSAGE);
                }
        } else {
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }        
    }
    private void btn_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseClicked
        // TODO add your handling code here:
        Form_registro nuevoFormulario = new Form_registro();
        nuevoFormulario.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_registrarMouseClicked
        
        
        
    public static void main(String args[]) {
    
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_iniciar_sesion;
    private javax.swing.JPanel btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lb_correo;
    private javax.swing.JLabel lb_iniciar_sesion;
    private javax.swing.JLabel lb_olvido_contraseña;
    private javax.swing.JPasswordField txt_contrasenia;
    private javax.swing.JTextField txt_correo;
    // End of variables declaration//GEN-END:variables
}
