package a.homework.sollutions;

public class LeapYear {

	public static void main(String[] args) {

		int year = (int) (Math.random() * 2021);
		year = 1200;
		System.out.println(year);

		// every 4th year but not 100th
		// OR
		// every 400th year
		// 0, 4, 8, 12.... 100NOT....400YES...

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("NOT Leap Year");
		}
	}

}
