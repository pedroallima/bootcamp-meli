package com.meli.oo.lesson5.exception;

public class FuncionarioExistenteException extends RuntimeException{

	
	public FuncionarioExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public FuncionarioExistenteException(RuntimeException e) {
		super(e);
	}
}
