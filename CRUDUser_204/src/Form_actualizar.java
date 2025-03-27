
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Form_actualizar extends javax.swing.JFrame {
    private UserCRUD crud;
   
    public Form_actualizar() {
        initComponents();
        crud =  new UserCRUD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        txt_actualizar_contrasenia = new javax.swing.JTextField();
        txt_actualizar = new javax.swing.JTextField();
        txt_actualizar2 = new javax.swing.JTextField();
        txt_actualizar_correo = new javax.swing.JTextField();
        txt_actualizar_nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ACTUALIZAR USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 10));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel3.setText("Correo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        btn_actualizar.setText("Actualizar datos");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        btn_buscar.setText("Buscar por id");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
        jPanel1.add(txt_actualizar_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 160, -1));
        jPanel1.add(txt_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 150, -1));
        jPanel1.add(txt_actualizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));
        jPanel1.add(txt_actualizar_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 160, -1));
        jPanel1.add(txt_actualizar_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea actualizar los datos?", "Confirmar actualización",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE
        );
        if(opcion == JOptionPane.YES_OPTION){                    
            if (!txt_actualizar_nombre.getText().isEmpty()&&!txt_actualizar_correo.getText().isEmpty()&&!txt_actualizar_contrasenia.getText().isEmpty()){
                boolean rs = crud.actualizar_datos(txt_actualizar_nombre.getText(), txt_actualizar_correo.getText(), txt_actualizar_contrasenia.getText());
                JOptionPane.showMessageDialog(this, "Actializacion exitosa","Actualizar",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Los campos no deben estar vacios","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Actualizacion no exitosa","Actualizar",JOptionPane.INFORMATION_MESSAGE);
        }
        
                
    }//GEN-LAST:event_btn_actualizarActionPerformed


    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String id_text = txt_actualizar.getText();

        if (id_text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El ID es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (char c : id_text.toCharArray()) {
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(this, "El ID debe contener solo números", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        try {
            int id = Integer.parseInt(id_text);
            ResultSet rs = crud.Buscar_por_id(id);

            if (rs.next()) {
                txt_actualizar_nombre.setText(rs.getString("nombre"));
                txt_actualizar_correo.setText(rs.getString("correo"));
                txt_actualizar_contrasenia.setText(rs.getString("contrasenia"));
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún registro con el ID proporcionado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al realizar la búsqueda: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(Form_actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_actualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_actualizar;
    private javax.swing.JTextField txt_actualizar2;
    private javax.swing.JTextField txt_actualizar_contrasenia;
    private javax.swing.JTextField txt_actualizar_correo;
    private javax.swing.JTextField txt_actualizar_nombre;
    // End of variables declaration//GEN-END:variables
}
