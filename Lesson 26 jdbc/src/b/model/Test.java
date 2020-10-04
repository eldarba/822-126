package b.model;

public class Test {

	public static void main(String[] args) {

		PersonDAO dao = new PersonDaoImpl();

//		Person p1 = new Person(201, "AAA", 35);
//		dao.savePreparedStatement(p1);

		Person p2 = dao.find(201);
		System.out.println(p2);

		p2.setName("Albert");
		p2.setAge(p2.getAge() + 1);
		dao.update(p2);

		Person p3 = dao.find(201);
		System.out.println(p3);

		dao.delete(p3.getId());
		Person p4 = dao.find(201);
		System.out.println(p4);

	}

}
