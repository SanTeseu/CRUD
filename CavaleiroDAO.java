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

    public List<Cavaleiro> listar() {
        List<Cavaleiro> lista = new ArrayList<>();
        String sql = "SELECT * FROM Cavaleiros";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Cavaleiro c = new Cavaleiro();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setConstelacao(rs.getString("constelacao"));
                c.setNivel(rs.getString("nivel"));
                c.setAfiliacao(rs.getString("afiliacao"));
                lista.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void atualizar(Cavaleiro c) {
        String sql = "UPDATE Cavaleiros SET nome=?, constelacao=?, nivel=?, afiliacao=? WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getConstelacao());
            stmt.setString(3, c.getNivel());
            stmt.setString(4, c.getAfiliacao());
            stmt.setInt(5, c.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM Cavaleiros WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
