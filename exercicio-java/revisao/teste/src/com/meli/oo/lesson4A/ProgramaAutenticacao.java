package com.meli.oo.lesson4A;

import com.meli.oo.lesson4A.model.Cliente;
import com.meli.oo.lesson4A.model.Desenvolvedor;

public class ProgramaAutenticacao {

	
	public static void main(String[] args) {
		
		Desenvolvedor nobre = new Desenvolvedor("nobre", "m", 20000, "nobre@mail.com", "radioNobre");
		Cliente cliente = new Cliente("cliente@mail.com", "123456");
		
		boolean autenticacaoNobre = nobre.autentica("nobre@mail.com", "radioNobre");
		boolean autenticacaoCliente = cliente.autentica("cliente@mail.com", "123456");
		
		System.out.println("autenticacao do nobre: " + autenticacaoNobre);
		System.out.println("autenticacao do cliente: " + autenticacaoCliente);
	}
}
