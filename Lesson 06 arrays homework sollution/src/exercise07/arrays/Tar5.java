package exercise07.arrays;

import java.util.Arrays;
import java.util.Random;

public class Tar5 {
	/*
	 * Create a class that calculates student average year grade.
	 * 
	 * create a matrix according to the following:
	 * 
	 * there are 20 students in class
	 * 
	 * there are 10 different grades per student (randomize values between 0-100 as
	 * input)
	 * 
	 * print each student average grade
	 * 
	 * print the class average grade
	 */
	public static void main(String[] args) {

		int[][] matrix = new int[20][10];
		Random random = new Random();

		double sumOfAverages = 0;

		System.out.println("=== Students Grades ===");

		for (int i = 0; i < matrix.length; i++) {
			double studentAvg = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(101);
				studentAvg += matrix[i][j];
			}

			studentAvg = studentAvg / matrix[i].length;
			sumOfAverages += studentAvg;

			System.out.print("Student " + (i + 1) + ": ");
			System.out.print(Arrays.toString(matrix[i]));
			System.out.println("\tAvg " + studentAvg);
		}

		double classAverage = sumOfAverages / matrix.length;
		System.out.println("==================================");
		System.out.println("Class Average: " + classAverage);

	}

}
