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
	
	@Test
	public void testaSubtracaoCorretaParaDoisInteirosPositivos() {
		//definir cenário de teste
		Calculadora calculadora = new Calculadora();
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;
		int resultadoEsperado = 5;

		calculadora.subtrair(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
	public void testaSubtracaoCorretaParaDoisInteirosNegativos() {
		//definir cenário de teste
		Calculadora calculadora = new Calculadora();
		int entradaNumero1 = -10;
		int entradaNumero2 = 5;
		int resultadoEsperado = -15;

		calculadora.subtrair(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaMultiplicarCorretaParaDoisInteirosPositivos() {
		//definir cenário de teste
		Calculadora calculadora = new Calculadora();
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;
		int resultadoEsperado = 50;

		calculadora.multiplicar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
	public void testaMultiplicarCorretaParaDoisInteirosNegativos() {
		//definir cenário de teste
		Calculadora calculadora = new Calculadora();
		int entradaNumero1 = -10;
		int entradaNumero2 = 5;
		int resultadoEsperado = -50;

		calculadora.multiplicar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaDividisaoCorretaParaDoisInteirosPositivos() {
		//definir cenário de teste
		Calculadora calculadora = new Calculadora();
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;
		int resultadoEsperado = 2;

		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
	public void testaDividisaoCorretaParaDoisInteirosNegativos() {
		//definir cenário de teste
		Calculadora calculadora = new Calculadora();
		int entradaNumero1 = 10;
		int entradaNumero2 = 0;
		int resultadoEsperado = -1;

		calculadora.dividir(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
}
