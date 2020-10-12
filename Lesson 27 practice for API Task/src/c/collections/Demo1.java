package c.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {

		Collection<Date> collection;
		List<Date> list;
		Set<Date> set;

		// sorting lists
		Comparable<?> comparable; // this interface is implemented for natural order
		Comparator<?> comparator; // this interface is implemented for other order

		list = new Vector<>();
		list.add(new GregorianCalendar(1980, 1, 1).getTime());
		list.add(new GregorianCalendar(1975, 1, 1).getTime());
		list.add(new GregorianCalendar(1982, 1, 1).getTime());

		printAnyCollection(list);

		list.sort(null);
		printAnyCollection(list);
		list.sort(new DateInverseComparator());
		printAnyCollection(list);

	}

	public static void printAnyCollection(Collection<?> col) {
		System.out.println("===============");
		for (Object element : col) {
			System.out.println(element);
		}
	}

}

class DateInverseComparator implements Comparator<Date> {

	@Override
	public int compare(Date d1, Date d2) {
		return d2.compareTo(d1);
	}

}
