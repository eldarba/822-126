package c.multiDimArray;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {

		int lines = 5;

		int seats0 = 2;
		int seats1 = 5;
		int seats2 = 10;
		int seats3 = 25;
		int seats4 = 15;

		String[][] cinema = new String[lines][];
		cinema[0] = new String[seats0]; // number of seats in this row
		cinema[1] = new String[seats1];
		cinema[2] = new String[seats2];
		cinema[3] = new String[seats3];
		cinema[4] = new String[seats4];

		String dan = "Dan"; // row 0, seat 1
		String ran = "Ran"; // row 4, seat 14
		String Danna = "Danna"; // row 3, seat 0

		cinema[0][1] = dan;
		cinema[4][14] = ran;
		cinema[3][0] = Danna;

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
