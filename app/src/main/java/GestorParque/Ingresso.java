/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorParque;

import java.sql.Date;
/**
 *
 * @author vital
 */
public class Ingresso {
     private int id;
    private Date dataCompra;
    private String tipo;
    private double preco;

    public Ingresso(int id, Date dataCompra, String tipo, double preco) {
        this.id = id;
        this.dataCompra = dataCompra;
        this.tipo = tipo;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }
}
