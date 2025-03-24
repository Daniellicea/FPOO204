import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class UserCRUD {
    private Connection conexion;
    
    public UserCRUD(){
        conexion = ConexionMySQL.conectar();
    }
    
    public  boolean InsertUsuario (String nombre, String correo, String contra){
        String insertSQL="Insert into usuarios(nombre, correo,contrasenia) values (?,?,?)";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1,nombre);
            ps.setString(2,correo);
            ps.setString(3,contra);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al crear al usuario "+e.getMessage());
            return false;
        }
    }
    
    
}


