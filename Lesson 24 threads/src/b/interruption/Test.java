package b.interruption;

public class Test {

	public static void main(String[] args) {

		CounterThread t1 = new CounterThread("counter");
		CounterThreadSleep t2 = new CounterThreadSleep("counterSleep");

		// set priority
		t1.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.setDaemon(true);
		t2.start();

		System.out.println("is t2 daemon: " + t2.isDaemon());

		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();

		try {
			Thread.sleep(2800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.interrupt();

	}

}
