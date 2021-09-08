package com.meli.oo.lesson4;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Funcionario{

	private String nome;
	private String sexo;
	private double salario;
	private DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
	private static DecimalFormat df = new DecimalFormat("#.##");


	public Funcionario(){
	}

	public Funcionario(String n, String s, double sal) {
		nome = n;
		sexo = s;
		simbolo.setDecimalSeparator('.');
		df.setRoundingMode(RoundingMode.UP);
		df.setDecimalFormatSymbols(simbolo);
		String format = df.format(sal);
		salario = Double.valueOf(format);

	}
	
	public double getSalario() {
		return salario;
	}
	
	public String getNome() {
		return nome.toUpperCase();
	}
	
	public String getSexo() {
		return sexo;
	}
	
	@Override
	public String toString() {
		return nome + "         " + sexo + "        " + salario;
	}
}
