
package views;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import persistencia.*;
import Entidades.Pedido;
import java.awt.Component;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ViewPedidoAdmin extends javax.swing.JInternalFrame {

   private PedidoData pedidoData=new PedidoData();
   private MeseroData meseroData=new MeseroData();
   private MesaData mesaData=new MesaData();
    
    private DefaultTableModel modelo= new DefaultTableModel(){
        
         @Override
          public boolean isCellEditable(int fila, int columna) {
              
              return false;
          }
     
    };

    
    public ViewPedidoAdmin() {
        initComponents();
        
//        modelo = new DefaultTableModel();

         jrbPedidosBD.setSelected(true);
         grupoRadioButon();

         armarCabeceraTabla();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaPedidos = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jpActualizarPorId = new javax.swing.JPanel();
        jbActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtMesaActualizar = new javax.swing.JTextField();
        jtMeseroActualizar = new javax.swing.JTextField();
        jtMontoActualizar = new javax.swing.JTextField();
        jdatechooserActualizar = new com.toedter.calendar.JDateChooser();
        jpBuscarPorId = new javax.swing.JPanel();
        jtBuscarPorId = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpBuscarBD = new javax.swing.JPanel();
        jbBuscarBaseDatos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jpBuscarPorFecha = new javax.swing.JPanel();
        jtMontoTotal = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jrbBuscarPorId = new javax.swing.JRadioButton();
        jrbPedidosBD = new javax.swing.JRadioButton();
        jrbBuscarFecha = new javax.swing.JRadioButton();
        jpBotonesPorId = new javax.swing.JPanel();
        jbBajaLogica = new javax.swing.JButton();
        jbAltaLogica = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();

        setTitle("Contable");

        jtablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtablaPedidos.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jtablaPedidos);

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jpActualizarPorId.setBackground(new java.awt.Color(153, 153, 153));
        jpActualizarPorId.setForeground(new java.awt.Color(153, 153, 153));

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Mesa");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Mesero");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Fecha");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Monto");

        jtMesaActualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMesaActualizarKeyTyped(evt);
            }
        });

        jtMeseroActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMeseroActualizarActionPerformed(evt);
            }
        });
        jtMeseroActualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMeseroActualizarKeyTyped(evt);
            }
        });

        jtMontoActualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMontoActualizarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpActualizarPorIdLayout = new javax.swing.GroupLayout(jpActualizarPorId);
        jpActualizarPorId.setLayout(jpActualizarPorIdLayout);
        jpActualizarPorIdLayout.setHorizontalGroup(
            jpActualizarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActualizarPorIdLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpActualizarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(72, 72, 72)
                .addGroup(jpActualizarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdatechooserActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jtMeseroActualizar)
                    .addComponent(jtMesaActualizar)
                    .addComponent(jtMontoActualizar))
                .addGap(41, 41, 41))
            .addGroup(jpActualizarPorIdLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jbActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpActualizarPorIdLayout.setVerticalGroup(
            jpActualizarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpActualizarPorIdLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpActualizarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtMesaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpActualizarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtMeseroActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jpActualizarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jdatechooserActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jpActualizarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtMontoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jbActualizar)
                .addGap(22, 22, 22))
        );

        jpBuscarPorId.setBackground(new java.awt.Color(153, 153, 153));
        jpBuscarPorId.setForeground(new java.awt.Color(153, 153, 153));

        jtBuscarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBuscarPorIdActionPerformed(evt);
            }
        });
        jtBuscarPorId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtBuscarPorIdKeyTyped(evt);
            }
        });

        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Buscar por Id Pedido");

        javax.swing.GroupLayout jpBuscarPorIdLayout = new javax.swing.GroupLayout(jpBuscarPorId);
        jpBuscarPorId.setLayout(jpBuscarPorIdLayout);
        jpBuscarPorIdLayout.setHorizontalGroup(
            jpBuscarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarPorIdLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarPorIdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpBuscarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBuscarPorIdLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jbBuscar))
                    .addComponent(jtBuscarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        jpBuscarPorIdLayout.setVerticalGroup(
            jpBuscarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarPorIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jtBuscarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpBuscarBD.setBackground(new java.awt.Color(153, 153, 153));
        jpBuscarBD.setForeground(new java.awt.Color(153, 153, 153));

        jbBuscarBaseDatos.setText("Base Datos");
        jbBuscarBaseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarBaseDatosActionPerformed(evt);
            }
        });

        jLabel8.setText("Listar los pedidos de la BD");

        javax.swing.GroupLayout jpBuscarBDLayout = new javax.swing.GroupLayout(jpBuscarBD);
        jpBuscarBD.setLayout(jpBuscarBDLayout);
        jpBuscarBDLayout.setHorizontalGroup(
            jpBuscarBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarBDLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpBuscarBDLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jbBuscarBaseDatos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBuscarBDLayout.setVerticalGroup(
            jpBuscarBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarBDLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbBuscarBaseDatos)
                .addContainerGap())
        );

        jpBuscarPorFecha.setBackground(new java.awt.Color(153, 153, 153));

        jtMontoTotal.setEditable(false);

        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Buscar por fecha ");

        javax.swing.GroupLayout jpBuscarPorFechaLayout = new javax.swing.GroupLayout(jpBuscarPorFecha);
        jpBuscarPorFecha.setLayout(jpBuscarPorFechaLayout);
        jpBuscarPorFechaLayout.setHorizontalGroup(
            jpBuscarPorFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarPorFechaLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jpBuscarPorFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jpBuscarPorFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtMontoTotal)
                        .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jpBuscarPorFechaLayout.setVerticalGroup(
            jpBuscarPorFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarPorFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jrbBuscarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBuscarPorIdActionPerformed(evt);
            }
        });

        jrbPedidosBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPedidosBDActionPerformed(evt);
            }
        });

        jrbBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBuscarFechaActionPerformed(evt);
            }
        });

        jpBotonesPorId.setBackground(new java.awt.Color(153, 153, 153));

        jbBajaLogica.setText("Baja Logica");
        jbBajaLogica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaLogicaActionPerformed(evt);
            }
        });

        jbAltaLogica.setText("Alta Logica");
        jbAltaLogica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaLogicaActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotonesPorIdLayout = new javax.swing.GroupLayout(jpBotonesPorId);
        jpBotonesPorId.setLayout(jpBotonesPorIdLayout);
        jpBotonesPorIdLayout.setHorizontalGroup(
            jpBotonesPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesPorIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbBajaLogica)
                .addGap(18, 18, 18)
                .addComponent(jbAltaLogica)
                .addGap(18, 18, 18)
                .addComponent(jbEliminar)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jpBotonesPorIdLayout.setVerticalGroup(
            jpBotonesPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotonesPorIdLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jpBotonesPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBajaLogica)
                    .addComponent(jbAltaLogica)
                    .addComponent(jbEliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpBotonesPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jrbBuscarPorId)
                                .addGap(240, 240, 240)
                                .addComponent(jrbPedidosBD)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpBuscarPorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(48, 48, 48)
                                .addComponent(jpBuscarBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpBuscarPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jrbBuscarFecha)
                                .addGap(76, 76, 76))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jpActualizarPorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbPedidosBD)
                    .addComponent(jrbBuscarFecha)
                    .addComponent(jrbBuscarPorId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpBuscarPorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBuscarBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBuscarPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpActualizarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jpBotonesPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jtBuscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarPorIdActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtBuscarPorIdActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        
        if(! jtBuscarPorId.getText().isEmpty()){
            
        cargaDatosTabla();
        jtBuscarPorId.setEnabled(false);
        
         deshabilitarComponentes(jpActualizarPorId,true);
         deshabilitarComponentes(jpBotonesPorId,true);
            
        }else{
                    JOptionPane.showMessageDialog(this, "Ingrese un ID para Buscar.");

        }
        
     
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    
     //BUSCAR POR FECHA Y MUESTRA EL MONTO TOTAL DE TODOS LOS PEDIDOS CON ESA FECHA seleccionada

    
    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange
        // TODO add your handling code here:
        borrarFilaTabla();
        
        if(jdFecha.getDate() != null){
            //de jdfecha se extrae con getDate como un Date de java util para transformarlo se usa ToInstant convierte el javautil en un objeto tipo instant que representa un punto en el tiempo
            //para convertir ese instant a un objeto tipo zone id time que representa una fecha en una zona horaria determinada invocando metodo atZone espera que le pase la zona horaria
            //la clase zoneId la constante que representa la zona horaria local systemDefault ese objeto zonIdtIME se convierte de date a un tolocalDate
            LocalDate fechaN=jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           Double resultado = pedidoData.listarIngresosParaUnaFecha(fechaN);
//            System.out.println("RESULTADO  "+resultado);
            jtMontoTotal.setText("$ "+resultado);
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            List<Pedido>listaP =pedidoData.listarIngresosParaUnaFechaSinMonto(fechaN);
//            jtablaPedidos.setEnabled(false);
            for (Pedido lista : listaP) {
                            
                            modelo.addRow(new Object []{lista.getId_pedido() ,lista.getMesa().getId_mesa(), lista.getMesero().getId_mesero(),lista.getFecha_pedido().format(dtf), lista.getMonto_total()}) ;

            }
            
        }
        
    }//GEN-LAST:event_jdFechaPropertyChange

    //Al seleccionar una fila de la tabla puedes darle baja logica REVISAR POR QUE NO ANDA
    private void jbBajaLogicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaLogicaActionPerformed
        // TODO add your handling code here:
        
