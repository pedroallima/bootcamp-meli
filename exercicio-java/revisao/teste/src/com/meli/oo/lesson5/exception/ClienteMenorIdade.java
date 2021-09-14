package com.meli.oo.lesson5.exception;

public class ClienteMenorIdade  extends RuntimeException{
    // Lancando
    public ClienteMenorIdade(String mensagem) {
        super(mensagem);
    }

    public ClienteMenorIdade(RuntimeException e) {
        super(e);
    }

}
