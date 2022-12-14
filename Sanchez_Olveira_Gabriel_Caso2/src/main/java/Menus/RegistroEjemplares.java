/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menus;

import java.util.List;

import javax.swing.JOptionPane;

import Archivos.ManejoArchivos;
import Libros.Libro;

/**
 *
 * @author GabrielPC
 */
public class RegistroEjemplares extends javax.swing.JFrame {

    public List<Libro> libros = ManejoArchivos.LeerDatosDeArchivo();

    public RegistroEjemplares() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloLibro = new javax.swing.JTextField();
        ejemplaresLibro = new javax.swing.JTextField();
        autorLibro = new javax.swing.JTextField();
        generoLibro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registrarBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 153, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(tituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 207, -1));
        jPanel1.add(ejemplaresLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 50, -1));
        jPanel1.add(autorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 207, -1));
        jPanel1.add(generoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 207, -1));

        jLabel1.setText("Ejemplares:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel2.setText("Titulo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setText("Autor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setText("Genero:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        registrarBtn.setText("Registrar");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(registrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        jPanel1.add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menus/book.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registrarBtnActionPerformed
        if (autorLibro.getText().equals("") || tituloLibro.getText().equals("") || generoLibro.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Campos vacios.", getTitle(), 0);
            return;
        } else {
            try {

                Libro libro = new Libro(tituloLibro.getText(), autorLibro.getText(), generoLibro.getText(),
                        Integer.parseInt(ejemplaresLibro.getText()));
                for (Libro lib : libros) {
                    if (lib.getTitulo().equals(libro.getTitulo())) {
                        JOptionPane.showMessageDialog(rootPane, "Ya existe.", getTitle(), 0);
                        return;
                    }
                }
                ManejoArchivos archivo = new ManejoArchivos();
                archivo.EscribirEnArchivo(libro);
                JOptionPane.showMessageDialog(rootPane, "Registrado.", getTitle(), 1);
                dispose();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }// GEN-LAST:event_registrarBtnActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_volverBtnActionPerformed
        dispose();
    }// GEN-LAST:event_volverBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorLibro;
    private javax.swing.JTextField ejemplaresLibro;
    private javax.swing.JTextField generoLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JTextField tituloLibro;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
