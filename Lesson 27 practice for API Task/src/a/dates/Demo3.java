package a.dates;

import java.sql.Date;
import java.time.LocalDate;

public class Demo3 {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2020, 1, 10);

		System.out.println(date1);
		System.out.println(date2);

		// go from LocalDate to java.sql.Date
		Date dateSql = Date.valueOf(date2);
		System.out.println(dateSql);
		System.out.println();

		// before
		System.out.println(date1.isBefore(date2));

		// add 2 years and 5 days
		date1.plusYears(2);
		date1.plusDays(5);
		System.out.println(date1);

	}
}
