/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import Entidades.Mesero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.MeseroData;

/**
 *
 * @author nelso
 */
public class ViewMeseroAdmin extends javax.swing.JInternalFrame {
    private List <Mesero> meseros = new ArrayList<>();
    private MeseroData meseroData = new MeseroData();
    
    
    

    /**
     * Creates new form ViewMesero
     */
    public ViewMeseroAdmin() {
        initComponents();
        jbEliminar.setEnabled(false);
        jbActualizar.setEnabled(false);
//        armarCabeceraTabla();
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jlContraseña = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtDNI = new javax.swing.JTextField();
        jpContraseña = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jbActualizar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();

        setTitle("Agregar Mesero");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlNombre.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jlNombre.setText("Nombre:");
        getContentPane().add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 30));

        jlApellido.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jlApellido.setText("Apellido:");
        getContentPane().add(jlApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 30));

        jlDni.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jlDni.setText("DNI:");
        getContentPane().add(jlDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 30));

        jlContraseña.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jlContraseña.setText("Contraseña:");
        getContentPane().add(jlContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 30));

        jtNombre.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 210, 30));

        jtApellido.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, 30));

        jtDNI.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDNIKeyTyped(evt);
            }
        });
        getContentPane().add(jtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 210, 30));

        jpContraseña.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jpContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpContraseñaKeyTyped(evt);
            }
        });
        getContentPane().add(jpContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 210, 30));

        jbEliminar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 110, 30));

        jbBuscar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 110, -1));

        jbAgregar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jtID.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        getContentPane().add(jtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 80, 30));

        jbActualizar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 110, 30));

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cruz.png"))); // NOI18N
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 30, 30));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo cuadrado 4.png"))); // NOI18N
        jlFondo.setText("jLabel2");
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
//        try {
//            
//            String nombre = jtNombre.getText();
//            String apellido = jtApellido.getText();
//            int dni = Integer.parseInt(jtDNI.getText());
//            if(dni<999999){
//                JOptionPane.showMessageDialog(this, "DNI invalido.");
//                return;
//            }
//            String contraseña = jpContraseña.getText();
//        
//            if(nombre.isEmpty() || apellido.isEmpty() || dni == 0 || contraseña.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Completar todos los campos.");
//                return;
//            }
//            Mesero mesero = new Mesero (nombre, apellido, dni, LocalDate.now(), contraseña, true);
//            
//            meseroData.agregarMesero(mesero);
//                    jtNombre.setText("");
//                    jtApellido.setText("");
//                    jtDNI.setText("");
//                    jpContraseña.setText("");
//                    
//            Mesero nuevoMesero = new Mesero();//RECORDAR AÑADIR CONTRASEÑA Y ESTADO 
//            meseros.add(nuevoMesero);
////            cargarDatosEnTabla();
//            JOptionPane.showMessageDialog(this, "Mesero agregado exitosamente.");
//            
//        }    catch (Exception e){
//            JOptionPane.showMessageDialog(this, "DNI debe ser numerico.");
//        }
//        
  try {
        String nombre = jtNombre.getText();
        String apellido = jtApellido.getText();
        String dniTexto = jtDNI.getText();
        

        
        String contraseña = jpContraseña.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || dniTexto.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completar todos los campos.");
            return;
        }
        int dni = Integer.parseInt(dniTexto);
                // Verificar si el DNI ya existe
        if (meseroData.dniExiste(dni)) {
            JOptionPane.showMessageDialog(this, "El DNI ya está registrado.");
            return;
        }

        if (dni < 999999) {
            JOptionPane.showMessageDialog(this, "DNI inválido.");
            return;
        }
        
        Mesero mesero = new Mesero(nombre, apellido, dni, LocalDate.now(), contraseña, true);
        meseroData.agregarMesero(mesero);
        
        // Limpiar campos después de agregar
        jtNombre.setText("");
        jtApellido.setText("");
        jtDNI.setText("");
        jpContraseña.setText("");
        
        JOptionPane.showMessageDialog(this, "Mesero agregado exitosamente.");
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "DNI debe ser numérico.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
        
   
    }//GEN-LAST:event_jbAgregarActionPerformed

    
    
    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        
                                                    
    // Asegurarse de que el campo ID no esté vacío
    String idText = jtID.getText();
    if (idText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un ID para actualizar.");
        return;
    }

    try {
        // Obtener el ID y los nuevos valores de los campos
        int id = Integer.parseInt(idText);
        String nombre = jtNombre.getText().trim();
        String apellido = jtApellido.getText().trim();
        int dni = Integer.parseInt(jtDNI.getText().trim());
        String contraseña = jpContraseña.getText().trim();

        // Verificar que todos los campos estén llenos
        if (nombre.isEmpty() || apellido.isEmpty() || jtDNI.getText().isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos antes de actualizar.");
            return;
        }

        // Crear una instancia de Mesero con los nuevos datos
        Mesero mesero = new Mesero(id, nombre, apellido, dni, LocalDate.now(), contraseña, true);

        // Llamar al método de actualización en meseroData
        boolean actualizado = meseroData.actualizarMesero(mesero);

        if (actualizado) {
            JOptionPane.showMessageDialog(this, "Mesero actualizado exitosamente.");
            // Limpiar los campos después de actualizar
            jtNombre.setText("");
            jtApellido.setText("");
            jtDNI.setText("");
            jpContraseña.setText("");
            jtID.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un mesero con el ID especificado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "DNI e ID deben ser valores numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar el mesero: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed


                                             
    String idText = jtID.getText();
    
    if (idText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un ID para eliminar.");
        return;
    }

    try {
        int id = Integer.parseInt(idText);
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar el mesero " + "'"+meseroData.buscarMozoPorId(id).getApellido()+"'"+ " de la base de datos?", "Advertencia", JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            // Llamar al método de eliminación en meseroData
            if (meseroData.eliminarMesero(id)) { // Ahora funciona correctamente
                JOptionPane.showMessageDialog(this, "Mesero eliminado exitosamente.");
//                cargarDatosEnTabla(); // Actualizar la tabla después de eliminar
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró mesero con ID " + id);
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
    }


    
       
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed


try {
        // Obtener el ID del JTextField jtID
        int idCompare = Integer.parseInt(jtID.getText());
        // Buscar el mesero utilizando meseroData
        Mesero mesero = meseroData.buscarMozoPorId(idCompare);
          jbEliminar.setEnabled(true);
        jbActualizar.setEnabled(true);
        if (mesero != null) {
            // Si se encuentra el mesero, llenar los campos con sus datos
            jtNombre.setText(mesero.getNombre());
            jtApellido.setText(mesero.getApellido());
            jtDNI.setText(String.valueOf(mesero.getDni()));
            jpContraseña.setText(mesero.getContraseña());
            // Aquí podrías agregar más campos si es necesario
        } else {
            // Si no se encuentra el mesero, mostrar un mensaje
            JOptionPane.showMessageDialog(this, "No se encontró mesero con el ID " + idCompare);
        }

    } catch (NumberFormatException e) {
        // Si ocurre un error de formato, mostrar un mensaje
        JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
    }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jpContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpContraseñaKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jpContraseñaKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        
         if ((c>'z' || c<'a')&&(c>'Z' || c<'A')) evt.consume();
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDNIKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
         
        
        if (c>'9' || c<'0') evt.consume();
        
        if( jtDNI.getText().length() >= 8 ){
            evt.consume();
        }
    }//GEN-LAST:event_jtDNIKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        
         if ((c>'z' || c<'a')&&(c>'Z' || c<'A')) evt.consume();
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlContraseña;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jpContraseña;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}


