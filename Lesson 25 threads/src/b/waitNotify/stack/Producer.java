package b.waitNotify.stack;

public class Producer extends Thread {

	private Stack stack;
	private long sleepTime;
	private int amount;

	public Producer(String name, Stack stack, long sleepTime, int amount) {
		super(name);
		this.stack = stack;
		this.sleepTime = sleepTime;
		this.amount = amount;
	}

	@Override
	public void run() {
		for (int i = 0; i < amount; i++) {
			int x = (int) (Math.random() * 101);
			stack.push(x);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// break until 19:45
	}

}
