package com.meli;

public class Exercicio3 {
    public static void main(String[] args) {
        PessoaEx3 zezinho = new PessoaEx3("Zezinho", 25, 1, 70.0, 1.90);
        PessoaEx3 marcelinho = new PessoaEx3("Marcelinho", 18, null);

        System.out.println("Nome: " + zezinho + " Idade: " + zezinho.idade + " ID: " + zezinho.id + " peso: " + zezinho.peso + " altura: " + zezinho.altura);
        if (zezinho.eMaiorDeIdade()) {
            System.out.println("É maior de idade");
        }else {
            System.out.println("É menor de idade");
        }
        switch (zezinho.calcularIMC()){
            case -1:
                System.out.println("Esta abaixo do peso");
                break;
            case 0:
                System.out.println("Peso saudável");
                break;
            default:
                System.out.println("Sobrepeso!");
                break;
        }
    }
}
