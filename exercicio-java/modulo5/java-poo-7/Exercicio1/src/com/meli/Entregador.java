package com.meli;

public class Entregador extends Funcionario {
    private static final double PLUS = 5000;

    public Entregador(String nome, Integer antiguidade, Double salario) {
        super(nome, antiguidade, salario, PLUS);
    }



    @Override
    public double calculePlus() {
        return 0;
    }


}
