import java.awt.Color;
import  java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Form_registro extends javax.swing.JFrame {
    int xMouse, yMouse;
    
    public Form_registro() {
        initComponents();
        verificarConexion();
        //ImageIcon icono = new ImageIcon("C:/FPOO204/Bankario/src/Limpiar.png");

    // Asigna el ícono al botón
        //btn_limpiar.setIcon(icono);

    // Opcional: Ajusta la posición del texto e ícono
        //btn_limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        //btn_limpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_contrasenia = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lb_iniciar_sesion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btn_registrar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        bnt_cerrar = new javax.swing.JPanel();
        lb_cerrar = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setLocationByPlatform(true);
        setUndecorated(true);
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

        jLabel4.setText("Correo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 111, -1));

        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setText("Ingrese su nombre");
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
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 171, 20));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Registro de usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 314, 37));

        txt_correo.setForeground(new java.awt.Color(204, 204, 204));
        txt_correo.setText("Ingrese su correo");
        txt_correo.setToolTipText("");
        txt_correo.setBorder(null);
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 170, 20));

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 111, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 111, -1));

        txt_contrasenia.setForeground(new java.awt.Color(204, 204, 204));
        txt_contrasenia.setText("Ingrese su co");
        txt_contrasenia.setBorder(null);
        getContentPane().add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 170, 20));

        jLabel5.setText("Apellidos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 111, -1));

        txt_apellidos.setForeground(new java.awt.Color(204, 204, 204));
        txt_apellidos.setText("Ingrese sus apellidos");
        txt_apellidos.setBorder(null);
        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });
        getContentPane().add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 170, 20));

        jLabel6.setText("¿Ya tiene un usuario?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 120, 20));

        lb_iniciar_sesion.setText("I̲n̲i̲c̲i̲a̲r̲ ̲s̲e̲s̲i̲ó̲n̲");
        lb_iniciar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_iniciar_sesion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lb_iniciar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_iniciar_sesionMouseClicked(evt);
            }
        });
        getContentPane().add(lb_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 171, 9));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 171, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 171, 9));

        btn_registrar.setBackground(new java.awt.Color(3, 47, 48));
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

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registar usuario");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        btn_registrar.add(jLabel7);

        getContentPane().add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 120, -1));

        btn_limpiar.setBackground(new java.awt.Color(3, 47, 48));
        btn_limpiar.setForeground(new java.awt.Color(3, 23, 22));
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Limpiar");
        btn_limpiar.add(jLabel9);

        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 90, -1));

        bnt_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnt_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bnt_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bnt_cerrarMouseExited(evt);
            }
        });

        lb_cerrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lb_cerrar.setText("X");
        lb_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseEntered(evt);
            }
        });
        bnt_cerrar.add(lb_cerrar);

        getContentPane().add(bnt_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 30, 30));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 171, -1));

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

    private void btn_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseClicked
        limpiar_campo();
    }//GEN-LAST:event_btn_limpiarMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       //guardamos lo que contengan las cajas de texto
        String nom = txt_usuario.getText();
        String cor = txt_correo.getText();
        String con = txt_contrasenia.getText();
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

    private void lb_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lb_cerrarMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseMoved

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void lb_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseEntered
        // TODO add your handling code here:
        bnt_cerrar.setBackground(Color.red);
        lb_cerrar.setBackground(Color.white);
    }//GEN-LAST:event_lb_cerrarMouseEntered

    private void bnt_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_cerrarMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bnt_cerrarMouseEntered

    private void bnt_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_cerrarMouseExited
        // TODO add your handling code here:
        bnt_cerrar.setBackground(Color.white);
        lb_cerrar.setBackground(Color.black);
    }//GEN-LAST:event_bnt_cerrarMouseExited

    private void btn_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseEntered
        // TODO add your handling code here:
        btn_registrar.setBackground(new Color(0,64,60));
    }//GEN-LAST:event_btn_registrarMouseEntered

    private void btn_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseExited
        // TODO add your handling code here:
        btn_registrar.setBackground(new Color(3,47,48));
    }//GEN-LAST:event_btn_registrarMouseExited

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        // TODO add your handling code here:
        txt_usuario.setText("");
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMouseExited
        // TODO add your handling code here:
        txt_usuario.setText("Ingrese su nombre");
    }//GEN-LAST:event_txt_usuarioMouseExited

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bnt_cerrar;
    private javax.swing.JPanel btn_limpiar;
    private javax.swing.JPanel btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_iniciar_sesion;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JPasswordField txt_contrasenia;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
