package c.waitNotofy;

public class Demo1 {

	public static void main(String[] args) {

		Object key = new Object();

		Thread t = new Thread() {
			@Override
			public void run() {
				synchronized (key) {
					try {
						Thread.sleep(3_000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("about to notify");
					key.notify();
				}
			}
		};

		t.start();

		synchronized (key) {
			System.out.println("aaa");
			System.out.println("aaa");
			try {
				key.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("aaa");
			System.out.println("aaa");
		}
	}

}
