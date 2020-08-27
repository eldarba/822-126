package d.sort;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {

		{
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 10; i++) {
				list.add((int) (Math.random() * 101));
			}
			System.out.println(list);
			list.sort(null);
			System.out.println(list);
		}
		System.out.println("=====================");

		{
			List<String> list = new ArrayList<>();
			list.add("ttt");
			list.add("bbb");
			list.add("ccc");
			list.add("aaa");
			System.out.println(list);
			list.sort(null);
			System.out.println(list);
		}
		System.out.println("=====================");

		{
			List<LocalDate> list = new ArrayList<>();
			list.add(LocalDate.of(2000, 11, 25));
			list.add(LocalDate.of(1980, 11, 25));
			list.add(LocalDate.of(2020, 1, 1));
			list.add(LocalDate.of(1980, 10, 25));
			System.out.println(list);
			list.sort(null);
			System.out.println(list);
		}
		System.out.println("=====================");

		{
			List<Person> list = new ArrayList<>();
			list.add(new Person(105, "ccc", 13));
			list.add(new Person(101, "aaa", 36));
			list.add(new Person(107, "zzz", 27));
			list.add(new Person(109, "bbb", 19));
			System.out.println(list);
			// sort by natural order
			list.sort(null);
			System.out.println(list);

			// sort by other order (age)
			PersonAgeComparator ageComparator = new PersonAgeComparator();
			list.sort(ageComparator);
			System.out.println(list);

			// sort by other order (name)
			PersonNameComparator nameComparator = new PersonNameComparator();
			list.sort(nameComparator);
			System.out.println(list);
		}
		System.out.println("=====================");

		Set<Person> set1 = new TreeSet<>();
		set1.add(new Person(105, "ccc", 13));
		set1.add(new Person(101, "aaa", 36));
		set1.add(new Person(107, "zzz", 27));

		Set<Person> set2 = new TreeSet<>(new PersonAgeComparator());
		set2.addAll(set1); // add all elements of set1 to set2

		// sorted sets
		System.out.println(set1);
		System.out.println(set2);
	}

}
