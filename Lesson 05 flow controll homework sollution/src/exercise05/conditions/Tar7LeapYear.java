package exercise05.conditions;

public class Tar7LeapYear {

	/*
	 * Create a class that randomize a value to present a year (like 970, 1990, 2010
	 * …) and prints the year and if it is leap year or not.
	 * 
	 * leap year must:
	 * 
	 * divide by 4
	 * 
	 * not divide by 100
	 * 
	 * if divided by 100 must also divide by 400
	 */

	public static void main(String[] args) {
//		year range: 1900 - 2050
		int min = 1900;
		int max = 2050;
		int year = (int) (Math.random() * (max - min + 1)) + min;
		System.out.println("year: " + year);

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("IS a leap year");
		} else {
			System.out.println("NOT a leap year");
		}
	}

}
