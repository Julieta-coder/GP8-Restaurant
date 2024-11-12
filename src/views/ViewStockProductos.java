
package views;


import Entidades.Producto;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
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
        JTablaProductos = new javax.swing.JTable();
        jpFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jlImagenFondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTablaProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JTablaProductos.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        JTablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        JTablaProductos.setEnabled(false);
        jScrollPane1.setViewportView(JTablaProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 550, 247));

        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("Buscar por nombre:");
        jpFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 170, 27));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cruz.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpFondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 30));

        jtNombre.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });
        jpFondo.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 238, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("<html><u>Busqueda de Productos Activos</u></html> ");
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
    private javax.swing.JTable JTablaProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
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
    JTablaProductos.setModel(modelo);
    

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
             // modelo.fireTableDataChanged(); //notifico los cambios al modelo de la tabla
      
              
  // Establecer fuente y colores de fondo y texto para el encabezado de la tabla
    JTablaProductos.getTableHeader().setFont(new Font("Segoe UI", Font.ITALIC, 14));
    JTablaProductos.getTableHeader().setOpaque(false);
    JTablaProductos.getTableHeader().setBackground(new Color(30, 144, 255)); // Azul para el encabezado
    JTablaProductos.getTableHeader().setForeground(new Color(23, 32, 42)); // Color de texto del encabezado
    JTablaProductos.setRowHeight(25);

    // Crear un renderizador para centrar el texto del encabezado de la tabla
    DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
    headerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER); // Centrar texto en el encabezado
    headerRenderer.setBackground(new Color(30, 144, 255)); // Color de fondo del encabezado

    // Crear un renderizador para centrar, establecer colores y aplicar estilos a las celdas de datos de la tabla
    DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        // Centramos el texto en las celdas
        setHorizontalAlignment(SwingConstants.CENTER);
        
        if (isSelected) {
            c.setBackground(new Color(169, 169, 169)); // Color de fondo al seleccionar (azul claro)
            c.setForeground(Color.WHITE); // Color de texto al seleccionar (blanco)
        } else {
            c.setBackground(new Color(245, 245, 245)); // Color de fondo normal de las celdas (gris claro)
            c.setForeground(Color.BLACK); // Color de texto normal (negro)
        }
        
        return c;
    }
};
    

   // Aplicar el renderizador personalizado a cada columna para el encabezado y las celdas
    for (int i = 0; i < JTablaProductos.getColumnModel().getColumnCount(); i++) {
    JTablaProductos.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
    JTablaProductos.getColumnModel().getColumn(i).setCellRenderer(cellRenderer); // Aplica el centrado y los colores en celdas
}
    

 } //FIN CARGAR DATOS
    
    
    

}// FIN


