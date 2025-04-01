
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Form_eliminar extends javax.swing.JFrame {
    private UserCRUD crud;
  
    public Form_eliminar() {
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
        btn_eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        txt_id_eliminar = new javax.swing.JTextField();
        txt_actualizar2 = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ELIMINAR USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 10));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        btn_eliminar.setText("Eliminar usuario");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        btn_buscar.setText("Buscar por id");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
        jPanel1.add(txt_id_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 150, -1));
        jPanel1.add(txt_actualizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        txt_nombre.setEnabled(false);
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar el usuario?", "Eliminar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(opcion == JOptionPane.YES_OPTION){
            if (!txt_id_eliminar.getText().isEmpty()){
                boolean rs = crud.Eliminar_usuario(Integer.parseInt(txt_id_eliminar.getText()));
                JOptionPane.showMessageDialog(this, "Eliminacion exitosa","Eliminacion",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Los campos no deben estar vacios","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Eliminacion no exitosa","Eliminacion",JOptionPane.INFORMATION_MESSAGE);
        }
        limpiar_campo();
    }//GEN-LAST:event_btn_eliminarActionPerformed
    
    private  void limpiar_campo(){
        txt_id_eliminar.setText("");   
        txt_nombre.setText("");   
    }
    
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String id_text = txt_id_eliminar.getText();

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
                txt_nombre.setText(rs.getString("nombre"));                
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún registro con el ID proporcionado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al realizar la búsqueda: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(Form_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_actualizar2;
    private javax.swing.JTextField txt_id_eliminar;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
