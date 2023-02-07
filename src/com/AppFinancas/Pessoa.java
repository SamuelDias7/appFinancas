package com.AppFinancas;

public class Pessoa {
	// Atributos
	public double salario;
	public double result;
	public double result2;
	
	// Métodos
	public double calcularSalario(double salario) {
		this.salario = salario;
		
		result = salario * 30 / 100;

		return result;
	}

}
