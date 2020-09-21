package b.waitNotify.stack;

public class Consumer extends Thread {

	private Stack stack;
	private long sleepTime;
	private int amount;

	public Consumer(String name, Stack stack, long sleepTime, int amount) {
		super(name);
		this.stack = stack;
		this.sleepTime = sleepTime;
		this.amount = amount;
	}

	@Override
	public void run() {
		for (int i = 0; i < amount; i++) {
			int x = stack.pop();
			System.out.println(getName() + " popped: " + x);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
