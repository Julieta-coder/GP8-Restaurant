/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import Entidades.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import persistencia.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matias
 */
public class ViewComandas extends javax.swing.JInternalFrame {

    
    Timer timer;
    
    private DefaultTableModel modelo= new DefaultTableModel(){
    @Override
    public boolean isCellEditable(int row, int column) {
        // Todas las celdas no son editables
        return false;
    }
};
    
        private DefaultTableModel modeloDetalle= new DefaultTableModel(){
    @Override
    public boolean isCellEditable(int row, int column) {
        // Todas las celdas no son editables
        return false;
    }
};

    
     private PedidoData pedidoData=new PedidoData();
     private DetallePedidoData detalleData=new DetallePedidoData();


    
    public ViewComandas() {
        initComponents();
        
        armarCabeceraPedidos();
        armarCabeceraDetalles();
        cargaDatosTablaPedidos();
        
        
        // Listener para seleccionar filas y cargar detalles
    jtPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            cargarDetallesPedidoSeleccionado(evt);
        }
    });
        
        
        ActionListener actionListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Tiempo en formato 24hs
                Date date= new Date();
                DateFormat timeFormat= new SimpleDateFormat("HH:mm:ss");
                String time=timeFormat.format(date);
                jlHora.setText(time);
                
                
                 Date date2= new Date();
                DateFormat timeFormat2= new SimpleDateFormat("dd/MM/yyyy");
                String time2=timeFormat2.format(date2);
                jlFecha.setText(time2);
                
            }
        };
        
        timer= new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
        
        //TABLA 1 y 2
           // Establecer fuente y colores de fondo y texto para el encabezado de la tabla
        jtPedidos.getTableHeader().setFont(new Font("Segoe UI", Font.ITALIC, 14));
        jtDetalles.getTableHeader().setFont(new Font("Segoe UI", Font.ITALIC, 14));
        jtPedidos.getTableHeader().setOpaque(false);
        jtDetalles.getTableHeader().setOpaque(false);
        jtPedidos.getTableHeader().setBackground(new Color(30, 144, 255)); // Azul para el encabezado
        jtDetalles.getTableHeader().setBackground(new Color(30, 144, 255)); // Azul para el encabezado
        jtPedidos.getTableHeader().setForeground(new Color(23, 32, 42)); // Color de texto del encabezado
        jtDetalles.getTableHeader().setForeground(new Color(23, 32, 42)); // Color de texto del encabezado
        jtPedidos.setRowHeight(25);
        jtDetalles.setRowHeight(25);
        
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
     
        // Aplicar el renderizador personalizado a cada columna para centrar los datos
//        for (int i = 0; i < jtPedidos.getColumnModel().getColumnCount(); i++) {
//        jtPedidos.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
//}

        // Aplicar el renderizador personalizado a cada columna para centrar los datos
        for (int i = 0; i < jtDetalles.getColumnModel().getColumnCount(); i++) {
        jtDetalles.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
}
        // Aplicar el renderizador personalizado al encabezado de cada columna
        for (int i = 0; i < jtPedidos.getColumnModel().getColumnCount(); i++) {
         jtPedidos.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
}
        // Aplicar el renderizador personalizado al encabezado de cada columna
        for (int i = 0; i < jtDetalles.getColumnModel().getColumnCount(); i++) {
         jtDetalles.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
         
        // Configurar para ajustar automáticamente el ancho
        jtPedidos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

         // Configurar para ajustar automáticamente el ancho
        jtDetalles.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSalir = new javax.swing.JButton();
        jpPrincipal = new javax.swing.JPanel();
        jpFechaYhora = new javax.swing.JPanel();
        jlFecha = new javax.swing.JLabel();
        jlHora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDetalles = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbSalir1 = new javax.swing.JButton();

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cruz.png"))); // NOI18N
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        setTitle("Comandas");

        jpFechaYhora.setBackground(new java.awt.Color(0, 0, 0));

        jlFecha.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(255, 255, 255));
        jlFecha.setText("HOY ES ");

        jlHora.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlHora.setForeground(new java.awt.Color(255, 255, 255));
        jlHora.setText("LA HORA ES");

        javax.swing.GroupLayout jpFechaYhoraLayout = new javax.swing.GroupLayout(jpFechaYhora);
        jpFechaYhora.setLayout(jpFechaYhoraLayout);
        jpFechaYhoraLayout.setHorizontalGroup(
            jpFechaYhoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFechaYhoraLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jlHora, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jpFechaYhoraLayout.setVerticalGroup(
            jpFechaYhoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFechaYhoraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpFechaYhoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHora, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jtPedidos.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jtPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtPedidos);

        jtDetalles.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jtDetalles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtDetalles);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("Seleccione ID de la fila para ver el detalle");

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jpFechaYhora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpFechaYhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cruz.png"))); // NOI18N
        jbSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSalir1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSalir1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalir1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSalir1;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlHora;
    private javax.swing.JPanel jpFechaYhora;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JTable jtDetalles;
    private javax.swing.JTable jtPedidos;
    // End of variables declaration//GEN-END:variables

    
    
       private void armarCabeceraPedidos() {
        this.modelo.addColumn("ID");
        this.modelo.addColumn("ID_MESA");
        this.modelo.addColumn("ID_MESERO");
        this.modelo.addColumn("Hora");
        jtPedidos.setModel(modelo);
    }
       
     private void armarCabeceraDetalles() {
        this.modeloDetalle.addColumn("ID_DETALLE");
        this.modeloDetalle.addColumn("PRODUCTO");
        this.modeloDetalle.addColumn("CANTIDAD");
       
        jtDetalles.setModel(modeloDetalle);
    }
    
       
      private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }

    }   
      
     private void borrarFilaTablaDetalles() {
        int indice = modeloDetalle.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modeloDetalle.removeRow(i);
        }

    }    
       
   private void cargaDatosTablaPedidos(){
         borrarFilaTabla();

           List<Pedido> listaP=  pedidoData.obtenerPedidosDelDia();

           
           for (Pedido lista : listaP) {
                        
                          modelo.addRow(new Object []{lista.getId_pedido() ,lista.getMesa().getId_mesa(), lista.getMesero().getId_mesero(),lista.getHora_pedido()}) ;

           
       }

           // Asignamos el renderizador personalizado a la tabla jtPedidos
        jtPedidos.setDefaultRenderer(Object.class, new CustomCellRenderer());

    }
   
   
   class CustomCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        
