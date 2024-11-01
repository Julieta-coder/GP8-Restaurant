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
    
    private List<Producto> listaP = pd.listarProductos();

    public ViewProductoAdmin() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbActualizar = new javax.swing.JButton();

        jLabel2.setText("Nombre:");

        jLabel3.setText("Categoria:");

        jLabel4.setText("Stock:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Estado:");

        jLabel7.setText("Carga de productos");

        jbGuardar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo:");

        jtCodigo.setEditable(false);
        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Categoria", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbActualizar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbEliminar)
                        .addGap(64, 64, 64)
                        .addComponent(jbGuardar)
                        .addGap(86, 86, 86)
                        .addComponent(jbActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(51, 51, 51)
                                            .addComponent(jrbEstado))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(35, 35, 35)
                                                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(224, 224, 224)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrbEstado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
    
        try {

            String nombre = jtNombre.getText();
            if (nombre.matches("^[a-zA-Z\\s]+$")) { //para que no se pueda poner numeros en nombre
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

        if (productoNuevo != null) {
            pd.cambiarEstado(productoNuevo.getId_producto());
            productoNuevo = null;
            limpiarCampos();

        } else {

            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }


    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed

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


    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        jtCodigo.setEditable(true);
        jtCodigo.requestFocus();
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        
        cargarDatos();
    }//GEN-LAST:event_jbActualizarActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables


private void cargarDatos(){
    
    modelo.setRowCount(0);
    
    for (Producto p : listaP){
        
        modelo.addRow(new Object[] {p.getId_producto(),p.getNombre(),p.getCategoria(),p.getPrecio(),p.getStock()});
        
    
    }
    


    }
}
