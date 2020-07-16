package a;

public class App2 {

	public static void main(String[] args) {
		Person p = new Person();
		// method invocation
		int sum = p.add2Numbers(4, 3);
		System.out.println(sum);
		
		// method invocation
		String str = p.saySomething("aaa");
		System.out.println(str);

	}

}
