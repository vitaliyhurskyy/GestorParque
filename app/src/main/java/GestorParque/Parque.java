/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorParque;

import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author vital
 */
public class Parque {
    private AtracaoDAO atracaoDAO;
    private VisitanteDAO visitanteDAO;
    private VendaDAO vendaDAO;

    public Parque() {
        this.atracaoDAO = new AtracaoDAO();
        this.visitanteDAO = new VisitanteDAO();
        this.vendaDAO = new VendaDAO();
    }

    public void adicionarAtracao(Atracao atracao) {
        try {
            atracaoDAO.adicionarAtracao(atracao);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarAtracao(Atracao atracao) {
        try {
            atracaoDAO.atualizarAtracao(atracao);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirAtracao(int id) {
        try {
            atracaoDAO.excluirAtracao(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Atracao> listarAtracoes() {
        try {
            return atracaoDAO.listarAtracoes();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void adicionarVisitante(Visitante visitante) {
        try {
            visitanteDAO.adicionarVisitante(visitante);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarVisitante(Visitante visitante) {
        try {
            visitanteDAO.atualizarVisitante(visitante);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirVisitante(int id) {
        try {
            visitanteDAO.excluirVisitante(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Visitante> listarVisitantes() {
        try {
            return visitanteDAO.listarVisitantes();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void adicionarVenda(Venda venda) {
        try {
            vendaDAO.adicionarVenda(venda);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Venda> listarVendas() {
        try {
            return vendaDAO.listarVendas();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
