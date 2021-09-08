package com.meli.oo.lesson4;

import java.text.DecimalFormat;

public class TesteDeParametro {
    public void imprime(double valor){
        String format = new DecimalFormat("#.##").format(valor);
        System.out.println(format);
    }

}
