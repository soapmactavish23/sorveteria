package com.example.sorveteria.core;

public abstract class Cobertura extends Sorvete {

    public static String CHOCOLATE = "chocolate";
    public static String MORANGO = "morango";
    public static String CARAMELO = "caramelo";

    protected Sorvete sorvete;

    public Cobertura(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    @Override
    public abstract double getPreco();

    @Override
    public abstract String getDescricao();
}
