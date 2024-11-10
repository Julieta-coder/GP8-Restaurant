
package views;

import Entidades.Mesa;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import persistencia.MesaData;




public class ViewMesaAdmin extends javax.swing.JInternalFrame {

    private List <Mesa> mesas = new ArrayList<>();
    private MesaData mesaData = new MesaData();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ViewMesaAdmin() {
        initComponents();
        armarCabeceraTabla();
        limpiarTabla();
        cargarDatosEnTabla();
                
        jNumeroMesa.setModel(new javax.swing.SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1)); // Valor inicial 0, mínimo 0, máximo Integer.MAX_VALUE, incremento 1
        jCapacidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1)); // Valor inicial 0, mínimo 0, máximo Integer.MAX_VALUE, incremento 1

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jNumeroMesa = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jAgregar = new javax.swing.JButton();
        jCapacidad = new javax.swing.JSpinner();
        jEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jDisposicion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jIdMesa = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDetalleMesa = new javax.swing.JTable();
        Actualizar = new javax.swing.JButton();
        jListaEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSalir = new javax.swing.JButton();
        jrbEstadoLogico = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setTitle("Agregar Mesa");
        setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        jNumeroMesa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setText("Numero Mesa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Capacidad");

        jAgregar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        jCapacidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jEliminar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Disposicion");

        jDisposicion.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jDisposicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ocupada", "Atendida" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setText("Estado");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel5.setText("ID");

        jIdMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdMesaActionPerformed(evt);
            }
        });

        jBuscar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jDetalleMesa.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jDetalleMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Numero Mesa", "Capacidad", "Disposicion", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jDetalleMesa);

        Actualizar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        jListaEstado.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jListaEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activa", "Inactiva" }));
        jListaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListaEstadoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel6.setText("Estado");

        jSalir.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Actualizar)
                        .addGap(125, 125, 125)
                        .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jIdMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jrbEstadoLogico)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDisposicion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jListaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jDisposicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbEstadoLogico))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jIdMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jListaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarTabla() {
    int rowCount = modelo.getRowCount();
    for (int i = rowCount - 1; i >= 0; i--) {
        modelo.removeRow(i);
    }
}

    private void cargarDatosEnTabla() {
    limpiarTabla(); // Limpia la tabla antes de cargar los nuevos datos

    // Asume que tienes una lista de mesas llamada "mesas"
    List<Mesa> mesas = mesaData.listarMesas(); // Obtiene las mesas activas desde la base de datos

    for (Mesa mesa : mesas) {
        modelo.addRow(new Object[]{
            mesa.getId_mesa(),
            mesa.getNumero(),
            mesa.getCapacidad(),
            mesa.getDisposicion(),
            mesa.getEstado() ? "Activa" : "Inactiva"
        });
    }
    
    // Establecer fuente y colores de fondo y texto para el encabezado de la tabla
    jDetalleMesa.getTableHeader().setFont(new Font("Segoe UI", Font.ITALIC, 14));
    jDetalleMesa.getTableHeader().setOpaque(false);
    jDetalleMesa.getTableHeader().setBackground(new Color(30, 144, 255)); // Azul para el encabezado
    jDetalleMesa.getTableHeader().setForeground(new Color(23, 32, 42)); // Color de texto del encabezado
    jDetalleMesa.setRowHeight(25);

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

    // Aplicar el renderizador personalizado a cada columna para el encabezado y las celdas
    for (int i = 0; i < jDetalleMesa.getColumnModel().getColumnCount(); i++) {
    jDetalleMesa.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
    jDetalleMesa.getColumnModel().getColumn(i).setCellRenderer(cellRenderer); // Aplica el centrado y los colores en celdas
}
}
   
    
    private void jIdMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIdMesaActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
               // TODO add your handling code here:
                                         
    try {
    if (jIdMesa.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID para buscar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    int id = Integer.parseInt(jIdMesa.getText().trim());

    // Llama al método buscarMesaPorId
    Mesa mesa = mesaData.buscarMesaPorId(id);

    if (mesa != null) {
        // Rellenar los campos con los datos de la mesa encontrada
        jNumeroMesa.setValue(mesa.getNumero());
        jCapacidad.setValue(mesa.getCapacidad());
        jDisposicion.setSelectedItem(mesa.getDisposicion());

        // Establece el estado en el combo box según el valor booleano
        if (mesa.getEstado()) {
            jrbEstadoLogico.isSelected();
        } else {
            jrbEstadoLogico.isSelected();
        }

        // Limpia la tabla antes de cargar los datos
        DefaultTableModel model = (DefaultTableModel) jDetalleMesa.getModel();
        model.setRowCount(0);

        // Agrega los datos de la mesa encontrada a la tabla
        model.addRow(new Object[]{
            mesa.getId_mesa(),
            mesa.getNumero(),
            mesa.getCapacidad(),
            mesa.getDisposicion(),
            mesa.getEstado() ? "Activa" : "Inactiva"
        });

    } else {
        JOptionPane.showMessageDialog(this, "La mesa no existe o está inactiva.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Debe ingresar un valor numérico en el campo ID", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NullPointerException e) {
    JOptionPane.showMessageDialog(this, "Error al intentar buscar la mesa. La mesa no existe o está inactiva.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar la mesa: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}


 
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
      
                                     
    // Corrección en el método jAgregarActionPerformed
                                   

    try {
        // Obtener los valores de los campos de entrada

        int numeroMesa = (Integer) jNumeroMesa.getValue(); // Corrección: se usa getValue en lugar de getText
        int capacidad = (Integer) jCapacidad.getValue(); // Corrección: se usa getValue en lugar de getText
        String disposicion = jDisposicion.getSelectedItem().toString();
        //boolean estado = (boolean) jEstado.getSelectedItem().);
        boolean estado = jrbEstadoLogico.isSelected();

        // Validar que todos los campos estén llenos
        if (numeroMesa == 0 || capacidad == 0 || disposicion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        // Crear una nueva mesa y agregarla a la base de datos
        Mesa mesa = new Mesa(numeroMesa, capacidad, disposicion, estado);
        boolean existe = mesaData.numeroExiste(numeroMesa);
        
        /*Comprobamos si el numero de mesa ya existe*/
        if(existe!=false){
             JOptionPane.showMessageDialog(this, "Mesa agregada exitosamente.");
             mesaData.agregarMesa(mesa);
        }else{
            JOptionPane.showMessageDialog(this,  "La mesa con el numero "+mesaData.buscarMesaPorId(numeroMesa).getNumero()+ " ya existe","Advertencia", JOptionPane.ERROR_MESSAGE);
        } 
        // Asegúrate de que mesaData esté correctamente inicializado

        // Limpiar los campos de entrada

        jNumeroMesa.setValue(0); // Corrección: se usa setValue en lugar de setText
        jCapacidad.setValue(0); // Corrección: se usa setValue en lugar de setText

        jNumeroMesa.setValue(0);
        jCapacidad.setValue(0);

        jDisposicion.setSelectedIndex(0);
        jrbEstadoLogico.isSelected();

        // Recargar la tabla para mostrar la nueva mesa
        cargarDatosEnTabla();

        // Mensaje de confirmación
       
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Capacidad y Número de Mesa deben ser valores numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al agregar la mesa: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
      
             
   // Asegúrate de que se haya seleccionado una fila en la tabla
    int selectedRow = jDetalleMesa.getSelectedRow();
    
    if (selectedRow >= 0) {
        try {
            // Asegúrate de que la edición de la celda actual se detenga para capturar el valor editado
            if (jDetalleMesa.isEditing()) {
                jDetalleMesa.getCellEditor().stopCellEditing();
            }

            // Obtener el ID de la mesa directamente de la columna de ID
            int idMesa = Integer.parseInt(modelo.getValueAt(selectedRow, 0).toString());

            // Bloquear cualquier intento de edición en la columna del ID (suponiendo que la columna 0 es el ID)
            modelo.setValueAt(idMesa, selectedRow, 0);

            // Leer y convertir los valores editables de la tabla
            int numeroMesa = Integer.parseInt(modelo.getValueAt(selectedRow, 1).toString());
            int capacidad = Integer.parseInt(modelo.getValueAt(selectedRow, 2).toString());
            String disposicion = modelo.getValueAt(selectedRow, 3).toString();
            boolean estado = modelo.getValueAt(selectedRow, 4).toString().equals("Activa");

            // Crear una instancia de Mesa sin modificar el ID
            Mesa me = new Mesa(idMesa, numeroMesa, capacidad, disposicion, estado);

            // Llamar al método para actualizar la mesa en la base de datos
            mesaData.actualizarMesa(me);

            // Mensaje de éxito
            JOptionPane.showMessageDialog(this, "Mesa actualizada exitosamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al leer los datos numéricos de la tabla. Verifica los tipos de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassCastException e) {
            JOptionPane.showMessageDialog(this, "Error al leer los datos de la tabla. Verifica los tipos de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar la mesa: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una mesa para actualizar.");
    }
  
        
    }//GEN-LAST:event_ActualizarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
       
       
     // Asegúrate de que se haya seleccionado una fila en la tabla
    int selectedRow = jDetalleMesa.getSelectedRow();

    if (selectedRow >= 0) {
        // Opciones personalizadas en castellano
        Object[] options = {"Sí", "No"};
        int confirm = JOptionPane.showOptionDialog(this, 
            "¿Estás seguro de que deseas eliminar esta mesa?", 
            "Confirmación", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0]);
        
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                // Asegúrate de que la edición de la celda actual se detenga para capturar el valor editado
                if (jDetalleMesa.isEditing()) {
                    jDetalleMesa.getCellEditor().stopCellEditing();
                }

                // Convertir el valor de la tabla con verificación de tipos
                int idMesa = Integer.parseInt(modelo.getValueAt(selectedRow, 0).toString());

                // Llamar al método para eliminar la mesa en la base de datos
                mesaData.eliminarMesa(idMesa);

                // Actualizar la tabla después de la eliminación
                limpiarTabla();
                cargarDatosEnTabla();

                // Mensaje de éxito
                JOptionPane.showMessageDialog(this, "Mesa eliminada exitosamente.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error al leer el ID de la mesa. Verifica los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al eliminar la mesa: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una mesa para eliminar.");
    }

  
        
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jListaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListaEstadoActionPerformed
        // TODO add your handling code here:
      limpiarTabla(); // Limpia la tabla antes de cargar los nuevos datos

    // Determina el estado seleccionado en el combo box
    boolean estadoSeleccionado = jListaEstado.getSelectedItem().toString().equals("Activa");

    // Llama a MesaData para obtener las mesas activas o inactivas
    List<Mesa> mesas = mesaData.listarMesasPorEstado(estadoSeleccionado);

    // Verifica si se han encontrado mesas para el estado seleccionado
    if (mesas != null && !mesas.isEmpty()) {
        // Llena la tabla con los datos de las mesas activas o inactivas
        for (Mesa mesa : mesas) {
            modelo.addRow(new Object[]{
                mesa.getId_mesa(),
                mesa.getNumero(),
                mesa.getCapacidad(),
                mesa.getDisposicion(),
                mesa.getEstado() ? "Activa" : "Inactiva"
            });
        }
    } else {
        // Muestra mensaje si no hay mesas para el estado seleccionado
        JOptionPane.showMessageDialog(this, "No hay mesas " + (estadoSeleccionado ? "activas" : "inactivas") + " para mostrar.");
    }




            
    }//GEN-LAST:event_jListaEstadoActionPerformed

    
//    private DefaultTableModel modelo;

private void armarCabeceraTabla() {
    // Crea un DefaultTableModel personalizado para evitar la edición de la columna ID
    modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            // Permite la edición de todas las columnas excepto la columna "ID" (asumimos que la columna 0 es "ID")
            return column != 0;
        }
    };
    
    // Solo agrega las columnas si el modelo aún no tiene ninguna
    if (modelo.getColumnCount() == 0) {
        modelo.addColumn("ID");
        modelo.addColumn("Numero Mesa");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Disposicion");
        modelo.addColumn("Estado");
    }

    // Asigna el modelo a la tabla
    jDetalleMesa.setModel(modelo);
    
}


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton jAgregar;
    private javax.swing.JButton jBuscar;
    private javax.swing.JSpinner jCapacidad;
    private javax.swing.JTable jDetalleMesa;
    private javax.swing.JComboBox<String> jDisposicion;
    private javax.swing.JButton jEliminar;
    private javax.swing.JTextField jIdMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jListaEstado;
    private javax.swing.JSpinner jNumeroMesa;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton jrbEstadoLogico;
    // End of variables declaration//GEN-END:variables
}