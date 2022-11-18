/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menus;

import java.util.*;

import javax.swing.JOptionPane;

import Archivos.ArchivoProductos;
import Archivos.ArchivoVentas;
import Productos.Productos;
import Productos.Venta;


public class MenuVenta extends javax.swing.JFrame {

    public List<Productos> productos = ArchivoProductos.LeerDatosDeArchivo(), productosComprados = new ArrayList<>();
    public double totalCompra = 0;
    public Venta venta = new Venta();

    public MenuVenta() {
        initComponents();
        for (Productos productos2 : productos) {
            listaProductos.addItem(productos2.getNombre());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cedulaCliente = new javax.swing.JTextField();
        listaProductos = new javax.swing.JComboBox<>();
        precioProducto = new javax.swing.JTextField();
        cantidadProducto = new javax.swing.JTextField();
        agregarProducto = new javax.swing.JButton();
        terminarCompra = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(cedulaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 209, -1));

        listaProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaProductosItemStateChanged(evt);
            }
        });
        jPanel1.add(listaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        precioProducto.setEditable(false);
        jPanel1.add(precioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 210, -1));
        jPanel1.add(cantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 80, -1));

        agregarProducto.setText("Agregar");
        agregarProducto
                .setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(153, 153, 153)));
        agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(agregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 70, 30));

        terminarCompra.setText("Terminar");
        terminarCompra
                .setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(153, 153, 153)));
        terminarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarCompraActionPerformed(evt);
            }
        });
        jPanel1.add(terminarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 80, 30));

        cancelarBtn.setText("Cancelar");
        cancelarBtn
                .setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(153, 153, 153)));
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menus/hen.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setText("Cantidad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel3.setText("Cedula:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setText("Productos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel5.setText("Precio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelarBtnActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(rootPane, "Compra cancelada.", getTitle(), 1);
        dispose();
    }// GEN-LAST:event_cancelarBtnActionPerformed

    private void agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_agregarProductoActionPerformed
        if (cedulaCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Cedula vacia.", getTitle(), 0);
            return;
        } else {
            try {
                for (Productos productos2 : productos) {
                    if (productos2.getNombre().equals(listaProductos.getSelectedItem())) {
                        productosComprados.add(productos2);
                        totalCompra += productos2.calcularPrecio(Double.parseDouble(cantidadProducto.getText()));
                        productos2.setCantidad(Integer.parseInt(cantidadProducto.getText()));
                    }
                }
                cedulaCliente.setEditable(false);
                cantidadProducto.setText("");
                JOptionPane.showMessageDialog(rootPane, "Producto agregado al carrito.", getTitle(), 1);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Formato cantidad invalido.", getTitle(), 0);
            }
        }

    }// GEN-LAST:event_agregarProductoActionPerformed

    private void terminarCompraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_terminarCompraActionPerformed
        if (productosComprados.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No se puede terminar compra sin productos agregados.", getTitle(), 0);
        } else {
            venta.setCedula(cedulaCliente.getText());
            venta.setProductos(productosComprados);
            venta.setTotal(totalCompra);
            ArchivoVentas archivo = new ArchivoVentas();
            archivo.EscribirEnArchivo(venta);
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(rootPane, "Compra finalizada!.", getTitle(), 1);
            dispose();
        }
    }// GEN-LAST:event_terminarCompraActionPerformed

    private void listaProductosItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_listaProductosItemStateChanged
        for (Productos productos2 : productos) {
            if (productos2.getNombre().equals(listaProductos.getSelectedItem())) {
                precioProducto.setText(productos2.getPrecio() + "");
            }
        }
    }// GEN-LAST:event_listaProductosItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProducto;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField cantidadProducto;
    private javax.swing.JTextField cedulaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaProductos;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JButton terminarCompra;
    // End of variables declaration//GEN-END:variables
}