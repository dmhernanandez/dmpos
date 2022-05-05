
package dmsoft.Clases.Entidades;

import dmsoft.Clases.ConexionMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Examen
{
   
  //Creamos las instancias de las clases
ConexionMYSQL conexion = new ConexionMYSQL();
Connection conectar = conexion.getConexion();
    private boolean realizado=false;
   //Se utiliza para incrementar el numero de parametro y no tener que escribirlo manualmente
    int contador;

  private int id;
  private String nombre;
  private String tipoDocumento;
  private String descripcion;
  private String numeroDocumento;
  private String correo;
  private String numeroTarjeta;
  private String claveTarjeta;
  private String passWeb;

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

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getClaveTarjeta() {
        return claveTarjeta;
    }

    public void setClaveTarjeta(String claveTarjeta) {
        this.claveTarjeta = claveTarjeta;
    }

    public String getPassWeb() {
        return passWeb;
    }

    public void setPassWeb(String passWeb) {
        this.passWeb = passWeb;
    }


      public boolean guardar() {
        try {
            contador=1;
            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAInsertarExamen`(?,?,?,?,?,?,?)}");

            cblStatement.setString(contador++, nombre);
            cblStatement.setString(contador++, tipoDocumento);
            cblStatement.setString(contador++, numeroDocumento);
            cblStatement.setString(contador++, correo);
            cblStatement.setString(contador++, numeroTarjeta);
            cblStatement.setString(contador++, claveTarjeta);
            cblStatement.setString(contador++, passWeb);
            
            if(cblStatement.executeUpdate()>0)
            {
                 realizado=true;
                 JOptionPane.showMessageDialog(null,"Datos guardados con exito","Realizado",JOptionPane.INFORMATION_MESSAGE);

            }
           
            
        } catch (Exception ex) {
            realizado=false;
            JOptionPane.showMessageDialog(null, "Error al guardar datos del usuario web\n\n" + ex, "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
        return realizado;
    }
    
    
    public boolean actualizar() {
        try {
            contador=1;
            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAActualizarExamen`(?,?,?,?,?,?,?,?)}");
            cblStatement.setInt(contador++, id);
            cblStatement.setString(contador++, nombre);
            cblStatement.setString(contador++, tipoDocumento);
            cblStatement.setString(contador++, numeroDocumento);
            cblStatement.setString(contador++, correo);
            cblStatement.setString(contador++, numeroTarjeta);
            cblStatement.setString(contador++, claveTarjeta);
            cblStatement.setString(contador++, passWeb);
            
            if(cblStatement.executeUpdate()>0)
            {
                realizado=true;
              JOptionPane.showMessageDialog(null,"Datos actualizados con exito","Realizado",JOptionPane.INFORMATION_MESSAGE);

            }
               
            
        } catch (Exception ex) {
            realizado=false;
            JOptionPane.showMessageDialog(null, "Error al actualizar datos del usuario web\n\n" + ex, "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
        return realizado;
    }
    
    //Con este metodo obtenemos los datos y pasamos como parametro la tabla y el modelo en el que 
    //se mostraran, ademas de eso se pasa un filtro y el vlor del filtro
   public void obtenerDatos(JTable tabla,DefaultTableModel modelo,String filtro){
       
       //limpiamos el modelo de la tabla
       modelo.setRowCount(0);
       //Creamos el arreglo para pasarlo como fila al modelo
       Object datos[]=new Object[8];
       try 
       {
        //primero pasamos los parametros y luego obtenemos los datos
        CallableStatement cblStatement=conectar.prepareCall("{CALL `PAConsultarExamenII`(?)}");
        cblStatement.setString(1,filtro);
        ResultSet rltSet=cblStatement.executeQuery();
           while(rltSet.next())
           {
               datos[0]=rltSet.getString(1);
               datos[1]=rltSet.getString(2);
               datos[2]=rltSet.getString(3);
               datos[3]=rltSet.getString(4);
               datos[4]=rltSet.getString(5);
               datos[5]=rltSet.getString(6);
               datos[6]=rltSet.getString(7);
               datos[7]=rltSet.getString(8);
               modelo.addRow(datos);
           }
            tabla.setModel(modelo);
       } 
       catch (Exception e)
       {
        JOptionPane.showMessageDialog(null, e);
       }
   }
}
