package br.com.curso.servicos;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.curso.dao.LocacaoDAO;
import br.com.curso.entidades.Filme;
import br.com.curso.entidades.Locacao;
import br.com.curso.entidades.Usuario;
import br.com.curso.utils.DateUtils;

public class LocacaoServiceTest {

	@InjectMocks
	private LocacaoService service;

	@Mock
	private LocacaoDAO locacaoDAO;

	@BeforeAll
	public static void setupAll() {
//		System.out.println("Teste before all");
	}

	@AfterAll
	public static void tearDownAll() {
//		System.out.println("Teste after all");
	}

	@BeforeEach
	public void setup() {
//		System.out.println("Teste before each");
//		MockitoAnnotations.initMocks(this);
		MockitoAnnotations.openMocks(this);
	}

	@AfterEach
	public void tearDown() {
//		System.out.println("Teste after each");
	}

	@Test
	public void testeLocacao() throws Exception {

		// Cenário
		Usuario usuario = new Usuario("Diogo Macedo");
		Filme filme = new Filme("Star Wars - Ataque dos Clones", 2, 5.50);

//		LocacaoService service = new LocacaoService();

		// Ação
		Locacao locacao = this.service.alugarFilmes(usuario, filme);

		ArgumentCaptor<Locacao> argumentCaptor = ArgumentCaptor.forClass(Locacao.class);

		Mockito.verify(this.locacaoDAO).salvar(argumentCaptor.capture());

//		Locacao locacaoRetornada = argumentCaptor.capture();

		Assertions.assertTrue(locacao.getValor() == 5.50);
		Assertions.assertTrue(DateUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assertions.assertTrue(
				DateUtils.isMesmaData(locacao.getDataRetorno(), DateUtils.obterDataComDiferencaDias(1)));

	}

	@Test
	public void testeLocacao_SemEstoque1() {

		System.out.println("Teste Locacao Sem Estoque 1");

		// Cenário
		Usuario usuario = new Usuario("Diogo Macedo");
		Filme filme = new Filme("Star Wars - Ataque dos Clones", 0, 5.50);

		LocacaoService service = new LocacaoService();

		// Ação
		Assertions.assertThrows(Exception.class, () -> service.alugarFilmes(usuario, filme));

	}

	@Test
	public void testeLocacao_SemEstoque2() {

		System.out.println("Teste Locacao Sem Estoque 2");

		// Cenário
		Usuario usuario = new Usuario("Diogo Macedo");
		Filme filme = new Filme("Star Wars - Ataque dos Clones", 0, 5.50);

		LocacaoService service = new LocacaoService();

		try {

			// Ação
			service.alugarFilmes(usuario, filme);

			Assertions.fail("Exceção esperada.");

		} catch (Exception e) {

			Assertions.assertEquals("O filme escolhido está sem estoque.", e.getMessage());

		}

	}

}
