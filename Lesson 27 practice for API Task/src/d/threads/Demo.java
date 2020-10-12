package d.threads;

public class Demo {

	public static void main(String[] args) {

		Runnable r = null; // interface with run() method
		r.run(); // define what the thread does

		Thread t = null; // a thread object (implement Runnable)
		t.run(); // define what the thread does
		t.start(); // actually starting a new thread execution
		t.interrupt(); // interrupting this thread's execution

		// Thread static methods
		try {
			Thread.sleep(5000); // Causes the currently executing thread to sleep
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
