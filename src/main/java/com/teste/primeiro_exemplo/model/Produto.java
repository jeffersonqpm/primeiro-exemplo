package com.teste.primeiro_exemplo.model;

public class Produto {

    //#region Atributos

    private int id;
    private String nome;
    private int quantidade;
    private double valor;
    private String obs;
    
   //#endregion

   

   //#region getterESetters

    public int getId() {
        return id;
    }

    public Produto(int id, String nome, int quantidade, double valor, String obs) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.obs = obs;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    //#endregion

}
