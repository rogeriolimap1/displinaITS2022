package com.iftm.primeiroSpringBoot.entity;

public class TesteManualCalculadora {

	public static void main(String[] args) {
		// 1. parte 1: definir cenário do teste
		// instanciar os objetos a serem testados
		Calculadora calculadora = new Calculadora();
		// definir as vairáveis de entrada e resultado esperado
		double entradaNumero1 = 10;
		double entradaNumero2 = 5;
		// saida esperada do teste
		double resultadoEsperado = 15;
		// 2. parte 2: executar a função a ser testada
		calculadora.somar(entradaNumero1, entradaNumero2);
		double resultadoObtido = calculadora.getResultado();
		// 3. parte 3: verificar o resultado
		if(resultadoEsperado == resultadoObtido) {
			System.out.println("Passou no teste");
		}else {
			System.out.println("Não passou no teste");
		}
		

	}

}
