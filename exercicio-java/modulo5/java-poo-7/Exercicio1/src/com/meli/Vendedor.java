package com.meli;

public class Vendedor extends Funcionario {
    private Double comissao;
    private static final double PLUS = 5000;

    public Vendedor(String nome, Integer antiguidade, Double salario, Double comissao) {
        super(nome, antiguidade, salario, PLUS);
        this.comissao = comissao;
    }

    public Double getComissao() {
        return comissao;
    }
    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }


    @Override
    public double calculePlus() {
        double total = 0;
        if (antiguidade == 5 && comissao > 5000) {
            total = salario + PLUS;
        } else {
            total = 0d;
        }
        return total;
    }

    @Override
    public String toString() {
        return " " +comissao+" comissao";
    }
}
