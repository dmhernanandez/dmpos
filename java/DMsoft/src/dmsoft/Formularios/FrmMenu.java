

package dmsoft.Formularios;
import  dmsoft.Clases.ConexionMYSQL;
import dmsoft.Clases.Entidades.Login;
import dmsoft.Clases.Entidades.Utilidades;
import javax.swing.JFrame;


public class FrmMenu extends javax.swing.JFrame {

  //Creamos una instancia del la clase Utilidades que es donde se encunetran los metodos y funciones
  //Que usan en comun todos los formulario
    Utilidades utilidades=new Utilidades();
    Login log= new Login();
    public FrmMenu() {
       initComponents();
       new ConexionMYSQL().getConexion();
       this.setLocationRelativeTo(null);
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       
       utilidades.cambiarComponente(destokPaneContendor, new IframeAtajos());
       //ASIGNMOS LOS PRIVILEGIOS
        asignarPrivilegios();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlPieFormulario = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        destokPaneContendor = new javax.swing.JDesktopPane();
        mbrMenuOpciones = new javax.swing.JMenuBar();
        mnuUsuario = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuProductos = new javax.swing.JMenu();
        mtemProductos = new javax.swing.JMenuItem();
        mtemCategoria = new javax.swing.JMenuItem();
        mtemMedidas = new javax.swing.JMenuItem();
        mnuFacturacion = new javax.swing.JMenu();
        mnuProveedor = new javax.swing.JMenu();
        mtmProveedor = new javax.swing.JMenuItem();
        mnuSeguridad = new javax.swing.JMenu();
        mtenEmpleados = new javax.swing.JMenuItem();
        mtemTipoUsuario = new javax.swing.JMenuItem();
        mnuEmpleado = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuConfiguracion = new javax.swing.JMenu();
        mtenEmpresa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        pnlPieFormulario.setPreferredSize(new java.awt.Dimension(915, 40));
        pnlPieFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("sabado 18 de julio de 2013");
        jLabel13.setPreferredSize(new java.awt.Dimension(107, 10));
        pnlPieFormulario.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 2, 180, 20));

        getContentPane().add(pnlPieFormulario, java.awt.BorderLayout.SOUTH);

        destokPaneContendor.setBackground(new java.awt.Color(255, 255, 255));
        destokPaneContendor.setLayout(new java.awt.BorderLayout());
        getContentPane().add(destokPaneContendor, java.awt.BorderLayout.CENTER);

        mbrMenuOpciones.setName(""); // NOI18N
        mbrMenuOpciones.setPreferredSize(new java.awt.Dimension(546, 30));

        mnuUsuario.setForeground(new java.awt.Color(51, 51, 51));
        mnuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/archivo24.png"))); // NOI18N
        mnuUsuario.setText("Archivo");
        mnuUsuario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/home20.png"))); // NOI18N
        jMenuItem1.setText("Inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuUsuario.add(jMenuItem1);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/desconectar20.png"))); // NOI18N
        jMenuItem3.setText("Cerrar sesión");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuUsuario.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/salir20.png"))); // NOI18N
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnuUsuario.add(jMenuItem4);

        mbrMenuOpciones.add(mnuUsuario);

        mnuProductos.setForeground(new java.awt.Color(51, 51, 51));
        mnuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/almacen24.png"))); // NOI18N
        mnuProductos.setText("Almacen");
        mnuProductos.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N

        mtemProductos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        mtemProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/productos24.png"))); // NOI18N
        mtemProductos.setText("Gestion de productos");
        mtemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtemProductosActionPerformed(evt);
            }
        });
        mnuProductos.add(mtemProductos);

        mtemCategoria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        mtemCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/categorias20.png"))); // NOI18N
        mtemCategoria.setText("Gestionar categorias");
        mtemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtemCategoriaActionPerformed(evt);
            }
        });
        mnuProductos.add(mtemCategoria);

        mtemMedidas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        mtemMedidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/medidas24.png"))); // NOI18N
        mtemMedidas.setText("Unidades de medida");
        mtemMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtemMedidasActionPerformed(evt);
            }
        });
        mnuProductos.add(mtemMedidas);

        mbrMenuOpciones.add(mnuProductos);

        mnuFacturacion.setForeground(new java.awt.Color(51, 51, 51));
        mnuFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/factura24.png"))); // NOI18N
        mnuFacturacion.setText("Facturar");
        mnuFacturacion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mnuFacturacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mbrMenuOpciones.add(mnuFacturacion);

        mnuProveedor.setForeground(new java.awt.Color(51, 51, 51));
        mnuProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/proveedor24.png"))); // NOI18N
        mnuProveedor.setText("Proveedores");
        mnuProveedor.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mnuProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        mtmProveedor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        mtmProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/proveedorCarro24.png"))); // NOI18N
        mtmProveedor.setText("Gestion de proveedores");
        mtmProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtmProveedorActionPerformed(evt);
            }
        });
        mnuProveedor.add(mtmProveedor);

        mbrMenuOpciones.add(mnuProveedor);

        mnuSeguridad.setForeground(new java.awt.Color(51, 51, 51));
        mnuSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/administracion2.png"))); // NOI18N
        mnuSeguridad.setText("Administración");
        mnuSeguridad.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mnuSeguridad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        mtenEmpleados.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        mtenEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/clientes24.png"))); // NOI18N
        mtenEmpleados.setText("Empleados");
        mtenEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtenEmpleadosActionPerformed(evt);
            }
        });
        mnuSeguridad.add(mtenEmpleados);

        mtemTipoUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        mtemTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/usuarios.png"))); // NOI18N
        mtemTipoUsuario.setText("Usuarios");
        mtemTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtemTipoUsuarioActionPerformed(evt);
            }
        });
        mnuSeguridad.add(mtemTipoUsuario);

        mbrMenuOpciones.add(mnuSeguridad);

        mnuEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        mnuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/examen24.png"))); // NOI18N
        mnuEmpleado.setText("Examen");
        mnuEmpleado.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mnuEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jMenuItem2.setText("Ver examen");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuEmpleado.add(jMenuItem2);

        mbrMenuOpciones.add(mnuEmpleado);

        mnuConfiguracion.setForeground(new java.awt.Color(51, 51, 51));
        mnuConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/configuracion24.png"))); // NOI18N
        mnuConfiguracion.setText("Configuración");
        mnuConfiguracion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mnuConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        mtenEmpresa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        mtenEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/empresa20.png"))); // NOI18N
        mtenEmpresa.setText("Empresa");
        mtenEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtenEmpresaActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mtenEmpresa);

        mbrMenuOpciones.add(mnuConfiguracion);

        setJMenuBar(mbrMenuOpciones);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mtenEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtenEmpresaActionPerformed

        utilidades.cambiarComponente(destokPaneContendor, new IframeEmpresa());
    }//GEN-LAST:event_mtenEmpresaActionPerformed

    private void mtemTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtemTipoUsuarioActionPerformed
 utilidades.cambiarComponente(destokPaneContendor, new IframeUsuarios(destokPaneContendor.getSize()));
    }//GEN-LAST:event_mtemTipoUsuarioActionPerformed

    private void mtenEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtenEmpleadosActionPerformed
      utilidades.cambiarComponente(destokPaneContendor, new IframeEmpleados());
    }//GEN-LAST:event_mtenEmpleadosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     utilidades.cambiarComponente(destokPaneContendor, new IframeAtajos());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mtmProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtmProveedorActionPerformed
       utilidades.cambiarComponente(destokPaneContendor, new IframeProveedor());
    }//GEN-LAST:event_mtmProveedorActionPerformed

    private void mtemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtemCategoriaActionPerformed
         utilidades.cambiarComponente(destokPaneContendor, new IframeCategoria());
    }//GEN-LAST:event_mtemCategoriaActionPerformed

    private void mtemMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtemMedidasActionPerformed
         utilidades.cambiarComponente(destokPaneContendor, new IframeUnidades());
    }//GEN-LAST:event_mtemMedidasActionPerformed

    private void mtemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtemProductosActionPerformed
        utilidades.cambiarComponente(destokPaneContendor, new IframeProductos());
    }//GEN-LAST:event_mtemProductosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          utilidades.cambiarComponente(destokPaneContendor, new IframeExamen());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new FrmLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    
