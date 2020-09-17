package a;

public class Demo1MainThread {

	public static void main(String[] args) {

		System.out.println("hello java threads");

		Thread mainThread = Thread.currentThread();
		System.out.println("name of current runnin thread: " + mainThread.getName());

// option 1 - extend Thread class
		MyThread t1 = new MyThread("t1");
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());

		// stop main for 500 ms
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println(t1.getState());

// option 2 - implement Runnable interface
		MyRunnable r1 = new MyRunnable();
		Thread t2 = new Thread(r1, "t2");
		t2.start();

		// we want main to halt for the termination of t1 and t2
		try {
			t1.join(); // current thread ( main) wait for t1 to terminate
			System.out.println(t1.getState());
			t2.join(); // current thread ( main) wait for t2 to terminate
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("END OF PROGRAM");
	}

}

// option 1 - extend Thread class
class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + this.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " is finished");
	}
}

// option 2 - implement Runnable interface
class MyRunnable extends SuperClass implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + Thread.currentThread().getName());
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(Thread.currentThread().getName() + " is finished");
	}
}

class SuperClass {

}
