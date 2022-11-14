package SQL;

import java.sql.*;
import java.util.*;

import Admin.Administrador;

public class SQLAdmin {

    private static final String SQL_SELECT = "SELECT id_user, username, password FROM admin_users";
    private static final String SQL_INSERT = "INSERT INTO admin_users(username, password) VALUES(? , ?)";
    private static final String SQL_UPDATE = "UPDATE admin_users SET username = ?, password = ? WHERE id_user = ?";
    private static final String SQL_DELETE = "DELETE FROM admin_users WHERE id_user = ?";

    public List<Administrador> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Administrador persona = null;
        List<Administrador> personas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_user = rs.getInt("id_user");
                String username = rs.getString("username");
                String password = rs.getString("password");
                persona = new Administrador(id_user, username, password);
                personas.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return personas;
    }

    public int insertar(Administrador persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getUsername());
            stmt.setString(2, persona.getPassword());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return registros;
    }

    public int actualizar(Administrador persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getUsername());
            stmt.setString(2, persona.getPassword());
            stmt.setInt(5, persona.getId_usuario());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return registros;
    }

    public int eliminar(Administrador persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getId_usuario());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return registros;
    }
}
