/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.personal.utiles.FormularioUtil;
import controlador.EventControlador;
import controlador.UserControlador;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import entidades.EventLog;
import entidades.User;
import java.util.ArrayList;
import modelos.MTEventLog;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingx.JXTable;

/**
 *
 * @author Aldo
 */
public class correccionIndividual extends javax.swing.JInternalFrame {

    /**
     * Creates new form correccionIndividual
     */
    private List<EventLog> listadoIdC;
    private List<EventLog> listadoIdI;
    private UserControlador uc;
    private EventControlador ec;
    public correccionIndividual() {
        initComponents();
        inicializar();
        bindeoSalvaje();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdIncorrecto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdCorrecto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        pnlMarcaciones = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEventsIdC = new org.jdesktop.swingx.JXTable();
        txtNombreIdCorrecto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumEventIdC = new javax.swing.JTextField();
        pnlNavegacion = new javax.swing.JPanel();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        spPagina = new javax.swing.JSpinner();
        txtTotal = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        cboTamanio = new javax.swing.JComboBox();
        btnMostrarEventsIdC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEventsIdI = new org.jdesktop.swingx.JXTable();
        txtNombreIdIncorrecto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumEventIdI = new javax.swing.JTextField();
        pnlNavegacion1 = new javax.swing.JPanel();
        btnPrimero1 = new javax.swing.JButton();
        btnAnterior1 = new javax.swing.JButton();
        spPagina1 = new javax.swing.JSpinner();
        txtTotal1 = new javax.swing.JTextField();
        btnSiguiente1 = new javax.swing.JButton();
        btnUltimo1 = new javax.swing.JButton();
        cboTamanio1 = new javax.swing.JComboBox();
        btnMostrarEventsIdI = new javax.swing.JButton();
        pnlBtn = new javax.swing.JPanel();
        btnHacerCruce = new javax.swing.JButton();

        setClosable(true);
        setTitle("Corrección de Marcaciones - Individual");
        setPreferredSize(new java.awt.Dimension(900, 500));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de empleado"));
        pnlDatos.setPreferredSize(new java.awt.Dimension(850, 150));
        java.awt.GridBagLayout jPanel4Layout = new java.awt.GridBagLayout();
        jPanel4Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel4Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        pnlDatos.setLayout(jPanel4Layout);

        jLabel1.setText("ID Correcto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        pnlDatos.add(jLabel1, gridBagConstraints);

        txtIdIncorrecto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        pnlDatos.add(txtIdIncorrecto, gridBagConstraints);

        jLabel2.setText("ID Incorrecto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        pnlDatos.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnlDatos.add(txtIdCorrecto, gridBagConstraints);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 13;
        pnlDatos.add(btnBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        getContentPane().add(pnlDatos, gridBagConstraints);

        pnlMarcaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Marcaciones a corregir"));
        java.awt.GridBagLayout jPanel5Layout = new java.awt.GridBagLayout();
        jPanel5Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel5Layout.rowHeights = new int[] {0};
        pnlMarcaciones.setLayout(jPanel5Layout);

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel2Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel2.setLayout(jPanel2Layout);

        jLabel4.setText("Usuario Correcto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel2.add(jLabel4, gridBagConstraints);

        tblEventsIdC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblEventsIdC);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        txtNombreIdCorrecto.setEditable(false);
        txtNombreIdCorrecto.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(txtNombreIdCorrecto, gridBagConstraints);

        jLabel5.setText("Marcaciones:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        txtNumEventIdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumEventIdCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.015;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 5);
        jPanel2.add(txtNumEventIdC, gridBagConstraints);

        pnlNavegacion.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        btnPrimero.setText("<<");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnPrimero);

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnAnterior);

        spPagina.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spPagina.setMinimumSize(new java.awt.Dimension(60, 20));
        spPagina.setPreferredSize(new java.awt.Dimension(60, 20));
        spPagina.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spPaginaStateChanged(evt);
            }
        });
        pnlNavegacion.add(spPagina);