private void asignarPrivilegios(){
    mtemProductos.setEnabled(log.getPrivilegio(Login.PRIV_PRODUCTOS));
    mtemCategoria.setEnabled(log.getPrivilegio(Login.PRIV_CATEGORIAS));
    mtemMedidas.setEnabled(log.getPrivilegio(Login.PRIV_MEDIDAS));
    mtmProveedor.setEnabled(log.getPrivilegio(Login.PRIV_PROVEEDORES));
    mtenEmpleados.setEnabled(log.getPrivilegio(Login.PRIV_EMPLEADOS));
    mtemTipoUsuario.setEnabled(log.getPrivilegio(Login.PRIV_USUARIOS));
    mtenEmpresa.setEnabled(log.getPrivilegio(Login.PRIV_EMPRESA));
}
          
         
            
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane destokPaneContendor;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuBar mbrMenuOpciones;
    private javax.swing.JMenu mnuConfiguracion;
    private javax.swing.JMenu mnuEmpleado;
    private javax.swing.JMenu mnuFacturacion;
    private javax.swing.JMenu mnuProductos;
    private javax.swing.JMenu mnuProveedor;
    private javax.swing.JMenu mnuSeguridad;
    private javax.swing.JMenu mnuUsuario;
    private javax.swing.JMenuItem mtemCategoria;
    private javax.swing.JMenuItem mtemMedidas;
    private javax.swing.JMenuItem mtemProductos;
    private javax.swing.JMenuItem mtemTipoUsuario;
    private javax.swing.JMenuItem mtenEmpleados;
    private javax.swing.JMenuItem mtenEmpresa;
    private javax.swing.JMenuItem mtmProveedor;
    private javax.swing.JPanel pnlPieFormulario;
    // End of variables declaration//GEN-END:variables
}
