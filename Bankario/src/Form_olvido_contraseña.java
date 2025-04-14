
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Form_olvido_contraseña extends javax.swing.JFrame {
    ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("com/images/Logo.png"));
    private Usuario usuario;

    public Form_olvido_contraseña() {
        usuario =  new Usuario();
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setIconImage(img.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_consultar_contraseña = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_consultar_correo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txt_contrasenia = new javax.swing.JTextField();

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
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, 9));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Recuperar");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 320, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("contraseña");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrse su correo:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 40));

        btn_consultar_contraseña.setBackground(new java.awt.Color(36, 36, 36));
        btn_consultar_contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_consultar_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_consultar_contraseñaMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Consultar contraseña");

        javax.swing.GroupLayout btn_consultar_contraseñaLayout = new javax.swing.GroupLayout(btn_consultar_contraseña);
        btn_consultar_contraseña.setLayout(btn_consultar_contraseñaLayout);
        btn_consultar_contraseñaLayout.setHorizontalGroup(
            btn_consultar_contraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_consultar_contraseñaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_consultar_contraseñaLayout.setVerticalGroup(
            btn_consultar_contraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_consultar_contraseñaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(btn_consultar_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 160, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contraseña:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 20));

        txt_consultar_correo.setBackground(new java.awt.Color(80, 80, 80));
        txt_consultar_correo.setForeground(new java.awt.Color(255, 255, 255));
        txt_consultar_correo.setBorder(null);
        jPanel5.add(txt_consultar_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 150, 20));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 180, 10));

        txt_contrasenia.setBackground(new java.awt.Color(80, 80, 80));
        txt_contrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txt_contrasenia.setBorder(null);
        jPanel5.add(txt_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 180, 20));

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
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Form_inicio nuevoFormulario = new Form_inicio();
        nuevoFormulario.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_consultar_contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consultar_contraseñaMouseClicked
       if (!txt_consultar_correo.getText().isEmpty()){
            try {
                String contrasenia = usuario.obtener_contrasenia(txt_consultar_correo.getText());
                if(contrasenia != null && !contrasenia.isEmpty()) {
                    txt_contrasenia.setText(contrasenia);
                    JOptionPane.showMessageDialog(this, "Consulta exitosa", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else {
                JOptionPane.showMessageDialog(this, "No se encontró el usuario", "Error", JOptionPane.ERROR_MESSAGE);
                }
             } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al consultar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
             }                   
       }else{
                JOptionPane.showMessageDialog(this, "Los campos no deben estar vacios","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btn_consultar_contraseñaMouseClicked

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_olvido_contraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_consultar_contraseña;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txt_consultar_correo;
    private javax.swing.JTextField txt_contrasenia;
    // End of variables declaration//GEN-END:variables
}
