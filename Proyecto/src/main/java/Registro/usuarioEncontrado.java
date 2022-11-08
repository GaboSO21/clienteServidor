/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Registro;

import javax.swing.table.DefaultTableModel;

import Persona.Cocinero;
import Persona.Estudiante;
import Persona.Persona;
import Persona.Profesor;

/**
 *
 * @author GabrielPC
 */
public class usuarioEncontrado extends javax.swing.JFrame {

        private int usuario;
        private static Persona persona;

        /**
         * Creates new form usuarioEncontrado
         */
        public usuarioEncontrado(Estudiante estudiante) {
                initComponents();
                setVisible(true);
                setLocationRelativeTo(null);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellidos");
                modelo.addColumn("Edad");
                modelo.addColumn("Cedula");
                modelo.addColumn("Seccion");
                modelo.addColumn("Beca");
                modelo.addColumn("Estado");
                modelo.addRow(new Object[] { estudiante.getNombre(), estudiante.getApellido(), estudiante.getEdad(),
                                estudiante.getCedula(), estudiante.getGrupo(), estudiante.isBeca(),
                                estudiante.isActividad() });
                tablaEncontrado.setModel(modelo);
                this.usuario = 1;
                usuarioEncontrado.persona = (Estudiante) estudiante;
        }

        public usuarioEncontrado(Profesor profesor) {
                initComponents();
                setVisible(true);
                setLocationRelativeTo(null);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellidos");
                modelo.addColumn("Correo");
                modelo.addColumn("Cedula");
                modelo.addColumn("Estado");
                modelo.addColumn("Salario");
                modelo.addRow(new Object[] { profesor.getNombre(), profesor.getApellido(), profesor.getCorreo(),
                                profesor.getCedula(), profesor.isActividad(), profesor.getSalario() });
                tablaEncontrado.setModel(modelo);
                this.usuario = 2;
                usuarioEncontrado.persona = (Profesor) profesor;
        }

        public usuarioEncontrado(Cocinero cocinero) {
                initComponents();
                setVisible(true);
                setLocationRelativeTo(null);
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellidos");
                modelo.addColumn("Cedula");
                modelo.addColumn("Estado");
                modelo.addColumn("Salario");
                modelo.addRow(new Object[] { cocinero.getNombre(), cocinero.getApellido(), cocinero.getCedula(),
                                cocinero.isActividad(), cocinero.getSalario() });
                tablaEncontrado.setModel(modelo);
                this.usuario = 3;
                usuarioEncontrado.persona = (Cocinero) cocinero;
        }

        public static Persona getPersona() {
                return persona;
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
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEncontrado = new javax.swing.JTable();
        volverBuscar = new javax.swing.JButton();
        editarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 153, 153));

        tablaEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEncontrado);
        if (tablaEncontrado.getColumnModel().getColumnCount() > 0) {
            tablaEncontrado.getColumnModel().getColumn(0).setResizable(false);
            tablaEncontrado.getColumnModel().getColumn(1).setResizable(false);
            tablaEncontrado.getColumnModel().getColumn(2).setResizable(false);
            tablaEncontrado.getColumnModel().getColumn(3).setResizable(false);
        }

        volverBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        volverBuscar.setText("Volver");
        volverBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBuscarActionPerformed(evt);
            }
        });

        editarBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        editarBtn.setText("Editar");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volverBuscar)
                    .addComponent(editarBtn))
                .addGap(172, 172, 172))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editarBtn)
                .addGap(18, 18, 18)
                .addComponent(volverBuscar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void inactivarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_inactivarBtnActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_inactivarBtnActionPerformed

        private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editarBtnActionPerformed
                switch (usuario) {
                        case 1:
                                dispose();
                                editarEstudiante editarEstudiante = new editarEstudiante();
                                editarEstudiante.setVisible(true);
                                editarEstudiante.setLocationRelativeTo(null);
                                break;
                        case 2:
                                dispose();
                                editarProfesor editarProfesor = new editarProfesor();
                                editarProfesor.setVisible(true);
                                editarProfesor.setLocationRelativeTo(null);
                                break;
                        case 3:
                                dispose();
                                editarCocinero editarCocinero = new editarCocinero();
                                editarCocinero.setVisible(true);
                                editarCocinero.setLocationRelativeTo(null);
                                break;
                }
        }// GEN-LAST:event_editarBtnActionPerformed

        private void volverBuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_volverBuscarActionPerformed
                dispose();
        }// GEN-LAST:event_volverBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tablaEncontrado;
    private javax.swing.JButton volverBuscar;
    // End of variables declaration//GEN-END:variables
}
