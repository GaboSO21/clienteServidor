/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import Archivos.ManejoArchivos;
import Automovil.Automovil;

/**
 *
 * @author gabos
 */
public class VerCarros extends javax.swing.JFrame {

    public ManejoArchivos archivo;
    public List<Automovil> carros;

    public VerCarros() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        this.archivo = new ManejoArchivos();
        this.carros = archivo.LeerDatosDeArchivo();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Placa");
        modelo.addColumn("Marca");
        modelo.addColumn("Combustible");
        modelo.addColumn("Transmision");
        modelo.addColumn("Modelo");
        modelo.addColumn("Velocidad Max");
        modelo.addColumn("Velocidad Actual");
        for (Automovil automovil : carros) {
            modelo.addRow(new Object[] {
                    automovil.getPlaca(), automovil.getMarca(), automovil.getCombustible(), automovil.getTransmision(),
                    automovil.getModelo(), automovil.getVelocidadMax(), automovil.getVelocidadActual()
            });
        }
        listaCarros.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        volverBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCarros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverBtn.setText("Volver");
        volverBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(255, 255, 0)));
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        jPanel1.add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 70, 30));

        listaCarros.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane1.setViewportView(listaCarros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 375, 374));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/vehicle.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_volverBtnActionPerformed
        new MenuPrincipal();
        dispose();
    }// GEN-LAST:event_volverBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaCarros;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
