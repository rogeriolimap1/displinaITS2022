package org.iftm.primeiroSpringBoot.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.iftm.primeiroSpringBoot.entity.Calculadora;

public class CalculadoraTest {
	@Test
	public void testaSomaCorretaParaDoisInteirosPositivos() {
		//definir cenário de teste
		Calculadora calculadora = new Calculadora();
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;
		int resultadoEsperado = 15;

		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
	public void testaSomaCorretaParaDoisInteirosNegativos() {
		//definir cenário de teste
		Calculadora calculadora = new Calculadora();
		int entradaNumero1 = -10;
		int entradaNumero2 = 5;
		int resultadoEsperado = -5;

		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
}
