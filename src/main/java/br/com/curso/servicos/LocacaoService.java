package br.com.curso.servicos;

import java.util.Date;

import br.com.curso.entidades.Filme;
import br.com.curso.entidades.Locacao;
import br.com.curso.entidades.Usuario;
import br.com.curso.utils.DateUtils;

public class LocacaoService {

	public Locacao alugarFilmes(Usuario usuario, Filme filme) throws Exception {

		if (filme.getEstoque() == 0) {
			throw new Exception("O filme escolhido está sem estoque.");
		}

		Locacao locacao = new Locacao();

		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		Date dataEntrega = DateUtils.adicionarDias(new Date(), 1);
		locacao.setDataRetorno(dataEntrega);

		return locacao;

	}

}
