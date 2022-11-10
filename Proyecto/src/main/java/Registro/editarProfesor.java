/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Registro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Archivos.ManejoDeArchivos;
import Persona.Persona;
import Persona.Profesor;

public class editarProfesor extends javax.swing.JFrame {

    /**
     * Creates new form editarProfesor
     */
    public editarProfesor() {
        initComponents();
        Profesor profesor = (Profesor) usuarioEncontrado.getPersona();
        nombreProfesor.setText(profesor.getNombre());
        apellidosProfesor.setText(profesor.getApellido());
        correoProfesor.setText(profesor.getCorreo());
        cedulaProfesor.setText(profesor.getCedula());
        salarioProfesor.setText(profesor.getSalario() + "");
        if (profesor.isActividad()) {
            estadoProfesor.setSelectedIndex(0);
        } else {
            estadoProfesor.setSelectedIndex(1);
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        correoProfesor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        estadoProfesor = new javax.swing.JComboBox<>();
        nombreProfesor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        apellidosProfesor = new javax.swing.JTextField();
        salarioProfesor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cedulaProfesor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        editarBtn = new com.k33ptoo.components.KButton();
        volver = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        correoProfesor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null,
                null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel2.add(correoProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 132, 248, -1));

        jLabel11.setText("Correo:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, -1, -1));

        jLabel10.setText("Apellidos:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 95, -1, -1));

        jLabel8.setText("Estado:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 217, -1, -1));

        estadoProfesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        estadoProfesor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null,
                null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        estadoProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoProfesorActionPerformed(evt);
            }
        });
        jPanel2.add(estadoProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 212, 87, -1));

        nombreProfesor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null,
                null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel2.add(nombreProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 49, 248, -1));

        jLabel7.setText("Nombre:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, -1, -1));

        apellidosProfesor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null,
                null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel2.add(apellidosProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 92, 248, -1));

        salarioProfesor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null,
                null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        salarioProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioProfesorActionPerformed(evt);
            }
        });
        jPanel2.add(salarioProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 256, 248, -1));

        jLabel13.setText("Salario:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 259, -1, -1));

        jLabel12.setText("Cedula:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 175, -1, -1));

        cedulaProfesor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null,
                null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel2.add(cedulaProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 172, 248, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Editar ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 6, -1, -1));

        editarBtn.setText("Editar");
        editarBtn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        editarBtn.setkEndColor(new java.awt.Color(51, 51, 51));
        editarBtn.setkHoverColor(new java.awt.Color(102, 102, 102));
        editarBtn.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        editarBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        editarBtn.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        editarBtn.setkStartColor(new java.awt.Color(51, 51, 51));
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(editarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 150, -1));

        volver.setText("Volver");
        volver.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        volver.setkEndColor(new java.awt.Color(102, 102, 102));
        volver.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        volver.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        volver.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        volver.setkStartColor(new java.awt.Color(51, 51, 51));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel2.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_volverActionPerformed
        dispose();
    }// GEN-LAST:event_volverActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editarBtnActionPerformed
        try {
            ArrayList<Persona> lista = new ManejoDeArchivos().LeerDatosDeArchivo();
            ManejoDeArchivos archivo = new ManejoDeArchivos();
            String nombre = nombreProfesor.getText(), apellidos = apellidosProfesor.getText(),
                    cedula = cedulaProfesor.getText(), correo = correoProfesor.getText();
            double salario = Double.parseDouble(salarioProfesor.getText());
            boolean estado = false;
            switch (estadoProfesor.getSelectedIndex()) {
                case 0:
                    estado = true;
                    break;
                case 1:
                    estado = false;
                    break;
            }
            archivo.clearFile();
            for (Persona persona : lista) {
                if (persona.getCedula().equals(usuarioEncontrado.getPersona().getCedula())
                        && (persona instanceof Profesor)) {
                    Profesor profesor = (Profesor) persona;
                    profesor.setActividad(estado);
                    profesor.setApellido(apellidos);
                    profesor.setCedula(cedula);
                    profesor.setCorreo(correo);
                    profesor.setNombre(nombre);
                    profesor.setSalario(salario);
                    JOptionPane.showMessageDialog(rootPane, "Profesor editado con exito.", "Registro", 1);
                    for (Persona i : lista) {
                        archivo.EscribirEnArchivo(i);
                    }
                    break;
                }
            }
            dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Error", 0);
        }
    }// GEN-LAST:event_editarBtnActionPerformed

    private void estadoProfesorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_estadoProfesorActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_estadoProfesorActionPerformed

    private void salarioProfesorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_salarioProfesorActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_salarioProfesorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidosProfesor;
    private javax.swing.JTextField cedulaProfesor;
    private javax.swing.JTextField correoProfesor;
    private com.k33ptoo.components.KButton editarBtn;
    private javax.swing.JComboBox<String> estadoProfesor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreProfesor;
    private javax.swing.JTextField salarioProfesor;
    private com.k33ptoo.components.KButton volver;
    // End of variables declaration//GEN-END:variables
}
