package br.com.utilitarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

	@Test
	public void naoEMultiploDeNinguem() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String resultado = fizzBuzz.fizzBuzz(2);
		assertEquals("2", resultado);
	}

	@Test
	public void eMultiploDe3() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String resultado = fizzBuzz.fizzBuzz(3);
		assertEquals("Fizz", resultado);
	}

	@Test
	public void eMultiploDe5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String resultado = fizzBuzz.fizzBuzz(5);
		assertEquals("Buzz", resultado);
	}

	@Test
	public void eMultiploDe3E5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String resultado = fizzBuzz.fizzBuzz(15);
		assertEquals("FizzBuzz", resultado);
	}

	@ParameterizedTest
	@CsvSource({ "2, 2", "3, Fizz", "5, Buzz", "15, FizzBuzz" })
	public void testeParametrizado(int numero, String resultadoEsperado) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String resultado = fizzBuzz.fizzBuzz(numero);
		Assertions.assertEquals(resultadoEsperado, resultado);
	}

}
