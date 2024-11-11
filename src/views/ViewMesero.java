
package views;

import Entidades.Mesero;
import Entidades.Pedido;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import persistencia.MeseroData;
import persistencia.PedidoData;


public class ViewMesero extends javax.swing.JInternalFrame {

    
     private DefaultTableModel modelo = new DefaultTableModel();
     PedidoData pd = new PedidoData();
     private List <Mesero> listaM = new ArrayList();   
     private List <Pedido> listaP = new ArrayList();   
     private MeseroData md = new MeseroData();
     
     
    public ViewMesero() {
        initComponents();
        
        listaM = md.listarMeseros(); 
        cargarMesero();
        
        cabeceraTabla();
        
        //metodo que uso para saber si un item esta seleccionado en el combobox y cambia de estado 
        jcbMeseros.addItemListener(new ItemListener() {
            
         @Override
        public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            actualizarTabla();
                 }
              }
         });
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbMeseros = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaMeseroPedidos = new javax.swing.JTable();
        jrbPendientes = new javax.swing.JRadioButton();
        jrbCobrados = new javax.swing.JRadioButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jbSalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Mozo:");
        PanelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        PanelFondo.add(jcbMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, 30));

        jTablaMeseroPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaMeseroPedidos.setEnabled(false);
        jScrollPane1.setViewportView(jTablaMeseroPedidos);

        PanelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 520, 170));

        jrbPendientes.setText("Pedidos pendientes");
        jrbPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPendientesActionPerformed(evt);
            }
        });
        PanelFondo.add(jrbPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jrbCobrados.setText("Pedidos cobrados");
        jrbCobrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCobradosActionPerformed(evt);
            }
        });
        PanelFondo.add(jrbCobrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jdcFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaPropertyChange(evt);
            }
        });
        PanelFondo.add(jdcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 150, 30));

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cruz.png"))); // NOI18N
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        PanelFondo.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 30, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo cuadrado 4.png"))); // NOI18N
        PanelFondo.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrbPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPendientesActionPerformed
        

        jrbCobrados.setSelected(false); //hago que cuando se seleccione uno el otro se desseleccione  
        jdcFecha.setEnabled(false);
     //   actualizarTabla();
    }//GEN-LAST:event_jrbPendientesActionPerformed

    private void jrbCobradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCobradosActionPerformed
        jrbPendientes.setSelected(false);
        jdcFecha.setEnabled(true);
        //actualizarTabla();
    }//GEN-LAST:event_jrbCobradosActionPerformed

    private void jdcFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaPropertyChange
        actualizarTabla();
   
    }//GEN-LAST:event_jdcFechaPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaMeseroPedidos;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Mesero> jcbMeseros;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JRadioButton jrbCobrados;
    private javax.swing.JRadioButton jrbPendientes;
    // End of variables declaration//GEN-END:variables


private void cabeceraTabla(){
         
    this.modelo.addColumn("ID_PEDIDO");
    this.modelo.addColumn("NRO_MESA");
    this.modelo.addColumn("FECHA");
    this.modelo.addColumn("HORA");
    //this.modelo.addColumn("ESTADO");
    this.modelo.addColumn("TOTAL");
    
    jTablaMeseroPedidos.setModel(modelo);
    

}

 private void borrarFilaTabla(){
   int indice = modelo.getRowCount()-1; // obtengo la contidad de columnas menos 1
   
   for (int i  = indice; i>=0;i--){
   modelo.removeRow(i);
   } //borro las filas de atras para adelante 
   
   }

private void cargarMesero(){
        
    for (Mesero mese : listaM){
        jcbMeseros.addItem(mese); //esto lleva al toStrign porque muestro un objeto de tipo mesero
    }


}



//ESETO ME SIRVO SOLO PARA LOS READIO BUTTON, SIN TENER LAS FECHAS EN CCUENTA 
//    private void cargarDatosPendientes(){       
//       
//         Mesero selec =(Mesero)jcbMeseros.getSelectedItem();//tomo del combo box el mesero seleccionado
//                            //como el getselected nos devuelve un object lo casteo a Mesero
//       
//         if(selec != null){
//          
//            listaP = pd.listarPedidosDelMozoPendiente(selec.getId_mesero());
//       
//           for (Pedido p : listaP){
//           modelo.addRow(new Object[]{p.getId_pedido(), p.getMesa().getId_mesa(), p.getFecha_pedido(),p.getHora_pedido(),p.getMonto_total()});
//       
//               }
//        
//         }
//    }
    
//    private void cargarDatosCobrados(){
//        
//         
//         Mesero selec =(Mesero)jcbMeseros.getSelectedItem();//tomo del combo box el mesero seleccionado
//                            //como el getselected nos devuelve un object lo casteo a Mesero
//       
//         if(selec != null){
//          
//            listaP = pd.listarPedidosDelMozoCobrado(selec.getId_mesero());
//       
//           for (Pedido p : listaP){
//           modelo.addRow(new Object[]{p.getId_pedido(), p.getMesa().getId_mesa(), p.getFecha_pedido(),p.getHora_pedido(),p.getMonto_total()});
//       
//               }
//        
//         }
//    }
    
    private void actualizarTabla() {
         borrarFilaTabla();
        
          LocalDate fecha = null;
        
          //corroboro si hay una fecha seleccionada y captura dicha fecha del chooser
          if(jdcFecha.getDate() != null){        
               fecha = jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();          
            }
    
         Mesero selec =(Mesero)jcbMeseros.getSelectedItem(); //mesero que selecciono en el combo box
        
        if(selec !=null){
            
             if (jrbPendientes.isSelected()) {                           
         
                     listaP = pd.listarPedidosDelMozoPendiente(selec.getId_mesero());
        
                }else if(jrbCobrados.isSelected()){
                    
                    if(fecha != null){
                    
                        listaP = pd.listarPedidosDelMozoParaTalFecha(selec.getId_mesero(), fecha);
                    
                         }else {
                    
                                  listaP= pd.listarPedidosDelMozoCobrado(selec.getId_mesero());
                                          }              
                         } 
                            
                  } 
             
                   for (Pedido p : listaP){
                    if(p.getMesa()!=null){   
                        /*EVITAMOS QUE RETORNE MESAS NULAS ES DECIR CON UNA BAJA LOGICA*/
                        modelo.addRow(new Object[]{p.getId_pedido(), p.getMesa().getId_mesa(), p.getFecha_pedido(),p.getHora_pedido(),p.getMonto_total()});
                    
                    }
           
             
            } //FIN PRIMER IF
        
        
        
    } //FIN ACTUALIZAR TABLA

}
