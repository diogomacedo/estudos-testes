package br.com.curso.servicos;

import javax.swing.JOptionPane;

import br.com.curso.exceptions.DivisaoPorZeroException;

public class Calculadora {

	public int somar(int a, int b) {
		return a + b;
	}

	public int subtrair(int a, int b) {
		return a - b;
	}

	public int multiplicar(int a, int b) {
		return a * b;
	}

	public double dividir(int a, int b) throws DivisaoPorZeroException {
		if (b == 0) {
			throw new DivisaoPorZeroException();
		}
		return (double) a / b;
	}

	public static void main(String[] args) throws DivisaoPorZeroException {

		String input = JOptionPane.showInputDialog(" Qual cálculo deseja fazer? \n \n " + " [1] Somar \n "
				+ " [2] Subtrair \n " + " [3] Multiplicar \n " + " [4] Dividir \n \n "
				+ " * Se desejar encerrar a aplicação, basta informar um número diferente das opções. \n \n \n");

		int opcao = Integer.parseInt(input);

		while (opcao >= 1 && opcao <= 4) {

			switch (opcao) {
			case 1:
				menuSomar();
				break;
			case 2:
				menuSubtrair();
				break;
			case 3:
				menuMultiplicar();
				break;
			case 4:
				menuDividir();
			}

			input = JOptionPane.showInputDialog(" Qual cálculo deseja fazer? \n \n " + " [1] Somar \n "
					+ " [2] Subtrair \n " + " [3] Multiplicar \n " + " [4] Dividir \n \n "
					+ " * Se desejar encerrar a aplicação, basta informar um número diferente das opções. \n \n \n");

			opcao = Integer.parseInt(input);

		}

		JOptionPane.showMessageDialog(null, "Finalizando...");
		System.exit(0);

	}

	public static void menuSomar() {

		String input = JOptionPane.showInputDialog(" Qual é o primeiro número? \n ");
		int numero1 = Integer.parseInt(input);

		input = JOptionPane.showInputDialog(" Qual é o segundo número? \n ");
		int numero2 = Integer.parseInt(input);

		Calculadora calc = new Calculadora();

		int resultado = calc.somar(numero1, numero2);

		JOptionPane.showMessageDialog(null, "O resultado de [" + numero1 + "] + [" + numero2 + "] é: \n " + resultado);

	}

	public static void menuSubtrair() {

		String input = JOptionPane.showInputDialog(" Qual é o primeiro número? \n ");
		int numero1 = Integer.parseInt(input);

		input = JOptionPane.showInputDialog(" Qual é o segundo número? \n ");
		int numero2 = Integer.parseInt(input);

		Calculadora calc = new Calculadora();

		int resultado = calc.subtrair(numero1, numero2);

		JOptionPane.showMessageDialog(null, "O resultado de [" + numero1 + "] - [" + numero2 + "] é: \n " + resultado);

	}

	public static void menuMultiplicar() {

		String input = JOptionPane.showInputDialog(" Qual é o primeiro número? \n ");
		int numero1 = Integer.parseInt(input);

		input = JOptionPane.showInputDialog(" Qual é o segundo número? \n ");
		int numero2 = Integer.parseInt(input);

		Calculadora calc = new Calculadora();

		int resultado = calc.multiplicar(numero1, numero2);

		JOptionPane.showMessageDialog(null, "O resultado de [" + numero1 + "] x [" + numero2 + "] é: \n " + resultado);

	}

	public static void menuDividir() throws DivisaoPorZeroException {

		String input = JOptionPane.showInputDialog(" Qual é o primeiro número? \n ");
		int numero1 = Integer.parseInt(input);

		input = JOptionPane.showInputDialog(" Qual é o segundo número? \n ");
		int numero2 = Integer.parseInt(input);

		Calculadora calc = new Calculadora();

		double resultado = calc.dividir(numero1, numero2);

		JOptionPane.showMessageDialog(null, "O resultado de [" + numero1 + "] / [" + numero2 + "] é: \n " + resultado);

	}

}
