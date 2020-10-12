package d.threads;

public class Demo2 {

	public static void main(String[] args) {

		// 1
		// creating a thread execution: option 1
		// define a class that extends Thread
		MyThread t1 = new MyThread();
		t1.start();

		// 2
		// creating a thread execution: option 2
		// define a class that implements Runnable
		MyRunnable r2 = new MyRunnable();
		Thread t2 = new Thread(r2);
		t2.start();
	}

}

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);

	}

}
