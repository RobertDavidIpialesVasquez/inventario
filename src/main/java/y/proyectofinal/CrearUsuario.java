/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package y.proyectofinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CrearUsuario extends javax.swing.JFrame {

    Conexionn cn = new Conexionn();
    Connection con = cn.conectar();

    public CrearUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bttregresar = new javax.swing.JButton();
        bttañadirusuario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_apellido1 = new javax.swing.JTextField();
        txt_movil = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Nombres:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 153, 0));
        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("AñADIR USUSARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 40));

        Usuario.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(204, 204, 0));
        Usuario.setText("uSUARIO:");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 110, 20));

        txt_usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 310, 30));

        txt_nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 310, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 102));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 30, -1));

        bttregresar.setBackground(new java.awt.Color(204, 204, 0));
        bttregresar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        bttregresar.setText("REGRESAR");
        bttregresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttregresarActionPerformed(evt);
            }
        });
        getContentPane().add(bttregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        bttañadirusuario.setBackground(new java.awt.Color(204, 204, 0));
        bttañadirusuario.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        bttañadirusuario.setText("AÑADIR");
        bttañadirusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttañadirusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttañadirusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(bttañadirusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 120, 30));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("Apellidos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("Telefono Movil:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        txt_direccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 310, 30));

        txt_contraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));
        getContentPane().add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 310, 30));

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 0));
        jLabel9.setText("Contraseña:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, 30));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("Direccion Domicilio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txt_apellido1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));
        getContentPane().add(txt_apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 310, 30));

        txt_movil.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));
        getContentPane().add(txt_movil, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 310, 30));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("-");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Pictures\\Saga negro2.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void bttregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttregresarActionPerformed
        // TODO add your handling code here:
        Administrador ad = new Administrador();
        ad.setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_bttregresarActionPerformed

    private void bttañadirusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttañadirusuarioActionPerformed

        try {
            String nombre = txt_nombre.getText();
            String apellido = txt_apellido1.getText();
            String movil = txt_movil.getText();
            String direccion = txt_direccion.getText();
            String usuario = txt_usuario.getText();
            String contraseña = String.valueOf(txt_contraseña.getText());

            // Check if the user already exists in the database
            String queryExistence = "SELECT COUNT(*) FROM inicio WHERE Usuario = ?";
            PreparedStatement psExistence = Conexionn.conectar().prepareStatement(queryExistence);
            psExistence.setString(1, usuario);
            ResultSet rsExistence = psExistence.executeQuery();
            rsExistence.next();
            int count = rsExistence.getInt(1);

            if (count > 0) {

                JOptionPane.showMessageDialog(null, "El usuario ya existe en la base de datos");

                Limpiar1();
            } else {

                String query = "INSERT INTO inicio (Nombre, Apellido, TelefonoMovil, DireccionDomicilio, Usuario, Contraseña) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = Conexionn.conectar().prepareStatement(query);
                ps.setString(1, nombre);
                ps.setString(2, apellido);
                ps.setString(3, movil);
                ps.setString(4, direccion);
                ps.setString(5, usuario);
                ps.setString(6, contraseña);

                int rowsInserted = ps.executeUpdate();

                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
                    // You can add any further actions after successful registration
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el usuario");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_bttañadirusuarioActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton bttañadirusuario;
    private javax.swing.JButton bttregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_apellido1;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_movil;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txt_nombre.setText("");
        txt_direccion.setText("");
        txt_usuario.setText("");
        txt_contraseña.setText("");

    }

    private void Limpiar1() {

        txt_usuario.setText("");

    }
}
