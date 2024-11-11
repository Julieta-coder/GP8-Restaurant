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

    private List<Mesa> mesas = new ArrayList<>();
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
        jbActivar = new javax.swing.JButton();
        jbDesactivar = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jNumeroMesa.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        getContentPane().add(jNumeroMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("Numero Mesa:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Capacidad:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));

        jAgregar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 120, 41));

        jCapacidad.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        getContentPane().add(jCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 120, -1));

        jEliminar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 110, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Disposicion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 30));

        jDisposicion.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jDisposicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ocupada", "Atendida" }));
        getContentPane().add(jDisposicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Estado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 30));

        jIdMesa.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jIdMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdMesaActionPerformed(evt);
            }
        });
        getContentPane().add(jIdMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 120, -1));

        jBuscar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 92, 36));

        jDetalleMesa.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 743, 164));

        Actualizar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 110, 41));

        jListaEstado.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jListaEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activa", "Inactiva" }));
        jListaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListaEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jListaEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 216, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setText("Estado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 68, -1));

        jSalir.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cruz.png"))); // NOI18N
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 30, 30));
        getContentPane().add(jrbEstadoLogico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 40, -1));

        jbActivar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jbActivar.setText("Activar");
        jbActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivarActionPerformed(evt);
            }
        });
        getContentPane().add(jbActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 110, 40));

        jbDesactivar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jbDesactivar.setText("Desactivar");
        jbDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesactivarActionPerformed(evt);
            }
        });
        getContentPane().add(jbDesactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, 40));

        jlFondo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo grande.png"))); // NOI18N
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

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
        jDetalleMesa.getTableHeader().setFont(new Font("Segoe UI", Font.ITALIC, 12));
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
            if (existe != false) {
                JOptionPane.showMessageDialog(this, "Mesa agregada exitosamente.");
                mesaData.agregarMesa(mesa);
            } else {
                JOptionPane.showMessageDialog(this, "La mesa con el numero " + numeroMesa + " ya existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
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

    private void jbActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivarActionPerformed
        // TODO add your handling code here:
        int selectedRow = jDetalleMesa.getSelectedRow();

        if (selectedRow >= 0) {
            int id_mesa = Integer.parseInt(modelo.getValueAt(selectedRow, 0).toString());
            mesaData.altaLogica(id_mesa);
        }
    }//GEN-LAST:event_jbActivarActionPerformed

    private void jbDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesactivarActionPerformed
        // TODO add your handling code here:
        int selectedRow = jDetalleMesa.getSelectedRow();

        if (selectedRow >= 0) {
            int id_mesa = Integer.parseInt(modelo.getValueAt(selectedRow, 0).toString());
            mesaData.bajaLogica(id_mesa);
        }
    }//GEN-LAST:event_jbDesactivarActionPerformed

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
    private javax.swing.JButton jbActivar;
    private javax.swing.JButton jbDesactivar;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JRadioButton jrbEstadoLogico;
    // End of variables declaration//GEN-END:variables
}
