package br.com.utilitarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AnagramaTest {

	private Anagrama anagrama;

	@BeforeEach
	void init() {
		this.anagrama = new Anagrama();
	}

	@Test
	void testAnagramaRamoRoma() {

		String palavra1 = "Ramo";
		String palavra2 = "Roma";

		boolean resultado = this.anagrama.isAnagrama(palavra1, palavra2);

		assertEquals(true, resultado);

	}

	@ParameterizedTest
	@CsvSource({
		"ramo, roma, true",
		"podendo, depondo, true",
		"pato, pata, false",
		"aaab, abbb, false"
	})
	void testPalavras(String palavra1, String palavra2, boolean resultadoEsperado) {

		boolean resultado = this.anagrama.isAnagrama(palavra1, palavra2);

		assertEquals(resultadoEsperado, resultado);

	}

}