//            int selectedRow = jtablaPedidos.getSelectedRow();
//            
//            int idPedido= Integer.parseInt(modelo.getValueAt(selectedRow, 0).toString());
            int idPedido= Integer.parseInt( jtBuscarPorId.getText() );
            
              if (jtBuscarPorId.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un ID para dar Baja Logica.");
        return;
    }
            
        try {
            
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres darle baja logica al Pedido " + "'"+pedidoData.buscarPedidoPorId(idPedido).getId_pedido()+"'"+ " de la base de datos?", "Advertencia", JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            // Llamar al método de eliminación en meseroData
            if (   pedidoData.actualizarEstadoLogico(idPedido, false)) { // Ahora funciona correctamente
                JOptionPane.showMessageDialog(this, "Pedido dado de baja logica exitosamente.");
//                cargarDatosEnTabla(); // Actualizar la tabla después de eliminar
                     jtBuscarPorId.setText("");
                     jtBuscarPorId.setEnabled(true);
                     
                        jtBuscarPorId.requestFocusInWindow();
                        
                    deshabilitarComponentes(jpActualizarPorId,false);
              deshabilitarComponentes(jpBotonesPorId,false);
                     
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró Pedido con ID " + idPedido);
            }
        }
        } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");

        }
    
              
              /*
            pedidoData.actualizarEstadoLogico(idPedido, false);
            
            System.out.println("estado actualizado");*/
            
           
            
    }//GEN-LAST:event_jbBajaLogicaActionPerformed
