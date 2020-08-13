package a;

public class TestFinalize {

	public static void main(String[] args) throws InterruptedException {
		Person p = new Person(101, "aaa", 22);
		System.out.println(p);
		p = null;

		System.gc();

		Thread.sleep(3000);

	}

}
