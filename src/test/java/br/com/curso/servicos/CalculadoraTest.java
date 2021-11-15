package br.com.curso.servicos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.curso.exceptions.DivisaoPorZeroException;

public class CalculadoraTest {

	private Calculadora calculadora;

	@BeforeEach
	public void init() {
		this.calculadora = new Calculadora();
	}

	@Test
	public void deveSomarDoisNumerosInteiros() {

		int a = 3;
		int b = 5;

		int resultado = this.calculadora.somar(a, b);

		Assertions.assertEquals(8, resultado);

	}

	@Test
	public void deveSubtrairDoisNumerosInteiros() {

		int a = 10;
		int b = 2;

		int resultado = this.calculadora.subtrair(a, b);

		Assertions.assertEquals(8, resultado);

	}

	@Test
	public void deveMultiplicarDoisNumerosInteiros() {

		int a = 5;
		int b = 9;

		int resultado = this.calculadora.multiplicar(a, b);

		Assertions.assertEquals(45, resultado);

	}

	@Test
	public void deveDivirDoisNumerosInteiros() throws DivisaoPorZeroException {

		int a = 6;
		int b = 3;

		int resultado = this.calculadora.dividir(a, b);

		Assertions.assertEquals(2, resultado);

	}

	@Test
	public void deveLancarExcecaoQuandoDividirUmNumeroInteiroPorZero() throws DivisaoPorZeroException {

		int a = 9;
		int b = 0;

		Assertions.assertThrows(DivisaoPorZeroException.class, () -> this.calculadora.dividir(a, b));

	}

}