// FUNCIONA BIEN LO QUE SI REVISAR EL TEMA DE DETALLE PEDIDO QUE SEA EN CASCADA CUANDO TENGA PEDIDOS ASOCIADOS POR QUE SI NO NO ELIMINA
    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        
           int idPedido= Integer.parseInt( jtBuscarPorId.getText() );
//            pedidoData.eliminarPedido(idPedido);

             String idText = jtBuscarPorId.getText();
    
    if (idText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un ID para eliminar.");
        return;
    }

    try {
        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar el Pedido " + "'"+pedidoData.buscarPedidoPorId(idPedido).getId_pedido()+"'"+ " de la base de datos?", "Advertencia", JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            // Llamar al método de eliminación en meseroData
            if (pedidoData.eliminarPedido(idPedido)) { // Ahora funciona correctamente
                JOptionPane.showMessageDialog(this, "Pedido eliminado exitosamente.");
//                cargarDatosEnTabla(); // Actualizar la tabla después de eliminar
                     jtBuscarPorId.setText("");
                     jtBuscarPorId.setEnabled(true);
                     
                        jtBuscarPorId.requestFocusInWindow();
                        
                    deshabilitarComponentes(jpActualizarPorId,false);
                      deshabilitarComponentes(jpBotonesPorId,false);
                     
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró Pedido con ID " + idPedido);
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
    }
            
            
    }//GEN-LAST:event_jbEliminarActionPerformed

    //dar de Alta un pedido
    private void jbAltaLogicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaLogicaActionPerformed
        // TODO add your handling code here:
        
          int idPedido= Integer.parseInt( jtBuscarPorId.getText() );
            
              if (jtBuscarPorId.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un ID para dar Baja Logica.");
        return;
    }
            
        try {
            
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres darle alta logica al Pedido " + "'"+pedidoData.buscarPedidoPorId(idPedido).getId_pedido()+"'"+ " de la base de datos?", "Advertencia", JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            // Llamar al método de eliminación en meseroData
            if (   pedidoData.actualizarEstadoLogico(idPedido, true)) { // Ahora funciona correctamente
                JOptionPane.showMessageDialog(this, "Pedido dado de Alta logica exitosamente.");
//                cargarDatosEnTabla(); // Actualizar la tabla después de eliminar
                     jtBuscarPorId.setText("");
                     jtBuscarPorId.setEnabled(true);
                     
                       jtBuscarPorId.requestFocusInWindow();
                       
                   deshabilitarComponentes(jpActualizarPorId,false);
                  deshabilitarComponentes(jpBotonesPorId,false);
                     
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró Pedido con ID " + idPedido);
            }
        }
        } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");

        }
           
            
    }//GEN-LAST:event_jbAltaLogicaActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        
         int idPedido= Integer.parseInt( jtBuscarPorId.getText() );
