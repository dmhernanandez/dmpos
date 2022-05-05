
package dmsoft.Clases.Entidades;

import dmsoft.Clases.ConexionMYSQL;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Roles
{
    //Creamos las dos variables y los metodos get y set;
   private String nombreUsuario;
   private String descripcionUsuario;
   private Connection conectar=null;
   private boolean realizado=false;
    /*Cremos un ArrayList para almacenar los permisos de todos los usuarios*/
   private ArrayList<Integer> permisos;
   //Creamos un objeto de la clase ConexionMYSQL para poder conectarnos a la base de datos
   private ConexionMYSQL conexion=new ConexionMYSQL();
   
    public Roles(String nombreUsuario, String descripcionUsuario) {
        this.permisos = new ArrayList<>();
        this.nombreUsuario = nombreUsuario;
        this.descripcionUsuario = descripcionUsuario;
    }

    public Roles()
    {
        this.permisos = new ArrayList<>();
         
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }

    public void setDescripcionUsuario(String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
    }
   
    //Este metodo nos permite llenar la tabla los tipos de usuarios
    //pasandole como parametro la tabla y el modelo de la misma
    public void llenarTablaPrivilegios(DefaultTableModel modelo, JTable tabla)
    {
        //Creamos un arreglo de tipo Object para poder recibir todos los tipos de datos
        Object datos[]=new Object[4];
         conectar=conexion.getConexion();
        try 
        {
   
            CallableStatement cblStatement=conectar.prepareCall("{CALL PAConsultaPrivilegios()}");
            ResultSet rstSet=cblStatement.executeQuery();
            while(rstSet.next())
            {
                datos[0]=rstSet.getInt(1);
                datos[1]=rstSet.getString(2);
                datos[2]=false;
                datos[3]=rstSet.getString(3);
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error 1: No se pudo recuperar inforación"
                    + "de la tabla de Usuarios/n"+e);
        }
    }
    
    /*Con este metodo llenamos la tabla de roles*/
    public void llenarTablaRoles(DefaultTableModel modelo, JTable tabla,String filtro)
    {
        //Creamos un arreglo de tipo Object para poder recibir todos los tipos de datos
        Object datos[]=new Object[3];
         conectar=conexion.getConexion();
        try 
        {
            //Primero limpiamos el modelo para que cuando entre la consulta no se dupliquen las filas
            modelo.setRowCount(0);
            //Luego realizamos la consulta
            CallableStatement cblStatement=conectar.prepareCall("{CALL PAConsultaUsuarios(?)}");
            cblStatement.setString(1, filtro);
            
            ResultSet rstSet=cblStatement.executeQuery();
            while(rstSet.next())
            {
                datos[0]=rstSet.getInt(1);
                datos[1]=rstSet.getString(2);
                datos[2]=rstSet.getString(3);
                modelo.addRow(datos);
            }
          
            tabla.setModel(modelo);
        } 
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error 1: No se pudo recuperar inforación"
                    + "de la tabla de Roles"
                    + "/n"+e);
        }
    }
    //Este metodo permite eliminar datos de la tabla tipo usuarios
    public void eliminarUsuario(String usuario)
    {
       try
       {
           conectar=conexion.getConexion();
           CallableStatement clbStatatment=conectar.prepareCall("{}");
           clbStatatment.setString(1, usuario);
            //stment=clbStatatment.execute();
       }
       catch (SQLException ex) {
          
       }
        
    }
    
    /*Con este metedo se guardan los datos del usuario*/
    public boolean guardarUsuario(String nombre, String descripcion)
    {
         realizado=false;
       try
       {
           CallableStatement cblStatement= conectar.prepareCall("{CALL PAInsertarUsuarios(?,?)}");
           cblStatement.setString(1,nombre);
           cblStatement.setString(2, descripcion);
           if(cblStatement.executeUpdate()>0)
             realizado=true;
       } 
       catch (Exception ex)
       {
           JOptionPane.showMessageDialog(null,"Error al guardar datos del Usuario\n"+ex);
       }
       return realizado;
    }
    
     //Con este metodo guardamos los privilegios del usuario
  public  boolean guardarPrivilegioUser(String nombreUsuario,ArrayList<Integer> privilegios)
    {
        realizado=false;
        try 
        {
            conectar=conexion.getConexion();
            CallableStatement cbleSt;
             //Luego Insertamos los nuevos privilegios para ese rol
             
           if(!privilegios.isEmpty())
           {
                for(int idPrivilegio:privilegios)
                {
                  cbleSt=conectar.prepareCall("{CALL PAInsertarRol(?,?)}");
                  cbleSt.setString(1, nombreUsuario);
                  cbleSt.setInt(2,idPrivilegio);
                  if(cbleSt.executeUpdate()>0)
                      realizado=true;
                }
           }
           else
               realizado=true;
        } 
        catch (SQLException e)
        {
            realizado=false;
            JOptionPane.showMessageDialog(null,"Error al guardar los privilegios del usuario\n"+e);
        }
             return realizado;
    }
  
  
    //Este metodo permite actualizar los roles y sus permisos
    public boolean actualizarDatos(int idUsuario,String nombre,String descripcion){
        realizado=false;
        try 
        {
            conectar=conexion.getConexion();
            CallableStatement cbleSt=conectar.prepareCall("{CALL `PAActualizarUsuarios`(?,?,?)}");
            cbleSt.setInt(1, idUsuario);
            cbleSt.setString(2, nombre);
            cbleSt.setString(3, descripcion);
            if(cbleSt.executeUpdate()>0)
                realizado=true;
        } 
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al Actualizar los datos del Usuario/n"+e);
        }
        return realizado;
    }
    
    //Este metodo Actualiza unicamente los permisos del empleado
    public  boolean actualizarRoles(int idUsuario,ArrayList<Integer> privilegios)
    {
        realizado=false;
        try 
        {
            conectar=conexion.getConexion();
            //Primero limpia el en la base de datos los privilegios que tien el usuario 
            CallableStatement cbleSt=conectar.prepareCall("{Call PALimpiarRol(?)}");
            cbleSt.setInt(1, idUsuario);
            cbleSt.executeUpdate();
           
             //Luego Insertamos los nuevos privilegios para ese rol
           cbleSt=conectar.prepareCall("{CALL PAActualizarRol(?,?)}");
           if(!privilegios.isEmpty())
           {
               //Creamos un for-each para enviar los datos del array
               for(int idPrivilegio:privilegios)
                { 
                  cbleSt.setInt(1, idUsuario);
                  cbleSt.setInt(2,idPrivilegio);
                  if(cbleSt.executeUpdate()>0)
                      realizado=true;
                }  
           }
           else 
               realizado=true;
                   
        } 
        catch (SQLException e)
        {
            realizado=false;
            JOptionPane.showMessageDialog(null,"Error al Actualizar los privilegios del Usuario\n"+e);
        }
        return realizado;
    }
    
    
    
    /*Con este metodo creamos llenamos ArrayLis para leer los privilegios
    de cada rol*/
    public void consultaPrivilegios(int idRol)
    {
       permisos.clear();
       try
       {
           conectar=conexion.getConexion();
           CallableStatement cblStatement=conectar.prepareCall("{CALL `PASeleccionarRoles`(?)}");
           cblStatement.setInt(1, idRol);
           ResultSet rltSet=cblStatement.executeQuery();
           while(rltSet.next())
           {
               permisos.add(rltSet.getInt(1));
           }
           
       } 
       catch (SQLException ex)
       {
         JOptionPane.showMessageDialog(null,"Error al seleccionar privilegios\n"
                                          + "del rol \n "+ ex);
       }

    }
    /*Esta funcion retorna un valor entero, en esta caso retorna el idPrivilegio del privilegio
    que es paralelo con los indices de la tabla*/
    public int getPrivilegios(int index)
       {
           return permisos.get(index);
       }
    //Retorna el tamaño del ArrayList de los privilegios
    public int privilegiosLength()
    {
        return permisos.size();
    }
    
   
}
