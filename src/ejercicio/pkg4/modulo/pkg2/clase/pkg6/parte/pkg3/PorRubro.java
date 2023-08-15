/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.modulo.pkg2.clase.pkg6.parte.pkg3;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge Santiago
 */
public class PorRubro extends javax.swing.JInternalFrame {
private DefaultTableModel modelo= new DefaultTableModel();  /// Creo el Modelo de Tabla con el que voy a trabajar 

public boolean isCellEditable(int f, int c){
                        // con este booleano se deniega la posibilidad de editar las filas y las columnas de la tabla
        return false;
    
    }

    /**
     * Creates new form PorRubro
     */
    public PorRubro() {
        initComponents();
        cargarBox();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();
        jCPorrubro = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Busqueda Por Rubro");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Supermercado \"De Todo S.A.\"");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Busqueda por Rubro");

        jTProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTProductos);

        jCPorrubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPorrubroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCPorrubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jCPorrubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        
    
    private void jCPorrubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPorrubroActionPerformed
        
        
        Categorias cate= (Categorias)jCPorrubro.getSelectedItem();
                                                                        // Con este Action Performed interactuo con el Boton de rubros y lo vinculo con 
                                                                        // la clase categoria usando el getSelectedItem
                                                                        // y luego convoco al TreeSet y con el if lo recorro y los agrega en la Tabla 
                                                                        // en la fila en el orden propuesto
                                                                        
        for (Producto produ: Supermercado.listaProducto){
            
            if(produ.getRubro().equals(jCPorrubro.getSelectedItem())){
                modelo.addRow(new Object []{
                produ.getCodigo(),
                produ.getNombre(),
                produ.getPrecio(),
                produ.getDescripcion(),
                produ.getStock(),
                });
            }
                                                         // Con este if comparo si lo que aparece en el TreeSet es igual a lo que figura en el espacio 
                                                        // para insertar caracteres y luego si hay concidencia mostrar esa informacion en la tabla 
                                                        // en ese orden
        }
        
        
    }//GEN-LAST:event_jCPorrubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categorias> jCPorrubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables

     private void cargarBox(){
                                                         // con eso agrego los item del ComboBox
                                                        // con todas las opciones de la clase enum Categorias   
        jCPorrubro.addItem(Categorias.ALIMENTOS);
        jCPorrubro.addItem(Categorias.BEBIDAS);
        jCPorrubro.addItem(Categorias.CARNICERIA);
        jCPorrubro.addItem(Categorias.FIAMBRERIA);
        jCPorrubro.addItem(Categorias.LIMPIEZA);
    }
    
    private void armarCabecera(){
                                     
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Stock");
        
        
                                     // Armo el Modelo de Tabla que necesito con los items q necesito
        jTProductos.setModel(modelo);
    }

    private void eliminarFilas(){
        
        int f = jTProductos.getRowCount()-1;
                                    // con RowCount te cuenta la cantidad de filas q hay
        for(;f>=0; f--){
            modelo.removeRow(f);
                                    // se llama a la Tabla y se renueve las filas q estan de mas con un for
        }
        
    }
    
   
}