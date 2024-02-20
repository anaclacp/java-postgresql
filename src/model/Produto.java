/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Produto {
    
    private int id;
    private String sabor;
    private double preco;
    private int categoria_id;
    private String categoria_nome;
    
    public Produto(){
    }

    public Produto(int id, String sabor, double preco, int categoria_id, String categoria_nome) {
    this.id = id;
    this.sabor = sabor;
    this.preco = preco;
    this.categoria_id = categoria_id;
    this.categoria_nome = categoria_nome;
}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getCategoria_nome() {
        return categoria_nome;
    }

    public void setCategoria_nome(String categoria_nome) {
        this.categoria_nome = categoria_nome;
    }
    
    @Override
    public String toString(){
        return sabor;
    }
    
    
}
