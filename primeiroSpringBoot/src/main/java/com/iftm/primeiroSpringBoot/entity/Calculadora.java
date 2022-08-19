package com.iftm.primeiroSpringBoot.entity;

public class Calculadora {
	private double resultado;
	
	public void somar(double num1, double num2) {
		resultado = num1 + num2;
	}
	
	public void subtrair(double num1, double num2) {
		resultado = num1 - num2;
	}
	
	public void dividir(double num1, double num2) {
		resultado = num1 / num2;
	}
	
	public void multiplicar (double num1, double num2) {
		resultado = num1 * num2;
	}

	public double getResultado() {
		return resultado;
	}
	

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}	

	
	
}