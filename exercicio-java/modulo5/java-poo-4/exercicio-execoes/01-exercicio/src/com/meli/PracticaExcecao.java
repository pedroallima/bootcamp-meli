package com.company;

public class PracticaExcecao {
    public int a = 0;
    public int b = 300;

    public PracticaExcecao(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public  void quociente(){
        try {
            double conta = this.b / this.a;
            System.out.println("O resultado :" + conta);
        }
        //catch (Exception ex){
        //    System.out.println("Ocorreu um erro");

        catch (Exception ex){
            throw new IllegalArgumentException("Nao Pode ser dividio por zero");

        }


    }



}

