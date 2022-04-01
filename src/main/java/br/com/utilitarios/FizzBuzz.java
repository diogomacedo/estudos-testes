package br.com.utilitarios;

import javax.swing.JOptionPane;

public class FizzBuzz {

	public String fizzBuzz(int i) {

		String result = null;

		boolean multiplo3 = this.isMultiplo3(i);
		boolean multiplo5 = this.isMultiplo5(i);

		if (multiplo3 && multiplo5) {
			result = "FizzBuzz";
		} else if (multiplo3 && !multiplo5) {
			result = "Fizz";
		} else if (!multiplo3 && multiplo5) {
			result = "Buzz";
		} else {
			result = String.valueOf(i);
		}

		return result;

	}

	private boolean isMultiplo3(int i) {
		if (i % 3 == 0) {
			return true;
		}
		return false;
	}

	private boolean isMultiplo5(int i) {
		if (i % 5 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog(" Informe um número e descubra se: \n " + " * É múltiplo de 3 \n "
				+ " * É múltiplo de 5 \n " + " * É múltiplo de 3 e de 5 \n " + " * Não é múltiplo de 3 e nem de 5 \n \n"
				+ " Se o número for múltiplo de 3, você verá a mensagem 'Fizz' \n"
				+ " Se o número for múltiplo de 5, você verá a mensagem 'Buzz' \n"
				+ " Se o número for múltiplo de 3 e de 5, você verá a mensagem 'FizzBuzz' \n"
				+ " Se o número não for múltiplo de ninguém, você verá o número \n \n \n");

		int numero = Integer.parseInt(input);

		FizzBuzz fizzBuzz = new FizzBuzz();
		String resultado = fizzBuzz.fizzBuzz(numero);

		JOptionPane.showMessageDialog(null, resultado);

		System.exit(0);

	}

}
