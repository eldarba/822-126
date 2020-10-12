package a.dates;

import java.util.Calendar;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {

//		type 1
		java.util.Date dateUtil = new Date(); // general perpuse
//		type 2
		java.sql.Date dateSql = new java.sql.Date(System.currentTimeMillis()); // sql compliant yyyy-mm-dd

		System.out.println(dateUtil);
		System.out.println(dateSql);

		// 12/05/1987

//		type 3
		Calendar cal = Calendar.getInstance(); // you can use a factory method
		// you can directly create GregorianCalendar
		// cal = new GregorianCalendar(1987, Calendar.MAY, 12);
		System.out.println(cal.getTime());

		cal.set(1987, Calendar.MAY, 12, 0, 0, 0);
		System.out.println(cal.getTime());

		System.out.println("YEAR: " + cal.get(Calendar.YEAR));
		System.out.println("MONTH: " + cal.get(Calendar.MONTH));
		System.out.println("DAY_OF_WEEK: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_MONTH: " + cal.get(Calendar.DAY_OF_MONTH));

		cal.add(Calendar.YEAR, 2);
		cal.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println(cal.getTime());

	}

}
