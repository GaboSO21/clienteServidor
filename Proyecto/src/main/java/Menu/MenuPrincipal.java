/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import javax.swing.JOptionPane;

import Registro.ModuloRegistro;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 153, 153));

        kGradientPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 51, 51));

        kButton1.setBorder(null);
        kButton1.setText("User Module");
        kButton1.setAlignmentY(0.0F);
        kButton1.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/perfil.png"))); // NOI18N
        kButton1.setIconTextGap(5);
        kButton1.setkBorderRadius(20);
        kButton1.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton1.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton1.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton1.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/perfil.png"))); // NOI18N
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setBorder(null);
        kButton2.setText("Not available");
        kButton2.setAlignmentY(0.0F);
        kButton2.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/perfil.png"))); // NOI18N
        kButton2.setIconTextGap(5);
        kButton2.setkBorderRadius(20);
        kButton2.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton2.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton2.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton2.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/perfil.png"))); // NOI18N
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        kButton3.setBorder(null);
        kButton3.setText("Not available");
        kButton3.setAlignmentY(0.0F);
        kButton3.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/perfil.png"))); // NOI18N
        kButton3.setIconTextGap(5);
        kButton3.setkBorderRadius(20);
        kButton3.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton3.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton3.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton3.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/perfil.png"))); // NOI18N
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        kButton4.setBorder(null);
        kButton4.setText("Not available");
        kButton4.setAlignmentY(0.0F);
        kButton4.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/perfil.png"))); // NOI18N
        kButton4.setIconTextGap(5);
        kButton4.setkBorderRadius(20);
        kButton4.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton4.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton4.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton4.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/perfil.png"))); // NOI18N
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
                kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(kGradientPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(57, Short.MAX_VALUE)));
        kGradientPanel2Layout.setVerticalGroup(
                kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(31, Short.MAX_VALUE)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("EL COLEGIO");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
                kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        kGradientPanel1Layout.setVerticalGroup(
                kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout
                                .createSequentialGroup()
                                .addContainerGap(21, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kButton1ActionPerformed
        ModuloRegistro registro = new ModuloRegistro();
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
        setVisible(false);
    }// GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kButton2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Opcion no disponible.", "Menu", 0);
    }// GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kButton3ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Opcion no disponible.", "Menu", 0);
    }// GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kButton4ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Opcion no disponible.", "Menu", 0);
    }// GEN-LAST:event_kButton4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
