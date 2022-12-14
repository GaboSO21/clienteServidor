/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ModuloCalculoP;

import java.awt.CardLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Menu.MenuPrincipal;
import Persona.Colaborador;
import Persona.Persona;
import Planilla.Planilla;
import SQL.Conexion;
import SQL.SQLColaborador;


public class RegistroColaboradores extends javax.swing.JFrame {

    public Connection conexion;
    public SQLColaborador conexionSQL;
    public List<Colaborador> colaboradores = new ArrayList<>();
    public HashSet<Date> fechas = new HashSet<>();
    public CardLayout cardLayout;

    public RegistroColaboradores() {
        initComponents();
        cardLayout = (CardLayout) (pnlCards.getLayout());
        try {
            this.conexion = Conexion.getConnection();
            if (this.conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            this.conexionSQL = new SQLColaborador(conexion);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        actualizarLista();
        actualizarSet();
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

        customLayout = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        registroColaborador = new javax.swing.JButton();
        verPlanillas = new javax.swing.JButton();
        pnlCards = new javax.swing.JPanel();
        pnlColaborador = new keeptoo.KGradientPanel();
        cedulaColaborador = new javax.swing.JTextField();
        nombreColaborador = new javax.swing.JTextField();
        apellidosColaborador = new javax.swing.JTextField();
        salarioColaborador = new javax.swing.JTextField();
        mesFecha = new javax.swing.JTextField();
        annoFecha = new javax.swing.JTextField();
        crearColaborador = new com.k33ptoo.components.KButton();
        volverColaborador = new com.k33ptoo.components.KButton();
        pnlConteo = new keeptoo.KGradientPanel();
        calcularPlanilla = new com.k33ptoo.components.KButton();
        volverConteo = new com.k33ptoo.components.KButton();
        fechasRegistradas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlanillas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        registroColaborador.setBackground(new java.awt.Color(51, 51, 51));
        registroColaborador.setForeground(new java.awt.Color(204, 204, 204));
        registroColaborador.setText("Colaboladores");
        registroColaborador.setBorder(null);
        registroColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroColaboradorActionPerformed(evt);
            }
        });

