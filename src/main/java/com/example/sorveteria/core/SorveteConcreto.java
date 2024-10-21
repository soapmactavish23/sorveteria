package com.example.sorveteria.core;

public class SorveteConcreto extends Sorvete {
    private String sabor;
    private double preco;

    public SorveteConcreto(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return sabor;
    }
}
