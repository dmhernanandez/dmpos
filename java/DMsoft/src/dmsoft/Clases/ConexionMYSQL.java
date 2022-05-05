/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmsoft.Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionMYSQL {
    
    //Creamos una Variable de Tipo Conecction
    private  Connection conexion=null;
    public Connection getConexion()
    {
        //Creamos tres variables con los parametros de la Conexión
        String dbase="jdbc:mysql://localhost/dbpuntoventa";
        String user="root";
        String password="dany1999hernan";
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           conexion=DriverManager.getConnection(dbase, user, password);
         //   JOptionPane.showMessageDialog(null,"ConexionMYSQL Exitosa");
        }
        catch (HeadlessException | ClassNotFoundException | SQLException e) 
        {
           JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos "+ e);
        }
        return conexion;
    }
    
    
}
