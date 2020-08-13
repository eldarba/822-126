package a;

public class TestEquality {

	public static void main(String[] args) {

		// primitives equality => == operator
		int x = 5;
		int y = 6;
		System.out.println(x == y);

		// objects equality => equals method
		String s1 = new String("aaa");
		String s2 = new String("aaa");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println("=============");
		Person p1 = new Person(101, "aaa", 25);
		Person p2 = new Person(101, "bbb", 26);

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
