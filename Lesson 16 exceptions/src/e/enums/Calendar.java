package e.enums;

public class Calendar {

	public Day day;

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
// 		in a class it would look like that (if nested, the class)
//		public static final Day SUNDAY = new Day();
//		public static final Day MONDAY = new Day();
//		public static final Day TUESDAY = new Day();
	}

	public static void main(String[] args) {
		Calendar cal = new Calendar();
		cal.day = Day.SUNDAY;
	}

}
