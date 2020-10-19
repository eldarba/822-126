package task3.api.orders;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrderSystem {

	private Set<Order> orders = new HashSet<Order>();
	private OrderTask task = new OrderTask(orders);
	private Thread taskThread = new Thread(task, "orders task");

	public void init() {
		taskThread.start();
	}

	public void destroy() {
		taskThread.interrupt();
	}

	public boolean addOrder(Order order) {
		synchronized (orders) {
			return orders.add(order);
		}
	}

	public List<Order> getOrders() {
		List<Order> list = new ArrayList<Order>(orders);
		list.sort(null);
		return list;
	}

	public void printOrderMenu() {
		System.out.println("\n==========================");
		System.out.println("Order Menu");
		System.out.println("1 ........... Add Order by seconds (add)");
		System.out.println("11 .......... Add Order by date (date)");
		System.out.println("2 ........... Show All Orders (show)");
		System.out.println("q ........... Exit");
		System.out.println("Your choice: ");
	}

}
