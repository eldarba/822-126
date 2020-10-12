package b.systemBuild;

import java.util.Scanner;

public class Run {

	static Scanner sc = new Scanner(System.in);
	static Calculator calc = new Calculator();

	public static void main(String[] args) {

		boolean quit = false;
		String input;

		while (!quit) {

			try {

				calc.showMenu();

				input = sc.nextLine();

				switch (input) {
				case "1":
				case "add":
					doPlus();
					break;
				case "2":
				case "sub":
					doMinus();
					break;
				case "3":
				case "mul":
					try {
						doMultiply();
					} catch (CalculatorException e) {
						System.out.println("the exception: " + e); // print the exception
						Throwable t = e.getCause();
						System.out.println("the cause: " + t); // print the cause
						System.out.println("the cause of the cause: " + t.getCause()); // print the cause of the cause
					}
					break;
				case "4":
				case "div":
					doDivide();
					break;
				case "5":
				case "show":
					doShow();
					break;
				case "6":
				case "clear":
					doClear();
					break;
				case "q":
					quit = true;
					break;

				default:
					System.out.println("the command " + input + " is not supported");
					break;
				}
			} catch (Exception e) {
				System.out.println("Some other Error: " + e);
			}
		} // end of while

		System.out.println("Bye");
		sc.close();

	}

	private static void doDivide() {
		System.out.print("enter value to divide by: ");
		try {
			double val = Double.parseDouble(sc.nextLine());
			calc.div(val);
		} catch (NumberFormatException e) {
			System.out.println("wrong input: " + e.getMessage());
		}
	}

	private static void doMultiply() throws CalculatorException {
		System.out.print("enter value to multiply by: ");
		try {
			double val = Double.parseDouble(sc.nextLine());
			calc.mul(val);
		} catch (NumberFormatException e) {
			throw new CalculatorException("multiplication failed - wrong input", e);
		}
	}

	private static void doShow() {
		System.out.println("current result: " + calc.getCurrResult());

	}

	private static void doClear() {
		calc.clear();
	}

	private static void doMinus() throws NumberFormatException {
		System.out.print("enter value to subtract: ");
		double val = Double.parseDouble(sc.nextLine());
		calc.sub(val);

	}

	private static void doPlus() {
		System.out.print("enter value to add: ");
		try {
			double val = Double.parseDouble(sc.nextLine());
			calc.add(val);
		} catch (NumberFormatException e) {
			System.out.println("wrong input: " + e.getMessage());
		}
	}

}
