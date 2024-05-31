/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorParque;

/**
 *
 * @author vital
 */
public class Atracao {
     private int id;
    private String nome;
    private int capacidadeMaxima;
    private int visitantesNaFila;
    private int tempoEspera;

    public Atracao(int id, String nome, int capacidadeMaxima, int tempoEspera) {
        this.id = id;
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.tempoEspera = tempoEspera;
        this.visitantesNaFila = 0;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public int getVisitantesNaFila() {
        return visitantesNaFila;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void adicionarVisitanteNaFila() {
        visitantesNaFila++;
    }

    public void removerVisitanteDaFila() {
        if (visitantesNaFila > 0) {
            visitantesNaFila--;
        }
    }

    public void atualizarTempoEspera(int novoTempo) {
        this.tempoEspera = novoTempo;
    }

    public void atualizarCapacidade(int novaCapacidade) {
        this.capacidadeMaxima = novaCapacidade;
    }
}
