
package views;

import javax.swing.JOptionPane;


public class ViewPrincipal extends javax.swing.JFrame {

    
    public ViewPrincipal() {
        initComponents();
        setLocationRelativeTo(null); 
        /*ACTIVAR VISIBILIDAD Y EDICION de jpLogIn DESPUES*/
        jpLogIn.setEnabled(false);
        jpLogIn.setVisible(false);
//        jmAdministracion.setEnabled(false); va junto con el botono de log in
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jpLogIn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfConstraseña = new javax.swing.JTextField();
        jbLogIn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmMesa = new javax.swing.JMenu();
        jmMesero = new javax.swing.JMenu();
        jmPedido = new javax.swing.JMenu();
        jmReserva = new javax.swing.JMenu();
        jmiGuardarReserva = new javax.swing.JMenuItem();
        jmiListarReservas = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jmiContratarMesero = new javax.swing.JMenuItem();
        jmiAñadirMesa = new javax.swing.JMenuItem();
        jmiCargarProducto = new javax.swing.JMenuItem();
        jmiContable = new javax.swing.JMenuItem();
        jmiStock = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Usuario:");

        jtfUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Constraseña:");

        jtfConstraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jbLogIn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbLogIn.setText("Log in");
        jbLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLogInLayout = new javax.swing.GroupLayout(jpLogIn);
        jpLogIn.setLayout(jpLogInLayout);
        jpLogInLayout.setHorizontalGroup(
            jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLogInLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(jtfConstraseña))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLogInLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLogIn)
                .addGap(34, 34, 34))
        );
        jpLogInLayout.setVerticalGroup(
            jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLogInLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfConstraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLogIn)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        escritorio.setLayer(jpLogIn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(jpLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(540, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jpLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jmMesa.setText("Mesas");
        jmMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmMesaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmMesa);

        jmMesero.setText("Meseros");
        jMenuBar1.add(jmMesero);

        jmPedido.setText("Pedidos");
        jMenuBar1.add(jmPedido);

        jmReserva.setText("Reserva");

        jmiGuardarReserva.setText("Guardar reserva");
        jmiGuardarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGuardarReservaActionPerformed(evt);
            }
        });
        jmReserva.add(jmiGuardarReserva);

        jmiListarReservas.setText("Listar reservas");
        jmiListarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListarReservasActionPerformed(evt);
            }
        });
        jmReserva.add(jmiListarReservas);

        jMenuBar1.add(jmReserva);

        jmAdministracion.setText("Administracion");

        jmiContratarMesero.setText("Contratar mesero");
        jmiContratarMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContratarMeseroActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiContratarMesero);

        jmiAñadirMesa.setText("Añadir mesa");
        jmiAñadirMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAñadirMesaActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiAñadirMesa);

        jmiCargarProducto.setText("Cargar producto");
        jmiCargarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCargarProductoActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiCargarProducto);

        jmiContable.setText("Contable");
        jmiContable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContableActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiContable);

        jmiStock.setText("Stock productos");
        jmiStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiStockActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiStock);

        jMenuBar1.add(jmAdministracion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiContratarMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContratarMeseroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ViewMeseroAdmin interMeseroAdmin = new ViewMeseroAdmin();
        interMeseroAdmin.setVisible(true);
        escritorio.add(interMeseroAdmin);
        escritorio.moveToFront(interMeseroAdmin);
        
    }//GEN-LAST:event_jmiContratarMeseroActionPerformed

    private void jmMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmMesaMouseClicked
        
        escritorio.removeAll();
        escritorio.repaint();
        ViewSalonMesa interMesa = new ViewSalonMesa();
        interMesa.setVisible(true);
        escritorio.add(interMesa);
        escritorio.moveToFront(interMesa);
        
    }//GEN-LAST:event_jmMesaMouseClicked

    private void jmiAñadirMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAñadirMesaActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        ViewMesaAdmin interMesaAdmin = new ViewMesaAdmin();
        interMesaAdmin.setVisible(true);
        escritorio.add(interMesaAdmin);
        escritorio.moveToFront(interMesaAdmin);
        
    }//GEN-LAST:event_jmiAñadirMesaActionPerformed

    private void jmiCargarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCargarProductoActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        ViewProductoAdmin interProductoAdmin = new ViewProductoAdmin();
        interProductoAdmin.setVisible(true);
        escritorio.add(interProductoAdmin);
        escritorio.moveToFront(interProductoAdmin);
        
        
    }//GEN-LAST:event_jmiCargarProductoActionPerformed

    private void jmiContableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContableActionPerformed
        
         escritorio.removeAll();
        escritorio.repaint();
        ViewPedidoAdmin interPedidoAdmin = new ViewPedidoAdmin();
        interPedidoAdmin.setVisible(true);
        escritorio.add(interPedidoAdmin);
        escritorio.moveToFront(interPedidoAdmin);
        
        
    }//GEN-LAST:event_jmiContableActionPerformed

    private void jmiStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiStockActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        ViewStockProductos interStock = new ViewStockProductos();
        interStock.setVisible(true);
        escritorio.add(interStock);
        escritorio.moveToFront(interStock);
        
        
    }//GEN-LAST:event_jmiStockActionPerformed

    private void jmiGuardarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGuardarReservaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewReserva interReserva = new ViewReserva();
        interReserva.setVisible(true);
        escritorio.add(interReserva);
        escritorio.moveToFront(interReserva);
    }//GEN-LAST:event_jmiGuardarReservaActionPerformed

    private void jmiListarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListarReservasActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();
        escritorio.repaint();
        ViewListarReservas interReservaList = new ViewListarReservas();
        interReservaList.setVisible(true);
        escritorio.add(interReservaList);
        escritorio.moveToFront(interReservaList);
    }//GEN-LAST:event_jmiListarReservasActionPerformed

    private void jbLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLogInActionPerformed
        // TODO add your handling code here:
        /*PARA DESPUES PROXIMAMENTE*/
        
//        if(jtfConstraseña.getText().equalsIgnoreCase("hola")){
//            jmAdministracion.setEnabled(true);
//            jpLogIn.setEnabled(false);
//            jpLogIn.setVisible(false);
//        }else{
//            JOptionPane.showMessageDialog(this, "Contraseña invalida");
//        }
        
    }//GEN-LAST:event_jbLogInActionPerformed

  
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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbLogIn;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmMesa;
    private javax.swing.JMenu jmMesero;
    private javax.swing.JMenu jmPedido;
    private javax.swing.JMenu jmReserva;
    private javax.swing.JMenuItem jmiAñadirMesa;
    private javax.swing.JMenuItem jmiCargarProducto;
    private javax.swing.JMenuItem jmiContable;
    private javax.swing.JMenuItem jmiContratarMesero;
    private javax.swing.JMenuItem jmiGuardarReserva;
    private javax.swing.JMenuItem jmiListarReservas;
    private javax.swing.JMenuItem jmiStock;
    private javax.swing.JPanel jpLogIn;
    private javax.swing.JTextField jtfConstraseña;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
