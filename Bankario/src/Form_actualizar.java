
import javax.swing.JOptionPane;


public class Form_actualizar extends javax.swing.JFrame {
    
    private Usuario usuario;
    public Form_actualizar() {
        initComponents();
        usuario =  new Usuario();
       
        
    }
       private int idUsuario;
    
    public Form_actualizar(int idUsuario) {
        initComponents();
        this.idUsuario = idUsuario;
        this.usuario = new Usuario();
        
        String datos = new Usuario().cargarDatosUsuario(idUsuario);
        if(datos != null) {
             String[] partes = datos.split("\\|\\|\\|");
                txt_actualizar_nombre.setText(partes[0]);
                txt_actualizar_apellidos.setText(partes[1]);
                txt_actualizar_correo.setText(partes[2]);
                txt_actualizar_contrasenia.setText(partes[3]);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_actualizar_nombre = new javax.swing.JTextField();
        txt_actualizar_correo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txt_actualizar_apellidos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_actualizar_contrasenia = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icono regreso.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(80, 80, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 171, 9));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 171, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Actualizar");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 340, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Datos");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 340, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 60, 30));

        btn_registrar.setBackground(new java.awt.Color(36, 36, 36));
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Actualizar");

        javax.swing.GroupLayout btn_registrarLayout = new javax.swing.GroupLayout(btn_registrar);
        btn_registrar.setLayout(btn_registrarLayout);
        btn_registrarLayout.setHorizontalGroup(
            btn_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_registrarLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        btn_registrarLayout.setVerticalGroup(
            btn_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_registrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 160, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contraseña:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 80, 30));

        txt_actualizar_nombre.setBackground(new java.awt.Color(80, 80, 80));
        txt_actualizar_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_actualizar_nombre.setBorder(null);
        txt_actualizar_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_actualizar_nombreActionPerformed(evt);
            }
        });
        jPanel5.add(txt_actualizar_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 170, 20));

        txt_actualizar_correo.setBackground(new java.awt.Color(80, 80, 80));
        txt_actualizar_correo.setForeground(new java.awt.Color(255, 255, 255));
        txt_actualizar_correo.setBorder(null);
        jPanel5.add(txt_actualizar_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 170, 20));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 171, -1));

        txt_actualizar_apellidos.setBackground(new java.awt.Color(80, 80, 80));
        txt_actualizar_apellidos.setForeground(new java.awt.Color(255, 255, 255));
        txt_actualizar_apellidos.setBorder(null);
        jPanel5.add(txt_actualizar_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 170, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Apellidos:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        txt_actualizar_contrasenia.setBackground(new java.awt.Color(80, 80, 80));
        txt_actualizar_contrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txt_actualizar_contrasenia.setBorder(null);
        jPanel5.add(txt_actualizar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 170, 20));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 171, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Correo:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 200, 50, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_actualizar_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_actualizar_nombreActionPerformed
    }//GEN-LAST:event_txt_actualizar_nombreActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Menu_principal nuevoFormulario = new Menu_principal(idUsuario);
        nuevoFormulario.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarMouseClicked
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea actualizar los datos?", "Confirmar actualización",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE
        );
        if(opcion == JOptionPane.YES_OPTION){
            if (!txt_actualizar_nombre.getText().isEmpty()&&!txt_actualizar_correo.getText().isEmpty()&&!txt_actualizar_contrasenia.getText().isEmpty()){
                boolean rs = usuario.actualizar_datos(this.idUsuario, txt_actualizar_nombre.getText(), txt_actualizar_apellidos.getText(), txt_actualizar_correo.getText(), txt_actualizar_contrasenia.getText());
                JOptionPane.showMessageDialog(this, "Actializacion exitosa","Actualizar",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Los campos no deben estar vacios","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Actualizacion no exitosa","Actualizar",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_registrarMouseClicked

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_actualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_registrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txt_actualizar_apellidos;
    private javax.swing.JTextField txt_actualizar_contrasenia;
    private javax.swing.JTextField txt_actualizar_correo;
    private javax.swing.JTextField txt_actualizar_nombre;
    // End of variables declaration//GEN-END:variables
}
