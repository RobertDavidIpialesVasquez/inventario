/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package y.proyectofinal;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AgregarNuevasMarcas extends javax.swing.JFrame {

    Conexionn cn = new Conexionn();
    Connection con = cn.conectar();

    public AgregarNuevasMarcas() {
        initComponents();
        this.CargarComboAlmacenamiento();
        this.setLocationRelativeTo(null);
        lbl_fecha.setText(fechaActual());

    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Agregar = new javax.swing.JTable();
        txt_modelocelular = new javax.swing.JTextField();
        txt_colorcelular = new javax.swing.JTextField();
        btt_agregarcelular = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbx_Almacenamiento = new javax.swing.JComboBox<>();
        lbl_fecha = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("AGREGAR NUEVos Modelos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Modelo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 25));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Color:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        tb_Agregar.setBorder(new javax.swing.border.MatteBorder(null));
        tb_Agregar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_CELULAR", "MODELO", "COLOR", "ALMACENAMIENTO", "FECHA DE INGRESO"
            }
        ));
        tb_Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tb_Agregar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 950, 215));

        txt_modelocelular.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        getContentPane().add(txt_modelocelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 250, 30));

        txt_colorcelular.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        getContentPane().add(txt_colorcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 250, 30));

        btt_agregarcelular.setBackground(new java.awt.Color(255, 255, 0));
        btt_agregarcelular.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        btt_agregarcelular.setText("Agregar");
        btt_agregarcelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btt_agregarcelular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt_agregarcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_agregarcelularActionPerformed(evt);
            }
        });
        getContentPane().add(btt_agregarcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 130, 40));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 0));
        jLabel8.setText("FECHA DE INGRESO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 200, 20));

        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 0));
        jLabel10.setText("Almacenamiento:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        cbx_Almacenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_Almacenamiento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        cbx_Almacenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_AlmacenamientoActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_Almacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 250, 30));

        lbl_fecha.setBackground(new java.awt.Color(204, 153, 0));
        lbl_fecha.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lbl_fecha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fecha.setText("DD/MM/YYYY");
        getContentPane().add(lbl_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 230, 20));

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton1.setText("modificar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 0));
        jButton2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton2.setText("atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Pictures\\BARCO2.png")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String fechaActual() {
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formatoFecha);
    }


    private void btt_agregarcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_agregarcelularActionPerformed
        try {
            // Obtén el nuevo ID válido para el vehículo desde la base de datos
            int ID_Celular = obtenerNuevoIdVehiculoFromDatabase();
            PreparedStatement ps = con.prepareStatement("INSERT INTO `modelo_Celular` (ID_Celular, Modelo, Color, Almacenamiento , Fecha ) VALUES (?, ?, ?, ?, ?)");

            ps.setInt(1, ID_Celular);
            ps.setString(2, txt_modelocelular.getText());
            ps.setString(3, txt_colorcelular.getText());
            ps.setString(4, cbx_Almacenamiento.getSelectedItem().toString());
            ps.setString(5, lbl_fecha.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS REGISTRADOS");
            this.mostrarDatosMarcas();
            Limpiar();

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            Limpiar();

        }
        

    }//GEN-LAST:event_btt_agregarcelularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Administrador ad = new Administrador();
        ad.setVisible(rootPaneCheckingEnabled);
        this.dispose();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbx_AlmacenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_AlmacenamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_AlmacenamientoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int filaSeleccionada = tb_Agregar.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un registro para eliminar");
        } else {
            try {
                DefaultTableModel model = (DefaultTableModel) tb_Agregar.getModel();
                int idUsuarioAEliminar = (int) model.getValueAt(filaSeleccionada, 0);

                String query = "DELETE FROM modelo_Celular WHERE ID_Celular = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, idUsuarioAEliminar);

                int rowsDeleted = ps.executeUpdate();

                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                    // Actualizar la tabla después de eliminar el registro
                    btt_agregarcelularActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el registro en la base de datos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AgregarNuevasMarcas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarNuevasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarNuevasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarNuevasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarNuevasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarNuevasMarcas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_agregarcelular;
    private javax.swing.JComboBox<String> cbx_Almacenamiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JTable tb_Agregar;
    private javax.swing.JTextField txt_colorcelular;
    private javax.swing.JTextField txt_modelocelular;
    // End of variables declaration//GEN-END:variables

    private int obtenerNuevoIdVehiculoFromDatabase() {
        int nuevoId = 0;

        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT MAX(ID_Celular) FROM modelo_Celular");

            if (resultSet.next()) {
                int maxId = resultSet.getInt(1);
                nuevoId = maxId + 1;
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el nuevo ID: " + e);

        }

        return nuevoId;
    }

    private void CargarComboAlmacenamiento() {
        Connection cn = Conexionn.conectar();
        String sql = "select * from almacenamiento";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cbx_Almacenamiento.removeAllItems();
            cbx_Almacenamiento.addItem("Seleccione ALMACENAMIENTO:");
            while (rs.next()) {
                cbx_Almacenamiento.addItem(rs.getString("almacenamiento"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar categorias");
        }

    }

    private void Limpiar() {
        txt_colorcelular.setText("");
        txt_modelocelular.setText("");

    }
    public void mostrarDatosMarcas(){
    try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM modelo_Celular");

            // Limpiar la tabla muesrta antes de agregar nuevos datos
            DefaultTableModel model = (DefaultTableModel) tb_Agregar.getModel();
            model.setRowCount(0);

            // Recorrer el resultado y agregar los datos a la tabla muesrta
            while (rs.next()) {
                int ID_Celular = rs.getInt("ID_Celular");
                String modelo = rs.getString("Modelo");
                String color = rs.getString("Color");
                String Almacenamiento = rs.getString("Almacenamiento");
                String fecha = rs.getString("Fecha");

                // Agregar los datos a la tabla muesrta
                model.addRow(new Object[]{ID_Celular, modelo, color, Almacenamiento, fecha});
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener los datos de la tabla: " + e);
        }
    
    
    
    }

}
