package com.meli;

public class Main {

    public static void main(String[] args) {
        Pessoa zezinho = new Pessoa("Zezinho", 23, 1, 60.0, 1.90);
        Pessoa marcelinho = new Pessoa("Marcelinho", 18, null);

        System.out.println("Nome: " + zezinho.nome + " Idade: " + zezinho.idade + " ID: " + zezinho.id + " peso: " + zezinho.peso + " altura: " + zezinho.altura);

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
