/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorParque;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author vital
 */
public class VisitanteDAO {
    public void adicionarVisitante(Visitante visitante) throws SQLException {
        String sql = "INSERT INTO visitante (nome, idade, altura, preferencias) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, visitante.getNome());
            stmt.setInt(2, visitante.getIdade());
            stmt.setDouble(3, visitante.getAltura());
            stmt.setString(4, visitante.getPreferencias());
            stmt.executeUpdate();
        }
    }

    public void atualizarVisitante(Visitante visitante) throws SQLException {
        String sql = "UPDATE visitante SET preferencias = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, visitante.getPreferencias());
            stmt.setInt(2, visitante.getId());
            stmt.executeUpdate();
        }
    }

    public void excluirVisitante(int id) throws SQLException {
        String sql = "DELETE FROM visitante WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public List<Visitante> listarVisitantes() throws SQLException {
        List<Visitante> visitantes = new ArrayList<>();
        String sql = "SELECT * FROM visitante";
        try (Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Visitante visitante = new Visitante(rs.getInt("id"), rs.getString("nome"), rs.getInt("idade"), rs.getDouble("altura"), rs.getString("preferencias"));
                visitantes.add(visitante);
            }
        }
        return visitantes;
    }
}
