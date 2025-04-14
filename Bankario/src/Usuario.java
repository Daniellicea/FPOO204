import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

public class Usuario {
    private Connection conexion;
    
    public Usuario() {
        conexion = Conexion.conectar();
    }
    
    public boolean insertar_usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String contrasenia) {        
        String insertUsuarioSQL = "INSERT INTO usuarios(nombre, correo, contrasenia) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(insertUsuarioSQL, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contrasenia);
            
            int affectedRows = ps.executeUpdate();
            
            if (affectedRows == 0) {
                return false;
            }
            
            // Obtenemos el ID generado
            ResultSet id_generado = ps.getGeneratedKeys();
            if (id_generado.next()) {
                int idUsuario = id_generado.getInt(1);
                
                String insertApellidosSQL = "INSERT INTO apellidos(id_usuario, apellido_paterno, apellido_materno) VALUES (?, ?, ?)";
                PreparedStatement psApellidos = conexion.prepareStatement(insertApellidosSQL);
                psApellidos.setInt(1, idUsuario);
                psApellidos.setString(2, apellidoPaterno);
                psApellidos.setString(3, apellidoMaterno);
                
                // Insertamos credenciales básicas
                String insertCredencialSQL = "INSERT INTO credenciales(id_usuario) VALUES (?)";
                PreparedStatement psCredencial = conexion.prepareStatement(insertCredencialSQL);
                psCredencial.setInt(1, idUsuario);
                
                return psApellidos.executeUpdate() > 0 && psCredencial.executeUpdate() > 0;
            } else {
                return false;
            }
        } catch(SQLException e) {
            System.out.println("Error al crear al usuario: " + e.getMessage());
            return false;
        }
    }
    
    // Método para actualizar datos del usuario (actualizado)
    public boolean actualizar_datos(int idUsuario, String nombre, String apellidoPaterno, 
                                  String apellidoMaterno, String correo, String contrasenia) {
        // Actualizar tabla usuarios
        String actualizarUsuarioSQL = "UPDATE usuarios SET nombre = ?, correo = ?, contrasenia = ? WHERE id_usuario = ?";
        // Actualizar tabla apellidos
        String actualizarApellidosSQL = "UPDATE apellidos SET apellido_paterno = ?, apellido_materno = ? WHERE id_usuario = ?";
        
        try {
            // Transacción para asegurar que ambas actualizaciones se completen
            conexion.setAutoCommit(false);
            
            // Actualizar usuarios
            PreparedStatement psUsuario = conexion.prepareStatement(actualizarUsuarioSQL);
            psUsuario.setString(1, nombre);
            psUsuario.setString(2, correo);
            psUsuario.setString(3, contrasenia);
            psUsuario.setInt(4, idUsuario);
            int usuarioRows = psUsuario.executeUpdate();
            
            // Actualizar apellidos
            PreparedStatement psApellidos = conexion.prepareStatement(actualizarApellidosSQL);
            psApellidos.setString(1, apellidoPaterno);
            psApellidos.setString(2, apellidoMaterno);
            psApellidos.setInt(3, idUsuario);
            int apellidosRows = psApellidos.executeUpdate();
            
            if (usuarioRows > 0 && apellidosRows > 0) {
                conexion.commit();
                return true;
            } else {
                conexion.rollback();
                return false;
            }
        } catch(SQLException e) {
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                System.out.println("Error al hacer rollback: " + ex.getMessage());
            }
            System.out.println("Error al actualizar al usuario: " + e.getMessage());
            return false;
        } finally {
            try {
                conexion.setAutoCommit(true);
            } catch (SQLException e) {
                System.out.println("Error al restablecer auto-commit: " + e.getMessage());
            }
        }
    }
    
    // Método para verificar inicio de sesión
    public boolean verificar_inicio_sesion(String correo, String contrasenia) {
        String verificar = "SELECT u.id_usuario FROM usuarios u WHERE u.correo = ? AND u.contrasenia = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(verificar);
            ps.setString(1, correo);
            ps.setString(2, contrasenia);
            
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch(SQLException e) {
            System.out.println("Error al verificar inicio de sesión: " + e.getMessage());
            return false;
        }
    }
    
    // Método para obtener ID de usuario por correo
    public int obtener_id_usuario(String correo) {
        String sql = "SELECT id_usuario FROM usuarios WHERE correo = ?";
        
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt("id_usuario");
            }
        } catch(SQLException e) {
            System.out.println("Error al obtener ID: " + e.getMessage());
        }
        return -1; 
    }
    
    // Método para obtener contraseña
    public String obtener_contrasenia(String correo) {
        String sql = "SELECT contrasenia FROM usuarios WHERE correo = ?";
        
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getString("contrasenia");
            }
        } catch(SQLException e) {
            System.out.println("Error al obtener contraseña: " + e.getMessage());
        }
        return null;
    }
    
    // Método para obtener nombre 
    public String obtener_nombre_completo(int idUsuario) {
        String consulta = "SELECT u.nombre, a.apellido_paterno, a.apellido_materno " +
                     "FROM usuarios u JOIN apellidos a ON u.id_usuario = a.id_usuario " +
                     "WHERE u.id_usuario = ?";
        
        try (PreparedStatement ps = conexion.prepareStatement(consulta)) {
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellidoPaterno = rs.getString("apellido_paterno");
                String apellidoMaterno = rs.getString("apellido_materno");
                
                return (nombre + " " + apellidoPaterno + " "+ apellidoMaterno);
            }
        } catch(SQLException e) {
            System.out.println("Error al obtener nombre completo: " + e.getMessage());
        }
        return "";
    }
    
    // Método para cargar todos los datos del usuario
    public String cargar_datos_usuario(int idUsuario) {
        String sql = "SELECT u.nombre, u.correo, u.contrasenia, a.apellido_paterno, a.apellido_materno " +
                     "FROM usuarios u JOIN apellidos a ON u.id_usuario = a.id_usuario " +
                     "WHERE u.id_usuario = ?";
        
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getString("nombre") + "|||" + 
                        rs.getString("apellido_paterno") + "|||" + 
                        rs.getString("apellido_materno") + "|||" +
                        rs.getString("correo") + "|||" + 
                        rs.getString("contrasenia");
            }
        } catch(SQLException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
        return null;
    }  
    
    public boolean agregar_opinion(int idUsuario, String contenido) {
        String sql = "INSERT INTO opiniones(id_usuario, contenido) VALUES (?, ?)";
        
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, idUsuario);
            ps.setString(2, contenido);
            return ps.executeUpdate() > 0;
        } catch(SQLException e) {
            System.out.println("Error al agregar opinión: " + e.getMessage());
            return false;
        }
    }
        
}