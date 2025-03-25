import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


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
    
    public ResultSet Buscar_por_id (int id){
        String sq_buscar_id = "Select * from usuarios where id_usuario = ? ";
        try{
            PreparedStatement ps = conexion.prepareStatement(sq_buscar_id);
            ps.setInt(1, id);
            return ps.executeQuery();
        }catch (SQLException e){
            System.out.println("Error al buscar por Idi"+e.getMessage());
            return null;
        }
    }
    
    public ResultSet obtenerTodos (){
        String sqlTodos="select * from usuarios";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlTodos);
            return ps.executeQuery(); //me retorna la consulta de todos los usuarios 
        }catch(SQLException s){
            System.out.println("Error al consultar todos" + s.getMessage());
            return null;
        }
    }
    
    
}


