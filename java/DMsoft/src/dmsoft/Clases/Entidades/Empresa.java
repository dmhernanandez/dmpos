
package dmsoft.Clases.Entidades;

import dmsoft.Clases.ConexionMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Empresa {

   
  private int idEmpresa=0;
  private String codigo ="";
   private String rtn="";
   private String nombre="";
   private String rubro="";
   private String slogan="";   
   private String direccion="";
   private String telefono="";
   private String correo="";
   private String fax="";
   private String rutaLogo="";
   private boolean confirmacion;
   
   //Creamos una instancia de la conexion
    ConexionMYSQL conexion=new ConexionMYSQL();
    Connection conectar=conexion.getConexion();
   
     public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getRtn() {
        return rtn;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public String getSlogan() {
        return slogan;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFax() {
        return fax;
    }

    public String getRutaLogo() {
        return rutaLogo;
    }
   
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setRutaLogo(String rutaLogo) {
        this.rutaLogo = rutaLogo;
    }
 
    public Empresa(String codigo, String rtn, String nombre, String rubro, String slogan, String direccion, String telefono, String correo, String fax, String rutaLogo) {
        this.codigo = codigo;
        this.rtn = rtn;
        this.nombre = nombre;
        this.rubro = rubro;
        this.slogan = slogan;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fax = fax;
        this.rutaLogo = rutaLogo;
    }
    public Empresa()
    {
        
    }
     //Con este metodo guardamos los datos de la empresa
    public boolean guardar()
    {
      confirmacion=false;
      try {
         CallableStatement cblStement=conectar.prepareCall("{CALL `PAInsertarEmpresa`(?,?,?,?,?,?,?,?,?,?)}");
          cblStement.setString(1, codigo);
          cblStement.setString(2, nombre);
          cblStement.setString(3, rubro);
          cblStement.setString(4, direccion);
          cblStement.setString(5, telefono);
          cblStement.setString(6, correo);
          cblStement.setString(7, fax);
          cblStement.setString(8, rtn);
          cblStement.setString(9, slogan);
          cblStement.setString(10, rutaLogo);
          if(cblStement.executeUpdate()>0)
          {
              confirmacion=true;
          }
      } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar\n"+ex);
            confirmacion=false;
      }
      return confirmacion;
    }
   public boolean actualizar()
    {
        confirmacion=false;
      try {
         CallableStatement cblStement=conectar.prepareCall("{CALL `PAActualizarEmpresa`(?,?,?,?,?,?,?,?,?,?,?)}");
          cblStement.setString(1, codigo);
          cblStement.setString(2, nombre);
          cblStement.setString(3, rubro);
          cblStement.setString(4, direccion);
          cblStement.setString(5, telefono);
          cblStement.setString(6, correo);
          cblStement.setString(7, fax);
          cblStement.setString(8, rtn);
          cblStement.setString(9, slogan);
          cblStement.setString(10, rutaLogo);
          cblStement.setInt(11, idEmpresa);
          if(cblStement.executeUpdate()>0)
          {
             confirmacion=true;
           
                     
          }
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al Actualizar datos\n"+ex);
          confirmacion=false;
      }
       return confirmacion;
    }
   
   //Con este metodo obtenemos los datos de la empresa de la base de datos
   public void obtenerDatos()
   {

      try {
          CallableStatement cblStement=conectar.prepareCall("{CALL PAConsultarEmpresa()}");
          ResultSet rst=cblStement.executeQuery();
          //Vamos a obtener unicamente el primer valor en la tabla
          
          if(rst.first())//Comprobamos que haya una empresa guardada
          {
              codigo=rst.getString(1);
              nombre=rst.getString(2);
              rubro=rst.getString(3);
              direccion=rst.getString(4);
              telefono=rst.getString(5);
              correo=rst.getString(6);
              fax=rst.getString(7);
              rtn=rst.getString(8);
              slogan=rst.getString(9);
              rutaLogo=rst.getString(10);
              idEmpresa=rst.getInt(11);
          }
      } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error al conultar datos de la empresa:\n"+ex);
      }
   }
   
   public boolean hayRegistros(){
       boolean existe=false;
      try {
          PreparedStatement pStatement=conectar.prepareStatement("SELECT FCExisteEmpresa()");
          ResultSet rst=pStatement.executeQuery();
             rst.next();
               existe=rst.getBoolean(1);
      } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error al conultar datos de la empresa:\n"+ex);
      }   
      return existe;
   }
}
