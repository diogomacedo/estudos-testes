package br.com.curso.servicos;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.curso.entidades.Filme;
import br.com.curso.entidades.Locacao;
import br.com.curso.entidades.Usuario;
import br.com.curso.utils.DateUtils;

public class LocacaoServiceTest {

	@Test
	public void teste() {

		// Cenário
		Usuario usuario = new Usuario("Diogo Macedo");
		Filme filme = new Filme("Star Wars - Ataque dos Clones", 2, 5.50);

		LocacaoService service = new LocacaoService();

		// Ação
		Locacao locacao = service.alugarFilmes(usuario, filme);

		Assertions.assertTrue(locacao.getValor() == 5.50);
		Assertions.assertTrue(DateUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assertions.assertTrue(DateUtils.isMesmaData(locacao.getDataRetorno(), DateUtils.obterDataComDiferencaDias(1)));

	}

}
