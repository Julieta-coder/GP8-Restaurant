
package views;

import Entidades.Mesero;
import java.awt.Graphics;
import java.awt.Image;
import static java.lang.Integer.parseInt;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import persistencia.MeseroData;


public class ViewPrincipal extends javax.swing.JFrame {

    private boolean inicioSesion = false;
    
    
    public ViewPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        configurarEscritorio(); //llamo el metodo que cree para centrar el panel del login
    
        jmMesa.setEnabled(false);
        jmMesero.setEnabled(false);
        jmPedido.setEnabled(false);
        jmReserva.setEnabled(false);
        jmAdministracion.setEnabled(false);
      
      
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
        jbLogIn = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jlFondoLogin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmMesa = new javax.swing.JMenu();
        jmMesero = new javax.swing.JMenu();
        jmPedido = new javax.swing.JMenu();
        jmReserva = new javax.swing.JMenu();
        jmiGuardarReserva = new javax.swing.JMenuItem();
        jmiListarReservas = new javax.swing.JMenuItem();
        jmiComandas = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jmiContratarMesero = new javax.swing.JMenuItem();
        jmiAñadirMesa = new javax.swing.JMenuItem();
        jmiCargarProducto = new javax.swing.JMenuItem();
        jmiContable = new javax.swing.JMenuItem();
        jmiStock = new javax.swing.JMenuItem();
        jmiPersonal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setText("DNI:");
        jpLogIn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jtfUsuario.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jtfUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jtfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfUsuarioKeyTyped(evt);
            }
        });
        jpLogIn.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 104, 250, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");
        jpLogIn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 160, -1, -1));

        jbLogIn.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jbLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar.png"))); // NOI18N
        jbLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogInActionPerformed(evt);
            }
        });
        jpLogIn.add(jbLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 50, -1));

        jPassword.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpLogIn.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 250, 30));

        jlFondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo cuadrado 4.png"))); // NOI18N
        jpLogIn.add(jlFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 340));

        escritorio.setLayer(jpLogIn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jpLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jpLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

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

        jmPedido.setText("Caja");
        jmPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmPedidoMouseClicked(evt);
            }
        });
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

        jmiComandas.setText("Comandas");
        jmiComandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiComandasActionPerformed(evt);
            }
        });
        jmReserva.add(jmiComandas);

        jMenuBar1.add(jmReserva);

        jmAdministracion.setText("Administracion");
        jmAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdministracionActionPerformed(evt);
            }
        });

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

        jmiPersonal.setText("Personal");
        jmiPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPersonalActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiPersonal);

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
       if(jtfUsuario.getText().trim().isEmpty() || jPassword.getText().trim().isEmpty()){
           
           JOptionPane.showMessageDialog(this, "Debe ingresar usuario y contraseña");
           return;   
       } 
        
      try{
        MeseroData md = new MeseroData();
        Integer usuario = Integer.valueOf(jtfUsuario.getText().trim());
        String contra = jPassword.getText();

        Mesero mesero = md.buscarMozoPorDni(usuario);

         if(mesero !=null && usuario.equals(mesero.getDni()) && (contra.equals(mesero.getContraseña()))){
               // JOptionPane.showMessageDialog(this, "Ingreso correctamente!!");
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
            jPassword.setText("");
        }    
       }catch(NumberFormatException ex){
       
           JOptionPane.showMessageDialog(this, "El usuario debe ser un dni numerico");
           jtfUsuario.setText("");
           jPassword.setText("");
       
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

    private void jmPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmPedidoMouseClicked
        
      if(inicioSesion){   
          
         escritorio.removeAll();
         escritorio.repaint();
         ViewCaja interCaja = new ViewCaja();
         interCaja.setVisible(true);
         escritorio.add(interCaja);
         escritorio.moveToFront(interCaja);
        
        }else{
          
        JOptionPane.showMessageDialog(this, "Debe iniciar sesion para acceder");
     }
        
        
    }//GEN-LAST:event_jmPedidoMouseClicked

    private void jmiComandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiComandasActionPerformed
        // TODO add your handling code here:
        
         escritorio.removeAll();
        escritorio.repaint();
        ViewComandas interComandas = new ViewComandas();
        interComandas.setVisible(true);
        escritorio.add(interComandas);
        escritorio.moveToFront(interComandas);
    }//GEN-LAST:event_jmiComandasActionPerformed

    private void jmAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdministracionActionPerformed

    }//GEN-LAST:event_jmAdministracionActionPerformed

    private void jmiPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPersonalActionPerformed
        // TODO add your handling code here:
       escritorio.removeAll();
        escritorio.repaint();
        ViewPersonal interPersonal = new ViewPersonal();
        interPersonal.setVisible(true);
        escritorio.add(interPersonal);
        escritorio.moveToFront(interPersonal);
    }//GEN-LAST:event_jmiPersonalActionPerformed

    private void jtfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsuarioKeyTyped
        // TODO add your handling code here:
             char c = evt.getKeyChar();
         
        
        if (c>'9' || c<'0') evt.consume();
        
        if( jtfUsuario.getText().length() >= 8 ){
            evt.consume();
    }//GEN-LAST:event_jtfUsuarioKeyTyped
 }
  
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
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbLogIn;
    private javax.swing.JLabel jlFondoLogin;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmMesa;
    private javax.swing.JMenu jmMesero;
    private javax.swing.JMenu jmPedido;
    private javax.swing.JMenu jmReserva;
    private javax.swing.JMenuItem jmiAñadirMesa;
    private javax.swing.JMenuItem jmiCargarProducto;
    private javax.swing.JMenuItem jmiComandas;
    private javax.swing.JMenuItem jmiContable;
    private javax.swing.JMenuItem jmiContratarMesero;
    private javax.swing.JMenuItem jmiGuardarReserva;
    private javax.swing.JMenuItem jmiListarReservas;
    private javax.swing.JMenuItem jmiPersonal;
    private javax.swing.JMenuItem jmiStock;
    private javax.swing.JPanel jpLogIn;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

    //METODOS PARA CENTRAR EL PANEL DEL LOGIN CUANDO SE AGRANDA LA PNATALLA
private void centrarPanelLogin(){
    int x = (escritorio.getWidth()- jpLogIn.getWidth())/2;
    int y=(escritorio.getHeight()-jpLogIn.getHeight())/2;
    jpLogIn.setLocation(x, y);   
    
}

 private void configurarEscritorio() {
        escritorio.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                centrarPanelLogin();
            }
        });
    }
 

}
