/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmsoft.Formularios;

import dmsoft.Clases.Entidades.Empleados;
import dmsoft.Clases.Entidades.Examen;
import dmsoft.Clases.Entidades.Producto;
import dmsoft.Clases.Entidades.Roles;
import dmsoft.Clases.Entidades.Utilidades;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dany_Hernandez
 */
public class IframeExamen extends javax.swing.JInternalFrame {

    /**
     * Creates new form IframeEmpleados
     * @param dimension
     */
    //Creamos objetos para los modelos de nuestra tablas
    DefaultTableModel modeloExamen;

    Utilidades utilidades=new Utilidades();
    private int tipoOperacion=Utilidades.DEFAULT;
     Examen examen=new Examen();

    
    public IframeExamen() {
        initComponents();
        
      //Eliminamos el border del JInternalFrame para que no nos muestre las opciones de arriba
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI(); 
        bi.setNorthPane(null);

        

        modeloTabla();

        //Una ves que hemos creado el modelo aho le damos formato a la table
        formatoTabla();

        utilidades.cambiarComponente(tbneProductos, panelProductos, "Usuarios registrados");
         examen.obtenerDatos(tblUsuariosExamen, modeloExamen, "");

        //Reseteamos la varibale change ya que en el metodo obtenerTipoUsuarios se vuelve positiva
         utilidades.setChanged(false);
         btnRetornar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        tbneProductos = new javax.swing.JTabbedPane();
        panelProductos = new javax.swing.JPanel();
        spneTablaEmpleados = new javax.swing.JScrollPane();
        tblUsuariosExamen = new javax.swing.JTable();
        panelBuscarEmpleado = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtBuscarUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelDatos = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumDocumento = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtaInstrucciones = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cbxTipoDocumento = new javax.swing.JComboBox<>();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNumTarjeta = new javax.swing.JTextField();
        txtClaveTarjeta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRetornar = new javax.swing.JButton();

        setBorder(null);
        setName("Examen"); // NOI18N

        tbneProductos.setBackground(new java.awt.Color(252, 252, 252));
        tbneProductos.setForeground(new java.awt.Color(51, 51, 51));
        tbneProductos.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tbneProductos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tbneProductos.setOpaque(true);
        tbneProductos.setPreferredSize(new java.awt.Dimension(750, 340));

        panelProductos.setLayout(new java.awt.BorderLayout(0, 5));

        tblUsuariosExamen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        tblUsuariosExamen.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblUsuariosExamen.setOpaque(false);
        tblUsuariosExamen.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tblUsuariosExamen.setSelectionForeground(new java.awt.Color(226, 226, 226));
        spneTablaEmpleados.setViewportView(tblUsuariosExamen);

        panelProductos.add(spneTablaEmpleados, java.awt.BorderLayout.CENTER);

        panelBuscarEmpleado.setBackground(new java.awt.Color(246, 246, 246));
        panelBuscarEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 216, 216)));
        panelBuscarEmpleado.setPreferredSize(new java.awt.Dimension(100, 90));
        panelBuscarEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(61, 61, 61));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Buscar");
        panelBuscarEmpleado.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 27));

        txtBuscarUsuario.setBackground(new java.awt.Color(252, 252, 252));
        txtBuscarUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtBuscarUsuario.setForeground(new java.awt.Color(30, 30, 30));
        txtBuscarUsuario.setToolTipText("");
        txtBuscarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        txtBuscarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarUsuarioKeyReleased(evt);
            }
        });
        panelBuscarEmpleado.add(txtBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 730, 30));

        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(246, 246, 246));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setText("Para editar los datos de un usuario, seleccione uno de la tabla y        luego de click en el boton editar ");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        panelBuscarEmpleado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 15, 420, 60));

        panelProductos.add(panelBuscarEmpleado, java.awt.BorderLayout.NORTH);

        tbneProductos.addTab("Productos", panelProductos);

        panelDatos.setBackground(new java.awt.Color(250, 250, 250));
        panelDatos.setPreferredSize(new java.awt.Dimension(600, 400));
        panelDatos.setLayout(new java.awt.GridBagLayout());

        pnlDatos.setBackground(new java.awt.Color(246, 246, 246));
        pnlDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        pnlDatos.setForeground(new java.awt.Color(204, 204, 204));
        pnlDatos.setPreferredSize(new java.awt.Dimension(702, 140));
        pnlDatos.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(61, 61, 61));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nombre de usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 30, 0, 134);
        pnlDatos.add(jLabel1, gridBagConstraints);

        txtNombre.setBackground(new java.awt.Color(252, 252, 252));
        txtNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(30, 30, 30));
        txtNombre.setAutoscrolls(false);
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 134);
        pnlDatos.add(txtNombre, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(61, 61, 61));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Numero de documento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(16, 30, 0, 134);
        pnlDatos.add(jLabel2, gridBagConstraints);

        txtNumDocumento.setBackground(new java.awt.Color(252, 252, 252));
        txtNumDocumento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtNumDocumento.setForeground(new java.awt.Color(30, 30, 30));
        txtNumDocumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        txtNumDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumDocumentoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 134);
        pnlDatos.add(txtNumDocumento, gridBagConstraints);

        jLabel18.setBackground(new java.awt.Color(151, 196, 242));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/web26.png"))); // NOI18N
        jLabel18.setText("Registrate en los servicios web de BBVA");
        jLabel18.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 46;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDatos.add(jLabel18, gridBagConstraints);

        txtaInstrucciones.setEditable(false);
        txtaInstrucciones.setBackground(new java.awt.Color(246, 246, 246));
        txtaInstrucciones.setColumns(23);
        txtaInstrucciones.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtaInstrucciones.setForeground(new java.awt.Color(137, 137, 135));
        txtaInstrucciones.setLineWrap(true);
        txtaInstrucciones.setRows(3);
        txtaInstrucciones.setTabSize(10);
        txtaInstrucciones.setText("Tip de seguridad: Nunca compartas la clave de acceso con nadie, ya que podra realizar cualquier transacción sin tu autorización.\n");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 22;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 39, 10, 27);
        pnlDatos.add(txtaInstrucciones, gridBagConstraints);

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Correo electronico");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(16, 30, 0, 134);
        pnlDatos.add(jLabel22, gridBagConstraints);

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Tipo de documento de identidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(16, 30, 0, 305);
        pnlDatos.add(jLabel28, gridBagConstraints);

        cbxTipoDocumento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        cbxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Documento Nacional de Identificacion", "Cédula de extrangeria", " " }));
        cbxTipoDocumento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoDocumentoItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 134);
        pnlDatos.add(cbxTipoDocumento, gridBagConstraints);

        txtCorreo.setBackground(new java.awt.Color(252, 252, 252));
        txtCorreo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 134);
        pnlDatos.add(txtCorreo, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Información de tu tarjeta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 3, 0, 129);
        pnlDatos.add(jLabel4, gridBagConstraints);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 5, 80);
        pnlDatos.add(jSeparator1, gridBagConstraints);

        txtNumTarjeta.setBackground(new java.awt.Color(252, 252, 252));
        txtNumTarjeta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtNumTarjeta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 134);
        pnlDatos.add(txtNumTarjeta, gridBagConstraints);

        txtClaveTarjeta.setBackground(new java.awt.Color(252, 252, 252));
        txtClaveTarjeta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtClaveTarjeta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 340);
        pnlDatos.add(txtClaveTarjeta, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(61, 61, 61));
        jLabel7.setText("Número de tarjeta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(16, 30, 0, 134);
        pnlDatos.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(61, 61, 61));
        jLabel8.setText("Clave de tarjeta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 30, 0, 134);
        pnlDatos.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("La misma que usas en el cajero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 134);
        pnlDatos.add(jLabel9, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(61, 61, 61));
        jLabel11.setText("Contraseña de acceso a BBVA online");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 134);
        pnlDatos.add(jLabel11, gridBagConstraints);

        txtContraseña.setBackground(new java.awt.Color(252, 252, 252));
        txtContraseña.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        txtContraseña.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 134);
        pnlDatos.add(txtContraseña, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Prodras consultar tus productos y hacer transacciones online.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 46;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 11, 0);
        pnlDatos.add(jLabel3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Tus datos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 129);
        pnlDatos.add(jLabel5, gridBagConstraints);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 10, 80);
        pnlDatos.add(jSeparator2, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Lo utilizaremos para ponernos en contacto, enviarte extractos y \"PagoTiempo\"");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 134);
        pnlDatos.add(jLabel6, gridBagConstraints);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/lock120.png"))); // NOI18N
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 22;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDatos.add(jLabel10, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("**Todos los campos son obligatorios");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        pnlDatos.add(jLabel12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 37;
        gridBagConstraints.gridheight = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 202;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 200, 5, 150);
        panelDatos.add(pnlDatos, gridBagConstraints);

        tbneProductos.addTab("Agregar", panelDatos);

        getContentPane().add(tbneProductos, java.awt.BorderLayout.CENTER);

        panelBotones.setBackground(new java.awt.Color(250, 250, 250));
        panelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 229, 229)));
        panelBotones.setPreferredSize(new java.awt.Dimension(120, 23));
        panelBotones.setLayout(new java.awt.GridLayout(8, 0, 0, 5));

        btnNuevo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/agregarDatos40.png"))); // NOI18N
        btnNuevo.setText("Nuevo registro");
        btnNuevo.setToolTipText("Agregar nuevo empleado");
        btnNuevo.setBorder(null);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusPainted(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setPreferredSize(new java.awt.Dimension(70, 75));
        btnNuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/agregarDatos44.png"))); // NOI18N
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        panelBotones.add(btnNuevo);

        btnGuardar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/guardar40.png"))); // NOI18N
        btnGuardar.setText("Registrar");
        btnGuardar.setToolTipText("Guardar empleado");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setPreferredSize(new java.awt.Dimension(70, 75));
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/guardar44.png"))); // NOI18N
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelBotones.add(btnGuardar);

        btnEditar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/editar40.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Edita un empleado");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setPreferredSize(new java.awt.Dimension(70, 75));
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/editar44.png"))); // NOI18N
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panelBotones.add(btnEditar);

        btnRetornar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/return40.png"))); // NOI18N
        btnRetornar.setText("Regresar");
        btnRetornar.setToolTipText("Sale de la pestaña");
        btnRetornar.setBorderPainted(false);
        btnRetornar.setContentAreaFilled(false);
        btnRetornar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetornar.setFocusPainted(false);
        btnRetornar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRetornar.setPreferredSize(new java.awt.Dimension(70, 75));
        btnRetornar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/dmsoft/Imagenes/return44.png"))); // NOI18N
        btnRetornar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });
        panelBotones.add(btnRetornar);

        getContentPane().add(panelBotones, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
      //Validamos que no se este realizando ninguna otra operacion y que la operacion sea por DEFAULT
       if(tipoOperacion==Utilidades.DEFAULT)
       {
          //Validamos que se haya seleccionado un examen de la tabla
           if(tblUsuariosExamen.getSelectedRow()>=0)
           {

               //Cambiamos el tipo de operacion
               tipoOperacion=Utilidades.EDITAR;
                btnRetornar.setVisible(true);
               btnGuardar.setText("Salvar");
                examen.setId(Integer.parseInt((String) tblUsuariosExamen.getValueAt(tblUsuariosExamen.getSelectedRow(), 0)));
                txtNombre.setText((String) tblUsuariosExamen.getValueAt(tblUsuariosExamen.getSelectedRow(), 1));
                cbxTipoDocumento.setSelectedItem((String) tblUsuariosExamen.getValueAt(tblUsuariosExamen.getSelectedRow(), 2));
                txtNumDocumento.setText((String) tblUsuariosExamen.getValueAt(tblUsuariosExamen.getSelectedRow(), 3));
                txtCorreo.setText((String) tblUsuariosExamen.getValueAt(tblUsuariosExamen.getSelectedRow(), 4));
                txtNumTarjeta.setText((String) tblUsuariosExamen.getValueAt(tblUsuariosExamen.getSelectedRow(), 5));
                txtClaveTarjeta.setText((String) tblUsuariosExamen.getValueAt(tblUsuariosExamen.getSelectedRow(), 6));
                txtContraseña.setText((String) tblUsuariosExamen.getValueAt(tblUsuariosExamen.getSelectedRow(), 7));
                utilidades.cambiarComponente(tbneProductos, panelDatos, "Editar datos de Usuario");
;               //Cambiamos el valor de change
                 utilidades.setChanged(false);
       
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Seleccione un usuario de la tabla");
           }
       }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
       int opcion;
        if(utilidades.isChanged())
        {
              opcion=JOptionPane.showConfirmDialog(null,"Los datos se modificaron.\n"
                                           + "¿Desea guardar los cambios?","Salir",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
              if(opcion==JOptionPane.YES_OPTION)
              {
                  if(guardarDatos())
                  {
                      btnRetornar.setVisible(false);
                      resetFields();
                      utilidades.cambiarComponente(tbneProductos, panelProductos, "Usuarios Registrados");
                  }
              }
              else if(opcion==JOptionPane.NO_OPTION)
              {
                  //Reseteamos la operacion a default
                  btnRetornar.setVisible(false);
                  resetFields();
                  utilidades.cambiarComponente(tbneProductos, panelProductos, "Usuarios Registrados");
                  
              }
                  
        }
        else
        {
            //Reseteamos la operacion a default
                 btnRetornar.setVisible(false);
                  resetFields();
                 utilidades.cambiarComponente(tbneProductos, panelProductos, "Usuarios Registrados");
        }
           
            
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
       utilidades.setChanged(utilidades.onChange(evt));
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtNumDocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocumentoKeyReleased
        utilidades.setChanged(utilidades.onChange(evt));
    }//GEN-LAST:event_txtNumDocumentoKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

   if(!utilidades.isChanged())
    {
         tipoOperacion=Utilidades.NUEVO;
         btnRetornar.setVisible(true);
         utilidades.cambiarComponente(tbneProductos, panelDatos, "Registrar nuevo usario");
    }
    else
    {
        int opcion=JOptionPane.showConfirmDialog(null,"Los datos se modificaron.\n"
                                           + "¿Desea guardar los cambios?","Salir",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(opcion==JOptionPane.YES_OPTION)
         {
                if(guardarDatos())
                {
                  resetFields();
                  utilidades.cambiarComponente(tbneProductos, panelDatos, "Registrar nuevo usario");
                }
                  
              }
              else if(opcion==JOptionPane.NO_OPTION)
              {
                  //Reseteamos la operacion a default
                  resetFields();
                  utilidades.cambiarComponente(tbneProductos, panelDatos, "Registrar nuevo usario");
              }
    }
       
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(tipoOperacion==Utilidades.NUEVO||tipoOperacion==Utilidades.EDITAR)
        {
             if(guardarDatos())
             {
                utilidades.cambiarComponente(tbneProductos, panelProductos, "Usarios Registrados");
                examen.obtenerDatos(tblUsuariosExamen, modeloExamen,"");
                btnRetornar.setVisible(false);
             }
             
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtBuscarUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioKeyReleased
     examen.obtenerDatos(tblUsuariosExamen, modeloExamen, txtBuscarUsuario.getText());
        
    }//GEN-LAST:event_txtBuscarUsuarioKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
          utilidades.setChanged(utilidades.onChange(evt));
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void cbxTipoDocumentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoDocumentoItemStateChanged
       utilidades.setChanged(utilidades.onChange(evt));
    }//GEN-LAST:event_cbxTipoDocumentoItemStateChanged
     
    //Este metodo es para darle diseño al modelo de la tabla 
   private  void modeloTabla(){
      //Creamos un arreglo de Strings para los encabezados de nuestra tabla
    String encabezados[]= {"Id", "Nombre", "Tipo de documento", "Numero de documento", 
                           "Correo", "Num. tarjeta", "Clave tarjeta",
                              "Clave, acceso web"};
    //Creamos un modelo para nuestros arreglo para los encabezados
   modeloExamen=new DefaultTableModel(null,encabezados){

       
       
         //Tambien sobre escribimos el metodo que permite editar las celdas de la tabla
        @Override
         public boolean isCellEditable(int rowIndex,int columnIndex){
             return false;
         }
       };
    //Agregamos nuestro modelo a la tabla
      tblUsuariosExamen.setModel(modeloExamen);
     }
    
    
    //Este metodo se encarga del diseño de la tabla, es decir del formato de las celdas
    private void formatoTabla()
    {
       int id=40,
           nombre=200,
           tipoDocument=250,
           numDocumento=150,
           email=350,
           numTarjtea=180,
           claveTajeta=160,
           claveWeb=150;
           
      //Creamos un arreglo con las medidas fijos predeterminados de la tabla para cada celda
      int ancho[]={id,nombre,tipoDocument,numDocumento,email,numTarjtea,claveTajeta,claveWeb};
      for(int i=0;i<tblUsuariosExamen.getColumnCount();i++)
      {
          tblUsuariosExamen.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
          tblUsuariosExamen.getColumnModel().getColumn(i).setResizable(false);
      }
      tblUsuariosExamen.setRowHeight(20);
      //Establecemos el header
      new Utilidades().setTableHeader(tblUsuariosExamen);
    }
   

    //Este metodo se encarga de deicidir que tipo de operacion se realizara. Si es Guardar o Actualizar
   private boolean realizarOperacion(int tipo){
       boolean realizado=false;
       switch(tipo)
       {
            case Utilidades.NUEVO:
                //llenamos la variables de la clase empleados con los valores del campo de texto
                //que luego seran enviadas en el metodo guardar o actualizar
                setDatos();
                //Luego utilizamos las variables para mandar a llamar al metodo guardar
                 if(examen.guardar())
                  realizado=true;  
            break;
            case Utilidades.EDITAR:
                setDatos();
               if(examen.actualizar())
                   realizado=true;
            break;
       }
       return realizado;
   }

   //Con este metodo obtenemos todos los valores de los campos
   private void setDatos()
   {
         
     examen.setNombre(txtNombre.getText());
     examen.setTipoDocumento(cbxTipoDocumento.getSelectedItem().toString());
     examen.setNumeroDocumento(txtNumDocumento.getText());
     examen.setCorreo(txtCorreo.getText());
     examen.setNumeroTarjeta(txtNumTarjeta.getText());
     examen.setClaveTarjeta(txtClaveTarjeta.getText());
     examen.setPassWeb(txtContraseña.getText());
//     
   }
   
   //Con este metodo asignamos los valores a las variables a los campos 
   private void  getDatos()
   {
             
       txtNombre.setText(examen.getNombre());
       cbxTipoDocumento.setSelectedItem(examen.getTipoDocumento());
       txtNumDocumento.setText(examen.getNumeroDocumento());
       txtCorreo.setText(examen.getCorreo());
       txtNumTarjeta.setText(examen.getNumeroTarjeta());
       txtClaveTarjeta.setText(examen.getClaveTarjeta());
       txtContraseña.setText(examen.getPassWeb());
       /*Debido a que los combobox tiene implementa el ItemListener cada vez que seleccionamos, un item
        el envento detecta el cambio y marca la varible change como true, entonces cada vez que se hace 
       una seleccion en los comboBox entonces la reseteamos porque no es un cambio que nosotros hacemos*/
       utilidades.setChanged(false);
   }
   
   //Con este metodo vamos a limpiar los campos
   private void resetFields()
   {
        tipoOperacion=Utilidades.DEFAULT;
         txtNombre.setText("");
         cbxTipoDocumento.setSelectedIndex(0);
         txtNumDocumento.setText("");
         txtCorreo.setText("");
         txtNumTarjeta.setText("");
         txtClaveTarjeta.setText("");
         txtContraseña.setText("");
         txtBuscarUsuario.setText("");
         btnGuardar.setText("Registrar");
       /*Debido a que los combobox implementan la Interfaz ItemListener cada vez que se selecciona  o agrega .
         un item el envento detecta el cambio y cambia el valor de la varible "change" a true, pare evitar esto
        cada vez que se hace una seleccion en los comboBox desde id la reseteamos porque no es un cambio que
         el usuario a realizado*/
        utilidades.setChanged(false);
     
   }
   
   private boolean guardarDatos(){
       boolean realizado=false;
       //Validamos los campos obligatorios
        if(!utilidades.validarCampos(txtNumDocumento.getText(),txtNombre.getText(),txtCorreo.getText(),txtClaveTarjeta.getText(),txtContraseña.getText(),txtNumTarjeta.getText()))
            {
                //LLamamos la funcion realizarOperacion para que defina si esta guardando o actualizando
               if(realizarOperacion(tipoOperacion))
               {
                  resetFields();
                  examen.obtenerDatos(tblUsuariosExamen, modeloExamen, "");
                  realizado=true;
               }
                  
            }
            else
              JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");
        return realizado;
   }
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRetornar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBuscarEmpleado;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JScrollPane spneTablaEmpleados;
    private javax.swing.JTable tblUsuariosExamen;
    private javax.swing.JTabbedPane tbneProductos;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JTextField txtClaveTarjeta;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumDocumento;
    private javax.swing.JTextField txtNumTarjeta;
    private javax.swing.JTextArea txtaInstrucciones;
    // End of variables declaration//GEN-END:variables
}
