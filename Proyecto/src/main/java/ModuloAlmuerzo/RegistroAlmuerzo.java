/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ModuloAlmuerzo;

import java.awt.*;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Almuerzos.Almuerzos;
import Persona.*;
import Archivos.*;
import Menu.MenuPrincipal;


public class RegistroAlmuerzo extends javax.swing.JFrame {

    /**
     * Creates new form RegistroAlmuerzo
     */

    public CardLayout cardLayout;
    public ManejoDeArchivos archivos = new ManejoDeArchivos();
    public ArrayList<Almuerzos> almuerzos = archivos.LeerAlmuerzos();
    public ArrayList<Persona> estudiantes = archivos.LeerDatosDeArchivo();

    public RegistroAlmuerzo() {
        initComponents();
        cardLayout = (CardLayout) (pnlCards.getLayout());
        for (Almuerzos almuerzos2 : almuerzos) {
            almuerzosRegistrados.addItem(almuerzos2.getFecha().toString().replace("00:00:00 CST", ""));
            almuerzosRegistrados2.addItem(almuerzos2.getFecha().toString().replace("00:00:00 CST", ""));
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customLayout = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        registroAlmuerzo = new javax.swing.JButton();
        retiroAlmuerzo = new javax.swing.JButton();
        conteoAlmuerzo = new javax.swing.JButton();
        pnlCards = new javax.swing.JPanel();
        pnlRegistro = new keeptoo.KGradientPanel();
        diaAlmuerzo = new javax.swing.JTextField();
        mesAlmuerzo = new javax.swing.JTextField();
        annoAlmuerzo = new javax.swing.JTextField();
        crearAlmuerzo = new com.k33ptoo.components.KButton();
        volverRegistro = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlRetiro = new keeptoo.KGradientPanel();
        cedulaEstudiante = new javax.swing.JTextField();
        almuerzosRegistrados = new javax.swing.JComboBox<>();
        retirarAlmuerzo = new com.k33ptoo.components.KButton();
        volverRetiro = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        pnlConteo = new keeptoo.KGradientPanel();
        volverConteo = new com.k33ptoo.components.KButton();
        almuerzosRegistrados2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlmuerzos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        registroAlmuerzo.setBackground(new java.awt.Color(51, 51, 51));
        registroAlmuerzo.setForeground(new java.awt.Color(204, 204, 204));
        registroAlmuerzo.setText("Almuerzos");
        registroAlmuerzo.setBorder(null);
        registroAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroAlmuerzoActionPerformed(evt);
            }
        });

        retiroAlmuerzo.setBackground(new java.awt.Color(51, 51, 51));
        retiroAlmuerzo.setForeground(new java.awt.Color(204, 204, 204));
        retiroAlmuerzo.setText("Retiro");
        retiroAlmuerzo.setBorder(null);
        retiroAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retiroAlmuerzoActionPerformed(evt);
            }
        });

        conteoAlmuerzo.setBackground(new java.awt.Color(51, 51, 51));
        conteoAlmuerzo.setForeground(new java.awt.Color(204, 204, 204));
        conteoAlmuerzo.setText("Conteo");
        conteoAlmuerzo.setBorder(null);
        conteoAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conteoAlmuerzoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registroAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retiroAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conteoAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(registroAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(retiroAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(conteoAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jSplitPane1.setLeftComponent(jPanel6);

        pnlCards.setLayout(new java.awt.CardLayout());

        pnlRegistro.setkEndColor(new java.awt.Color(255, 255, 255));
        pnlRegistro.setkStartColor(new java.awt.Color(153, 153, 153));
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diaAlmuerzo.setBackground(new java.awt.Color(255, 255, 255));
        diaAlmuerzo.setForeground(new java.awt.Color(102, 102, 102));
        diaAlmuerzo.setText("Dia...");
        diaAlmuerzo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        diaAlmuerzo.setCaretColor(new java.awt.Color(0, 0, 255));
        diaAlmuerzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diaAlmuerzoMouseClicked(evt);
            }
        });
        diaAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaAlmuerzoActionPerformed(evt);
            }
        });
        pnlRegistro.add(diaAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 90, -1));

        mesAlmuerzo.setBackground(new java.awt.Color(255, 255, 255));
        mesAlmuerzo.setForeground(new java.awt.Color(102, 102, 102));
        mesAlmuerzo.setText("Mes...");
        mesAlmuerzo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        mesAlmuerzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesAlmuerzoMouseClicked(evt);
            }
        });
        pnlRegistro.add(mesAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 90, -1));

        annoAlmuerzo.setBackground(new java.awt.Color(255, 255, 255));
        annoAlmuerzo.setForeground(new java.awt.Color(102, 102, 102));
        annoAlmuerzo.setText("Anno...");
        annoAlmuerzo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        annoAlmuerzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annoAlmuerzoMouseClicked(evt);
            }
        });
        pnlRegistro.add(annoAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 90, -1));

        crearAlmuerzo.setText("Crear");
        crearAlmuerzo.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        crearAlmuerzo.setkEndColor(new java.awt.Color(51, 51, 51));
        crearAlmuerzo.setkHoverColor(new java.awt.Color(102, 102, 102));
        crearAlmuerzo.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        crearAlmuerzo.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        crearAlmuerzo.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        crearAlmuerzo.setkStartColor(new java.awt.Color(51, 51, 51));
        crearAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearAlmuerzoActionPerformed(evt);
            }
        });
        pnlRegistro.add(crearAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 150, -1));

        volverRegistro.setText("Volver");
        volverRegistro.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        volverRegistro.setkEndColor(new java.awt.Color(102, 102, 102));
        volverRegistro.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        volverRegistro.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        volverRegistro.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        volverRegistro.setkStartColor(new java.awt.Color(51, 51, 51));
        volverRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverRegistroActionPerformed(evt);
            }
        });
        pnlRegistro.add(volverRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 80, 30));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("/");
        pnlRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 30, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("dd:");
        pnlRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("MM:");
        pnlRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("yyyy:");
        pnlRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("/");
        pnlRegistro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 30, -1));

        pnlCards.add(pnlRegistro, "pnlRegistro");

        pnlRetiro.setkEndColor(new java.awt.Color(255, 255, 255));
        pnlRetiro.setkStartColor(new java.awt.Color(153, 153, 153));
        pnlRetiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulaEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        cedulaEstudiante.setForeground(new java.awt.Color(102, 102, 102));
        cedulaEstudiante.setText("Cedula...");
        cedulaEstudiante.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        cedulaEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cedulaEstudianteMouseClicked(evt);
            }
        });
        pnlRetiro.add(cedulaEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 321, -1));

        almuerzosRegistrados.setBackground(new java.awt.Color(255, 255, 255));
        almuerzosRegistrados.setForeground(new java.awt.Color(0, 0, 0));
        almuerzosRegistrados.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        almuerzosRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almuerzosRegistradosActionPerformed(evt);
            }
        });
        pnlRetiro.add(almuerzosRegistrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 150, -1));

        retirarAlmuerzo.setText("Retirar");
        retirarAlmuerzo.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        retirarAlmuerzo.setkEndColor(new java.awt.Color(51, 51, 51));
        retirarAlmuerzo.setkHoverColor(new java.awt.Color(102, 102, 102));
        retirarAlmuerzo.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        retirarAlmuerzo.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        retirarAlmuerzo.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        retirarAlmuerzo.setkStartColor(new java.awt.Color(51, 51, 51));
        retirarAlmuerzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarAlmuerzoActionPerformed(evt);
            }
        });
        pnlRetiro.add(retirarAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 150, -1));

        volverRetiro.setText("Volver");
        volverRetiro.setToolTipText("");
        volverRetiro.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        volverRetiro.setkEndColor(new java.awt.Color(102, 102, 102));
        volverRetiro.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        volverRetiro.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        volverRetiro.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        volverRetiro.setkStartColor(new java.awt.Color(51, 51, 51));
        volverRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverRetiroActionPerformed(evt);
            }
        });
        pnlRetiro.add(volverRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 80, 30));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Dia:");
        pnlRetiro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        pnlCards.add(pnlRetiro, "pnlRetiro");

        pnlConteo.setkEndColor(new java.awt.Color(255, 255, 255));
        pnlConteo.setkStartColor(new java.awt.Color(153, 153, 153));
        pnlConteo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverConteo.setText("Volver");
        volverConteo.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        volverConteo.setkEndColor(new java.awt.Color(102, 102, 102));
        volverConteo.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        volverConteo.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        volverConteo.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        volverConteo.setkStartColor(new java.awt.Color(51, 51, 51));
        volverConteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverConteoActionPerformed(evt);
            }
        });
        pnlConteo.add(volverConteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 80, 30));

        almuerzosRegistrados2.setBackground(new java.awt.Color(255, 255, 255));
        almuerzosRegistrados2.setForeground(new java.awt.Color(0, 0, 0));
        almuerzosRegistrados2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        almuerzosRegistrados2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                almuerzosRegistrados2ItemStateChanged(evt);
            }
        });
        almuerzosRegistrados2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almuerzosRegistrados2ActionPerformed(evt);
            }
        });
        pnlConteo.add(almuerzosRegistrados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, -1));

        tablaAlmuerzos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaAlmuerzos);

        pnlConteo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 400, 300));

        pnlCards.add(pnlConteo, "pnlConteo");

        jSplitPane1.setRightComponent(pnlCards);

        javax.swing.GroupLayout customLayoutLayout = new javax.swing.GroupLayout(customLayout);
        customLayout.setLayout(customLayoutLayout);
        customLayoutLayout.setHorizontalGroup(
            customLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customLayoutLayout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        customLayoutLayout.setVerticalGroup(
            customLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customLayoutLayout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(customLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void almuerzosRegistrados2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_almuerzosRegistrados2ItemStateChanged
        for (Almuerzos almuerzos2 : almuerzos) {
            if (almuerzos2.getFecha().toString().replace("00:00:00 CST", "")
                    .equals(almuerzosRegistrados2.getSelectedItem())) {
                ArrayList<Persona> estudiantes = almuerzos2.getEstudiantes();
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellidos");
                modelo.addColumn("Edad");
                modelo.addColumn("Cedula");
                modelo.addColumn("Seccion");
                modelo.addColumn("Beca");
                modelo.addColumn("Estado");
                for (Persona persona : estudiantes) {
                    Estudiante estudiante = (Estudiante) persona;
                    modelo.addRow(new Object[] { estudiante.getNombre(), estudiante.getApellido(), estudiante.getEdad(),
                            estudiante.getCedula(), estudiante.getGrupo(), estudiante.isBeca(),
                            estudiante.isActividad() });
                }
                tablaAlmuerzos.setModel(modelo);
                return;
            }
        }
    }//GEN-LAST:event_almuerzosRegistrados2ItemStateChanged

    private void almuerzosRegistrados2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_almuerzosRegistrados2ActionPerformed

    }// GEN-LAST:event_almuerzosRegistrados2ActionPerformed

    private void registroAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registroAlmuerzoActionPerformed
        cardLayout.show(pnlCards, "pnlRegistro");
    }// GEN-LAST:event_registroAlmuerzoActionPerformed

    private void retiroAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_retiroAlmuerzoActionPerformed
        cardLayout.show(pnlCards, "pnlRetiro");
    }// GEN-LAST:event_retiroAlmuerzoActionPerformed

    private void conteoAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_conteoAlmuerzoActionPerformed
        cardLayout.show(pnlCards, "pnlConteo");
    }// GEN-LAST:event_conteoAlmuerzoActionPerformed

    private void diaAlmuerzoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_diaAlmuerzoMouseClicked
        diaAlmuerzo.setText("");
        diaAlmuerzo.setForeground(Color.BLACK);
    }// GEN-LAST:event_diaAlmuerzoMouseClicked

    private void diaAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_diaAlmuerzoActionPerformed

    }// GEN-LAST:event_diaAlmuerzoActionPerformed

    private void mesAlmuerzoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_mesAlmuerzoMouseClicked
        mesAlmuerzo.setText("");
        mesAlmuerzo.setForeground(Color.BLACK);
    }// GEN-LAST:event_mesAlmuerzoMouseClicked

    private void annoAlmuerzoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_annoAlmuerzoMouseClicked
        annoAlmuerzo.setText("");
        annoAlmuerzo.setForeground(Color.BLACK);
    }// GEN-LAST:event_annoAlmuerzoMouseClickeda

    private void crearAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_crearAlmuerzoActionPerformed
        if (revisarAlmuerzos()) {
            return;
        } else {
            Almuerzos almuerzo = new Almuerzos(
                    diaAlmuerzo.getText() + "/" + mesAlmuerzo.getText() + "/" + annoAlmuerzo.getText());
            archivos.EscribirEnArchivo(almuerzo);
            almuerzosRegistrados.addItem(almuerzo.getFecha().toString().replace("00:00:00 CST", ""));
            almuerzosRegistrados2.addItem(almuerzo.getFecha().toString().replace("00:00:00 CST", ""));
            JOptionPane.showMessageDialog(rootPane, "Dia de almuerzo registrado.", getTitle(), 1);
            almuerzos = archivos.LeerAlmuerzos();
            reinicarCampos();
        }
    }// GEN-LAST:event_crearAlmuerzoActionPerformed

    public boolean revisarAlmuerzos() {
        try {
            Almuerzos almuerzo = new Almuerzos(
                diaAlmuerzo.getText() + "/" + mesAlmuerzo.getText() + "/" + annoAlmuerzo.getText());
        for (Almuerzos almuerzos2 : almuerzos) {
            if (almuerzos2.getFecha().toString().equals(almuerzo.getFecha().toString())) {
                JOptionPane.showMessageDialog(rootPane, "Este dia ya ha sido registrado anteriormente.", getTitle(), 0);
                reinicarCampos();
                return true;
            } else if (diaAlmuerzo.getText().equals("") || mesAlmuerzo.getText().equals("")
                    || annoAlmuerzo.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Campos vacios.", getTitle(), 0);
                return true;
            }
        }

        return false;
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Campos vacios.", getTitle(), 0);
            return true;
        }

    }

    private void reinicarCampos() {
        diaAlmuerzo.setText("Dia...");
        diaAlmuerzo.setForeground(Color.GRAY);
        annoAlmuerzo.setText("Anno...");
        annoAlmuerzo.setForeground(Color.GRAY);
        mesAlmuerzo.setText("Mes..");
        mesAlmuerzo.setForeground(Color.GRAY);
    }

    private void volverRegistroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_volverRegistroActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        dispose();
    }// GEN-LAST:event_volverRegistroActionPerformed

    private void cedulaEstudianteMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cedulaEstudianteMouseClicked
        cedulaEstudiante.setText("");
        cedulaEstudiante.setForeground(Color.BLACK);
    }// GEN-LAST:event_cedulaEstudianteMouseClicked

    private void retirarAlmuerzoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_retirarAlmuerzoActionPerformed
        if (cedulaEstudiante.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Campo vacio.", getTitle(), 0);
            return;
        } else {
            for (Almuerzos almuerzos2 : almuerzos) {
                ArrayList<Persona> estudiantesAlmuerzo = almuerzos2.getEstudiantes();
                if (almuerzos2.getFecha().toString().replace("00:00:00 CST", "")
                        .equals(almuerzosRegistrados.getSelectedItem())) {
                    for (Persona estudiante : estudiantes) {
                        if (estudiante instanceof Estudiante) {
                            if (cedulaEstudiante.getText().equals(estudiante.getCedula()) && estudiante.isActividad()) {
                                estudiantesAlmuerzo.add(estudiante);
                                archivos.clearAlmuerzos();
                                for (Almuerzos almuerzo : almuerzos) {
                                    archivos.EscribirEnArchivo(almuerzo);
                                }
                                JOptionPane.showMessageDialog(rootPane,
                                        estudiante.getNombre() + ", se ha retirado su almuerzo.", getTitle(), 1);
                                System.out.println(estudiantesAlmuerzo);
                                almuerzos = archivos.LeerAlmuerzos();
                                return;
                            } else if (cedulaEstudiante.getText().equals(estudiante.getCedula())
                                    && !estudiante.isActividad()) {
                                JOptionPane.showMessageDialog(rootPane, "El estudiante se encuentra inactivo.",
                                        getTitle(), 0);
                                return;
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Estudiante no encontrado.", getTitle(), 0);
        }
    }// GEN-LAST:event_retirarAlmuerzoActionPerformed

    private void volverRetiroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_volverRetiroActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        dispose();
    }// GEN-LAST:event_volverRetiroActionPerformed

    private void visualizarFechaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_crearCocineroActionPerformed
        
    }// GEN-LAST:event_crearCocineroActionPerformed

    private void volverConteoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_volverCocineroActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        dispose();
    }// GEN-LAST:event_volverCocineroActionPerformed

    private void almuerzosRegistradosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_almuerzosRegistradosActionPerformed

    }// GEN-LAST:event_almuerzosRegistradosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> almuerzosRegistrados;
    private javax.swing.JComboBox<String> almuerzosRegistrados2;
    private javax.swing.JTextField annoAlmuerzo;
    private javax.swing.JTextField cedulaEstudiante;
    private javax.swing.JButton conteoAlmuerzo;
    private com.k33ptoo.components.KButton crearAlmuerzo;
    private javax.swing.JPanel customLayout;
    private javax.swing.JTextField diaAlmuerzo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField mesAlmuerzo;
    private javax.swing.JPanel pnlCards;
    private keeptoo.KGradientPanel pnlConteo;
    private keeptoo.KGradientPanel pnlRegistro;
    private keeptoo.KGradientPanel pnlRetiro;
    private javax.swing.JButton registroAlmuerzo;
    private com.k33ptoo.components.KButton retirarAlmuerzo;
    private javax.swing.JButton retiroAlmuerzo;
    private javax.swing.JTable tablaAlmuerzos;
    private com.k33ptoo.components.KButton volverConteo;
    private com.k33ptoo.components.KButton volverRegistro;
    private com.k33ptoo.components.KButton volverRetiro;
    // End of variables declaration//GEN-END:variables
}
