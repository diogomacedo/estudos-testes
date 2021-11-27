package br.com.curso.utils;

import br.com.curso.matchers.AdicionarDiasMatcher;

public class MatchersUtils {

	public static AdicionarDiasMatcher ehHojeComDiferencaDeDias(int qtdeDias) {
		return new AdicionarDiasMatcher(qtdeDias);
	}

	public static AdicionarDiasMatcher ehHoje() {
		return new AdicionarDiasMatcher(0);
	}

}
