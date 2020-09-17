package b.interruption;

public class CounterThreadSleep extends Thread {

	public CounterThreadSleep(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " - " + getName() + " is interrupted? " + isInterrupted());

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// the interrupted status is cleared
				// handler code is how we react to interruption
				System.out.println(getName() + " was interrupted");
//				break;
				i = 0;
			}

		}
	}

}
