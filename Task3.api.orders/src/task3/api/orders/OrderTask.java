package task3.api.orders;

import java.util.Calendar;
import java.util.Set;

public class OrderTask implements Runnable {

	private Set<Order> orders;

	public OrderTask(Set<Order> orders) {
		super();
		this.orders = orders;
	}

	@Override
	public void run() {
		System.out.println("OrderTask starting");
		while (true) {
			Calendar now = Calendar.getInstance();
			synchronized (orders) {
				for (Order order : orders) {
					if (!order.isPopped() && order.getReadyOn().before(now)) {
						order.setPopped(true);
						System.out.println("\n\t>>>> pop message for: " + order);
						if (order.isImportant()) {
							ImportantOrderTask task = new ImportantOrderTask(order);
							Thread t = new Thread(task);
							t.start();
						}
					}
				}
			}

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				break;
			}
		}

		System.out.println("OrderTask stopping");

	}

}
