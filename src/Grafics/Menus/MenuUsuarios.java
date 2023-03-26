/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafics.Menus;

/**
 *
 * @author Antonio Alvarez
 */
public class MenuUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form MenuUsuarios
     */
    public MenuUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jToggleButtonListarUsuario = new javax.swing.JToggleButton();
        jToggleButtonBuscarUsuario = new javax.swing.JToggleButton();
        jToggleButtonAgregarUsuario = new javax.swing.JToggleButton();
        jToggleButtonModificarUsuario = new javax.swing.JToggleButton();
        jToggleButtonEliminarUsuario = new javax.swing.JToggleButton();
        jToggleButtonAtrás = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitulo.setText("Menu Usuarios");

        jToggleButtonListarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButtonListarUsuario.setText("Listar Usuario");
        jToggleButtonListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonListarUsuarioActionPerformed(evt);
            }
        });

        jToggleButtonBuscarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButtonBuscarUsuario.setText("Buscar Usuario");
        jToggleButtonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonBuscarUsuarioActionPerformed(evt);
            }
        });

        jToggleButtonAgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButtonAgregarUsuario.setText("Agregar Usuario");
        jToggleButtonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAgregarUsuarioActionPerformed(evt);
            }
        });

        jToggleButtonModificarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButtonModificarUsuario.setText("Modificar Usuario");
        jToggleButtonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonModificarUsuarioActionPerformed(evt);
            }
        });

        jToggleButtonEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButtonEliminarUsuario.setText("Eliminar Usuario");
        jToggleButtonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEliminarUsuarioActionPerformed(evt);
            }
        });

        jToggleButtonAtrás.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButtonAtrás.setText("Atrás");
        jToggleButtonAtrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAtrásActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButtonAtrás, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonListarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTitulo)
                .addGap(31, 31, 31)
                .addComponent(jToggleButtonListarUsuario)
                .addGap(18, 18, 18)
                .addComponent(jToggleButtonBuscarUsuario)
                .addGap(18, 18, 18)
                .addComponent(jToggleButtonAgregarUsuario)
                .addGap(18, 18, 18)
                .addComponent(jToggleButtonModificarUsuario)
                .addGap(18, 18, 18)
                .addComponent(jToggleButtonEliminarUsuario)
                .addGap(43, 43, 43)
                .addComponent(jToggleButtonAtrás)
                .addContainerGap(30, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonListarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonListarUsuarioActionPerformed

    private void jToggleButtonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonBuscarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonBuscarUsuarioActionPerformed

    private void jToggleButtonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAgregarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonAgregarUsuarioActionPerformed

    private void jToggleButtonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonModificarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonModificarUsuarioActionPerformed

    private void jToggleButtonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEliminarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonEliminarUsuarioActionPerformed

    private void jToggleButtonAtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAtrásActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonAtrásActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButtonAgregarUsuario;
    private javax.swing.JToggleButton jToggleButtonAtrás;
    private javax.swing.JToggleButton jToggleButtonBuscarUsuario;
    private javax.swing.JToggleButton jToggleButtonEliminarUsuario;
    private javax.swing.JToggleButton jToggleButtonListarUsuario;
    private javax.swing.JToggleButton jToggleButtonModificarUsuario;
    // End of variables declaration//GEN-END:variables
}
