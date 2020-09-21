package b.waitNotify.stack;

public class Test {

	public static void main(String[] args) {

		Stack stack = new Stack();

		Producer p1 = new Producer("p1", stack, 1000, 10);
		Producer p2 = new Producer("p2", stack, 3000, 10);
		Producer p3 = new Producer("p3", stack, 700, 10);

		Consumer c1 = new Consumer("c1", stack, 250, 10);
		Consumer c2 = new Consumer("c2", stack, 1500, 20);

		p1.start();
		p2.start();
		p3.start();

		try {
			Thread.sleep(4500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		c1.start();
		c2.start();

	}

}
