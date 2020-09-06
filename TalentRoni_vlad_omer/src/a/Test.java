package a;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
//		Person p1 = new Person(101, "aaa", 25, new Address("ben gurion", 11));
//		Person p2 = p1.getClone();
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p1 == p2);
//		System.out.println(p1.getAddress() == p2.getAddress());
//		Object o;

//		Superman s = Superman.INSTANCE;
//		System.out.println(s.getAlt());
//		s.setAlt(100);
//		System.out.println(s.getAlt());

		Set<Person> set = new HashSet<>();
		set.add(new Person(101, "aaa"));
		set.add(new Person(102, "bbb"));
		set.add(new Person(103, "ccc"));
		System.out.println(set.contains(new Person(102, null)));

	}

}
