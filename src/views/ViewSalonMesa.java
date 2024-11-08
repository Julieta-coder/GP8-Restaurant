/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import Entidades.*;
import persistencia.*;

import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adriana
 */
public class ViewSalonMesa extends javax.swing.JInternalFrame {

    private MesaData mesaData;
    private MeseroData meseroData;
    private PedidoData pedidoData;
    private DetallePedidoData detallePedidoData;
    private ProductoData productoData;
    private Mesa mesa;
    private Mesero mesero;
    private Pedido pedido;
    private Producto producto;
    private DetallePedido detallePedido;

    private DefaultTableModel modeloTabla = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    private DefaultTableModel modeloTablaProducto = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public ViewSalonMesa() {

        mesaData = new MesaData();;
        meseroData = new MeseroData();
        pedidoData = new PedidoData();
        detallePedidoData = new DetallePedidoData();
        mesa = new Mesa();
        mesero = new Mesero();
        pedido = new Pedido();
        detallePedido = new DetallePedido();
        producto = new Producto();
        productoData = new ProductoData();

        initComponents();
        cargarComboMozo();
        armarCabeceraMesas();
        tablaCompleta();

        /*Ventana emergente*/
        armarCabeceraProductos();
        cargarComboBebidas();
        cargarComboEntrada();
        cargarComboPlatoPrincipal();
        cargarComboPostre();

        jpAbrirMesa.setEnabled(false);
        jpAbrirMesa.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpSalon = new javax.swing.JDesktopPane();
        jpAbrirMesa = new javax.swing.JPanel();
        jbAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcBebidas = new javax.swing.JComboBox<>();
        jcEntrada = new javax.swing.JComboBox<>();
        jsCantidaPP = new javax.swing.JSpinner();
        jsCantidadEntrada = new javax.swing.JSpinner();
        jcPlatoPrincipal = new javax.swing.JComboBox<>();
        jsCantidadBebidas = new javax.swing.JSpinner();
        jbAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jbTomarPedido = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jcPostre = new javax.swing.JComboBox<>();
        jsCantidadPostre = new javax.swing.JSpinner();
        jbSalir = new javax.swing.JButton();
        jpSalon = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMesasActivas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jcbMeseros = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jsCantidadPersonas = new javax.swing.JSpinner();
        jbAbrirMesa = new javax.swing.JButton();

        setTitle("Salon");

        jdpSalon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpAbrirMesa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbAtras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back-button.png"))); // NOI18N
        jbAtras.setText("Atras");
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });
        jpAbrirMesa.add(jbAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Atender");
        jpAbrirMesa.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Bebidas:");
        jpAbrirMesa.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Entrada:");
        jpAbrirMesa.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Plato Principal:");
        jpAbrirMesa.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jcBebidas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpAbrirMesa.add(jcBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 180, -1));

        jcEntrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpAbrirMesa.add(jcEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 180, -1));

        jsCantidaPP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpAbrirMesa.add(jsCantidaPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 80, -1));

        jsCantidadEntrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpAbrirMesa.add(jsCantidadEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 80, -1));

        jcPlatoPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpAbrirMesa.add(jcPlatoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 180, -1));

        jsCantidadBebidas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpAbrirMesa.add(jsCantidadBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 80, -1));

        jbAgregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbAgregar.setText("Agregar producto");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jpAbrirMesa.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtProductos);

        jpAbrirMesa.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, 190));

        jbTomarPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbTomarPedido.setText("Tomar pedido");
        jbTomarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTomarPedidoActionPerformed(evt);
            }
        });
        jpAbrirMesa.add(jbTomarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("Actualizar pedido");
        jpAbrirMesa.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("Cobrar");
        jpAbrirMesa.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Postre:");
        jpAbrirMesa.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, -1, -1));

        jcPostre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpAbrirMesa.add(jcPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 180, -1));

        jsCantidadPostre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpAbrirMesa.add(jsCantidadPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 80, -1));

        jbSalir.setBackground(new java.awt.Color(51, 51, 51));
        jbSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-cross-32.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jpAbrirMesa.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        jdpSalon.add(jpAbrirMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 910, 380));

        jpSalon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtMesasActivas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtMesasActivas);

        jpSalon.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 226));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Mozo: ");
        jpSalon.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jcbMeseros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jcbMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMeserosActionPerformed(evt);
            }
        });
        jpSalon.add(jcbMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Personas:");
        jpSalon.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jsCantidadPersonas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpSalon.add(jsCantidadPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 150, -1));

        jbAbrirMesa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbAbrirMesa.setText("Abrir mesa");
        jbAbrirMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbrirMesaActionPerformed(evt);
            }
        });
        jpSalon.add(jbAbrirMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 150, -1));

        jdpSalon.add(jpSalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 738, 299));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpSalon, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpSalon)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMeserosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMeserosActionPerformed

    private void jbAbrirMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbrirMesaActionPerformed
        // TODO add your handling code here:

        int filaSelect = jtMesasActivas.getSelectedRow();

        if (filaSelect != -1) {
            int personas = (int) jsCantidadPersonas.getValue();
            int capacidad = (int) jtMesasActivas.getValueAt(filaSelect, 2);

            if (personas <= capacidad) {
                int id_mesa = (int) jtMesasActivas.getValueAt(filaSelect, 0);
                int numero = (int) jtMesasActivas.getValueAt(filaSelect, 1);
                String disposicion = (String) jtMesasActivas.getValueAt(filaSelect, 3);
                mesa.setId_mesa(id_mesa);
                mesa.setNumero(numero);
                mesa.setCapacidad(capacidad);
                mesa.setDisposicion(disposicion);

                mesero = (Mesero) jcbMeseros.getSelectedItem();

                pedido.setMesa(mesa);
                pedido.setMesero(mesero);
                pedido.setFecha_pedido(LocalDate.now());
                pedido.setHora_pedido(LocalTime.now());
                pedido.setEstado(true);

                pedidoData.cargarPedido(pedido);

                jpSalon.setEnabled(false);
                jpSalon.setVisible(false);
                jpAbrirMesa.setEnabled(true);
                jpAbrirMesa.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "La cantidad de personas supera a la capcidad de la mesa.");
            }
        }


    }//GEN-LAST:event_jbAbrirMesaActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        // TODO add your handling code here:
        jpSalon.setEnabled(true);
        jpSalon.setVisible(true);
        jpAbrirMesa.setEnabled(false);
        jpAbrirMesa.setVisible(false);
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbTomarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTomarPedidoActionPerformed
        // TODO add your handling code here:
        /*Obtenemos el total de las filas*/
        int totalFilas = jtProductos.getRowCount();
        boolean flag = false;
        /*Comprobamos que existan filas*/
        if (totalFilas > 0) {
            
            int confirm = JOptionPane.showConfirmDialog(this, "¿Confirma el pedido?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                
                flag =true;
                // Seleccionar todas las filas usando setRowSelectionInterval
                jtProductos.setRowSelectionInterval(0, totalFilas - 1); // Selecciona desde la primera hasta la última fila
                // Creamos un arreglo para obtener las filas seleccionadas
                int[] filasRecorrido = jtProductos.getSelectedRows();

                // Recorrer cada fila seleccionada
                double total = 0;
                for (int fila : filasRecorrido) {
                    // Extraer los valores de cada columna en la fila seleccionada
                    int id_producto = (int) jtProductos.getValueAt(fila, 0);
                    String nombre = (String) jtProductos.getValueAt(fila, 1);
                    String categoria = (String) jtProductos.getValueAt(fila, 2);
                    double precio = (double) jtProductos.getValueAt(fila, 3);
                    int cantidad = (int) jtProductos.getValueAt(fila, 4);

                    detallePedido.setCantidad(cantidad);

                    detallePedido.setProducto(productoData.buscarProductoPorId(id_producto));

                    detallePedido.setPrecio_unitario(precio);

                    detallePedido.setSub_total(precio * cantidad);

                    total = precio * cantidad + total;

                    pedidoData.actualizarMontoTotal(pedido.getId_pedido(), total);

                    detallePedido.setPedido(pedido);
                    detallePedidoData.agregarDetallePedido(detallePedido);
                     
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay productos seleccionados.");
        }
        if(flag){
            borrarFilaTabla();
        }
       

    }//GEN-LAST:event_jbTomarPedidoActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
        int bebidas = (int) jsCantidadBebidas.getValue();
        int entrada = (int) jsCantidadEntrada.getValue();
        int platoP = (int) jsCantidaPP.getValue();
        int postre = (int) jsCantidadPostre.getValue();

        int[] cantidades = {bebidas, entrada, platoP, postre};

        boolean hayCantidadMayorQueCero = false;

        for (int cantidad : cantidades) {
            if (cantidad > 0) {
                hayCantidadMayorQueCero = true;
                break;
            }
        }

        if (hayCantidadMayorQueCero) {

            if (bebidas > 0) {
                Producto producto = (Producto) jcBebidas.getSelectedItem();
                cargarProductos(producto, bebidas);
                jsCantidadBebidas.setValue(0);
            }
            if (entrada > 0) {
                Producto producto = (Producto) jcEntrada.getSelectedItem();
                cargarProductos(producto, entrada);
                jsCantidadEntrada.setValue(0);
            }
            if (platoP > 0) {
                Producto producto = (Producto) jcPlatoPrincipal.getSelectedItem();
                cargarProductos(producto, platoP);
                jsCantidaPP.setValue(0);
            }
            if (postre > 0) {
                Producto producto = (Producto) jcPostre.getSelectedItem();
                cargarProductos(producto, postre);
                jsCantidadPostre.setValue(0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna opción.");
        }
    }//GEN-LAST:event_jbAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAbrirMesa;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbTomarPedido;
    private javax.swing.JComboBox<Producto> jcBebidas;
    private javax.swing.JComboBox<Producto> jcEntrada;
    private javax.swing.JComboBox<Producto> jcPlatoPrincipal;
    private javax.swing.JComboBox<Producto> jcPostre;
    private javax.swing.JComboBox<Mesero> jcbMeseros;
    private javax.swing.JDesktopPane jdpSalon;
    private javax.swing.JPanel jpAbrirMesa;
    private javax.swing.JPanel jpSalon;
    private javax.swing.JSpinner jsCantidaPP;
    private javax.swing.JSpinner jsCantidadBebidas;
    private javax.swing.JSpinner jsCantidadEntrada;
    private javax.swing.JSpinner jsCantidadPersonas;
    private javax.swing.JSpinner jsCantidadPostre;
    private javax.swing.JTable jtMesasActivas;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables
    private void borrarFilaTabla() {
        int indice = modeloTablaProducto.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modeloTablaProducto.removeRow(i);
        }
    }

    private void armarCabeceraMesas() {
        this.modeloTabla.addColumn("ID");
        this.modeloTabla.addColumn("N° Mesa");
        this.modeloTabla.addColumn("Capacidad");
        this.modeloTabla.addColumn("Disposicion");
        jtMesasActivas.setModel(modeloTabla);
    }

    private void armarCabeceraProductos() {
        this.modeloTablaProducto.addColumn("ID_Producto");
        this.modeloTablaProducto.addColumn("Nombre producto");
        this.modeloTablaProducto.addColumn("Categoria");
        this.modeloTablaProducto.addColumn("Precio");
        this.modeloTablaProducto.addColumn("Cantidad");
        jtProductos.setModel(modeloTablaProducto);
    }

    public void tablaCompleta() {
        ArrayList<Mesa> mesas = (ArrayList<Mesa>) mesaData.listarMesas();
        for (Mesa m : mesas) {
            if (m.getDisposicion().equalsIgnoreCase("libre")) {
                modeloTabla.addRow(new Object[]{m.getId_mesa(), m.getNumero(), m.getCapacidad(), m.getDisposicion()});
            }

        }

    }

    private void cargarComboMozo() {
        ArrayList<Mesero> meseros = (ArrayList<Mesero>) meseroData.listarMeseros();

        jcbMeseros.removeAllItems();
        for (Mesero mesero : meseros) {

            jcbMeseros.addItem(mesero);
        }

    }

    private void cargarComboBebidas() {
        ArrayList<Producto> prodcutos = (ArrayList<Producto>) productoData.listarProductos();
        jcBebidas.removeAllItems();
        for (Producto p : prodcutos) {
            if (p.getCategoria().equalsIgnoreCase("bebida")) {
                jcBebidas.addItem(p);
            }
        }

    }

    private void cargarComboEntrada() {
        ArrayList<Producto> prodcutos = (ArrayList<Producto>) productoData.listarProductos();
        jcEntrada.removeAllItems();
        for (Producto p : prodcutos) {
            if (p.getCategoria().equalsIgnoreCase("entrada")) {
                jcEntrada.addItem(p);
            }
        }

    }

    private void cargarComboPlatoPrincipal() {
        ArrayList<Producto> prodcutos = (ArrayList<Producto>) productoData.listarProductos();
        jcPlatoPrincipal.removeAllItems();
        for (Producto p : prodcutos) {
            if (p.getCategoria().trim().equalsIgnoreCase("plato principal")) {
                jcPlatoPrincipal.addItem(p);
            }
        }

    }

    private void cargarComboPostre() {
        ArrayList<Producto> prodcutos = (ArrayList<Producto>) productoData.listarProductos();
        jcPostre.removeAllItems();
        for (Producto p : prodcutos) {
            if (p.getCategoria().equalsIgnoreCase("postre")) {
                jcPostre.addItem(p);
            }
        }

    }

    public void cargarProductos(Producto producto, int cantidad) {
        Producto productoSelect = producto;
        if (productoSelect != null) {
            modeloTablaProducto.addRow(new Object[]{productoSelect.getId_producto(), productoSelect.getNombre(), productoSelect.getCategoria(), productoSelect.getPrecio(), cantidad});
        }
    }

}
