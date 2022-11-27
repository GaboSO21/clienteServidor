package SQL;

import java.sql.*;
import java.sql.Date;
import java.util.*;

import Persona.Colaborador;

public class SQLColaborador implements SQLAcciones {

    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT id_Colaborador, nombre, apellidos, cedula, horas, fecha FROM planillaColab";
    private static final String SQL_INSERT = "INSERT INTO planillaColab(nombre, apellidos, cedula, horas, fecha) VALUES(?, ?, ?, ?, ?)";

    public SQLColaborador() {

    }

    public SQLColaborador(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    @Override
    public List<Colaborador> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Colaborador colaborador = null;
        List<Colaborador> colaboradores = new ArrayList<>();
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_Colaborador = rs.getInt("id_Colaborador");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String cedula = rs.getString("cedula");
                int horasTrabajadas = rs.getInt("horas");
                Date fecha = rs.getDate("fecha");
                colaborador = new Colaborador(nombre, apellidos, cedula, id_Colaborador, horasTrabajadas, fecha);
                colaboradores.add(colaborador);
            }
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return colaboradores;
    }

    @Override
    public int insert(Colaborador colaborador) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, colaborador.getNombre());
            stmt.setString(2, colaborador.getApellido());
            stmt.setString(3, colaborador.getCedula());
            stmt.setInt(4, colaborador.getHorasTrabajadas());
            stmt.setDate(5, colaborador.getFecha());
            registros = stmt.executeUpdate();
        } finally {
            try {
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return registros;
    }

}
