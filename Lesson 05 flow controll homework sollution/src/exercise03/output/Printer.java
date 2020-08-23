package exercise03.output;

public class Printer {

	public static void main(String[] args) {

		/*
		 * Define the following variables & initialize each with the specified values
		 */
		String part1 = "There will be";
		int visitors = 5;
		String part2 = "people for dinner";

		// Print the complete message
		System.out.println(part1 + " " + visitors + " " + part2);

		/*
		 * try to increment the number of visitors to 7 [visitors+2] in the print line
		 */
		System.out.println(part1 + " " + (visitors + 2) + " " + part2);

	}

}
