package task3.api.orders;

public class ImportantOrderTask implements Runnable {

	private Order order;

	public ImportantOrderTask(Order order) {
		super();
		this.order = order;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(3_000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\n\t\t**** IMPORTANT " + i + "/3 - pop message for: " + order);
		}

	}

}
