/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import com.sun.awt.AWTUtilities;
import gestion.GestionLugar;
import gestion.GestionLugares;
import gestion.GestionLugares;
import gestion.GestionPersonalAutorizado;
import gestion.GestionUsuarios;
import static java.awt.Frame.ICONIFIED;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;

/**
 *
 * @author Skylake
 */
public class Principal extends javax.swing.JFrame {

    private boolean minimiza = false;
    public static boolean cerra = false;

    public GestionLugares gestionLugares = null;
    public GestionPersonalAutorizado gestionPersonalAutorizado = null;
    public GestionUsuarios gestionUsuario = null;
    public static boolean estacerrado(Object obj) {
        JInternalFrame[] activos = escritorio.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
                cerra = false;
            }
            i++;
        }
        return cerrado;
    }

    /**
     * Creates new form Principal
     */
    public Principal() {
        this.setUndecorated(true);

        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        // this.setLocationRelativeTo(this);
        AWTUtilities.setWindowOpaque(this, false);
        //  FadeEffect.fadeInFrame(this, 50, 0.1f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbCerrar = new rojeru_san.RSButtonRiple();
        jbMinimizar = new rojeru_san.RSButtonRiple();
        jPanel4 = new javax.swing.JPanel();
        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        jbLugares = new rojeru_san.RSButtonRiple();
        jbPersonalAutorizado = new rojeru_san.RSButtonRiple();
        jblUsuario = new rojeru_san.RSButtonRiple();
        jbLugares3 = new rojeru_san.RSButtonRiple();
        jbLugares4 = new rojeru_san.RSButtonRiple();
        jbLugares5 = new rojeru_san.RSButtonRiple();
        rSPanelShadow2 = new rojeru_san.RSPanelShadow();
        jPanel5 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(245, 124, 0));

        jPanel3.setBackground(new java.awt.Color(245, 124, 0));

        jbCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jbCerrar.setText("X");
        jbCerrar.setColorHover(new java.awt.Color(255, 152, 0));
        jbCerrar.setColorText(new java.awt.Color(245, 124, 0));
        jbCerrar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jbMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        jbMinimizar.setText("__");
        jbMinimizar.setColorHover(new java.awt.Color(255, 152, 0));
        jbMinimizar.setColorText(new java.awt.Color(245, 124, 0));
        jbMinimizar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jbMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMinimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(245, 124, 0));

        jbLugares.setBackground(new java.awt.Color(255, 255, 255));
        jbLugares.setText("LUGARES");
        jbLugares.setColorHover(new java.awt.Color(255, 152, 0));
        jbLugares.setColorText(new java.awt.Color(245, 124, 0));
        jbLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLugaresActionPerformed(evt);
            }
        });

        jbPersonalAutorizado.setBackground(new java.awt.Color(255, 255, 255));
        jbPersonalAutorizado.setText("PERSONAL AUTORIZADO");
        jbPersonalAutorizado.setColorHover(new java.awt.Color(255, 152, 0));
        jbPersonalAutorizado.setColorText(new java.awt.Color(245, 124, 0));
        jbPersonalAutorizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPersonalAutorizadoActionPerformed(evt);
            }
        });

        jblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jblUsuario.setText("USUARIO");
        jblUsuario.setColorHover(new java.awt.Color(255, 152, 0));
        jblUsuario.setColorText(new java.awt.Color(245, 124, 0));
        jblUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblUsuarioActionPerformed(evt);
            }
        });

        jbLugares3.setBackground(new java.awt.Color(255, 255, 255));
        jbLugares3.setText("LUGARES");
        jbLugares3.setColorHover(new java.awt.Color(255, 152, 0));
        jbLugares3.setColorText(new java.awt.Color(245, 124, 0));

        jbLugares4.setBackground(new java.awt.Color(255, 255, 255));
        jbLugares4.setText("LUGARES");
        jbLugares4.setColorHover(new java.awt.Color(255, 152, 0));
        jbLugares4.setColorText(new java.awt.Color(245, 124, 0));

        jbLugares5.setBackground(new java.awt.Color(255, 255, 255));
        jbLugares5.setText("LUGARES");
        jbLugares5.setColorHover(new java.awt.Color(255, 152, 0));
        jbLugares5.setColorText(new java.awt.Color(245, 124, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbPersonalAutorizado, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jbLugares3, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jbLugares5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jbLugares4, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbPersonalAutorizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLugares4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLugares3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLugares5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 841, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        rSPanelShadow2.add(jPanel5, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(rSPanelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSPanelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSPanelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLugaresActionPerformed
        if (estacerrado(gestionLugares)) {
             try {
                gestionLugares = new GestionLugares(); // TODO add your handling code here:
                int width = escritorio.getWidth();
                int Height = escritorio.getHeight();
                gestionLugares.setSize(width, Height);
                escritorio.add(gestionLugares);
                gestionLugares.show();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbLugaresActionPerformed

    private void jbMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
        if (!minimiza) {
            minimiza = false;
            this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        } else {
            minimiza = true;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jbMinimizarActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbPersonalAutorizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPersonalAutorizadoActionPerformed
               if (estacerrado(gestionPersonalAutorizado)) {
             try {
                gestionPersonalAutorizado = new GestionPersonalAutorizado(); // TODO add your handling code here:
                int width = escritorio.getWidth();
                int Height = escritorio.getHeight();
                gestionPersonalAutorizado.setSize(width, Height);
                escritorio.add(gestionPersonalAutorizado);
                gestionPersonalAutorizado.show();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } // TODO add your handling code here:
    }//GEN-LAST:event_jbPersonalAutorizadoActionPerformed

    private void jblUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblUsuarioActionPerformed
                   if (estacerrado(gestionUsuario)) {
             try {
                gestionUsuario = new GestionUsuarios(); // TODO add your handling code here:
                int width = escritorio.getWidth();
                int Height = escritorio.getHeight();
                gestionUsuario.setSize(width, Height);
                escritorio.add(gestionUsuario);
                gestionUsuario.show();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jblUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
         try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            /*  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private rojeru_san.RSButtonRiple jbCerrar;
    private rojeru_san.RSButtonRiple jbLugares;
    private rojeru_san.RSButtonRiple jbLugares3;
    private rojeru_san.RSButtonRiple jbLugares4;
    private rojeru_san.RSButtonRiple jbLugares5;
    private rojeru_san.RSButtonRiple jbMinimizar;
    private rojeru_san.RSButtonRiple jbPersonalAutorizado;
    private rojeru_san.RSButtonRiple jblUsuario;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelShadow rSPanelShadow2;
    // End of variables declaration//GEN-END:variables
}
