package c.multiDimArray;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		int lines = 5;
		int seats = 10;
		String[][] cinema = new String[lines][seats];

		String dan = "Dan"; // row 0, seat 5
		String ran = "Ran"; // row 4, seat 9
		String Danna = "Danna"; // row 4, seat 0

		cinema[0][5] = dan;
		cinema[4][9] = ran;
		cinema[4][0] = Danna;

		// print specified seats
		System.out.println(cinema[4][5]);
		System.out.println(cinema[4][0]);
		System.out.println(cinema[4][9]);

		// print entire cinema
		for (int rowNum = 0; rowNum < cinema.length; rowNum++) {
			System.out.println(Arrays.toString(cinema[rowNum]));
		}

	}

}
