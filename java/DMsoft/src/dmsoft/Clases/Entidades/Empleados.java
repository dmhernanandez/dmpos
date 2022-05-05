/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmsoft.Clases.Entidades;

import dmsoft.Clases.ConexionMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Empleados {

    ConexionMYSQL conexion = new ConexionMYSQL();
    Connection conectar = conexion.getConexion();
    private String dni;
    private String pNombre;
    private String sNombre;
    private String apellidoMaterno;
    private String apallidoPaterno;
    private Date fechaNacimiento;
    private String direccion;
    private String correo;
    private String telefono;
    private String nombreUsuario;
    private String clave;
    private String estado;
    private String idCargo="";
    private String tipoUsuario;
   private int idEmpleado;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    private boolean realizado = false;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoPaterno) {
        this.apellidoMaterno = apellidoPaterno;
    }

    public String getApallidoPaterno() {
        return apallidoPaterno;
    }

    public void setApellidoPaterno(String apalleidoPaterno) {
        this.apallidoPaterno = apalleidoPaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return nombreUsuario;
    }

    public void setUsuario(String usuario) {
        this.nombreUsuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String idRol) {
        this.tipoUsuario = idRol;
    }

    public boolean guardar() {
        try {
            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAInsertarEmpleados`(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cblStatement.setString(1,dni);
            cblStatement.setString(2, pNombre);
            cblStatement.setString(3, sNombre);
            cblStatement.setString(4, apallidoPaterno);
            cblStatement.setString(5, apellidoMaterno);
            cblStatement.setDate(6, fechaNacimiento);
            cblStatement.setString(7, direccion);
            cblStatement.setString(8, correo);
            cblStatement.setString(9, telefono);
            cblStatement.setString(10, nombreUsuario);
            cblStatement.setString(11, clave);
            cblStatement.setString(12, estado);
            cblStatement.setString(13, idCargo);
            cblStatement.setString(14, tipoUsuario);
            
            if(cblStatement.executeUpdate()>0)
            {
                 realizado=true;
                 JOptionPane.showMessageDialog(null,"Datos guardados con exito","Realizado",JOptionPane.INFORMATION_MESSAGE);

            }
           
            
        } catch (Exception ex) {
            realizado=false;
            JOptionPane.showMessageDialog(null, "Error al guardar datos del Empleado\n" + ex, "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
        return realizado;
    }
    
    
    public boolean actualizar() {
        try {
            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAActualizarEmpleados`(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cblStatement.setInt(1, idEmpleado);
            cblStatement.setString(2,dni);
            cblStatement.setString(3, pNombre);
            cblStatement.setString(4, sNombre);
            cblStatement.setString(5, apallidoPaterno);
            cblStatement.setString(6, apellidoMaterno);
            cblStatement.setDate(7, fechaNacimiento);
            cblStatement.setString(8, direccion);
            cblStatement.setString(9, correo);
            cblStatement.setString(10, telefono);
            cblStatement.setString(11, nombreUsuario);
            cblStatement.setString(12, clave);
            cblStatement.setString(13, estado);
            cblStatement.setString(14, idCargo);
            cblStatement.setString(15, tipoUsuario);
            
            if(cblStatement.executeUpdate()>0)
            {
                realizado=true;
              JOptionPane.showMessageDialog(null,"Datos actualizados con exito","Realizado",JOptionPane.INFORMATION_MESSAGE);

            }
               
            
        } catch (Exception ex) {
            realizado=false;
            JOptionPane.showMessageDialog(null, "Error al guardar datos del Empleado\n" + ex, "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
        return realizado;
    }
    //Con este metodo obtenemos los datos y pasamos como parametro la tabla y el modelo en el que 
    //se mostraran, ademas de eso se pasa un filtro y el vlor del filtro
   public void obtenerDatos(JTable tabla,DefaultTableModel modelo,String filtro,String valorFiltro){
       
       //limpiamos el modelo de la tabla
       modelo.setRowCount(0);
       //Creamos el arreglo para pasarlo como fila al modelo
       Object datos[]=new Object[10];
       try 
       {
        //primero pasamos los parametros y luego obtenemos los datos
        CallableStatement cblStatement=conectar.prepareCall("{CALL `PAConsultarEmpleados`(?,?)}");
        cblStatement.setString(1,filtro);
        cblStatement.setString(2, valorFiltro);
        ResultSet rltSet=cblStatement.executeQuery();
           while(rltSet.next())
           {
               datos[0]=rltSet.getString(1);
               datos[1]=rltSet.getString(2);
               datos[2]=rltSet.getString(3);
               datos[3]=rltSet.getDate(4);
               datos[4]=rltSet.getString(5);
               datos[5]=rltSet.getString(6);
               datos[6]=rltSet.getString(7);
               datos[7]=rltSet.getString(8);
               datos[8]=rltSet.getString(9);
               datos[9]=rltSet.getString(10);
           
               modelo.addRow(datos);
           }
            tabla.setModel(modelo);
       } 
       catch (Exception e)
       {
        JOptionPane.showMessageDialog(null, e);
       }
   }
   
   //Con este metodo obtenemos los valores pero llenamos las variables
    public void obtenerDatos(String DNI){

       try 
       {
        //primero pasamos los parametros y luego obtenemos los datos
        CallableStatement cblStatement=conectar.prepareCall("{CALL `PAConsultarEmpleados2`(?)}");
        cblStatement.setString(1,DNI);
        ResultSet rltSet=cblStatement.executeQuery();
           while(rltSet.next())
           {
              idEmpleado=  rltSet.getInt(1);
              dni  =rltSet.getString(2);
              pNombre=rltSet.getString(3);
              sNombre=rltSet.getString(4);
              apallidoPaterno=rltSet.getString(5);
              apellidoMaterno=rltSet.getString(6);
              fechaNacimiento=rltSet.getDate(7);
              direccion=rltSet.getString(8);
              telefono=rltSet.getString(9);
              correo=rltSet.getString(10);
              nombreUsuario=rltSet.getString(11);
              clave=rltSet.getString(12);
              estado=rltSet.getString(13);
              tipoUsuario=rltSet.getString(14);
           }
 
       } 
       catch (Exception e)
       {
        JOptionPane.showMessageDialog(null, e);
       }
   }
    
    //Con este metodo agregamos al JComboBox todos los tipos de usuarios
    public void obtenerTiposUsuarios(JComboBox combo)
    {
        try {
            CallableStatement cblStatement=conectar.prepareCall("{CALL `PASeleccionarUsuarios`()}");
            ResultSet rltSet=cblStatement.executeQuery();
            while(rltSet.next())
            {
                combo.addItem(rltSet.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al recuperar lista de usuarios ","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
