
package views;

import Entidades.Mesero;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import persistencia.MeseroData;


public class ViewPrincipal extends javax.swing.JFrame {

    private boolean inicioSesion = false;
    
    public ViewPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        jmMesa.setEnabled(false);
        jmMesero.setEnabled(false);
        jmPedido.setEnabled(false);
        jmReserva.setEnabled(false);
        jmAdministracion.setEnabled(false);
        
        
        /*ACTIVAR VISIBILIDAD Y EDICION de jpLogIn DESPUES*/
      //  jpLogIn.setEnabled(false);
       // jpLogIn.setVisible(false);
//        jmAdministracion.setEnabled(false); va junto con el botono de log in
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondoresto.png"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){

                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }

        };
        jpLogIn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfContraseña = new javax.swing.JTextField();
        jbLogIn = new javax.swing.JButton();
        jlFondoLogin = new javax.swing.JLabel();
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

        jpLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Usuario:");
        jpLogIn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 60, -1, -1));

        jtfUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jpLogIn.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 104, 277, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Constraseña:");
        jpLogIn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 160, -1, -1));

        jtfContraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpLogIn.add(jtfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 204, 277, -1));

        jbLogIn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbLogIn.setText("Log in");
        jbLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogInActionPerformed(evt);
            }
        });
        jpLogIn.add(jbLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 260, -1, -1));

        jlFondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo cuadrado 4.png"))); // NOI18N
        jpLogIn.add(jlFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 340));

        escritorio.setLayer(jpLogIn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jpLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jpLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jmMesa.setText("Mesas");
        jmMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmMesaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmMesa);

        jmMesero.setText("Meseros");
        jmMesero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmMeseroMouseClicked(evt);
            }
        });
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
        
        
    if(inicioSesion){
        
        escritorio.removeAll();
        escritorio.repaint();
        ViewSalonMesa interMesa = new ViewSalonMesa();
        interMesa.setVisible(true);
        escritorio.add(interMesa);
        escritorio.moveToFront(interMesa);
        
        }else{
        JOptionPane.showMessageDialog(this, "Debe iniciar sesion para acceder");
    }
        
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
       
        //verifico que los campos no esten vacios
        //con el trim elimino si el usuario puso espacios al principio o al final 
       if(jtfUsuario.getText().trim().isEmpty() || jtfContraseña.getText().trim().isEmpty()){
           
           JOptionPane.showMessageDialog(this, "Debe ingresar usuario y contraseña");
           return;   
       } 
        
      try{
        MeseroData md = new MeseroData();
        Integer usuario = Integer.parseInt(jtfUsuario.getText());
        String contra = jtfContraseña.getText();

        Mesero mesero = md.buscarMozoPorDni(usuario);

         if(mesero !=null && usuario.equals(mesero.getDni()) && (contra.equals(mesero.getContraseña()))){
                JOptionPane.showMessageDialog(this, "Ingreso correctamente!!");
                jpLogIn.setVisible(false);
                jmMesa.setEnabled(true);
                jmMesero.setEnabled(true);
                 jmPedido.setEnabled(true);
                jmReserva.setEnabled(true);
                jmAdministracion.setEnabled(true);
                inicioSesion = true;
                
        }else {
            JOptionPane.showMessageDialog(this, "Los datos ingresados son incorrectos");
            jtfUsuario.setText("");
            jtfContraseña.setText("");
        }    
       }catch(NumberFormatException ex){
       
           JOptionPane.showMessageDialog(this, "El usuario debe ser un dni numerico");
           jtfUsuario.setText("");
           jtfContraseña.setText("");
       }
    }//GEN-LAST:event_jbLogInActionPerformed

    private void jmMeseroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmMeseroMouseClicked
        
        
     if(inicioSesion){    
         escritorio.removeAll();
         escritorio.repaint();
         ViewMesero interMesero = new ViewMesero();
         interMesero.setVisible(true);
         escritorio.add(interMesero);
         escritorio.moveToFront(interMesero);
        
        }else{
        JOptionPane.showMessageDialog(this, "Debe iniciar sesion para acceder");
     }
    }//GEN-LAST:event_jmMeseroMouseClicked

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed

    }//GEN-LAST:event_jtfUsuarioActionPerformed

  
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
    private javax.swing.JLabel jlFondoLogin;
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
    private javax.swing.JTextField jtfContraseña;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
