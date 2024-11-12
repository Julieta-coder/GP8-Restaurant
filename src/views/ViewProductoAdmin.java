package views;

import Entidades.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.ProductoData;

public class ViewProductoAdmin extends javax.swing.JInternalFrame {
    

    private DefaultTableModel modelo = new DefaultTableModel();
    
    
    private ProductoData pd = new ProductoData();
    private Producto productoNuevo = null;
    
    

    public ViewProductoAdmin() {
        initComponents();
        
        
     //  modelo = new DefaultTableModel();

        
        
        
        comboCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jComboCategoria = new javax.swing.JComboBox<>();
        jtStock = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jlFondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Categoria:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Stock:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("Precio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setText("Estado:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("<html><u>CARGA DE PRODUCTOS</u></html> ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jtNombre.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        getContentPane().add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 160, 30));

        jComboCategoria.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 140, 30));

        jtStock.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        getContentPane().add(jtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 90, 30));

        jtPrecio.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        getContentPane().add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 90, 30));

        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jrbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jbGuardar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 120, 40));

        jbEliminar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/advertencia.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 120, 40));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 50, -1));

        jbSalir.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cruz.png"))); // NOI18N
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jtCodigo.setEditable(false);
        jtCodigo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jtCodigo.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 90, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel8.setText("*Presione enter para buscar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo cuadrado 4.png"))); // NOI18N
        jlFondo.setText("jLabel9");
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
    
        try {

            String nombre = jtNombre.getText();
            if (nombre.matches("^[a-zA-ZñÑ\\s]+$")) { //para que no se pueda poner numeros en nombre
                String categoria = (String) jComboCategoria.getSelectedItem();

                if (nombre.isEmpty() || categoria.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                    return;
                }

                Double precio = Double.parseDouble(jtPrecio.getText());
                int stock = Integer.parseInt(jtStock.getText());

                Boolean estado = jrbEstado.isSelected();

                if (productoNuevo == null) {
                    productoNuevo = new Producto(nombre, categoria, precio, stock, estado);
                    pd.agregarProducto(productoNuevo);
                   
                    JOptionPane.showMessageDialog(this, "¡Producto agregado!");
                
                } else {
                    productoNuevo.setNombre(nombre);
                    productoNuevo.setCategoria(categoria);
                    productoNuevo.setPrecio(precio);
                    productoNuevo.setStock(stock);
                    productoNuevo.setEstado(estado);
                    pd.actualizarProducto(productoNuevo);
                    
                    JOptionPane.showMessageDialog(this, "¡Producto modificado!");

                }
                
                limpiarCampos();
                productoNuevo=null;
                jtCodigo.setEditable(false);

            } else {
                JOptionPane.showMessageDialog(this, "Nombre debe contener solo letras");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un dato valido");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        //ESTE ERA ELIMINADO LOGICO POR EL BOTON ELIMINAR
//        if (productoNuevo != null) {
//            pd.cambiarEstado(productoNuevo.getId_producto());
//            productoNuevo = null;
//            limpiarCampos();
//
//        } else {
//
//            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
//        }

        String idProd = jtCodigo.getText();
        
        if (idProd.isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Debe ingresar un codigo para eliminar");
        }
        
      try{
        int id = Integer.parseInt(idProd);
        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar de la bases de datos completamente el producto con id " + id + "?");//, "Advertencia", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION){
        
            pd.eliminarProducto(id);
            limpiarCampos();
            jtCodigo.setEditable(false);
       
            }
        
        }catch (NumberFormatException e) {
            
        JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
        
        
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed

        
        try{
        Integer codigo = Integer.parseInt(jtCodigo.getText());

        productoNuevo = pd.buscarProductoPorId(codigo);

        if (productoNuevo != null) {

            jtNombre.setText(productoNuevo.getNombre());
            jComboCategoria.setSelectedItem(productoNuevo.getCategoria());
            jtPrecio.setText(String.valueOf(productoNuevo.getPrecio()));
            jtStock.setText(String.valueOf(productoNuevo.getStock()));
            jrbEstado.setSelected(productoNuevo.isEstado());
            
           

        }else{
            
             JOptionPane.showMessageDialog(null, "Debe ingresar un codigo existente");
        }
        }catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero");
            
        
        }

    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        jtCodigo.setEditable(true);
        jtCodigo.requestFocus();
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboCategoriaActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEstadoActionPerformed

    private void comboCategorias() {

        jComboCategoria.addItem("Entrada");
        jComboCategoria.addItem("Plato principal");
        jComboCategoria.addItem("Bebida con alcohol");
        jComboCategoria.addItem("Bebida sin alcohol");
        jComboCategoria.addItem("Postre");

    }

    private void limpiarCampos() {
        jtNombre.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        jrbEstado.setSelected(true);
        jtCodigo.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables


private void cargarDatos(){
    
    List<Producto> listaP = pd.listarProductos();
    
    //modelo.setRowCount(0);
    
    for (Producto p : listaP){
        
        modelo.addRow(new Object[] {p.getId_producto(),p.getNombre(),p.getCategoria(),p.getPrecio(),p.getStock()});
        
    
    }
    


    }
}
