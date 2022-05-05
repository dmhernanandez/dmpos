/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmsoft.Clases.Entidades;

import dmsoft.Clases.ConexionMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Producto {
  private String codigo;
  private String nombre;
  private float precio;
  private String descripcion;
  private float cantidad;
  private String unidad;
  private float isv;
  private String categoria;
  private String proveedor;
  private String estado;
    ConexionMYSQL conexion = new ConexionMYSQL();
    Connection conectar = conexion.getConexion();
    private boolean realizado=false;
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String Codigo) {
        this.codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public float getIsv() {
        return isv;
    }

    public void setIsv(float isv) {
        this.isv = isv;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
      public boolean guardar() {
        try {
            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAInsertarProducto`(?,?,?,?,?,?,?,?,?,?)}");
            cblStatement.setString(1,codigo);
            cblStatement.setString(2, nombre);
            cblStatement.setString(3, descripcion);
            cblStatement.setFloat(4, precio);
            cblStatement.setFloat(5, isv);
            cblStatement.setFloat(6, cantidad);
            cblStatement.setString(7, estado);
            cblStatement.setString(8, proveedor);
            cblStatement.setString(9, categoria);
            cblStatement.setString(10, unidad);
            
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
            CallableStatement cblStatement = conectar.prepareCall("{CALL `PAActualizarProducto`(?,?,?,?,?,?,?,?,?,?)}");
            cblStatement.setString(1,codigo);
            cblStatement.setString(2, nombre);
            cblStatement.setString(3, descripcion);
            cblStatement.setFloat(4, precio);
            cblStatement.setFloat(5, isv);
            cblStatement.setFloat(6, cantidad);
            cblStatement.setString(7, estado);
            cblStatement.setString(8, proveedor);
            cblStatement.setString(9, categoria);
            cblStatement.setString(10, unidad);
            
            if(cblStatement.executeUpdate()>0)
            {
                realizado=true;
              JOptionPane.showMessageDialog(null,"Datos actualizados con exito","Realizado",JOptionPane.INFORMATION_MESSAGE);

            }
               
            
        } catch (Exception ex) {
            realizado=false;
            JOptionPane.showMessageDialog(null, "Error al guardar datos del Producto\n\n" + ex, "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
        return realizado;
    }
    
    //Con este metodo obtenemos los datos y pasamos como parametro la tabla y el modelo en el que 
    //se mostraran, ademas de eso se pasa un filtro y el vlor del filtro
   public void obtenerDatos(JTable tabla,DefaultTableModel modelo,String filtro,String valorFiltro){
       
       //limpiamos el modelo de la tabla
       modelo.setRowCount(0);
       //Creamos el arreglo para pasarlo como fila al modelo
       Object datos[]=new Object[8];
       try 
       {
        //primero pasamos los parametros y luego obtenemos los datos
        CallableStatement cblStatement=conectar.prepareCall("{CALL `PAConsultarProductos`(?,?)}");
        cblStatement.setString(1,filtro);
        cblStatement.setString(2, valorFiltro);
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
   
   //Con este metodo obtenemos todos los valores  de los campos por separado para actualizarlos
    public void obtenerDatos(String DNI){

       try 
       {
        //primero pasamos los parametros y luego obtenemos los datos
        CallableStatement cblStatement=conectar.prepareCall("{CALL `PASeleccionarProductos`(?)}");
        cblStatement.setString(1,DNI);
        ResultSet rltSet=cblStatement.executeQuery();
           while(rltSet.next())
           {
              codigo=  rltSet.getString(1);
              nombre  =rltSet.getString(2);
              precio=rltSet.getFloat(3);
              descripcion=rltSet.getString(4);
              cantidad=rltSet.getFloat(5);
              unidad=rltSet.getString(6);
              isv=rltSet.getFloat(7);
              categoria=rltSet.getString(8);
              proveedor=rltSet.getString(9);
              estado=rltSet.getString(10);
           }
       } 
       catch (Exception e)
       {
        JOptionPane.showMessageDialog(null, e);
       }
   }
    
    //Con este metodo agregamos al JComboBox el nombre de todos los proveedores para seleccionar
    public void obtenerProveedor(JComboBox combo)
    {
        try {
            CallableStatement cblStatement=conectar.prepareCall("{CALL `PASeleccionarProveedor`()}");
            ResultSet rltSet=cblStatement.executeQuery();
            while(rltSet.next())
            {
                combo.addItem(rltSet.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al recuperar lista de Proveedores\n\n ","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
 
      //Con este metodo agregamos al JComboBox la abreviatura de todas las unidades de medida seleccionadas
    public void obtenerUnidad(JComboBox combo)
    {
        try {
            CallableStatement cblStatement=conectar.prepareCall("{CALL `PASeleccionarUnidad`()}");
            ResultSet rltSet=cblStatement.executeQuery();
            while(rltSet.next())
            {
                combo.addItem(rltSet.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al recuperar lista de Unidades de Medida\n\n "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
      //Con este metodo agregamos al JComboBox la abreviatura de todas las unidades de medida seleccionadas
    public void obtenerCategoria(JComboBox combo)
    {
        try {
            CallableStatement cblStatement=conectar.prepareCall("{CALL `PASeleccionarCategoria`()}");
            ResultSet rltSet=cblStatement.executeQuery();
            while(rltSet.next())
            {
                combo.addItem(rltSet.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al recuperar lista de Categorias\n\n "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
