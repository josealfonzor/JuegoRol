/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.*;

/**
 *
 * @author Rafael Marcano
 */
public class Lobby extends javax.swing.JFrame {

    
    DefaultTableModel modelo;
    List<Personaje> listaPersonajes=new ArrayList<>();
    
    /**
     * Creates new form Lobby
     */
    public Lobby(String nombreUsuario) {
        initComponents();
        
        modelo=(DefaultTableModel) tablaPersonajes.getModel();
        
        this.setTitle("Usuario: "+nombreUsuario);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banner = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbRol = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        lbImagen = new javax.swing.JLabel();
        btCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonajes = new javax.swing.JTable(){

            public Class getColumnClass(int column){

                return getValueAt(0,column).getClass();

            }

        };
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/logo.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/banner.jpg"))); // NOI18N
        banner.setText("jLabel1");
        getContentPane().add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 500, -1));

        jLabel2.setText("Nombre");

        jLabel3.setText("Rol");

        cbRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aldeano", "Mago", "Paladin" }));
        cbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolActionPerformed(evt);
            }
        });

        jLabel4.setText("Imagen");

        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/characters/rsz_2aldeano.jpg"))); // NOI18N

        btCrear.setText("Crear");
        btCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfNombre)
                        .addComponent(cbRol, 0, 166, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCrear)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addContainerGap(209, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(lbImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jLabel4)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("tab1", jPanel1);

        getContentPane().add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 260, 300));

        tablaPersonajes.setBackground(new java.awt.Color(255, 51, 51));
        tablaPersonajes.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        tablaPersonajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Ataque", "Vida", "Tipo", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPersonajes.setRowHeight(60);
        tablaPersonajes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaPersonajes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 430, 560));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/background (1).jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, -1, 683));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolActionPerformed
       
        switch ((String)cbRol.getSelectedItem()) {
             case "Aldeano":
                lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/characters/rsz_2aldeano.jpg")));
                break;
             case "Mago":
                lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/characters/rsz_11mago.jpg")));
                break;
              case "Paladin":
                lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/characters/rsz_1paladin.jpg")));
                break;    
        }
        
 
    }//GEN-LAST:event_cbRolActionPerformed

    private void btCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCrearMouseClicked
         
        switch ((String)cbRol.getSelectedItem()) {
             case "Aldeano":
                Aldeano aldeano = new Aldeano(tfNombre.getText()); 
                listaPersonajes.add(aldeano);
                modelo.addRow(new Object[]{
                      aldeano.getNombre(),
                      aldeano.getPt_ataque(),
                      aldeano.getPt_vida(),
                      "Aldeano",
                      new javax.swing.ImageIcon(getClass().getResource("/resources/characters/rsz_2aldeano.jpg"))
                      });
                break;
             case "Mago":
                Mago mago = new Mago(tfNombre.getText()); 
                listaPersonajes.add(mago);
                modelo.addRow(new Object[]{
                      mago.getNombre(),
                      mago.getPt_ataque(),
                      mago.getPt_vida(),
                      "Mago",
                      new javax.swing.ImageIcon(getClass().getResource("/resources/characters/rsz_11mago.jpg"))
                      });
                 break;
              case "Paladin": 
                 Paladin paladin = new Paladin(tfNombre.getText()); 
                listaPersonajes.add(paladin);
                modelo.addRow(new Object[]{
                      paladin.getNombre(),
                      paladin.getPt_ataque(),
                      paladin.getPt_vida(),
                      "Paladin",
                      new javax.swing.ImageIcon(getClass().getResource("/resources/characters/rsz_1paladin.jpg"))
                      });
                 break;   
        }
        
    }//GEN-LAST:event_btCrearMouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lobby(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel banner;
    private javax.swing.JButton btCrear;
    private javax.swing.JComboBox cbRol;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JTable tablaPersonajes;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
