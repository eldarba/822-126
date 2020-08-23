package exercise05.conditions;

import java.util.Random;

public class Tar6TaxCalculator {

	/*
	 * Salary taxes are calculated according to the following:
	 * 
	 * 0- 23,000 nis -> tax rate is 10%
	 * 
	 * 23,000- 50,000 nis -> tax rate is 20%
	 * 
	 * 50,000- 100,000 nis -> tax rate is 30%
	 * 
	 * 100,000 - up nis -> tax rate is 40%
	 * 
	 * Create a class named “TaxCalculator” that takes a salary of an employee
	 * (randomize a value to be used as an input) and prints the valid value after
	 * tax calculation
	 */

	public static void main(String[] args) {

		Random random = new Random();
		double salaryGross = random.nextInt(150_001); // 0 - 150,000
		System.out.println("Gross salary:\t" + salaryGross + " NIS");
		System.out.println("================================================================");

		double tax = 0D;
		double salaryNet;

		double grade1 = 23_000D;
		double grade1TaxRate = 0.1;
		double grade2 = 50_000D;
		double grade2TaxRate = 0.2;
		double grade3 = 100_000D;
		double grade3TaxRate = 0.3;
		double grade4TaxRate = 0.4;

		if (salaryGross <= grade1) {
			// take for relative part of grade 1
			double addToTax = salaryGross * grade1TaxRate;
			tax += addToTax;
			System.out.println(">>> cahrge for relative part of grade 1: " + addToTax);
			System.out.println(">>> You are within tax grade 1 (up to " + grade1 + ")");
		} else {
			// take for entire grade 1
			double addToTax = grade1 * grade1TaxRate;
			tax += addToTax;
			System.out.println(">>> cahrge for entire grade 1: " + addToTax);
			if (salaryGross <= grade2) {
				// take for relative part of grade 2
				addToTax = (salaryGross - grade1) * grade2TaxRate;
				tax += addToTax;
				System.out.println(">>> cahrge for relative part of grade 2: " + addToTax);
				System.out.println(">>> You are within tax grade 2 (up to " + grade2 + ")");
			} else {
				// take for entire grade 2
				addToTax = (grade2 - grade1) * grade2TaxRate;
				tax += addToTax;
				System.out.println(">>> cahrge for entire grade 2: " + addToTax);
				if (salaryGross <= grade3) {
					// take for relative part of grade 3
					addToTax = (salaryGross - grade2) * grade3TaxRate;
					tax += addToTax;
					System.out.println(">>> cahrge for relative part of grade 3: " + addToTax);
					System.out.println(">>> You are within tax grade 3 (up to " + grade3 + ")");
				} else {
					// take for entire grade 3
					addToTax = (grade3 - grade2) * grade3TaxRate;
					tax += addToTax;
					System.out.println(">>> cahrge for entire grade 3: " + addToTax);
					// take for relative part of grade 4
					addToTax = (salaryGross - grade3) * grade4TaxRate;
					tax += addToTax;
					System.out.println(">>> cahrge for relative part of grade 4: " + addToTax);
					System.out.println(">>> You are within tax grade 4 (" + grade3 + " and up)");
				}

			}
		}

		System.out.println("================================================================");
		salaryNet = salaryGross - tax;
		System.out.println("Tax due:\t" + tax + " NIS");
		System.out.println("Net salary:\t" + salaryNet + " NIS");
	}

}
