/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorParque;

/**
 *
 * @author vital
 */
public class Visitante {
     private int id;
    private String nome;
    private int idade;
    private double altura;
    private String preferencias;

    public Visitante(int id, String nome, int idade, double altura, String preferencias) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.preferencias = preferencias;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void atualizarPreferencias(String novasPreferencias) {
        this.preferencias = novasPreferencias;
    }
}
