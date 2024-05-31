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
public class VendaDAO {
    public void adicionarVenda(Venda venda) throws SQLException {
        String sql = "INSERT INTO venda (ingresso_id, visitante_id, atracao_id) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, venda.getIngresso().getId());
            stmt.setInt(2, venda.getVisitante().getId());
            stmt.setInt(3, venda.getAtracao().getId());
            stmt.executeUpdate();
        }
    }

    public List<Venda> listarVendas() throws SQLException {
        List<Venda> vendas = new ArrayList<>();
        String sql = "SELECT v.id, i.id as ingresso_id, i.data_compra, i.tipo, i.preco, " +
                     "vis.id as visitante_id, vis.nome, vis.idade, vis.altura, vis.preferencias, " +
                     "a.id as atracao_id, a.nome, a.capacidade_maxima, a.tempo_espera " +
                     "FROM venda v " +
                     "JOIN ingresso i ON v.ingresso_id = i.id " +
                     "JOIN visitante vis ON v.visitante_id = vis.id " +
                     "JOIN atracao a ON v.atracao_id = a.id";

        try (Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Ingresso ingresso = new Ingresso(
                    rs.getInt("ingresso_id"),
                    rs.getDate("data_compra"),
                    rs.getString("tipo"),
                    rs.getDouble("preco")
                );
                Visitante visitante = new Visitante(
                    rs.getInt("visitante_id"),
                    rs.getString("nome"),
                    rs.getInt("idade"),
                    rs.getDouble("altura"),
                    rs.getString("preferencias")
                );
                Atracao atracao = new Atracao(
                    rs.getInt("atracao_id"),
                    rs.getString("nome"),
                    rs.getInt("capacidade_maxima"),
                    rs.getInt("tempo_espera")
                );
                Venda venda = new Venda(rs.getInt("id"), ingresso, visitante, atracao);
                vendas.add(venda);
            }
        }
        return vendas;
    }
}
