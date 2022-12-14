/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import java.util.List;

import javax.swing.JOptionPane;

import Archivos.ManejoArchivos;
import Automovil.Automovil;

/**
 *
 * @author gabos
 */
public class AccionesMenu extends javax.swing.JFrame {

    public ManejoArchivos archivo;
    public List<Automovil> carros;

    public AccionesMenu() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        this.archivo = new ManejoArchivos();
        this.carros = archivo.LeerDatosDeArchivo();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        placaTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        volverBtn = new javax.swing.JButton();
        buscarCarro1 = new javax.swing.JButton();
        acelerarBtn = new javax.swing.JButton();
        desacelBtn = new javax.swing.JButton();
        frenarBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/vehicle.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 360, 300));
        jPanel1.add(placaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 207, -1));

        jLabel7.setText("Placa:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        volverBtn.setText("Volver");
        volverBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(255, 255, 0)));
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        jPanel1.add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 110, 30));

        buscarCarro1.setText("Buscar carro");
        buscarCarro1
                .setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(255, 255, 0)));
        buscarCarro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCarro1ActionPerformed(evt);
            }
        });
        jPanel1.add(buscarCarro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 110, 30));

        acelerarBtn.setText("Acelerar");
        acelerarBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(255, 255, 0)));
        acelerarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acelerarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(acelerarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 30));

        desacelBtn.setText("Desacelerar");
        desacelBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(255, 255, 0)));
        desacelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desacelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(desacelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 110, 30));

        frenarBtn1.setText("Frenar");
        frenarBtn1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(255, 255, 0)));
        frenarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenarBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(frenarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_volverBtnActionPerformed
        new MenuPrincipal();
        dispose();
    }// GEN-LAST:event_volverBtnActionPerformed

    private void buscarCarro1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buscarCarro1ActionPerformed
        Automovil carro = revisarCarro();
        if (carro == null) {
            return;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Carro encontrado.", getTitle(), 1);
            jTextArea1.append("Usando carro: " + carro.toString() + "\n");
            jTextArea1.append("Velocidad actual: " + carro.getVelocidadActual());
        }
    }// GEN-LAST:event_buscarCarro1ActionPerformed

    private void acelerarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_acelerarBtnActionPerformed
        Automovil carro = revisarCarro();
        if (carro == null) {
            return;
        } else {
            carro.acelerar();
            jTextArea1.append("\nVelocidad actual: " + carro.getVelocidadActual());
            archivo.BorrarDatos();
            for (Automovil automovil : carros) {
                archivo.EscribirEnArchivo(automovil);
            }
        }
    }// GEN-LAST:event_acelerarBtnActionPerformed

    private void desacelBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_desacelBtnActionPerformed
        Automovil carro = revisarCarro();
        if (carro == null) {
            return;
        } else {
            carro.desacelerar();
            jTextArea1.append("\nVelocidad actual: " + carro.getVelocidadActual());
            archivo.BorrarDatos();
            for (Automovil automovil : carros) {
                archivo.EscribirEnArchivo(automovil);
            }
        }
    }// GEN-LAST:event_desacelBtnActionPerformed

    private void frenarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_frenarBtn1ActionPerformed
        Automovil carro = revisarCarro();
        if (carro == null) {
            return;
        } else {
            carro.frenar();
            jTextArea1.append("\nVelocidad actual: " + carro.getVelocidadActual());
            archivo.BorrarDatos();
            for (Automovil automovil : carros) {
                archivo.EscribirEnArchivo(automovil);
            }
        }
    }// GEN-LAST:event_frenarBtn1ActionPerformed

    public Automovil revisarCarro() {
        for (Automovil automovil : carros) {
            if (automovil.getPlaca().equals(placaTxt.getText())) {
                return automovil;
            } else if (placaTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Campos vacios.", getTitle(), 0);
                return null;
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Carro no encontrado.", getTitle(), 0);
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acelerarBtn;
    private javax.swing.JButton buscarCarro1;
    private javax.swing.JButton desacelBtn;
    private javax.swing.JButton frenarBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField placaTxt;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
