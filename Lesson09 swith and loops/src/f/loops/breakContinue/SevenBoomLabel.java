package f.loops.breakContinue;

public class SevenBoomLabel {

	public static void main(String[] args) {
		outer: for (int i = 0; i <= 100; i++) {

			// is number divides by 7
			if (i % 7 == 0) {
				System.out.println("Boom");
				continue; // skip to next iteration
			}

			// is number contains the digit 7
			// 125874885
			int temp = i;
			while (temp != 0) {
				if (temp % 10 == 7) {
					System.out.println("Boom-");
					continue outer; // skip to next iteration
				}
				temp /= 10;
			}

			System.out.println(i);

		}
	}

}
