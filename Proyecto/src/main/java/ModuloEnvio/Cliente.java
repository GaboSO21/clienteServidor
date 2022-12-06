/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ModuloEnvio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Persona.Colaborador;
import Planilla.Planilla;
import Archivos.*;

public class Cliente extends javax.swing.JFrame implements Runnable {

    public ManejoDeArchivos archivo;
    public ArrayList<Planilla> planillas;
    public List<Colaborador> colaboradores;
    public HashSet<String> fechas;

    public Cliente() {
        initComponents();
        this.archivo = new ManejoDeArchivos();
        this.planillas = new ArrayList<>();
        this.planillas = archivo.LeerPlanillas();
        this.colaboradores = new ArrayList<>();
        this.fechas = new HashSet<>();
        actualizarSet();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Cedula");
        modelo.addColumn("Horas");
        modelo.addColumn("Fecha");
        modelo.addColumn("Total");
        tablaPlanillas.setModel(modelo);
        listaFechas.removeAllItems();
        for (String fecha : fechas) {
            listaFechas.addItem(fecha);
        }
    }

    public void actualizarSet() {
        for (Planilla planilla : planillas) {
            colaboradores = planilla.getColaboradores();
            fechas.add(colaboradores.get(0).getFecha().toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customLayout = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        verPlanillas = new javax.swing.JButton();
        pnlCards = new javax.swing.JPanel();
        pnlConteo = new keeptoo.KGradientPanel();
        volverBtn = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlanillas = new javax.swing.JTable();
        listaFechas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        verPlanillas.setBackground(new java.awt.Color(51, 51, 51));
        verPlanillas.setForeground(new java.awt.Color(204, 204, 204));
        verPlanillas.setText("Cliente");
        verPlanillas.setBorder(null);
        verPlanillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPlanillasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(verPlanillas, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(60, Short.MAX_VALUE)));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(verPlanillas, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(168, Short.MAX_VALUE)));

        jSplitPane1.setLeftComponent(jPanel6);

        pnlCards.setLayout(new java.awt.CardLayout());

        pnlConteo.setkEndColor(new java.awt.Color(255, 255, 255));
        pnlConteo.setkStartColor(new java.awt.Color(153, 153, 153));
        pnlConteo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverBtn.setText("Volver");
        volverBtn.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        volverBtn.setkEndColor(new java.awt.Color(102, 102, 102));
        volverBtn.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        volverBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        volverBtn.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        volverBtn.setkStartColor(new java.awt.Color(51, 51, 51));
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        pnlConteo.add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 80, 30));

        tablaPlanillas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane1.setViewportView(tablaPlanillas);

        pnlConteo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 400, 300));

        listaFechas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaFechasItemStateChanged(evt);
            }
        });
        pnlConteo.add(listaFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, -1));

        pnlCards.add(pnlConteo, "pnlConteo");

        jSplitPane1.setRightComponent(pnlCards);

        javax.swing.GroupLayout customLayoutLayout = new javax.swing.GroupLayout(customLayout);
        customLayout.setLayout(customLayoutLayout);
        customLayoutLayout.setHorizontalGroup(
                customLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(customLayoutLayout.createSequentialGroup()
                                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        customLayoutLayout.setVerticalGroup(
                customLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(customLayoutLayout.createSequentialGroup()
                                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(customLayout, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(customLayout, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaFechasItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_listaFechasItemStateChanged
        for (Planilla planilla : planillas) {
            colaboradores = planilla.getColaboradores();
            for (Colaborador colaborador : colaboradores) {
                if (listaFechas.getSelectedItem().equals(colaborador.getFecha().toString())) {
                    DefaultTableModel modelo = new DefaultTableModel();
                    modelo.addColumn("ID");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellidos");
                    modelo.addColumn("Cedula");
                    modelo.addColumn("Horas");
                    modelo.addColumn("Fecha");
                    modelo.addColumn("Total");
                    for (Colaborador colaborador2 : colaboradores) {
                        modelo.addRow(new Object[] { colaborador.getIdPersona(),
                                colaborador2.getNombre(),
                                colaborador2.getApellido(), colaborador2.getCedula(),
                                colaborador2.getHorasTrabajadas(),
                                colaborador2.getFecha().toString(), "--" });

                    }
                    tablaPlanillas.setModel(modelo);
                } else {
                    break;
                }
            }
        }
    }// GEN-LAST:event_listaFechasItemStateChanged

    private void verPlanillasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_verPlanillasActionPerformed

    }// GEN-LAST:event_verPlanillasActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_volverBtnActionPerformed

    }// GEN-LAST:event_volverBtnActionPerformed

    @Override
    public void run() {
        ServerSocket server = null;
        try {
            server = new ServerSocket(3302);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        while (true) {
            try {
                Socket socket = server.accept();
                ObjectInputStream stream = new ObjectInputStream(socket.getInputStream());
                try {
                    Planilla planilla = (Planilla) stream.readObject();
                    archivo.EscribirEnArchivo(planilla);
                    planillas = archivo.LeerPlanillas();
                    actualizarSet();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                stream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel customLayout;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JComboBox<String> listaFechas;
    private javax.swing.JPanel pnlCards;
    private keeptoo.KGradientPanel pnlConteo;
    private javax.swing.JTable tablaPlanillas;
    private javax.swing.JButton verPlanillas;
    private com.k33ptoo.components.KButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
