package br.com.utilitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
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

		Assertions.assertEquals(true, resultado);

	}

	@ParameterizedTest
	@CsvSource({ "ramo, roma, true", "podendo, depondo, true", "pato, pata, false", "aaab, abbb, false",
			"muro, rumo, true", "catinga, cantiga, true", ", , false" })
	void testPalavras(String palavra1, String palavra2, boolean resultadoEsperado) {

		Assumptions.assumeTrue(palavra1 != null && !palavra1.isEmpty() && palavra2 != null && !palavra2.isEmpty());

		boolean resultado = this.anagrama.isAnagrama(palavra1, palavra2);

		Assertions.assertEquals(resultadoEsperado, resultado);

	}

}
