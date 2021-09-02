package br.com.utilitarios;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramaTest {

	private Anagrama anagrama;

	@BeforeAll
	void beforeAllTests() {
		this.anagrama = new Anagrama();
	}

	@Test
	void testAnagramaRamoRoma() {

		String palavra1 = "Ramo";
		String palavra2 = "Roma";

		boolean resultado = this.anagrama.isAnagrama(palavra1, palavra2);

		assertEquals(true, resultado);

	}

}
