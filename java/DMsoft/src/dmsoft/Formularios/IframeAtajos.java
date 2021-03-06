/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmsoft.Formularios;

import dmsoft.Clases.Entidades.Login;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Dany_Hernandez
 */
public class IframeAtajos extends javax.swing.JInternalFrame {


    public IframeAtajos() {
        initComponents();
        //Eliminamos el border del JInternalFrame para que no nos muestre las opciones de arriba
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI(); 
        bi.setNorthPane(null);
        setPrivilegios();
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

        pnlAccesosRapidos = new javax.swing.JPanel();
        btnProductos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnFacturar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnProveedor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBorder(null);
        setName("Atajos"); // NOI18N

        pnlAccesosRapidos.setBackground(new java.awt.Color(242, 242, 242));
        pnlAccesosRapidos.setPreferredSize(new java.awt.Dimension(1280, 720));
        pnlAccesosRapidos.setLayout(new java.awt.GridBagLayout());

        btnProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductos.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(204, 204, 204));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/productos128.png"))); // NOI18N
        btnProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setFocusPainted(false);
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setOpaque(true);
        btnProductos.setPreferredSize(new java.awt.Dimension(160, 180));
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 42);
        pnlAccesosRapidos.add(btnProductos, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Productos");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(160, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 42);
        pnlAccesosRapidos.add(jLabel1, gridBagConstraints);

        btnUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(204, 204, 204));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/usuario2128.png"))); // NOI18N
        btnUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setFocusPainted(false);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setOpaque(true);
        btnUsuarios.setPreferredSize(new java.awt.Dimension(160, 180));
        btnUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 43, 23, 42);
        pnlAccesosRapidos.add(btnUsuarios, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(153, 255, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuarios");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(160, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(48, 43, 0, 42);
        pnlAccesosRapidos.add(jLabel2, gridBagConstraints);

        btnFacturar.setBackground(new java.awt.Color(255, 255, 255));
        btnFacturar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnFacturar.setForeground(new java.awt.Color(204, 204, 204));
        btnFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/factura128.png"))); // NOI18N
        btnFacturar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnFacturar.setContentAreaFilled(false);
        btnFacturar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacturar.setFocusPainted(false);
        btnFacturar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFacturar.setOpaque(true);
        btnFacturar.setPreferredSize(new java.awt.Dimension(160, 180));
        btnFacturar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 42, 0, 42);
        pnlAccesosRapidos.add(btnFacturar, gridBagConstraints);

        jLabel3.setBackground(new java.awt.Color(158, 193, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Facturar");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(160, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(30, 43, 0, 42);
        pnlAccesosRapidos.add(jLabel3, gridBagConstraints);

        jLabel4.setBackground(new java.awt.Color(255, 255, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Proveedores");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(160, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 42);
        pnlAccesosRapidos.add(jLabel4, gridBagConstraints);

        btnConfiguracion.setBackground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(204, 204, 204));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/ajustes128.png"))); // NOI18N
        btnConfiguracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnConfiguracion.setContentAreaFilled(false);
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.setFocusPainted(false);
        btnConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfiguracion.setOpaque(true);
        btnConfiguracion.setPreferredSize(new java.awt.Dimension(160, 180));
        btnConfiguracion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 23, 42);
        pnlAccesosRapidos.add(btnConfiguracion, gridBagConstraints);

        btnVentas.setBackground(new java.awt.Color(255, 255, 255));
        btnVentas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(204, 204, 204));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/ventas128.png"))); // NOI18N
        btnVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setFocusPainted(false);
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setOpaque(true);
        btnVentas.setPreferredSize(new java.awt.Dimension(160, 180));
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 42);
        pnlAccesosRapidos.add(btnVentas, gridBagConstraints);

        jLabel5.setBackground(new java.awt.Color(255, 204, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ventas");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(160, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 42);
        pnlAccesosRapidos.add(jLabel5, gridBagConstraints);

        btnProveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnProveedor.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnProveedor.setForeground(new java.awt.Color(204, 204, 204));
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/proveedor128.png"))); // NOI18N
        btnProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnProveedor.setContentAreaFilled(false);
        btnProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedor.setFocusPainted(false);
        btnProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProveedor.setOpaque(true);
        btnProveedor.setPreferredSize(new java.awt.Dimension(160, 180));
        btnProveedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 23, 42);
        pnlAccesosRapidos.add(btnProveedor, gridBagConstraints);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Configuraci??n");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(160, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 42);
        pnlAccesosRapidos.add(jLabel6, gridBagConstraints);

        getContentPane().add(pnlAccesosRapidos, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed

    }//GEN-LAST:event_btnUsuariosActionPerformed
    private void setPrivilegios(){
        Login log=new Login();
        btnConfiguracion.setEnabled(log.getPrivilegio(Login.PRIV_EMPRESA));
        btnProductos.setEnabled(log.getPrivilegio(Login.PRIV_PRODUCTOS));
        btnFacturar.setEnabled(log.getPrivilegio(Login.PRIV_FACTURACION));
        btnUsuarios.setEnabled(log.getPrivilegio(Login.PRIV_USUARIOS));
        btnProveedor.setEnabled(log.getPrivilegio(Login.PRIV_PROVEEDORES));
        btnVentas.setEnabled(log.getPrivilegio(Login.PRIV_VENTAS_REALIZADAS));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnFacturar;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnlAccesosRapidos;
    // End of variables declaration//GEN-END:variables
}