//
//         Pedido lista=  pedidoData.buscarPedidoPorId(idPedido);
         
           // Asegurarse de que el campo ID no esté vacío
    String idText = jtBuscarPorId.getText();
    if (idPedido == 0) {
        JOptionPane.showMessageDialog(this, "Ingrese un ID para actualizar.");
        return;
    }

    try {
        // Obtener el ID y los nuevos valores de los campos
        int id = Integer.parseInt(idText);
        System.out.println("id " + id+ "idpedido "+ idPedido);
        
        int mesa = Integer.parseInt(jtMesaActualizar.getText().trim());
        int mesero = Integer.parseInt(jtMeseroActualizar.getText().trim());
        LocalDate fechaN=jdatechooserActualizar.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("fecha "+ fechaN);
        double monto = Double.parseDouble(jtMontoActualizar.getText().trim());
        
        
//         Verificar que todos los campos estén llenos
        if (jtMesaActualizar.getText().isEmpty()|| jtMeseroActualizar.getText().isEmpty() || jdatechooserActualizar.getDate() ==null || jtMontoActualizar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos antes de actualizar.");
            return;
        }
        
        if( ! mesaData.numeroExiste(mesa)){
             JOptionPane.showMessageDialog(this, "La mesa no existe por favor ingrese un valor correcto.");
            return;
        }
        
         if(  meseroData.buscarMozoPorId(mesero).equals(null)){
             JOptionPane.showMessageDialog(this, "El mesero no existe por favor ingrese un valor correcto.");
            return;
        }

        boolean actualizado =  pedidoData.actualizarPedido(idPedido, mesa, mesero, fechaN, monto);


        if (actualizado) {
            JOptionPane.showMessageDialog(this, "Pedido actualizado exitosamente.");
            // Limpiar los campos después de actualizar
            jtMesaActualizar.setText("");
            jtMeseroActualizar.setText("");
            jtMontoActualizar.setText("");
            jdatechooserActualizar.setDate(null);
            jtBuscarPorId.setText("");
            jtBuscarPorId.setEnabled(true);
            jtBuscarPorId.requestFocusInWindow();
            
              deshabilitarComponentes(jpActualizarPorId,false);
              deshabilitarComponentes(jpBotonesPorId,false);
            
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un Pedido con el ID especificado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, " deben ser valores numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar el pedido: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jrbBuscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBuscarPorIdActionPerformed
        // TODO add your handling code here:
        
                grupoRadioButon();

    }//GEN-LAST:event_jrbBuscarPorIdActionPerformed

    private void jrbPedidosBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPedidosBDActionPerformed
        // TODO add your handling code here:
                grupoRadioButon();

    }//GEN-LAST:event_jrbPedidosBDActionPerformed

    private void jrbBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBuscarFechaActionPerformed
        // TODO add your handling code here:
                grupoRadioButon();

    }//GEN-LAST:event_jrbBuscarFechaActionPerformed

    private void jbBuscarBaseDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarBaseDatosActionPerformed
        // TODO add your handling code here:
        
        List <Pedido> listaP=   pedidoData.obtenerPedidos();

        for (Pedido lista : listaP) {
            
                        modelo.addRow(new Object []{lista.getId_pedido() ,lista.getMesa().getId_mesa(), lista.getMesero().getId_mesero(),lista.getFecha_pedido(), lista.getMonto_total()}) ;

            
        }
        
    
           
        
    }//GEN-LAST:event_jbBuscarBaseDatosActionPerformed

    private void jtMeseroActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMeseroActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMeseroActualizarActionPerformed

    private void jtBuscarPorIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarPorIdKeyTyped
        // TODO add your handling code here:
                 char c = evt.getKeyChar();

                if (c>'9' || c<'0') evt.consume();

    }//GEN-LAST:event_jtBuscarPorIdKeyTyped

    private void jtMesaActualizarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMesaActualizarKeyTyped
        // TODO add your handling code here:
        
          char c = evt.getKeyChar();
         
        
        if (c>'9' || c<'0') evt.consume();
        
    }//GEN-LAST:event_jtMesaActualizarKeyTyped

    private void jtMeseroActualizarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMeseroActualizarKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
         
        
        if (c>'9' || c<'0') evt.consume();
    }//GEN-LAST:event_jtMeseroActualizarKeyTyped

    private void jtMontoActualizarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMontoActualizarKeyTyped
        // TODO add your handling code here:
        
          char c = evt.getKeyChar();
         
        
        if (c>'9' || c<'0') evt.consume();
        
    }//GEN-LAST:event_jtMontoActualizarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbAltaLogica;
    private javax.swing.JButton jbBajaLogica;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbBuscarBaseDatos;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdFecha;
    private com.toedter.calendar.JDateChooser jdatechooserActualizar;
    private javax.swing.JPanel jpActualizarPorId;
    private javax.swing.JPanel jpBotonesPorId;
    private javax.swing.JPanel jpBuscarBD;
    private javax.swing.JPanel jpBuscarPorFecha;
    private javax.swing.JPanel jpBuscarPorId;
    private javax.swing.JRadioButton jrbBuscarFecha;
    private javax.swing.JRadioButton jrbBuscarPorId;
    private javax.swing.JRadioButton jrbPedidosBD;
    private javax.swing.JTextField jtBuscarPorId;
    private javax.swing.JTextField jtMesaActualizar;
    private javax.swing.JTextField jtMeseroActualizar;
    private javax.swing.JTextField jtMontoActualizar;
    private javax.swing.JTextField jtMontoTotal;
    private javax.swing.JTable jtablaPedidos;
    // End of variables declaration//GEN-END:variables


     private void armarCabeceraTabla() {
    // Inicializa el modelo solo si no está ya inicializado
   // if (modelo == null) {
     //   modelo = new DefaultTableModel();
    //}

    // Agrega las columnas solo una vez
    if (modelo.getColumnCount() == 0) {
        modelo.addColumn("ID");
        modelo.addColumn("Mesa");
        modelo.addColumn("Mesero");
        modelo.addColumn("Fecha");
        modelo.addColumn("Monto");
    }
    
    jtablaPedidos.setModel(modelo);  
}