        verPlanillas.setBackground(new java.awt.Color(51, 51, 51));
        verPlanillas.setForeground(new java.awt.Color(204, 204, 204));
        verPlanillas.setText("Conteo");
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
                                .addGap(29, 29, 29)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(registroColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(verPlanillas, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(48, Short.MAX_VALUE)));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(registroColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200,
                                        Short.MAX_VALUE)
                                .addComponent(verPlanillas, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)));

        jSplitPane1.setLeftComponent(jPanel6);

        pnlCards.setLayout(new java.awt.CardLayout());

        pnlColaborador.setkEndColor(new java.awt.Color(255, 255, 255));
        pnlColaborador.setkStartColor(new java.awt.Color(153, 153, 153));
        pnlColaborador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulaColaborador.setBackground(new java.awt.Color(255, 255, 255));
        cedulaColaborador.setForeground(new java.awt.Color(102, 102, 102));
        cedulaColaborador.setText("Cedula...");
        cedulaColaborador
                .setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        cedulaColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cedulaColaboradorMouseClicked(evt);
            }
        });
        pnlColaborador.add(cedulaColaborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 321, -1));

        nombreColaborador.setBackground(new java.awt.Color(255, 255, 255));
        nombreColaborador.setForeground(new java.awt.Color(102, 102, 102));
        nombreColaborador.setText("Nombre...");
        nombreColaborador
                .setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        nombreColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreColaboradorMouseClicked(evt);
            }
        });
        pnlColaborador.add(nombreColaborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 321, -1));

        apellidosColaborador.setBackground(new java.awt.Color(255, 255, 255));
        apellidosColaborador.setForeground(new java.awt.Color(102, 102, 102));
        apellidosColaborador.setText("Apellidos...");
        apellidosColaborador
                .setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        apellidosColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellidosColaboradorMouseClicked(evt);
            }
        });
        pnlColaborador.add(apellidosColaborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 321, -1));

        salarioColaborador.setBackground(new java.awt.Color(255, 255, 255));
        salarioColaborador.setForeground(new java.awt.Color(102, 102, 102));
        salarioColaborador.setText("Horas...");
        salarioColaborador
                .setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        salarioColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salarioColaboradorMouseClicked(evt);
            }
        });
        salarioColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioColaboradorActionPerformed(evt);
            }
        });
        pnlColaborador.add(salarioColaborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 321, -1));

        mesFecha.setBackground(new java.awt.Color(255, 255, 255));
        mesFecha.setForeground(new java.awt.Color(102, 102, 102));
        mesFecha.setText("Mes...");
        mesFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        mesFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesFechaMouseClicked(evt);
            }
        });
        mesFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesFechaActionPerformed(evt);
            }
        });
        pnlColaborador.add(mesFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 160, -1));

        annoFecha.setBackground(new java.awt.Color(255, 255, 255));
        annoFecha.setForeground(new java.awt.Color(102, 102, 102));
        annoFecha.setText("Anno...");
        annoFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        annoFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annoFechaMouseClicked(evt);
            }
        });
        annoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annoFechaActionPerformed(evt);
            }
        });
        pnlColaborador.add(annoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 150, -1));

        crearColaborador.setText("Crear");
        crearColaborador.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        crearColaborador.setkEndColor(new java.awt.Color(51, 51, 51));
        crearColaborador.setkHoverColor(new java.awt.Color(102, 102, 102));
        crearColaborador.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        crearColaborador.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        crearColaborador.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        crearColaborador.setkStartColor(new java.awt.Color(51, 51, 51));
        crearColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearColaboradorActionPerformed(evt);
            }
        });
        pnlColaborador.add(crearColaborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 150, -1));

        volverColaborador.setText("Volver");
        volverColaborador.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        volverColaborador.setkEndColor(new java.awt.Color(102, 102, 102));
        volverColaborador.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        volverColaborador.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        volverColaborador.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        volverColaborador.setkStartColor(new java.awt.Color(51, 51, 51));
        volverColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverColaboradorActionPerformed(evt);
            }
        });
        pnlColaborador.add(volverColaborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 80, 30));

        pnlCards.add(pnlColaborador, "pnlColaborador");

        pnlConteo.setkEndColor(new java.awt.Color(255, 255, 255));
        pnlConteo.setkStartColor(new java.awt.Color(153, 153, 153));
        pnlConteo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcularPlanilla.setText("Calcular");
        calcularPlanilla.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        calcularPlanilla.setkEndColor(new java.awt.Color(51, 51, 51));
        calcularPlanilla.setkHoverColor(new java.awt.Color(102, 102, 102));
        calcularPlanilla.setkHoverEndColor(new java.awt.Color(102, 102, 102));
        calcularPlanilla.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        calcularPlanilla.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        calcularPlanilla.setkStartColor(new java.awt.Color(51, 51, 51));
        calcularPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularPlanillaActionPerformed(evt);
            }
        });
        pnlConteo.add(calcularPlanilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 150, -1));

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
        pnlConteo.add(volverConteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 80, 30));

        fechasRegistradas.setBackground(new java.awt.Color(255, 255, 255));
        fechasRegistradas.setForeground(new java.awt.Color(0, 0, 0));
        fechasRegistradas
                .setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(102, 102, 102)));
        fechasRegistradas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fechasRegistradasItemStateChanged(evt);
            }
        });
        fechasRegistradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechasRegistradasActionPerformed(evt);
            }
        });
        pnlConteo.add(fechasRegistradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, -1));

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

    private void fechasRegistradasItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_fechasRegistradasItemStateChanged
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Cedula");
        modelo.addColumn("Horas");
        modelo.addColumn("Fecha");
        modelo.addColumn("Total");
        for (Colaborador colaborador : colaboradores) {
            if (colaborador.getFecha().toString().equals(fechasRegistradas.getSelectedItem())) {
                modelo.addRow(new Object[] { colaborador.getIdPersona(), colaborador.getNombre(),
                        colaborador.getApellido(), colaborador.getCedula(), colaborador.getHorasTrabajadas(),
                        colaborador.getFecha().toString(), "--" });
            }
        }
        tablaPlanillas.setModel(modelo);
    }// GEN-LAST:event_fechasRegistradasItemStateChanged

    public void actualizarLista() {
        try {
            colaboradores = conexionSQL.select();
            conexion.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conexion.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

    public void actualizarSet() {
        for (Colaborador colaborador : colaboradores) {
            fechas.add(colaborador.getFecha());
        }
    }

    private void registroColaboradorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registroColaboradorActionPerformed
        cardLayout.show(pnlCards, "pnlColaborador");
    }// GEN-LAST:event_registroColaboradorActionPerformed

    private void verPlanillasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_verPlanillasActionPerformed
        cardLayout.show(pnlCards, "pnlConteo");
        fechasRegistradas.removeAllItems();
        for (Date fecha : fechas) {
            fechasRegistradas.addItem(fecha.toString());
        }
    }// GEN-LAST:event_verPlanillasActionPerformed

    private void calcularPlanillaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_calcularPlanillaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaPlanillas.getModel();
        Planilla planilla = new Planilla();
        List<Colaborador> listaPlanilla = new ArrayList<>();
        for (Colaborador colaborador : colaboradores) {
            if (colaborador.getFecha().toString().equals(fechasRegistradas.getSelectedItem())) {
                listaPlanilla.add(colaborador);
            }
        }
        planilla.setColaboradores(listaPlanilla);
        modelo.addRow(new Object[] { ' ', ' ', ' ', ' ', ' ', ' ', planilla.calcularTotal() });

    }// GEN-LAST:event_calcularPlanillaActionPerformed

    private void volverConteoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_volverConteoActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        dispose();
    }// GEN-LAST:event_volverConteoActionPerformed

    private void fechasRegistradasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fechasRegistradasActionPerformed

    }// GEN-LAST:event_fechasRegistradasActionPerformed

    private void cedulaColaboradorMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cedulaColaboradorMouseClicked
        cedulaColaborador.setText("");
        cedulaColaborador.setForeground(Color.BLACK);
    }// GEN-LAST:event_cedulaColaboradorMouseClicked

    private void nombreColaboradorMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_nombreColaboradorMouseClicked
        nombreColaborador.setText("");
        nombreColaborador.setForeground(Color.BLACK);
    }// GEN-LAST:event_nombreColaboradorMouseClicked

    private void apellidosColaboradorMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_apellidosColaboradorMouseClicked
        apellidosColaborador.setText("");
        apellidosColaborador.setForeground(Color.BLACK);
    }// GEN-LAST:event_apellidosColaboradorMouseClicked

    private void salarioColaboradorMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_salarioColaboradorMouseClicked
        salarioColaborador.setText("");
        salarioColaborador.setForeground(Color.BLACK);
    }// GEN-LAST:event_salarioColaboradorMouseClicked

    private void salarioColaboradorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_salarioColaboradorActionPerformed

    }// GEN-LAST:event_salarioColaboradorActionPerformed

    private void crearColaboradorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_crearColaboradorActionPerformed
        if (revisarColab()) {
            return;
        } else {
            try {
                Persona colaborador = new Colaborador(nombreColaborador.getText(), apellidosColaborador.getText(),
                        cedulaColaborador.getText(), Integer.parseInt(salarioColaborador.getText()),
                        Date.valueOf(annoFecha.getText() + "-" + mesFecha.getText() + "-01"));
                conexionSQL.insert((Colaborador) colaborador);
                conexion.commit();
                actualizarLista();
                actualizarSet();
                JOptionPane.showMessageDialog(rootPane, "Colaborador registrado exitosamente.", getTitle(), 1);
                reinicarCampos();
            } catch (SQLException e) {
                e.printStackTrace();
                try {
                    conexion.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Valor erroneo ingresado.", getTitle(), 0);
                reinicarCampos();
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(rootPane, "Ingresar fecha valida.", getTitle(), 0);
                reinicarCampos();
            }
        }
    }// GEN-LAST:event_crearColaboradorActionPerformed

    private void volverColaboradorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_volverColaboradorActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        dispose();
    }// GEN-LAST:event_volverColaboradorActionPerformed

    private void mesFechaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_mesFechaMouseClicked
        mesFecha.setText("");
        mesFecha.setForeground(Color.black);
    }// GEN-LAST:event_mesFechaMouseClicked

    private void mesFechaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mesFechaActionPerformed

    }// GEN-LAST:event_mesFechaActionPerformed

    private void annoFechaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_annoFechaMouseClicked
        annoFecha.setText("");
        annoFecha.setForeground(Color.BLACK);
    }// GEN-LAST:event_annoFechaMouseClicked

    private void annoFechaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_annoFechaActionPerformed

    }// GEN-LAST:event_annoFechaActionPerformed

    private void reinicarCampos() {
        nombreColaborador.setText("Nombre...");
        nombreColaborador.setForeground(Color.GRAY);
        apellidosColaborador.setText("Apellidos...");
        apellidosColaborador.setForeground(Color.GRAY);
        cedulaColaborador.setText("Cedula..");
        cedulaColaborador.setForeground(Color.GRAY);
        salarioColaborador.setText("Horas");
        salarioColaborador.setForeground(Color.GRAY);
        annoFecha.setText("Anno...");
        annoFecha.setForeground(Color.GRAY);
        mesFecha.setText("Mes...");
        mesFecha.setForeground(Color.GRAY);
    }

    private boolean revisarColab() {
        for (Colaborador colaborador : colaboradores) {
            if (colaborador.getCedula().equals(cedulaColaborador.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Colaborador ya existe.", getTitle(), 0);
                return true;
            } else if (nombreColaborador.getText().equals("") || apellidosColaborador.getText().equals("")
                    || cedulaColaborador.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Campos vacios.", getTitle(), 0);
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField annoFecha;
    private javax.swing.JTextField apellidosColaborador;
    private com.k33ptoo.components.KButton calcularPlanilla;
    private javax.swing.JTextField cedulaColaborador;
    private com.k33ptoo.components.KButton crearColaborador;
    private javax.swing.JPanel customLayout;
    private javax.swing.JComboBox<String> fechasRegistradas;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField mesFecha;
    private javax.swing.JTextField nombreColaborador;
    private javax.swing.JPanel pnlCards;
    private keeptoo.KGradientPanel pnlColaborador;
    private keeptoo.KGradientPanel pnlConteo;
    private javax.swing.JButton registroColaborador;
    private javax.swing.JTextField salarioColaborador;
    private javax.swing.JTable tablaPlanillas;
    private javax.swing.JButton verPlanillas;
    private com.k33ptoo.components.KButton volverColaborador;
    private com.k33ptoo.components.KButton volverConteo;
    // End of variables declaration//GEN-END:variables
}
