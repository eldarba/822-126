package b.daemon;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("start");

		// application threads terminates when done or throws exception
		MyThread t1Application = new MyThread("app");

		// daemon threads terminates when all application threads are done
		MyThread t2Daemon = new MyThread("daemon");
		t2Daemon.setDaemon(true);

		t1Application.start();

		Thread.sleep(4000);

		t2Daemon.start();

	}

}
