package a.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo2 {

	public static void main(String[] args) {

		// 12/7/2015

		Date date = new GregorianCalendar(2015, Calendar.JULY, 12).getTime();
		System.out.println(date);

		// go from java.util.Date to java.sql.Date
		java.util.Date dateUtil = new java.sql.Date(date.getTime());
		System.out.println(dateUtil);

		// go from java.sql.Date to java.util.Date
		date = new Date(dateUtil.getTime());

		// before and after
		Calendar cal1 = new GregorianCalendar(2015, Calendar.JULY, 12);
		Calendar cal2 = new GregorianCalendar(2015, Calendar.JULY, 15);

		System.out.println(cal1.before(cal2));
		System.out.println(cal1.after(cal2));

	}

}
