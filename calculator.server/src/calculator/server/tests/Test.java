package calculator.server.tests;

import calculator.core.Calculator;

public class Test {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		String str = c.greet("Eldar");
		System.out.println(str);

	}

}
