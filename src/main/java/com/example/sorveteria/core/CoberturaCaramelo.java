package com.example.sorveteria.core;

public class CoberturaCaramelo extends Cobertura {
    public CoberturaCaramelo(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 0.50;
    }

    @Override
    public String getDescricao() {
        return sorvete.getDescricao() + ", Cobertura de Caramelo";
    }
}

