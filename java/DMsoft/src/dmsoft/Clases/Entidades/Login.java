
package dmsoft.Clases.Entidades;

import dmsoft.Clases.ConexionMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Login 
{
    ConexionMYSQL conexion = new ConexionMYSQL();
    Connection conectar = conexion.getConexion();
    
    private int idUsuario;
    //Creamos variables estaticas para acceder a los elementos del arreglo Estado
    public static final int PRIV_FACTURACION=0;
    public static final int PRIV_COMRAS=1;
    public static final int PRIV_PRODUCTOS=2;
    public static final int PRIV_PROVEEDORES=3;
    public static final int PRIV_EMPLEADOS=4;
    public static final int PRIV_USUARIOS=5;
    public static final int PRIV_CLIENTES=6;
    public static final int PRIV_CATEGORIAS=7;
    public static final int PRIV_VENTAS_REALIZADAS=8;
    public static final int PRIV_MEDIDAS=9;
    public static final int PRIV_EMPRESA=10;
    public static final int PRIV_ANULAR_VENTA=11;
    public static final int PRIV_MANTENIMIENTO_DB=12;
  /*Este arreglo contendra todos los privilegios del sistema*/
  private final String privilegios[]={"FACTURACION","COMPRAS","PRODUCTOS","PROVEEDORES","EMPLEADOS",
                                "USUARIOS","CLIENTES","CATEGORIAS","VENTAS_REALIZADAS","MEDIDAS",
                                  "EMPRESA","ANULAR_VENTA","MANTENIMIENTO_DB" };
  /*Este contendra el estado si estan asignados o no*/
    private static boolean estado[]=new boolean[13];
  
  /*Recupera de la base de datos todos los privilegios asignados y los compara con los del sistema*/
  private ArrayList<String> privUser=new ArrayList<>();
  
  
  //con este metodo validamos que existe el usario en la base de datos
  public boolean validarLogin(String user, String pass)
  {
      boolean existe=false;
      try {

            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAValidarLogin`(?,?)}");
            cblStatement.setString(1, user);
            cblStatement.setString(2, pass);
            ResultSet rst=cblStatement.executeQuery();
            while(rst.next())
            {
                idUsuario=rst.getInt(1);
                existe=true;
            }
            //Si existe el usuario, vamos a exatraer sus privilegios
            if(existe)
            {
                obtenerPrivilegios(idUsuario);
            }
        } catch (SQLException ex) {
           existe =false;
            JOptionPane.showMessageDialog(null, "Error al comprobar Login\n\n" + ex, "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
      return existe;
  }
  //Con este metodo obtenemos todos los privilegios asociados a un id de rol y los agregamos al ArrayList
  public void obtenerPrivilegios(int id)
  {
     try {
           privUser.clear();
            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAObtnerPrivilegios`(?)}");
            cblStatement.setInt(1, id);

            ResultSet rst=cblStatement.executeQuery();
            while(rst.next())
            {
             privUser.add(rst.getString(1));
            }
            
            //Una vez extraidos los privilegios los comparamos con los del sistema y determinamos cuales estan disponibles
            llenarEstados();
        }
     catch (SQLException ex)
        {

            JOptionPane.showMessageDialog(null, "Error al recuperar los privilegios \n\n" + ex, "Error al guardar", JOptionPane.ERROR_MESSAGE);
        } 
  }
  
   //Con este metodo llenamos el arreglo de datos de estado
  private void llenarEstados(){
      resetEstado();
      for(int i=0;i<privUser.size();i++)
      {
          for(int j=0;j<privilegios.length;j++)
          {
             //Comparamos que los privilegios del sistema sean iguales a los devueltos por el arreglo
              if(privUser.get(i).equals(privilegios[j]))
              {
                  System.out.println(privUser.get(i)+" = "+privilegios[j]);
                  estado[j]=true;
                  break;
              }
                  
          }
      }
  }
  public boolean getPrivilegio(int index)
  {
      return estado[index];
  }
  
  
  private void resetEstado()
  {
      for(int i=0;i<estado.length;i++)
          estado[i]=false;
  }
  
  
 
}
