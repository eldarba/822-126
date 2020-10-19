package task3.api.orders.trials;

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Runnable r = new Runnable() {

			// this is anonymous inner class:

			@Override
			public void run() {
				System.out.println("hello");
				System.out.println("hello");
				System.out.println("hello");

			}
		};

		Thread t = new Thread(r);
		t.start();

	}

}
