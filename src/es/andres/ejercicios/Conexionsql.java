/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.andres.ejercicios;

import java.sql.*;

/**
 *
 * @author andres.cañadas
 */
public class Conexionsql {
    
       private Connection connection;
       private String driver = "com.mysql.jdbc.Driver";
       private String servidor = "jdbc:mysql://10.10.220.83:3306/juansap";
       private String user = "userjuansap";
       private String pass = "123456";
    
    
    /*public void basededatos() throws SQLException{
        connection = DriverManager.getConnection(servidor, user, pass);
        System.out.println("DONE");
        connection.close();//Cierra conexión
    }*/
       
    private void cargarConexion() throws SQLException {
        
        connection = DriverManager.getConnection(servidor, user, pass);
        
    }
    
    public void mandarmensaje(String x, String y) throws ClassNotFoundException, SQLException{ 
            
         Class.forName(driver);
         cargarConexion();
         
         String sqlselect = "INSERT INTO mensajes (Nombre, Mensajes) VALUES ('" + x + "' , '" + y + " );";
         Statement st = connection.createStatement();
         st.executeUpdate(sqlselect);
	 st.close();
         
         connection.close();
    }
        public void leermensajes() throws ClassNotFoundException, SQLException{ 
            
         Class.forName(driver);
         cargarConexion();
         String sql ="" ;
         
         connection.close();
    }
    


}
