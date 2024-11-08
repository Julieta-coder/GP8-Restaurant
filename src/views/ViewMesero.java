
package views;

import Entidades.Mesero;
import Entidades.Pedido;
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
        cargarDatos();
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
        jButton1 = new javax.swing.JButton();
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
        jScrollPane1.setViewportView(jTablaMeseroPedidos);

        PanelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 520, 170));

        jrbPendientes.setText("Pedidos pendientes");
        PanelFondo.add(jrbPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jrbCobrados.setText("Pedidos cobrados");
        PanelFondo.add(jrbCobrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));
        PanelFondo.add(jdcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 150, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cruz.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelFondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 30, 30));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaMeseroPedidos;
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

private void cargarMesero(){
        
    for (Mesero mese : listaM){
        jcbMeseros.addItem(mese); //esto lleva al toStrign porque muestro un objeto de tipo mesero
    }


}

    private void cargarDatos(){
        
         modelo.setRowCount(0);
         
         Mesero selec =(Mesero)jcbMeseros.getSelectedItem();//tomo del combo box el mesero seleccionado
       //como el getselected nos devuelve un object lo casteo a Mesero
       
      // listaM = inscData.materiasNoCursadas(selec.getIdAlumno()); // esto nso devuelve la lista con todas las materias que no esta inscripto
       //ahora las gregamos a la tabla
       
      listaP = pd.listarPedidosDelMozo(selec.getId_mesero());
       
       for (Pedido p : listaP){
           modelo.addRow(new Object[]{p.getId_pedido(), p.getMesa(), p.getFecha_pedido(),p.getHora_pedido(),p.getMonto_total()});
       
       }
        

    }


}
