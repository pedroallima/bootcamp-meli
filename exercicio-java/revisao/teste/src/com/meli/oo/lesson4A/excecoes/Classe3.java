package com.meli.oo.lesson4A.excecoes;

import com.meli.oo.lesson4A.model.Funcionario;

public class Classe3 {

	private Funcionario funcionario;
	
	public void metod3() throws NullPointerException{
		System.out.println("executando o metodo 3");
		
		//funcionario = new Diretor();
		System.out.println("salario do diretor: " + funcionario.getSalario());
		
		System.out.println("finalizando o metodo 3");
	}

}
