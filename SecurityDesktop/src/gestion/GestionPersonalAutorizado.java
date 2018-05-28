/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import alertas.AlertaConfirmarPersonalAutorizado;
import alertas.AlertaError;
import controladores.PersonalAutorizadoControl;
import grillas.GrillaLugar;
import grillas.GrillaPersonalAutorizado;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import objetos.Lugar;
import objetos.PersonalAutorizado;

/**
 *
 * @author Skylake
 */
public class GestionPersonalAutorizado extends javax.swing.JInternalFrame {

    private GrillaPersonalAutorizado grillaPersonalAutorizado;
    private PersonalAutorizadoControl controlador = new PersonalAutorizadoControl();
    private PersonalAutorizado personalAutorizado;
    private List<PersonalAutorizado> list;

    /**
     * Creates new form GestionPerzonalAutorizado
     */
    public GestionPersonalAutorizado() throws SQLException {
        initComponents();
        ActualizarTabla();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

    }

    public void ActualizarTabla() throws SQLException {
        List<PersonalAutorizado> ca = controlador.extraertodo();
        try {
            grillaPersonalAutorizado = new GrillaPersonalAutorizado((ArrayList<PersonalAutorizado>) ca);
            //jtabla2.setModel(grillaLugar);
            jtLugares.setModel(grillaPersonalAutorizado);
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jbCerrar13 = new rojeru_san.RSButtonRiple();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLugares = new rojerusan.RSTableMetro();
        jPanel17 = new javax.swing.JPanel();
        jbModificar = new rojeru_san.RSButtonRiple();
        jbNuevo = new rojeru_san.RSButtonRiple();
        jbEliminar = new rojeru_san.RSButtonRiple();
        jtfBuscar = new rscomponentshade.RSTextFieldShade();
        jPanel18 = new javax.swing.JPanel();
        rSPanelShadow2 = new rojeru_san.RSPanelShadow();
        jPanel20 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlCargo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlUbicacion1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1033, 731));

        jPanel16.setBackground(new java.awt.Color(245, 124, 0));

