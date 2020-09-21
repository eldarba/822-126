package b.waitNotify;

public class Test {

	public static void main(String[] args) {

		Object mutex = new Object();

		MyWaitingThread t1 = new MyWaitingThread("t1_waiter", mutex);
		MyNotifyingThread t2 = new MyNotifyingThread("t2_notifier", mutex);

		t1.start();
		t2.start();

		// הפסקה עד 19:55

	}

}
