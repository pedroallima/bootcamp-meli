package com.meli;

public class Main {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Pedro", 5, 3000d, 6000d);
        Double salario = vendedor.calculePlus();


        if (!salario.equals(0)) {
            System.out.println(" beneficiado: " + vendedor.getNome() + " salário:" + salario);
        }
    }
}
