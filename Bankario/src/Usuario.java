import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

public class Usuario {
    private Connection conexion;
    
    public Usuario(){
        conexion = Conexion.conectar();
    }
    
    public  boolean InsertUsuario (String nombre, String apellidos , String correo, String contra){
        String insertSQL="Insert into usuarios(nombre, apellidos , correo,contrasenia) values (?,?,?,?)";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1,nombre);
            ps.setString(2,apellidos);
            ps.setString(3,correo);
            ps.setString(4,contra);
            
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al crear al usuario "+e.getMessage());
            return false;
        }
    }
    
public boolean verificar_inicio_sesion(String correo, String contra) {
    // Consulta SQL corregida
    String verificar = "SELECT * FROM usuarios WHERE correo = ? AND contrasenia = ?";
    
    try {
        // Preparar la consulta
        PreparedStatement verifi = conexion.prepareStatement(verificar);
        verifi.setString(1, correo);
        verifi.setString(2, contra);

        // Ejecutar la consulta y obtener los resultados
        ResultSet rs = verifi.executeQuery();

        // Si hay al menos un registro, el usuario y contraseña son válidos
        return rs.next();

    } catch (SQLException e) {
        System.out.println("Error al verificar el inicio de sesión: " + e.getMessage());
        return false;
        }
    }
}