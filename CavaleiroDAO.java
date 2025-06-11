package dao;

import model.Cavaleiro;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CavaleiroDAO {
    public void criarCavaleiro(Cavaleiro c) {
        String sql = "INSERT INTO Cavaleiros (nome, constelacao, nivel, afiliacao) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getConstelacao());
            stmt.setString(3, c.getNivel());
            stmt.setString(4, c.getAfiliacao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
