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
public class AtracaoDAO {
    public void adicionarAtracao(Atracao atracao) throws SQLException {
        String sql = "INSERT INTO atracao (nome, capacidade_maxima, tempo_espera) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, atracao.getNome());
            stmt.setInt(2, atracao.getCapacidadeMaxima());
            stmt.setInt(3, atracao.getTempoEspera());
            stmt.executeUpdate();
        }
    }

    public void atualizarAtracao(Atracao atracao) throws SQLException {
        String sql = "UPDATE atracao SET capacidade_maxima = ?, tempo_espera = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, atracao.getCapacidadeMaxima());
            stmt.setInt(2, atracao.getTempoEspera());
            stmt.setInt(3, atracao.getId());
            stmt.executeUpdate();
        }
    }

    public void excluirAtracao(int id) throws SQLException {
        String sql = "DELETE FROM atracao WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public List<Atracao> listarAtracoes() throws SQLException {
        List<Atracao> atracoes = new ArrayList<>();
        String sql = "SELECT * FROM atracao";
        try (Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Atracao atracao = new Atracao(rs.getInt("id"), rs.getString("nome"), rs.getInt("capacidade_maxima"), rs.getInt("tempo_espera"));
                atracoes.add(atracao);
            }
        }
        return atracoes;
    }
}
