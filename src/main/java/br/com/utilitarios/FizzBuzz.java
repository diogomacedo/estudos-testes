package br.com.utilitarios;

public class FizzBuzz {

	public String fizzBuzz(int i) {

		String result = null;

		boolean multiplo3 = false;
		boolean multiplo5 = false;

		if (i % 3 == 0) {
			multiplo3 = true;
		}

		if (i % 5 == 0) {
			multiplo5 = true;
		}

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

}
