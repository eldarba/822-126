package a;

public class App {

	public static void main(String[] args) {
		Person p = new Person();
//		p.id = 101;
		
		p.name = "Ron";
		p.age = 25;
		System.out.println(p.getDetails());
		//===========
		Employee e = new Employee();
//		e.id = 102;
		e.setId(101);
		e.name = "Gad";
		e.age = 30;
		e.salary = 10_000_000;
//		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);
		System.out.println(e.getDetails());

	}

}
