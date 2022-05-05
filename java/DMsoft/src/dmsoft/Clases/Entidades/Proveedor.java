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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Proveedor {
   ConexionMYSQL conexion = new ConexionMYSQL();
    Connection conectar = conexion.getConexion();
    private int idProveedor;
    private String nombre;
    private String representante;
    private String telefono;
    private String correo;
    private String producto;
   private boolean realizado=false;
    public ConexionMYSQL getConexion() {
        return conexion;
    }

    public void setConexion(ConexionMYSQL conexion) {
        this.conexion = conexion;
    }

    public Connection getConectar() {
        return conectar;
    }

    public void setConectar(Connection conectar) {
        this.conectar = conectar;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    public boolean guardar() {
        realizado=false;
        try {
            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAInsertarProveedor`(?,?,?,?,?)}");
            cblStatement.setString(1,nombre);
            cblStatement.setString(2, representante);
            cblStatement.setString(3, telefono);
            cblStatement.setString(4, correo);
            cblStatement.setString(5, producto);

            if(cblStatement.executeUpdate()>0)
            {
                 realizado=true;
                 JOptionPane.showMessageDialog(null,"Datos guardados con exito","Realizado",JOptionPane.INFORMATION_MESSAGE);

            }
           
            
        } catch (Exception ex) {
            realizado=false;
            JOptionPane.showMessageDialog(null, "Error al guardar datos del Proveedro\n\n" + ex, "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
        return realizado;
    }
    
    
    public boolean actualizar() {
       realizado=false; 
        try {
            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAActualizarProveedor`(?,?,?,?,?,?)}");
            cblStatement.setInt(1, idProveedor);
            cblStatement.setString(2,nombre);
            cblStatement.setString(3, representante);
            cblStatement.setString(4, telefono);
            cblStatement.setString(5, correo);
            cblStatement.setString(6, producto);
            
            if(cblStatement.executeUpdate()>0)
            {
                realizado=true;
              JOptionPane.showMessageDialog(null,"Datos actualizados con exito","Realizado",JOptionPane.INFORMATION_MESSAGE);

            }
               
            
        } catch (Exception ex) {
            realizado=false;
            JOptionPane.showMessageDialog(null, "Error al guardar datos del Proveedor\n\n" + ex, "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
        return realizado;
    }
    //Con este metodo obtenemos los datos y pasamos como parametro la tabla y el modelo en el que 
    //se mostraran, ademas de eso se pasa un filtro y el vlor del filtro
   public void obtenerDatos(JTable tabla,DefaultTableModel modelo,String filtro){
       
       //limpiamos el modelo de la tabla
       modelo.setRowCount(0);
       //Creamos el arreglo para pasarlo como fila al modelo
       Object datos[]=new Object[6];
       try 
       {
        //primero pasamos los parametros y luego obtenemos los datos
        CallableStatement cblStatement=conectar.prepareCall("{CALL `PAConsultarProveedor`(?)}");
        cblStatement.setString(1,filtro);
        ResultSet rltSet=cblStatement.executeQuery();
           while(rltSet.next())
           {
               datos[0]=rltSet.getInt(1);
               datos[1]=rltSet.getString(2);
               datos[2]=rltSet.getString(3);
               datos[3]=rltSet.getString(4);
               datos[4]=rltSet.getString(5);
               datos[5]=rltSet.getString(6);
           
               modelo.addRow(datos);
           }
            tabla.setModel(modelo);
       } 
       catch (Exception e)
       {
        JOptionPane.showMessageDialog(null, "Error al recuperar datos del proveedor \n\n"+e);
       }
   }
   
   //COn este metodo eliminamos un proveedor si no tiene ninguna relacion en otra tabla
   public int eliminar(int id){
       int respuesta=0;
       try
       {
           PreparedStatement ppStatement=conectar.prepareStatement("SELECT FCEliminarProveedor(?)");
           ppStatement.setInt(1, id);
           ResultSet rst=ppStatement.executeQuery();
           while(rst.next())
           {
            respuesta=rst.getInt(1);
           }
          
       } catch (Exception e)
       {
          respuesta=Utilidades.ERROR;
           JOptionPane.showMessageDialog(null, "Error al eliminar proveedor\n\n"+e);
       }
       
       return respuesta;
   }
}
