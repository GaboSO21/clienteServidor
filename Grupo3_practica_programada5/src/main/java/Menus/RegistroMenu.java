/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menus;

import java.util.List;

import javax.swing.JOptionPane;

import Archivos.ArchivoEspecies;
import Especie.Especies;

/**
 *
 * @author gabo-macos
 */
public class RegistroMenu extends javax.swing.JFrame {

    public List<Especies> peces;
    public ArchivoEspecies archivo;

    public RegistroMenu() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        this.archivo = new ArchivoEspecies();
        this.peces = archivo.LeerDatosDeArchivo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        precioTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        categoriaBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        registroBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        cantTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(precioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, -1));

        jLabel3.setText("Categoria:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menus/fish.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        categoriaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tropical", "Oriental" }));
        jPanel1.add(categoriaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 120, -1));

        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        jPanel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 207, -1));

        registroBtn.setText("Registrar especies");
        registroBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));
        registroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroBtnActionPerformed(evt);
            }
        });
        jPanel1.add(registroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 120, 30));

        salirBtn.setText("Salir");
        salirBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        jPanel1.add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 120, 30));
        jPanel1.add(cantTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 120, -1));

        jLabel6.setText("Cantidad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registroBtnActionPerformed
        if (revisarEspecies()) {
            return;
        } else {
            try {
                Especies pez = new Especies(nombreTxt.getText(), Integer.parseInt(cantTxt.getText()),
                        (String) categoriaBox.getSelectedItem(),
                        Double.parseDouble(precioTxt.getText()));
                archivo.EscribirEnArchivo(pez);
                peces = archivo.LeerDatosDeArchivo();
                JOptionPane.showMessageDialog(rootPane, "Especie registrada.", getTitle(), 1);
                resetTxt();
                return;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingresar numeros para precio y cantidad.", getTitle(), 0);
                return;
            }
        }

    }// GEN-LAST:event_registroBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_salirBtnActionPerformed
        dispose();
        new MenuPrincipal();
    }// GEN-LAST:event_salirBtnActionPerformed

    public boolean revisarEspecies() {

        for (Especies especies : peces) {
            if (especies.getNombre().equals(nombreTxt.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Especie ya existente.", getTitle(), 0);
                resetTxt();
                return true;
            } else if ((nombreTxt.getText().equals("")) || (cantTxt.getText().equals(""))
                    || (precioTxt.getText().equals(""))) {
                JOptionPane.showMessageDialog(rootPane, "Campos vacios.", getTitle(), 0);
                return true;
            }
        }

        return false;
    }

    public void resetTxt() {
        nombreTxt.setText("");
        cantTxt.setText("");
        precioTxt.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantTxt;
    private javax.swing.JComboBox<String> categoriaBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField precioTxt;
    private javax.swing.JButton registroBtn;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables
}
