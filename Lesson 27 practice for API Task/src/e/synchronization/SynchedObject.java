package e.synchronization;

public class SynchedObject {

	int x;
	int y;
	int z;
	Object monitor;

	// critical sections must not run by different threads at the same time

	public SynchedObject(Object monitor) {
		super();
		this.monitor = monitor;
	}

	// not critical at all
	public void m1() {
		System.out.println("m1");
		System.out.println("m1");
		System.out.println("m1");
		System.out.println("m1");
	}

	// all is critical - to enter you need the monitor for "this" object
	public synchronized void m2() {
		System.out.println("m2");
		System.out.println("m2");
		System.out.println("m2");
		System.out.println("m2");
	}

	// partly critical
	public void m3() {
		System.out.println("m3");
		synchronized (monitor) {// to enter you need the monitor for specified object
			System.out.println("m3");
			System.out.println("m3");
		}
		System.out.println("m3");
	}

	public static void main(String[] args) {

		Object monitorA = new Object();
		Object monitorB = new Object();

		SynchedObject s1 = new SynchedObject(monitorA);
		SynchedObject s2 = new SynchedObject(monitorA);

		MyThread t1 = new MyThread(s1);
		MyThread t2 = new MyThread(s1);
		MyThread t3 = new MyThread(s1);

		MyThread t4 = new MyThread(s2);
		MyThread t5 = new MyThread(s2);

	}

}

class MyThread extends Thread {

	SynchedObject s;

	public MyThread(SynchedObject s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		s.m3();
	}

}
