package exercise06.loops;

public class Tar10ShevaBoom {

	/*
	 * Create a class named ‘Boom’ that implements the game “7- Boom” for all values
	 * from 0 to 100. The game rules are:
	 * 
	 * if the current number can be divided by 7 –print “boom”
	 * 
	 * if the current number has the digit ‘7’ – print “boom”
	 * 
	 * otherwise – print the number as is
	 */

	public static void main(String[] args) {

		lbl: for (int n = 0; n <= 100; n++) {
			if (n % 7 == 0) {
				System.out.println("boom");
				continue;
			}

			int copyN = n;

			while (copyN != 0) {
				if (copyN % 10 == 7) {
					System.out.println("boom");
					continue lbl;
				}
				copyN /= 10;
			}

			System.out.println(n);
		}

	}

}
