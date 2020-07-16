package a;

public class App {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.id = 101;
		p1.name = "Dan";
		p1.age = 30;
		
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		System.out.println("==========");

		Person p2 = new Person();
		p2.id = 102;
		p2.name = "Ran";
		p2.age = 14;
		
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}

}
