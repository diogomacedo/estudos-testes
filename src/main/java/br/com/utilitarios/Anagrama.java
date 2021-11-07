package br.com.utilitarios;

import java.util.HashMap;

public class Anagrama {

	HashMap<String, Integer> mapPalavra1 = new HashMap<String, Integer>();
	HashMap<String, Integer> mapPalavra2 = new HashMap<String, Integer>();

	public boolean isAnagrama(String palavra1, String palavra2) {


		if (palavra1.length() != palavra2.length()) {
			return false;
		} else {

			for (char letra : palavra1.toCharArray()) {
				this.atualizarQtdeLetra(mapPalavra1, letra);
			}

			for (char letra : palavra2.toCharArray()) {
				this.atualizarQtdeLetra(mapPalavra2, letra);
			}

		}

		for (char letra : palavra1.toCharArray()) {
			int qtdeLetraPalavra01 = this.obterQtdeLetra(mapPalavra1, letra);
			int qtdeLetraPalavra02 = this.obterQtdeLetra(mapPalavra2, letra);
			if (qtdeLetraPalavra01 != qtdeLetraPalavra02) {
				return false;
			}
		}

		return true;

	}

	private void atualizarQtdeLetra(HashMap<String, Integer> hashMap, char letra) {
		String strLetra = String.valueOf(letra);
		int qtdeLetra = this.obterQtdeLetra(hashMap, strLetra) + 1;
		hashMap.put(strLetra, qtdeLetra);
	}

	private int obterQtdeLetra(HashMap<String, Integer> hashMap, String letra) {
		if (hashMap.containsKey(letra)) {
			return hashMap.get(letra);
		}
		return 0;
	}

	private int obterQtdeLetra(HashMap<String, Integer> hashMap, char letra) {
		String strLetra = String.valueOf(letra);
		return this.obterQtdeLetra(hashMap, strLetra);
	}

}
