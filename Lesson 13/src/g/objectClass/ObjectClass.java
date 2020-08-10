package g.objectClass;

import c.finalDemo.Person;

public class ObjectClass {

	public static void main(String[] args) {

		Object obj;

		Person p = new Person(101);
		String str = p.toString(); // convert Person to String
		System.out.println(str);

		System.out.println(p);
		p = null;
		System.out.println(p);

	}

}
