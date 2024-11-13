/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import Entidades.Mesero;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import persistencia.MeseroData;

/**
 *
 * @author nelso
 */
public class ViewPersonal extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel(){
    public boolean isCellEditable(int row, int column) {
        return false; // Todas las celdas no son editables
    }
    };
    private MeseroData meseroData = new MeseroData();

    /**
     * Creates new form ViewPersonal
     */
    public ViewPersonal() {
        initComponents();

        String[] cabecera = {"Id", "Nombre", "Apellido", "Fecha Registro", "Estado"};
        modelo.setColumnIdentifiers(cabecera);
        jtPersonal.setModel(modelo);

        cargarDatos(); // Cargar los datos en la tabla al iniciar
    
        
        // Establecer fuente y colores de fondo y texto para el encabezado de la tabla
        jtPersonal.getTableHeader().setFont(new Font("Segoe UI", Font.ITALIC, 14));
        jtPersonal.getTableHeader().setOpaque(false);
        jtPersonal.getTableHeader().setBackground(new Color(30, 144, 255)); // Azul para el encabezado
        jtPersonal.getTableHeader().setForeground(new Color(23, 32, 42)); // Color de texto del encabezado
        jtPersonal.setRowHeight(25);

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
        for (int i = 0; i < jtPersonal.getColumnModel().getColumnCount(); i++) {
        jtPersonal.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
}

        // Aplicar el renderizador personalizado al encabezado de cada columna
        for (int i = 0; i < jtPersonal.getColumnModel().getColumnCount(); i++) {
         jtPersonal.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
}

        // Configurar para ajustar automáticamente el ancho
        jtPersonal.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        
             
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtPersonal = new javax.swing.JTable();
        jbAlta = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jtPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jtPersonal);

        jbAlta.setText("Alta");

        jbBaja.setText("Baja");

        jbEliminar.setText("Eliminar");

        jbSalir.setText("X");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSalir)
                        .addGap(294, 294, 294)
                        .addComponent(jbAlta)
                        .addGap(18, 18, 18)
                        .addComponent(jbBaja)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cargarDatos() {
        // Limpiar el modelo antes de cargar datos
        modelo.setRowCount(0);

        List<Mesero> meseros = meseroData.listarPersonal();
        for (Mesero mesero : meseros) {
            Object[] fila = new Object[5];
            fila[0] = mesero.getId_mesero();
            fila[1] = mesero.getNombre();
            fila[2] = mesero.getApellido();
            fila[3] = mesero.getFecha_registro();
            fila[4] = mesero.isEstado() ? "Activo" : "Inactivo"; // Convertir el estado booleano en texto

            modelo.addRow(fila);
        }
    
    }
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbBaja;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtPersonal;
    // End of variables declaration//GEN-END:variables
}