        jbCerrar13.setBackground(new java.awt.Color(255, 255, 255));
        jbCerrar13.setText("X");
        jbCerrar13.setColorHover(new java.awt.Color(255, 152, 0));
        jbCerrar13.setColorText(new java.awt.Color(245, 124, 0));
        jbCerrar13.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jbCerrar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCerrar13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbCerrar13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 124, 0));

        jtLugares.setModel(new javax.swing.table.DefaultTableModel(
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
        jtLugares.setColorBackgoundHead(new java.awt.Color(255, 255, 255));
        jtLugares.setColorBordeFilas(new java.awt.Color(245, 124, 0));
        jtLugares.setColorBordeHead(new java.awt.Color(245, 124, 0));
        jtLugares.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        jtLugares.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        jtLugares.setColorForegroundHead(new java.awt.Color(245, 124, 0));
        jtLugares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLugaresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtLugares);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jbModificar.setBackground(new java.awt.Color(245, 124, 0));
        jbModificar.setText("MODIFICAR");
        jbModificar.setColorHover(new java.awt.Color(255, 152, 0));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(245, 124, 0));
        jbNuevo.setText("NUEVO");
        jbNuevo.setColorHover(new java.awt.Color(255, 152, 0));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(245, 124, 0));
        jbEliminar.setText("ELIMINAR");
        jbEliminar.setColorHover(new java.awt.Color(255, 152, 0));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jtfBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtfBuscar.setPlaceholder("BUSCAR POR NOMBRE");
        jtfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NOMBRE:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("APELLIDO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DNI:");

        jlNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CARGO:");

        jlDni.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jlApellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jlCargo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("CODIGO:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("ESTADO:");

        jlCodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jlUbicacion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                            .addComponent(jlUbicacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlUbicacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jlCodigo.getAccessibleContext().setAccessibleParent(jbEliminar);

        rSPanelShadow2.add(jPanel20, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar13ActionPerformed
        dispose();
    }//GEN-LAST:event_jbCerrar13ActionPerformed

    private void jtLugaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLugaresMouseClicked
        if (jtLugares.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FILA EN LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            personalAutorizado = grillaPersonalAutorizado.getLugar(jtLugares.getSelectedRow());

            jlNombre.setText(personalAutorizado.getNombrePersonalAutorizado());

            jlApellido.setText(personalAutorizado.getApellidoPersonalAutorizado());
            jlDni.setText(personalAutorizado.getDNI());
            jlCargo.setText(personalAutorizado.getCargo());
            jlCodigo.setText(personalAutorizado.getCodigo());

            if (personalAutorizado.getEstado().equals("1")) {
                jlUbicacion1.setText("ACTIVO");
            } else {
                jlUbicacion1.setText("INACTIVO");
            }
            //jTextArea1.setEnabled(false);
        }

    }//GEN-LAST:event_jtLugaresMouseClicked

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (this.jtLugares.getRowCount() < 1) {
            AlertaError er = new AlertaError(new JFrame(), true);
            er.jlError.setText("LA TABLA ESTA VACÍA");
            er.setVisible(true);
        } else {
            if (this.jtLugares.getSelectedRowCount() < 1) {
                AlertaError er = new AlertaError(new JFrame(), true);
                er.jlError.setText("SELECCIONA UN REGISTRO");
                er.setVisible(true);
            } else {
                personalAutorizado = grillaPersonalAutorizado.getLugar(jtLugares.getSelectedRow());

                ABMPersonalAutirozado aBMPersonalAutirozado = new ABMPersonalAutirozado(new JFrame(), true);
                aBMPersonalAutirozado.jtfNombre.setText(personalAutorizado.getNombrePersonalAutorizado());
                aBMPersonalAutirozado.jtApellido.setText(personalAutorizado.getApellidoPersonalAutorizado());
                aBMPersonalAutirozado.jtfDni.setText(personalAutorizado.getDNI());
                aBMPersonalAutirozado.jtfCargo.setText(personalAutorizado.getCargo());
                aBMPersonalAutirozado.jtfCodigo.setText(personalAutorizado.getCodigo());
                Integer id = personalAutorizado.getIdPersonalAutorizado();
                aBMPersonalAutirozado.jlId.setText(String.valueOf(id));
                if (personalAutorizado.getEstado().equals("1")) {
                    aBMPersonalAutirozado.jrbActivo.setSelected(true);
                } else {
                    aBMPersonalAutirozado.jrbInactivo.setSelected(false);

                }
                aBMPersonalAutirozado.jbLimpiar.setVisible(false);
                aBMPersonalAutirozado.jlTitulo.setText("MODIFICAR PERSONAL AUTORIZADO");
                aBMPersonalAutirozado.jbNuevo.setText("MODIFICAR");
                aBMPersonalAutirozado.setVisible(true);
                /* // JLabel jlabel = new JLabel(lugar.getNombreLugar());
                    jlImagen.setIcon(icon);
                    //jlNombreLugar.setSize(jlNombreLugar.getPreferredSize());
                    // jlNombreLugar.setText(lugar.getNombreLugar());
                    jlLugar.setText(lugar.getNombreLugar());
                    //jlNombreLugar.setText(lugar.getNombreLugar());
                    // jlNombreLugar.validate();
                    jlUbicacion.setText(lugar.getUbicacion());
                    jlEmail.setText(lugar.getEmail());

                    //jTextArea1.setEnabled(false);
                 */
            }
            /* int fila = this.jtLugares.getSelectedRow();

                ModalProductoM mp = new ModalProductoM(new JFrame(), true);
                mp.id.setText(this.jtLugares.getValueAt(fila, 0).toString());
                mp.nombre.setText(this.jtLugares.getValueAt(fila, 1).toString());
                mp.descripcion.setText(this.tabla.getValueAt(fila, 2).toString());
                mp.tipo.setSelectedItem(this.tabla.getValueAt(fila, 3).toString());
                mp.precio.setText(this.tabla.getValueAt(fila, 4).toString());
                mp.stock.setText(this.tabla.getValueAt(fila, 5).toString());
                mp.titulo.setText("MODIFICAR");
                mp.registrar.setText("GUARDAR");
                mp.setVisible(true);*/
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        ABMPersonalAutirozado aBMPersonalAutirozado = new ABMPersonalAutirozado(new JFrame(), true);
        aBMPersonalAutirozado.jlTitulo.setText("REGISTRAR PERSONAL AUTORIZADO");
        aBMPersonalAutirozado.jbNuevo.setText("REGISTRAR");
        aBMPersonalAutirozado.setVisible(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (this.jtLugares.getRowCount() < 1) {
            AlertaError er = new AlertaError(new JFrame(), true);
            er.jlError.setText("LA TABLA ESTA VACÍA");
            er.setVisible(true);
        } else {
            if (this.jtLugares.getSelectedRowCount() < 1) {
                AlertaError er = new AlertaError(new JFrame(), true);
                er.jlError.setText("SELECCIONA UN REGISTRO");
                er.setVisible(true);
            } else {
                personalAutorizado = grillaPersonalAutorizado.getLugar(jtLugares.getSelectedRow());
                AlertaConfirmarPersonalAutorizado acpa = new AlertaConfirmarPersonalAutorizado(new JFrame(), true);
                acpa.jlId.setText(String.valueOf(personalAutorizado.getIdPersonalAutorizado()));
                acpa.jlErrorPregunta.setText("¿ESTAS SEGURO?");
                acpa.jlErrorDescripcion.setText("SE BORRARÁ PERMANENTEMENTE");
                acpa.setVisible(true);
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBuscarKeyReleased

       buscar();
    }//GEN-LAST:event_jtfBuscarKeyReleased
    public void buscar() {
        List<PersonalAutorizado> ca = null;
        try {
            String variable = "";
            variable = jtfBuscar.getText();
            ca = controlador.buscar(variable);
        } catch (SQLException ex) {
            Logger.getLogger(GestionLugares.class.getName()).log(Level.SEVERE, null, ex);
        }

        grillaPersonalAutorizado = new GrillaPersonalAutorizado((ArrayList<PersonalAutorizado>) ca);
        //jtabla2.setModel(grillaLugar);
        jtLugares.setModel(grillaPersonalAutorizado);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.RSButtonRiple jbCerrar13;
    private rojeru_san.RSButtonRiple jbEliminar;
    private rojeru_san.RSButtonRiple jbModificar;
    private rojeru_san.RSButtonRiple jbNuevo;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCargo;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlUbicacion1;
    public rojerusan.RSTableMetro jtLugares;
    private rscomponentshade.RSTextFieldShade jtfBuscar;
    private rojeru_san.RSPanelShadow rSPanelShadow2;
    // End of variables declaration//GEN-END:variables
}