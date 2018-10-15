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
       private String usuario;
       private String mensaje;
       private String linea;
    
    
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
         
         String sqlselect = "INSERT INTO mensajes (Nombre, Mensaje) VALUES ('" + x + "' , '" + y + "' );";
         Statement st = connection.createStatement();
         st.executeUpdate(sqlselect);
	 st.close();
         
         connection.close();
    }
        public void leermensajes() throws ClassNotFoundException, SQLException{ 
            
         /*Class.forName(driver);
         cargarConexion();
         String sql ="" ;
         
         connection.close();*/
         try{
            String select = "Select * from mensajes";
             
            Class.forName(driver);
            cargarConexion();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                usuario = rs.getString("Nombre");
                mensaje = rs.getString("Mensaje");
                linea = usuario + ": " + mensaje;
                System.out.println(linea);
            }
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

}
