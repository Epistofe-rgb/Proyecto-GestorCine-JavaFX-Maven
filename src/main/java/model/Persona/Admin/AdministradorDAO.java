package model.Persona.Admin;

import model.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
