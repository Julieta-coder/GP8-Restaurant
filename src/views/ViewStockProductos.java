
package views;


import Entidades.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import persistencia.ProductoData;


public class ViewStockProductos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    
    ProductoData pd = new ProductoData();
    
  
   
    public ViewStockProductos() {
        initComponents();
        cabeceraTabla();
//        comboCategorias(); //ESTE ES PARA BUSCAR POR CATEGORIA, FALTA IMPLEMENTAR
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jpFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jlImagenFondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Categoria", "Precio", "Stock", "Esado"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 550, 247));

        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setText("Buscar por nombre:");
        jpFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 170, 27));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cruz.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpFondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 30));

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });
        jpFondo.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 238, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Busqueda de productos activos");
        jpFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jlImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo cuadrado 4.png"))); // NOI18N
        jpFondo.add(jlImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 584, 440));

        getContentPane().add(jpFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
        
        String nom = jtNombre.getText().toLowerCase();
        cargarDatos(nom);
    
    }//GEN-LAST:event_jtNombreKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlImagenFondo;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

private void cabeceraTabla(){
         
    this.modelo.addColumn("Codigo");
    this.modelo.addColumn("Nombre");
    this.modelo.addColumn("Categoria");
    this.modelo.addColumn("Precio");
    this.modelo.addColumn("Stock");
    jTable1.setModel(modelo);
    

}

    private void cargarDatos(String nom){
      
      modelo.setRowCount(0); // limpio la tabla
      List <Producto> listaP = pd.listarProductos();
     
     for (Producto p : listaP){
        
        //uso el tolowercase para que no discrimine minusculas y mayusculas 
        //uso el contains para que me busque coincidencias indistintamente de donde se encuentra la palabra ingresada o parte de la palabra
        if(p.getNombre().toLowerCase().contains(nom.toLowerCase())){
        
        modelo.addRow(new Object[] {p.getId_producto(),p.getNombre(),p.getCategoria(),p.getPrecio(),p.getStock()});
 
                     }
             }
              modelo.fireTableDataChanged(); //notifico los cambios al modelo de la tabla
        }
    
    
//     private void comboCategorias() {
//
//        jcbCategoria.addItem("Entrada");
//        jcbCategoria.addItem("Plato principal");
//        jcbCategoria.addItem("Bebida con alcohol");
//        jcbCategoria.addItem("Bebida sin alcohol");
//        jcbCategoria.addItem("Postre");
//
//    }
    
    
}// FIN


