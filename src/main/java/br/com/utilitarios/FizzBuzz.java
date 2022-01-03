package br.com.utilitarios;

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

}
