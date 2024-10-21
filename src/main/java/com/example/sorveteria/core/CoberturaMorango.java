package com.example.sorveteria.core;

public class CoberturaMorango extends Cobertura {
    public CoberturaMorango(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 0.50;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao() + ", Cobertura de Morango";
    }
}
