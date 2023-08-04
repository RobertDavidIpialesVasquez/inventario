package y.proyectofinal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stock extends javax.swing.JFrame {

    Conexionn cn = new Conexionn();
    Connection con = cn.conectar();

    public Stock() {
        initComponents();

        try {
            CargarComboAlmacenamiento();
            // Agregar ActionListener al ComboBox de Marcas
            cbx_Marca.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                }
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbt_Inventario = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_Proveedor = new javax.swing.JLabel();
        txt_buscarmarca = new javax.swing.JTextField();
        cbx_Marca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 160, 40));

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("INVENTARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 380, 60));

        tbt_Inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID MARCA", "MODELO", "ALMACENAMIENTO", "PRECIO", "CARACTERISTICAS", "CANTIDAD", "PROVEEDOR"
            }
        ));
        jScrollPane2.setViewportView(tbt_Inventario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1040, 160));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 100, 20));

        jLabel3.setText("BUSCAR:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 20));
        getContentPane().add(lbl_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 180, 30));

        txt_buscarmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarmarcaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_buscarmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 420, 40));

        getContentPane().add(cbx_Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_buscarmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarmarcaActionPerformed

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox<String> cbx_Marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Proveedor;
    private javax.swing.JTable tbt_Inventario;
    private javax.swing.JTextField txt_buscarmarca;
    // End of variables declaration//GEN-END:variables
   private void CargarComboAlmacenamiento() throws ClassNotFoundException {
       

        try {

            String sql = "select * from marcas";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String consulta = rs.getNString("Mar_Nombre");
                cbx_Marca.addItem(consulta);

            }
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar marcas");
        }
    }

// Método  para obtener modelos por marcas NO VALE :(
    private String[] obtenerModelosPorMarca(String marca) {
        // CONSULTA A LA BASES DE DATOS 

        if ("Marca1".equals(marca)) {
            return new String[]{"Modelo1A", "Modelo1B", "Modelo1C"};
        } else if ("Marca2".equals(marca)) {
            return new String[]{"Modelo2A", "Modelo2B"};
        } else {
            return new String[0];
        }
    }
}
