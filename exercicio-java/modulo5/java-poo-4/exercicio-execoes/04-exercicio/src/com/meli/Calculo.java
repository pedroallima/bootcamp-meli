package com.company;

import java.util.Random;

public class Calculo {
    public void MostrarMaior(int a, int b){
        if (a > b){
            System.out.println("O numero " + a + " é maior que "+ b);
        }
        else {
            System.out.println("O numero " + b + " é maior que "+ a);
        }
    }

    public void MostrarMenor(int a, int b){
        if (a < b){
            System.out.println("O numero " + a + " é menor que "+ b);
        }
        else {
            System.out.println("O numero " + b + " é menor que "+ a);
        }
    }
    public void CalcularPotencia(double numero, double potencia){
        double resultado = Math.pow(numero, potencia);
        System.out.println("O numero " + numero + " elevado a " + potencia + " e igual " + resultado);
    }
    public void CalcularCosseno(double angulo){
        double cosseno = Math.cos(angulo);
        System.out.println("O cosseno do angulo " + angulo + " é igual " + cosseno);
    }

    public void CalcularRaiz(double numero){
        double raiz = Math.sqrt(numero);
        System.out.println("A raiz do número " + numero + " é igual " + raiz);
    }

    public void MostrarAleatorio(){
        Random random = new Random();
        int aleatorio  = random.nextInt(1000);
        System.out.println("O número aleatorio gerado e " + aleatorio);
    }

}
