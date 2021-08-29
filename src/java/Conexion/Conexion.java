
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    static String bd = "Entradas";
    static String user = "root";
    static String pass = "1234";
    static String url = "jdbc:mysql://localhost:3306/" + bd;
    Connection conn = null;
    
    public Conexion(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection(url, user, pass);
           if (conn!= null) {
               System.out.println("Exito en la conexion");
           } 
       }catch(Exception e){
           System.out.println("Error de conexion" + e);
       }
      
   }
     public Connection conectar(){
           return conn;
       }
     public void desconectar()throws Exception   {
         conn.close();
     }
  }

