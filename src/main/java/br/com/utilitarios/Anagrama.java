package br.com.utilitarios;

import java.util.HashMap;

public class Anagrama {

	public boolean isAnagrama(String palavra1, String palavra2) {

		boolean result = true;

		int tamanhoPalavra1 = palavra1.length();

		HashMap<String, Integer> letrasQtdeString1 = new HashMap<String, Integer>();
		HashMap<String, Integer> letrasQtdeString2 = new HashMap<String, Integer>();

		int qtdeStr1 = 0;
		int qtdeStr2 = 0;

		for (char letra : palavra1.toCharArray()) {

			if (palavra1.length() != palavra2.length()) {
				result = false;
				break;
			} else if (palavra2.indexOf(letra) >= 0) {

				String strLetra = String.valueOf(letra);

				Integer qtdeStr01 = letrasQtdeString1.get(strLetra);
				qtdeStr1 = qtdeStr01.intValue();
				qtdeStr1++;
				letrasQtdeString1.put(strLetra, qtdeStr1);

				Integer qtdeStr02 = letrasQtdeString2.get(strLetra);
				qtdeStr2 = qtdeStr02.intValue();
				qtdeStr2++;
				letrasQtdeString2.put(strLetra, qtdeStr2);

			}

		}

		for (char letra : palavra1.toCharArray()) {
			String strLetra = String.valueOf(letra);
			Integer qtdeStr01 = letrasQtdeString1.get(strLetra);
			Integer qtdeStr02 = letrasQtdeString2.get(strLetra);
			if (qtdeStr01.intValue() != qtdeStr02.intValue()) {
				result = false;
				break;
			}
		}

		return false;

	}

}
