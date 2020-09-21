package b.waitNotify.stack;

public class Producer extends Thread {

	private Stack stack;

	public Producer(String name, Stack stack) {
		super(name);
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int x = (int) (Math.random() * 101);
			stack.push(x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
