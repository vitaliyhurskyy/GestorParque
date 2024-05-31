/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorParque;

/**
 *
 * @author vital
 */
public class Venda {
    private int id;
    private Ingresso ingresso;
    private Visitante visitante;
    private Atracao atracao;

    public Venda(int id, Ingresso ingresso, Visitante visitante, Atracao atracao) {
        this.id = id;
        this.ingresso = ingresso;
        this.visitante = visitante;
        this.atracao = atracao;
    }

    public int getId() {
        return id;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public Atracao getAtracao() {
        return atracao;
    }
}
