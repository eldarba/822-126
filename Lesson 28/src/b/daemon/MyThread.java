package b.daemon;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " = " + getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