private void borrarFilaTabla() {
    // Obtiene el número de filas en la tabla
    int rowCount = modelo.getRowCount();

    // Elimina las filas una por una, comenzando desde la última
    for (int i = rowCount - 1; i >= 0; i--) {
        modelo.removeRow(i);
    }
}


  private void cargaDatosTabla(){
         borrarFilaTabla();


         try {
            
             if (jtBuscarPorId.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID para buscar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
                    }
            
            int idPedido= Integer.parseInt( jtBuscarPorId.getText() );

           Pedido lista=  pedidoData.buscarPedidoPorId(idPedido);

           modelo.addRow(new Object []{lista.getId_pedido() ,lista.getMesa().getId_mesa(), lista.getMesero().getId_mesero(),lista.getFecha_pedido(), lista.getMonto_total()}) ;
            
        } catch (Exception e) {
            
            
            
        }


    }
  
  private void cargaDatosTablaPorFecha(){
         borrarFilaTabla();
         int idPedido= Integer.parseInt( jtBuscarPorId.getText() );
        
        

//           List <Pedido> lista= (List) pedidoData.buscarPedidoPorId(idPedido);
           Pedido lista=  pedidoData.buscarPedidoPorId(idPedido);

            modelo.addRow(new Object []{lista.getId_pedido() ,lista.getMesa().getId_mesa(), lista.getMesero().getId_mesero(),lista.getFecha_pedido(), lista.getMonto_total()}) ;

      
//        for(Pedido m : lista){
//            modelo.addRow(new Object []{m.getId_pedido() ,m.getMesa().getId_mesa(), m.getMesero().getId_mesero(),m.getFecha_pedido(), m.getMonto_total()}) ;
//        }

    }

  
  public void grupoRadioButon(){
        borrarFilaTabla();

      buttonGroup1.add(jrbBuscarPorId);
      buttonGroup1.add(jrbPedidosBD);
      buttonGroup1.add(jrbBuscarFecha);
      
      if( jrbBuscarPorId.isSelected()){
                  borrarFilaTabla();

         deshabilitarComponentes(jpBuscarBD,false);
         deshabilitarComponentes(jpBuscarPorFecha,false);
         deshabilitarComponentes(jpBuscarPorId,true);
//         deshabilitarComponentes(jpActualizarPorId,true);
//         deshabilitarComponentes(jpBotonesPorId,true);
         deshabilitarComponentes(jpActualizarPorId,false);
         deshabilitarComponentes(jpBotonesPorId,false);
          
          
      }else if(jrbPedidosBD.isSelected()){
                  borrarFilaTabla();

         deshabilitarComponentes(jpBuscarBD,true);
         deshabilitarComponentes(jpBuscarPorFecha,false);
         deshabilitarComponentes(jpBuscarPorId,false);
         deshabilitarComponentes(jpActualizarPorId,false);
         deshabilitarComponentes(jpBotonesPorId,false);
          
      }else if(jrbBuscarFecha.isSelected()){
                  borrarFilaTabla();

         deshabilitarComponentes(jpBuscarBD,false);
         deshabilitarComponentes(jpBuscarPorFecha,true);
         deshabilitarComponentes(jpBuscarPorId,false);
         deshabilitarComponentes(jpActualizarPorId,false);
         deshabilitarComponentes(jpBotonesPorId,false);
      }
      
  }
  
  public void deshabilitarComponentes(JPanel panel, Boolean valor) {
    for (Component componente : panel.getComponents()) {
        componente.setEnabled(valor);
        
    }
}
  
}
