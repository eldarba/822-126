package b.interruption;

public class CounterThread extends Thread {

	public CounterThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			// checked without clearing the interrupted status (dynamic method)
//			System.out.println(i + " - " + getName() + " is interrupted? " + isInterrupted());
			// checked WITH clearing the interrupted status (static method)
			System.out.println(i + " - " + getName() + " is interrupted? " + Thread.interrupted());
			if (isInterrupted()) {
				System.out.println(getName() + " was interrupted");
//				break;
			}
		}
	}

}
