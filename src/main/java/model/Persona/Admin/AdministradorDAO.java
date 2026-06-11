package model.Persona.Admin;

import model.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministradorDAO {

    public boolean insertar(Administrador admin) {
        String sql = "INSERT INTO administrador (nombres, apellidos, username, password) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionBD.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, admin.getNombres());
            stmt.setString(2, admin.getApellidos());
            stmt.setString(3, admin.getUsername());
            stmt.setString(4, admin.getPassword());
                return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Administrador validarLogin(String usuario, String password) {

        Administrador admin = null;

        String sql = "SELECT * FROM administrador WHERE username=? AND password=?";

        try (Connection con = ConexionBD.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Crear objeto Administrador con los datos de la BD
                admin = new Administrador(
                        rs.getInt("id"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("username"),
                        rs.getString("password")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return admin; // Devuelve null si no encontró coincidencia
    }
}
