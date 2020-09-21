package b.waitNotify.stack;

public class Consumer extends Thread {

	private Stack stack;

	public Consumer(String name, Stack stack) {
		super(name);
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int x = stack.pop();
			System.out.println(getName() + " popped: " + x);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
