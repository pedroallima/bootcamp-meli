package com.company;

public class Main {

    public static void main(String[] args) {

	String mensagemFinal = "Essa é a última mensagem";

	try {
	    int [] numeros = new int[5];
	    numeros [5] = 10;
    }
	catch (Exception ex){
        System.out.println("Ocorreu uma excecão " + ex.getMessage() + "\n");

    }
        System.out.println(mensagemFinal);


    }
}
