package br.com.curso.servicos;

import java.util.Date;

import br.com.curso.entidades.Filme;
import br.com.curso.entidades.Locacao;
import br.com.curso.entidades.Usuario;
import br.com.curso.utils.DateUtils;

public class LocacaoService {

	public Locacao alugarFilmes(Usuario usuario, Filme filme) {

		Locacao locacao = new Locacao();

		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		Date dataEntrega = DateUtils.adicionarDias(new Date(), 1);
		locacao.setDataRetorno(dataEntrega);

		return locacao;

	}

	public static void main(String[] args) {

		// Cenário

		Usuario usuario = new Usuario("Diogo Macedo");
		Filme filme = new Filme("Star Wars - Ataque dos Clones", 2, 5.50);

		LocacaoService service = new LocacaoService();

		// Ação

		Locacao locacao = service.alugarFilmes(usuario, filme);

		// Verificação
		System.out.println(locacao);
		System.out.println(locacao.getValor() == 5.50);
		System.out.println(DateUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		System.out.println(DateUtils.isMesmaData(locacao.getDataRetorno(), DateUtils.obterDataComDiferencaDias(1)));
	}

}