//        if (column == 3 && table.getColumnCount() > 3) { // Verifica que la columna 3 exista
//            LocalTime horaActual = LocalTime.now();
//            Object valueAtCell = table.getValueAt(row, 3);
//
//            if (valueAtCell instanceof LocalTime) {
//                LocalTime horaPedido = (LocalTime) valueAtCell;
//
//                // Calcular la diferencia en minutos
//                long minutosPasados = ChronoUnit.MINUTES.between(horaPedido, horaActual);
//
//                // Cambiar el color de fondo a rojo si han pasado más de 15 minutos
//                if (minutosPasados > 15) {
//                    cell.setBackground(Color.RED);
//                    cell.setForeground(Color.WHITE);
//                } else {
//                    cell.setBackground(Color.WHITE);
//                    cell.setForeground(Color.BLACK);
//                }
//            }
//        } else {
//            cell.setBackground(Color.WHITE);
//            cell.setForeground(Color.BLACK);
//        }
//        
//        return cell;
       
          // Obtener la hora actual y la hora del pedido
        LocalTime horaActual = LocalTime.now();
        LocalTime horaPedido = (LocalTime) table.getValueAt(row, 3); // Asumiendo que la hora del pedido está en la columna 3

        // Calcular la diferencia en minutos
        long minutosPasados = ChronoUnit.MINUTES.between(horaPedido, horaActual);

        // Cambiar el color de fondo a rojo si han pasado más de 15 minutos
        if (minutosPasados > 15) {
            cell.setBackground(Color.RED);
            cell.setForeground(Color.WHITE);
        } else {
            cell.setBackground(Color.WHITE);
            cell.setForeground(Color.BLACK);
        }

        return cell; 
        
       /*
        // Obtener la hora actual y la hora del pedido (columna 3 asumida como la hora)
        if (column == 3) { // Solo aplicar el color para la columna de la hora del pedido
            LocalTime horaActual = LocalTime.now();
            LocalTime horaPedido = (LocalTime) table.getValueAt(row, 3); // Asegúrate de que la hora sea del tipo LocalTime

            // Calcular la diferencia en minutos
            long minutosPasados = ChronoUnit.MINUTES.between(horaPedido, horaActual);

            // Cambiar el color de fondo a rojo si han pasado más de 15 minutos
            if (minutosPasados > 15) {
                cell.setBackground(Color.RED);
                cell.setForeground(Color.WHITE);
            } else {
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.BLACK);
            }
        } else {
            cell.setBackground(Color.WHITE);
            cell.setForeground(Color.BLACK);
        }

        return cell;
        */
       
    }
}

      
   private void cargaDatosTablaDetalles(int idPedido) {
    // Limpiar la tabla de detalles antes de cargar nuevos datos
    borrarFilaTablaDetalles();

    // Obtener detalles del pedido (puedes usar tu lógica para obtener detalles del pedidoData)
    List<DetallePedido> listaDetalles = detalleData.listarDetallesPorPedido(idPedido);

    for (DetallePedido detalle : listaDetalles) {
        modeloDetalle.addRow(new Object[]{detalle.getId_detalle(), detalle.getProducto().getNombre(), detalle.getCantidad()});
    }
}
   
   private void cargarDetallesPedidoSeleccionado(java.awt.event.MouseEvent evt) {

       try {
                      borrarFilaTablaDetalles();

           int filaSeleccionada = jtPedidos.getSelectedRow();
           if (filaSeleccionada != -1) {
               // Obtener el ID del pedido desde la fila seleccionada (suponiendo que es la primera columna)
               int idPedido = (int) jtPedidos.getValueAt(filaSeleccionada, 0);

               // Cargar los detalles del pedido usando el ID
               cargaDatosTablaDetalles(idPedido);
           } else {
               JOptionPane.showMessageDialog(this, "Por favor seleccione de la columna id la fila que desee ver su detalle.");

           }

       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");

       }
}
   
}

