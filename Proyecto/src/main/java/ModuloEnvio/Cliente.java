/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ModuloEnvio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Persona.Colaborador;
import Planilla.Planilla;

/**
 *
 * @author melis-macbook
 */
public class Cliente extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
        initComponents();
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

        customLayout = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        verPlanillas = new javax.swing.JButton();
        pnlCards = new javax.swing.JPanel();
        pnlConteo = new keeptoo.KGradientPanel();
        volverBtn = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlanillas = new javax.swing.JTable();

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
        pnlConteo.add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 80, 30));

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
        while (true)// Ejecutar el ciclo listen/accept constantemente
        {
            try {
                System.out.println("\nEsperando conexiones...");
                Socket socket = server.accept();// Espera y se mantiene a la escucha de una conexión
                ObjectInputStream stream = new ObjectInputStream(socket.getInputStream());
                try {
                    Planilla planilla = (Planilla) stream.readObject();
                    List<Colaborador> colaboradores = planilla.getColaboradores();
                    DefaultTableModel modelo = new DefaultTableModel();
                    modelo.addColumn("ID");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellidos");
                    modelo.addColumn("Cedula");
                    modelo.addColumn("Horas");
                    modelo.addColumn("Fecha");
                    modelo.addColumn("Total");
                    for (Colaborador colaborador : colaboradores) {
                        modelo.addRow(new Object[] { colaborador.getIdPersona(), colaborador.getNombre(),
                                colaborador.getApellido(), colaborador.getCedula(),
                                colaborador.getHorasTrabajadas(),
                                colaborador.getFecha().toString(), "--" });
                    }
                    tablaPlanillas.setModel(modelo);
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
    private javax.swing.JPanel pnlCards;
    private keeptoo.KGradientPanel pnlConteo;
    private javax.swing.JTable tablaPlanillas;
    private javax.swing.JButton verPlanillas;
    private com.k33ptoo.components.KButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
