package exercise05.conditions;

import java.util.Random;

public class Tar4SalaryRaiser {

	/*
	 * o define a random number named ‘salary’ with a value between 5000-6000.
	 * 
	 * o Now, raise the salary in 10% - only if the result is not greater than 6000
	 * (which is the maximum salary allowed)
	 * 
	 * o print the current salary and the updated salary
	 */

	public static void main(String[] args) {

		Random random = new Random();

		double salary = random.nextInt(1001) + 5000;
		double salaryUpdated = salary * 1.1;

		if (salaryUpdated > 6000) {
			salaryUpdated = salary;
		}

		System.out.println("the salary is:\t" + salary);
		System.out.println("updated salary:\t" + salaryUpdated);

	}

}
