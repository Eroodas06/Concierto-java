
package dao;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import modelo.Usuario;


public class UsuarioDao {
    Conexion  conn;
    
    public UsuarioDao (Conexion conn){
        this.conn = conn;
    }    
    
    public boolean insertar (Usuario user){
        String sql="insert into usuario values (?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            ps.setInt(1, user.getId());
            ps.setString (2, user.getNombre());
            ps.setString (3, user.getApellido());
            ps.setInt (4, user.getEdad());
            ps.setString (5, user.getFecha());
            ps.executeUpdate();
         return true;   
        }catch (Exception e){
            return false; 
            
        }
        
    } 
}
