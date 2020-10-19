package a.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo1 {

	public static void main(String[] args) {

		// 1. LocalDate
		LocalDateTime d1 = LocalDateTime.now();
		LocalDate d2 = LocalDate.of(2020, 5, 15);
		System.out.println(d1);
		System.out.println(d2);

		// 2. Calendar
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar(2020, Calendar.MAY, 15);

		// 3. java.util.Date
		Date u1 = new Date();
		Date u2 = new Date(12129999999548L);

		System.out.println(u1);
		System.out.println(u2);

	}

}
