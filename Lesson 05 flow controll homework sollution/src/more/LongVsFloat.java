package more;

public class LongVsFloat {

	public static void main(String[] args) {

		/*
		 * long is a 64 bit integer type - it represents 2^64 different numbers.
		 * 
		 * float is a 32 bit decimal type - it represents 2^32 different numbers (less
		 * than long).
		 * 
		 * since long is an integer, the distance between one value to the next is
		 * always 1
		 * 
		 * since float is a decimal, the distance between one value to the next is
		 * changing and in the high range of numbers the distance between one value to
		 * the next is huge, therefore float climbs to enormous heights, much more than
		 * long.
		 */

		long maxLong = 9223372036854775807L;
		float f = maxLong;

		System.out.println(maxLong + " >>> this is the max value of long");
		System.out.println(f + " >>> this is the max value of long represented by a float");

		maxLong++; // add 1 and this long variable overflows
		f++;// add 1 and this float variable doesn't change

		System.out.println(maxLong + " >>> long overflows after we added 1");
		System.out.println(f + " >>> float remains unchanged after we added 1");

		/*
		 * to change the float variable in this range of values we need to add much more
		 * than 1
		 */
		f += 1000000000000L;
		System.out.println(f + " >>> float changed after we added 1,000,000,000,000");
	}

}
