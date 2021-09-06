package com.example.springbootlesson.oo.lesson3Alterada;

public class Gerente extends Funcionario{

	
	public Gerente(String n, String s, double sal) {
		super(n,s,sal);
	}
	
	public double getGratificacao() {
		return super.getSalario() * 0.05;
	}
	
	@Override
	public String toString() {
		return super.toString() + "      " + getGratificacao();
	}
	
}
