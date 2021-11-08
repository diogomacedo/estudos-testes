package br.com.utilitarios;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.curso.entidades.Usuario;

public class AssertTest {

	@Test
	public void testes() {

		int x = 1;
		int y = 2;
		int z = x + y;

		Usuario usuario0 = null;
		Usuario usuario1 = new Usuario("Max");
		Usuario usuario2 = usuario1;
		Usuario usuario3 = new Usuario("Minduim");
		Usuario usuario4 = new Usuario("Minduim");

		Assertions.assertTrue(z == 3);
		Assertions.assertFalse(z == 4);
		Assertions.assertEquals(usuario3, usuario4);
		Assertions.assertNotEquals(usuario1, usuario3);

		Assertions.assertSame(usuario1, usuario2, "Compração de objetos");
		Assertions.assertNotSame(usuario3, usuario4);

		Assertions.assertNull(usuario0);
		Assertions.assertNotNull(usuario1);

		// Fluent Interface
		MatcherAssert.assertThat(usuario1.getNome(), CoreMatchers.is("Max"));

	}

}
