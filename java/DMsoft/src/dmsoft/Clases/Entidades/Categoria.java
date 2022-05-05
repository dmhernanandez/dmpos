/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmsoft.Clases.Entidades;

import dmsoft.Clases.ConexionMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dany_Hernandez
 */
public class Categoria {
   private int idCategoria;
   private String nombre;
   private String descripcion;
   private boolean realizado=false;
    ConexionMYSQL conexion=new ConexionMYSQL();
    Connection conectar=conexion.getConexion();
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean guardar() {
        realizado=false;
        try {
            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAInsertarCategoria`(?,?)}");
            cblStatement.setString(1,getNombre());
            cblStatement.setString(2, getDescripcion());

            if(cblStatement.executeUpdate()>0)
            {
                 realizado=true;
                 JOptionPane.showMessageDialog(null,"Datos guardados con exito","Realizado",JOptionPane.INFORMATION_MESSAGE);

            }
           
            
        } catch (Exception ex) {
            realizado=false;
            JOptionPane.showMessageDialog(null, "Error al guardar proveedor\n\n" + ex, "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
        return realizado;
    }
    
    
    public boolean actualizar() {
       realizado=false; 
        try {
            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAActualizarCategoria`(?,?,?)}");
            cblStatement.setInt(1, idCategoria);
            cblStatement.setString(2,nombre);
            cblStatement.setString(3, descripcion);
            
            if(cblStatement.executeUpdate()>0)
            {
                realizado=true;
              JOptionPane.showMessageDialog(null,"Datos actualizados con exito","Realizado",JOptionPane.INFORMATION_MESSAGE);

            }
               
            
        } catch (Exception ex) {
            realizado=false;
            JOptionPane.showMessageDialog(null, "Error al guardar datos de Categoría\n\n" + ex, "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
        return realizado;
    }
    //Con este metodo obtenemos los datos y pasamos como parametro la tabla y el modelo en el que 
    //se mostraran, ademas de eso se pasa un filtro y el vlor del filtro
   public void obtenerDatos(JTable tabla,DefaultTableModel modelo,String filtro){
       
       //limpiamos el modelo de la tabla
       modelo.setRowCount(0);
       //Creamos el arreglo para pasarlo como fila al modelo
       Object datos[]=new Object[3];
       try 
       {
        //primero pasamos los parametros y luego obtenemos los datos
        CallableStatement cblStatement=conectar.prepareCall("{CALL `PAConsultarCategoria`(?)}");
        cblStatement.setString(1,filtro);
        ResultSet rltSet=cblStatement.executeQuery();
           while(rltSet.next())
           {
               datos[0]=rltSet.getInt(1);
               datos[1]=rltSet.getString(2);
               datos[2]=rltSet.getString(3);
           
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
           PreparedStatement ppStatement=conectar.prepareStatement("SELECT FCEliminarCategoria(?)");
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

