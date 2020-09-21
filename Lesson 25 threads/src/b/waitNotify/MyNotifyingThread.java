package b.waitNotify;

public class MyNotifyingThread extends Thread {

	private Object mutex; // our shared buffer - plate

	public MyNotifyingThread(String name, Object mutex) {
		super(name);
		this.mutex = mutex;
	}

	@Override
	public void run() {
		synchronized (mutex) {
			// 1. print you are going to sleep for 5 second
			System.out.println(getName() + " is going to sleep for 5 seconds");
			// 2. sleep for 5 second
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			// 3. notify
			System.out.println(getName() + " is going to notify on " + mutex);
			mutex.notify();

		}
	}

}