        txtTotal.setEditable(false);
        txtTotal.setColumns(3);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("1");
        pnlNavegacion.add(txtTotal);

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnSiguiente);

        btnUltimo.setText(">>");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        pnlNavegacion.add(btnUltimo);

        cboTamanio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20", "25", "40", "50" }));
        cboTamanio.setMinimumSize(new java.awt.Dimension(53, 24));
        cboTamanio.setPreferredSize(new java.awt.Dimension(53, 24));
        cboTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTamanioActionPerformed(evt);
            }
        });
        pnlNavegacion.add(cboTamanio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel2.add(pnlNavegacion, gridBagConstraints);

        btnMostrarEventsIdC.setText("Mostrar marcaciones");
        btnMostrarEventsIdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEventsIdCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 21;
        jPanel2.add(btnMostrarEventsIdC, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlMarcaciones.add(jPanel2, gridBagConstraints);

        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel3Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel3.setLayout(jPanel3Layout);

        jLabel3.setText("Usuario Incorrecto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        tblEventsIdI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblEventsIdI);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel3.add(jScrollPane2, gridBagConstraints);

        txtNombreIdIncorrecto.setEditable(false);
        txtNombreIdIncorrecto.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel3.add(txtNombreIdIncorrecto, gridBagConstraints);

        jLabel6.setText("Marcaciones:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel3.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.015;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 5);
        jPanel3.add(txtNumEventIdI, gridBagConstraints);

        pnlNavegacion1.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        btnPrimero1.setText("<<");
        btnPrimero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimero1ActionPerformed(evt);
            }
        });
        pnlNavegacion1.add(btnPrimero1);

        btnAnterior1.setText("<");
        btnAnterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior1ActionPerformed(evt);
            }
        });
        pnlNavegacion1.add(btnAnterior1);

        spPagina1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spPagina1.setMinimumSize(new java.awt.Dimension(60, 20));
        spPagina1.setPreferredSize(new java.awt.Dimension(60, 20));
        spPagina1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spPagina1StateChanged(evt);
            }
        });
        pnlNavegacion1.add(spPagina1);

        txtTotal1.setEditable(false);
        txtTotal1.setColumns(3);
        txtTotal1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal1.setText("1");
        pnlNavegacion1.add(txtTotal1);

        btnSiguiente1.setText(">");
        btnSiguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente1ActionPerformed(evt);
            }
        });
        pnlNavegacion1.add(btnSiguiente1);

        btnUltimo1.setText(">>");
        btnUltimo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimo1ActionPerformed(evt);
            }
        });
        pnlNavegacion1.add(btnUltimo1);

        cboTamanio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20", "25", "40", "50" }));
        cboTamanio1.setMinimumSize(new java.awt.Dimension(53, 24));
        cboTamanio1.setPreferredSize(new java.awt.Dimension(53, 24));
        cboTamanio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTamanio1ActionPerformed(evt);
            }
        });
        pnlNavegacion1.add(cboTamanio1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 21;
        jPanel3.add(pnlNavegacion1, gridBagConstraints);

        btnMostrarEventsIdI.setText("Mostrar marcaciones");
        btnMostrarEventsIdI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEventsIdIActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 21;
        jPanel3.add(btnMostrarEventsIdI, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnlMarcaciones.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(pnlMarcaciones, gridBagConstraints);

        pnlBtn.setLayout(new java.awt.GridBagLayout());

        btnHacerCruce.setText("Hacer cruce");
        btnHacerCruce.setEnabled(false);
        btnHacerCruce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerCruceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pnlBtn.add(btnHacerCruce, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(pnlBtn, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        //Validación de campos vacios e ID's válidos
        if(erroresBusqueda()){
            return;
        }

        /**
         * eventosIdC -> Cantidad de eventos de asistencia del ID Correcto.
         * eventosIdI -> Cantidad de eventos de asistencia del ID Incorrecto.
         * */
        int eventosIdC = ec.contarEventosXID(txtIdCorrecto.getText());
        int eventosIdI = ec.contarEventosXID(txtIdIncorrecto.getText());
        
        User userIdC = uc.buscarPorId(txtIdCorrecto.getText());
        User userIdI = uc.buscarPorId(txtIdIncorrecto.getText());
        
        //Nombres para mostrar
        txtNombreIdCorrecto.setText(userIdC.getSUserName());
        txtNombreIdIncorrecto.setText(userIdI.getSUserName());
        //Cantidades a mostrar
        txtNumEventIdC.setText(eventosIdC+"");
        txtNumEventIdI.setText(eventosIdI+"");
        btnHacerCruce.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNumEventIdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumEventIdCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumEventIdCActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        // TODO add your handling code here:
        primero();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        anterior();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void spPaginaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spPaginaStateChanged
        // TODO add your handling code here:
        this.seleccionPagina();
    }//GEN-LAST:event_spPaginaStateChanged

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        siguiente();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
        ultimo();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void cboTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTamanioActionPerformed
        // TODO add your handling code here:
        this.paginaActual = 1;
        buscar();
        this.actualizarControlesNavegacion();
    }//GEN-LAST:event_cboTamanioActionPerformed

    private void btnPrimero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimero1ActionPerformed
        // TODO add your handling code here:
        primero1();
    }//GEN-LAST:event_btnPrimero1ActionPerformed

    private void btnAnterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior1ActionPerformed
        // TODO add your handling code here:
        anterior1();
    }//GEN-LAST:event_btnAnterior1ActionPerformed

    private void spPagina1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spPagina1StateChanged
        // TODO add your handling code here:
        this.seleccionPagina1();
    }//GEN-LAST:event_spPagina1StateChanged

    private void btnSiguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente1ActionPerformed
        // TODO add your handling code here:
        siguiente1();
    }//GEN-LAST:event_btnSiguiente1ActionPerformed

    private void btnUltimo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimo1ActionPerformed
        // TODO add your handling code here:
        ultimo1();
    }//GEN-LAST:event_btnUltimo1ActionPerformed

    private void cboTamanio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTamanio1ActionPerformed
        // TODO add your handling code here:
        this.paginaActual1 = 1;
        buscar1();
        this.actualizarControlesNavegacion1();
    }//GEN-LAST:event_cboTamanio1ActionPerformed

    private void btnMostrarEventsIdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEventsIdCActionPerformed
        // TODO add your handling code here:
        System.out.println("Mostrar marcaciones ID Correcto:");
        paginaActual = 1;
        buscar();
        actualizarControlesNavegacion();
    }//GEN-LAST:event_btnMostrarEventsIdCActionPerformed

    private void btnMostrarEventsIdIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEventsIdIActionPerformed
        // TODO add your handling code here:
        System.out.println("Mostrar marcaciones ID Incorrecto:");
        paginaActual1 = 1;
        buscar1();
        actualizarControlesNavegacion1();
    }//GEN-LAST:event_btnMostrarEventsIdIActionPerformed

    private void btnHacerCruceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerCruceActionPerformed
        // TODO add your handling code here:
        boolean resultado = ec.cruceEventos(txtIdCorrecto.getText(), txtIdIncorrecto.getText());
        if(resultado){                 
            uc.eliminar(uc.buscarPorId(txtIdIncorrecto.getText()));
            JOptionPane.showMessageDialog(this, "Se realizo el cruce correctamente.");
            JOptionPane.showMessageDialog(this, "Se elimino al usuario con dni incorrecto del Biostar: "+txtIdIncorrecto.getText());
            FormularioUtil.limpiarComponente(this.pnlMarcaciones);
            FormularioUtil.limpiarComponente(this.pnlDatos);
            FormularioUtil.limpiarComponente(this.pnlNavegacion);
            FormularioUtil.limpiarComponente(this.pnlNavegacion1);
            btnHacerCruce.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(this, "No se realizo el cruce correctamente.");
        }
    }//GEN-LAST:event_btnHacerCruceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAnterior1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnHacerCruce;
    private javax.swing.JButton btnMostrarEventsIdC;
    private javax.swing.JButton btnMostrarEventsIdI;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnPrimero1;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnSiguiente1;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton btnUltimo1;
    private javax.swing.JComboBox cboTamanio;
    private javax.swing.JComboBox cboTamanio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlBtn;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlMarcaciones;
    private javax.swing.JPanel pnlNavegacion;
    private javax.swing.JPanel pnlNavegacion1;
    private javax.swing.JSpinner spPagina;
    private javax.swing.JSpinner spPagina1;
    private org.jdesktop.swingx.JXTable tblEventsIdC;
    private org.jdesktop.swingx.JXTable tblEventsIdI;
    private javax.swing.JTextField txtIdCorrecto;
    private javax.swing.JTextField txtIdIncorrecto;
    private javax.swing.JTextField txtNombreIdCorrecto;
    private javax.swing.JTextField txtNombreIdIncorrecto;
    private javax.swing.JTextField txtNumEventIdC;
    private javax.swing.JTextField txtNumEventIdI;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotal1;
    // End of variables declaration//GEN-END:variables

    private boolean erroresBusqueda(){
        int errores = 0;
        String mensaje = "";
        if(txtIdCorrecto.getText().isEmpty()){
            errores++;
            mensaje += "> Debe ingresar el ID Correcto en el campo especificado \n";
        }
        if(txtIdIncorrecto.getText().isEmpty()){
            errores++;
            mensaje += "> Debe ingresar el ID Incorrecto en el campo especificado \n";
        }
        
        if(!txtIdCorrecto.getText().isEmpty() && !txtIdIncorrecto.getText().isEmpty()){
            User userCorrecto = uc.buscarPorId(txtIdCorrecto.getText());
            User userIncorrecto = uc.buscarPorId(txtIdIncorrecto.getText());
            
            if(userCorrecto == null){
                errores++;
                mensaje += "> El id "+txtIdCorrecto.getText()+" no existe en la base de datos. \n";
            }
            if(userIncorrecto == null){
                errores++;
                mensaje += "> El id "+txtIdIncorrecto.getText()+" no existe en la base de datos. \n";
            }
        }
        if(errores > 0){
            JOptionPane.showMessageDialog(this, "Se ha(n) encontrado el(los) siguiente(s) error(es):\n" + mensaje, "Mensaje del Sistema", JOptionPane.ERROR_MESSAGE);
        }
        
        return errores!=0;
    }
    
    private void inicializar(){
        
        uc = new UserControlador();
        ec = new EventControlador();
    }
    
    private int paginaActual = 1;
    private int totalPaginas = 0;
    private int tamanioPagina = 0;

    private int paginaActual1 = 1;
    private int totalPaginas1 = 0;
    private int tamanioPagina1 = 0;
    private void buscar() {
 
        tamanioPagina = Integer.parseInt(cboTamanio.getSelectedItem().toString());

        listadoIdC.clear();
        List<EventLog> lista = this.listar(txtIdCorrecto.getText(), paginaActual, tamanioPagina);
        System.out.println("LISTA: " + lista.size());
        listadoIdC.addAll(lista);

        tblEventsIdC.packAll();
    }
    
    private void buscar1() {
 
        tamanioPagina1 = Integer.parseInt(cboTamanio1.getSelectedItem().toString());

        listadoIdI.clear();
        List<EventLog> lista = this.listar1(txtIdIncorrecto.getText(), paginaActual1, tamanioPagina1);
        System.out.println("LISTA: " + lista.size());
        listadoIdI.addAll(lista);

        tblEventsIdI.packAll();
    }
    
    private List<EventLog> listar(String IdCorrecto, int pagina, int tamanio) {
        int total;

        total = ec.contarEventosXID(IdCorrecto);
        if (total % tamanio == 0) {
            totalPaginas = total / tamanio;
        } else {
            totalPaginas = (total / tamanio) + 1;
        }

        if (totalPaginas == 0) {
            totalPaginas = 1;
        }

        return ec.buscarXEventosXPagina(IdCorrecto, (pagina - 1) * tamanio, tamanio);
    }
    
    private List<EventLog> listar1(String IdIncorrecto, int pagina, int tamanio) {
        int total;

        total = ec.contarEventosXID(IdIncorrecto);
        if (total % tamanio == 0) {
            totalPaginas1 = total / tamanio;
        } else {
            totalPaginas1 = (total / tamanio) + 1;
        }

        if (totalPaginas1 == 0) {
            totalPaginas1 = 1;
        }

        return ec.buscarXEventosXPagina(IdIncorrecto, (pagina - 1) * tamanio, tamanio);
    }
     private void siguiente() {
        paginaActual++;
        if(!txtIdCorrecto.getText().isEmpty()){
            buscar();
        } 
        this.actualizarControlesNavegacion();
    }

    private void ultimo() {
        paginaActual = totalPaginas;
        if(!txtIdCorrecto.getText().isEmpty()){
            buscar();
        }
        this.actualizarControlesNavegacion();
    }

    private void primero() {
        paginaActual = 1;
        if(!txtIdCorrecto.getText().isEmpty()){
            buscar();
        }
        this.actualizarControlesNavegacion();
    }

    private void anterior() {
        paginaActual--;
        if(!txtIdCorrecto.getText().isEmpty()){
            buscar();
        }
        this.actualizarControlesNavegacion();
    }

    private void seleccionPagina() {
        paginaActual = (int) spPagina.getValue();
        if(!txtIdCorrecto.getText().isEmpty()){
            buscar();
        }
        this.actualizarControlesNavegacion();
    }

    //pagina dos
    private void siguiente1() {
        paginaActual1++;
        if(!txtIdIncorrecto.getText().isEmpty()){
            buscar1();
        } 
        this.actualizarControlesNavegacion1();
    }

    private void ultimo1() {
        paginaActual1 = totalPaginas1;
        if(!txtIdIncorrecto.getText().isEmpty()){
            buscar1();
        }
        this.actualizarControlesNavegacion1();
    }

    private void primero1() {
        paginaActual1 = 1;
        if(!txtIdIncorrecto.getText().isEmpty()){
            buscar1();
        }
        this.actualizarControlesNavegacion1();
    }

    private void anterior1() {
        paginaActual1--;
        if(!txtIdIncorrecto.getText().isEmpty()){
            buscar1();
        }
        this.actualizarControlesNavegacion1();
    }

    private void seleccionPagina1() {
        paginaActual1 = (int) spPagina1.getValue();
        if(!txtIdIncorrecto.getText().isEmpty()){
            buscar1();
        }
        this.actualizarControlesNavegacion1();
    }
    //Fin
    private void actualizarControlesNavegacion() {
        spPagina.setValue(paginaActual);
        txtTotal.setText(totalPaginas + "");

        SpinnerNumberModel modeloSP = (SpinnerNumberModel) spPagina.getModel();
        Comparable<Integer> maximo = totalPaginas;
        modeloSP.setMaximum(maximo);

        this.btnSiguiente.setEnabled(paginaActual != totalPaginas);
        this.btnUltimo.setEnabled(paginaActual != totalPaginas);

        this.btnAnterior.setEnabled(paginaActual != 1);
        this.btnPrimero.setEnabled(paginaActual != 1);
    }
    
    private void actualizarControlesNavegacion1() {
        spPagina1.setValue(paginaActual1);
        txtTotal1.setText(totalPaginas1 + "");

        SpinnerNumberModel modeloSP = (SpinnerNumberModel) spPagina1.getModel();
        Comparable<Integer> maximo = totalPaginas1;
        modeloSP.setMaximum(maximo);

        this.btnSiguiente1.setEnabled(paginaActual1 != totalPaginas1);
        this.btnUltimo1.setEnabled(paginaActual1 != totalPaginas1);

        this.btnAnterior1.setEnabled(paginaActual1 != 1);
        this.btnPrimero1.setEnabled(paginaActual1 != 1);
    }
    
    private void bindeoSalvaje() {
        listadoIdC = new ArrayList<>();
        listadoIdC = ObservableCollections.observableList(listadoIdC);
//
        listadoIdI = new ArrayList<>();
        listadoIdI = ObservableCollections.observableList(listadoIdI);
        
        MTEventLog mtC = new MTEventLog(listadoIdC);
        MTEventLog mtI = new MTEventLog(listadoIdI);
        
        tblEventsIdC.setModel(mtC);
        tblEventsIdI.setModel(mtI);
        
        actualizarTabla();
    }
    
    private void actualizarTabla() {
        listadoIdC.clear();
        listadoIdI.clear();
        
//        empleadoSeleccionado = null;
//        FormularioUtil.limpiarComponente(txtEmpleado);
        paginaActual = 1;
        paginaActual1 = 1;
//        buscar();
        actualizarControlesNavegacion();
        actualizarControlesNavegacion1();
//        tblTabla.packAll();
    }
}
