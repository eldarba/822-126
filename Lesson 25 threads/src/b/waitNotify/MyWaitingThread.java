package b.waitNotify;

public class MyWaitingThread extends Thread {

	private Object mutex; // our shared buffer - plate

	public MyWaitingThread(String name, Object mutex) {
		super(name);
		this.mutex = mutex;
	}

	@Override
	public void run() {
		synchronized (mutex) {
			// 1. print you are going to wait (on mutex)
			System.out.println(getName() + " is going to wait on " + mutex);
			// 2. wait
			try {
				mutex.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 3. print that you have been notified
			System.out.println(getName() + " was notified on " + mutex);
		}
	}

}
