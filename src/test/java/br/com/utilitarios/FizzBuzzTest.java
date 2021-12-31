package br.com.utilitarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	void naoEMultiploDeNinguem() {

		FizzBuzz fizzBuzz = new FizzBuzz();

		String resultado = fizzBuzz.fizzBuzz(2);

		assertEquals("2", resultado);

	}

	@Test
	void eMultiploDe3() {

		FizzBuzz fizzBuzz = new FizzBuzz();

		String resultado = fizzBuzz.fizzBuzz(3);

		assertEquals("Fizz", resultado);

	}

	@Test
	void eMultiploDe5() {

		FizzBuzz fizzBuzz = new FizzBuzz();

		String resultado = fizzBuzz.fizzBuzz(5);

		assertEquals("Buzz", resultado);

	}

	@Test
	void eMultiploDe3E5() {

		FizzBuzz fizzBuzz = new FizzBuzz();

		String resultado = fizzBuzz.fizzBuzz(15);

		assertEquals("FizzBuzz", resultado);

	}

}
