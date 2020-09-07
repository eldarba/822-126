package f.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Set<String> setStr = new TreeSet<>();
		setStr.add("aaa");
		setStr.add("ddddd");
		setStr.add("ccccccccc");
		setStr.add("bb");
		System.out.println(setStr);

		Set<Person> setPerson = new TreeSet<>();
		setPerson.add(new Person(102, "aaa", 25));
		setPerson.add(new Person(101, "bbb", 87));
		setPerson.add(new Person(103, "ccc", 7));
		System.out.println(setPerson);

		System.out.println("natural order");
		List<String> listStr = new ArrayList<String>(setStr);
		listStr.sort(null);
		System.out.println(listStr);
		System.out.println("length order");
		listStr.sort(new StringLengthComparator());
		System.out.println(listStr);

		System.out.println();

		System.out.println("==============");
		List<Person> listPerson = new ArrayList<>(setPerson);
		listPerson.add(new Person(20, "bbb", 87));
		listPerson.add(new Person(5, "bbb", 87));
		listPerson.add(new Person(2, "bbb", 87));

		System.out.println("insert order:");
		System.out.println(listPerson);

		System.out.println("natural order:");
		listPerson.sort(null);
		System.out.println(listPerson);

		System.out.println("other order - name:");
		PersonNameComparator nameComparator = new PersonNameComparator();
		listPerson.sort(nameComparator);
		System.out.println(listPerson);

	}

}
