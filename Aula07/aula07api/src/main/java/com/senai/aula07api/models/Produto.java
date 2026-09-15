package com.senai.aula07api.models;

public class Produto {
    // Atributos do produto
    private int id;
    private String nome;
    private double preco;

    // Construtor vazio usado na conversao do JSON recebido pela API.
    public Produto() {
    }

    // Construtor
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
