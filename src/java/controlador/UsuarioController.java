
package controlador;

import Conexion.Conexion;
import dao.UsuarioDao;
import java.util.Scanner;
import modelo.Usuario;


public class UsuarioController {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Usuario user = new Usuario(0);
        Conexion conn = new Conexion();
        UsuarioDao userd = new UsuarioDao(conn);
        
        System.out.println("Bienvenido a la venta de entradas para el concierto ");
        
        System.out.println("Ingrese Nombre");
        user.setNombre(sca.next());
        System.out.println("Ingrese Apellido");
        user.setApellido(sca.next());
        System.out.println("Ingrese su Edad");
        user.setEdad(sca.nextInt());
        System.out.println("Ingrese la fecha actual");
        user.setFecha(sca.next());
        
        boolean respuesta = userd.insertar(user);
        
        if (respuesta) {
            System.out.println("su registro fue guardado con Exito");
        }else{
            System.out.println("Error al guardar registro");
        }
        
                
    }
    
}
