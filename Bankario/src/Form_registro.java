import java.awt.Color;
import  java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Form_registro extends javax.swing.JFrame {    
    ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("com/images/Logo.png"));

    public Form_registro() {
        initComponents();
        verificarConexion();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setIconImage(img.getImage());
            }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lb_iniciar_sesion = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_apellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txt_contrasenia = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setLocationByPlatform(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(80, 80, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("¿Ya tiene un usuario?");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 120, 20));

        lb_iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        lb_iniciar_sesion.setText("I̲n̲i̲c̲i̲a̲r̲ ̲s̲e̲s̲i̲ó̲n̲");
        lb_iniciar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_iniciar_sesion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lb_iniciar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_iniciar_sesionMouseClicked(evt);
            }
        });
        jPanel2.add(lb_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, 20));

        btn_registrar.setBackground(new java.awt.Color(36, 36, 36));
        btn_registrar.setForeground(new java.awt.Color(3, 23, 22));
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registrarMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registar usuario");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        btn_registrar.add(jLabel7);

        jPanel2.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 170, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear cuenta");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 180, 37));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/boton_limpiar.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 111, -1));

        txt_usuario.setBackground(new java.awt.Color(80, 80, 80));
        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_usuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 171, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 171, 9));

        txt_apellidos.setBackground(new java.awt.Color(80, 80, 80));
        txt_apellidos.setForeground(new java.awt.Color(204, 204, 204));
        txt_apellidos.setBorder(null);
        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });
        jPanel2.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 170, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 111, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 171, 9));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 111, -1));

        txt_correo.setBackground(new java.awt.Color(80, 80, 80));
        txt_correo.setForeground(new java.awt.Color(204, 204, 204));
        txt_correo.setToolTipText("");
        txt_correo.setBorder(null);
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 170, 20));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 171, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 111, -1));

        txt_contrasenia.setBackground(new java.awt.Color(80, 80, 80));
        txt_contrasenia.setForeground(new java.awt.Color(204, 204, 204));
        txt_contrasenia.setBorder(null);
        jPanel2.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 170, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 171, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 340, 360));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarConexion(){
        Connection conex = Conexion.conectar();
    }
        
    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private  void limpiar_campo(){
        txt_usuario.setText("");
        txt_correo.setText("");
        txt_contrasenia.setText("");
        txt_apellidos.setText("");
    }
    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void lb_iniciar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_iniciar_sesionMouseClicked
        // TODO add your handling code here:
        Form_inicio nuevoFormulario = new Form_inicio();
      
        nuevoFormulario.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lb_iniciar_sesionMouseClicked

    private void btn_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       //guardamos lo que contengan las cajas de texto
        String nom = txt_usuario.getText();
        String cor = txt_correo.getText();
        String con = txt_contrasenia.getText();
        if (!cor.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(this, "Formato de correo electrónico inválido","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String ape = txt_apellidos.getText();
        //verificamos campos vacios
        if (nom.isEmpty()  ||  cor.isEmpty() || con.isEmpty() || ape.isEmpty()){
            JOptionPane.showMessageDialog(this,"Todos los campos son obligatorios","Error",JOptionPane.ERROR_MESSAGE );
            return ;

        }
        //insercion de datos en ka base de datos
        Usuario usur = new Usuario();
        boolean status = usur.InsertUsuario(nom, ape, cor, con);

        //Avisamos status de insersion
        if(status){
            JOptionPane.showMessageDialog(this,"Usuario guardado","Exito",JOptionPane.INFORMATION_MESSAGE );

        }else{
            JOptionPane.showMessageDialog(this,"Usuario no guardado","Error",JOptionPane.ERROR_MESSAGE );

        }
        limpiar_campo();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseMoved

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged

    private void btn_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_registrarMouseEntered

    private void btn_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btn_registrarMouseExited

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_usuarioMouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        limpiar_campo();
    }//GEN-LAST:event_jLabel12MouseClicked

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lb_iniciar_sesion;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JPasswordField txt_contrasenia;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
