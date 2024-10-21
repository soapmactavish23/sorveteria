package com.example.sorveteria.core;

public class CoberturaChocolate extends Cobertura {
    public CoberturaChocolate(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 0.50;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao() + ", Cobertura de Chocolate";
    }
}
