package b.model;

public class Test {

	public static void main(String[] args) {

		PersonDAO dao = new PersonDaoImpl();

		Person p1 = new Person(201, "AAA", 35);
		dao.savePreparedStatement(p1);

		Person p2 = dao.find(201);
		System.out.println(p2);

	}

}
