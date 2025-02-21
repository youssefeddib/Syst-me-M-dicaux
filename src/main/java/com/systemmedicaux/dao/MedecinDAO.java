package dao;

import model.Medecin;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedecinDAO {
    public void ajouterMedecin(Medecin medecin) {
        String sql = "INSERT INTO medecin (nom, specialite) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, medecin.getNom());
            stmt.setString(2, medecin.getSpecialite());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Medecin> getMedecins() {
        List<Medecin> medecins = new ArrayList<>();
        String sql = "SELECT * FROM medecin";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                medecins.add(new Medecin(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("specialite")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medecins;
    }
}
