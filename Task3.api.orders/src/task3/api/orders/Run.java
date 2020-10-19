package task3.api.orders;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Run {

	static Scanner sc = new Scanner(System.in);
	static String input;
	static OrderSystem sys = new OrderSystem();

	public static void main(String[] args) throws InterruptedException {

		sys.init();
		Thread.sleep(1000);
		boolean quitSys = false;

		while (!quitSys) {
			try {

				sys.printOrderMenu();
				input = sc.nextLine();

				switch (input) {
				case "1":
				case "add":
					doAddOrder();
					break;
				case "11":
				case "date":
					doAddOrderByDate();
					break;
				case "2":
				case "show":
					showAllOrders();
					break;
				case "q":
					sc.close();
					System.out.println("Bye");
					quitSys = true;
					break;

				default:
					System.out.println("Command " + input + " is not supported");
					break;
				}

			} catch (Exception e) {
				System.out.println("error: " + e);
			}
		}

		sys.destroy();
		sc.close();

	}

	private static void showAllOrders() {
		List<Order> orders = sys.getOrders();
		System.out.println("Orders =========================================================");
		for (Order order : orders) {
			System.out.println(order);
		}
		System.out.println("================================================================");

	}

	private static void doAddOrder() {
		System.out.print("In how many seconds order to be ready? ");
		int amount = Integer.parseInt(sc.nextLine());

		System.out.print("Enter order description: ");
		String text = sc.nextLine();

		System.out.print("Is this order important? y/n ");
		boolean important = sc.nextLine().equalsIgnoreCase("y") ? true : false;

		Calendar readyOn = Calendar.getInstance();
		readyOn.add(Calendar.SECOND, amount);
		Order order = new Order(readyOn, text, important);
		if (sys.addOrder(order)) {
			System.out.println("order added: " + order);
		} else {
			System.out.println("order NOT added, alrady exist: " + order);
		}

	}

	private static void doAddOrderByDate() {

		System.out.print("year: ");
		int year = Integer.parseInt(sc.nextLine());

		System.out.print("month: ");
		int month = Integer.parseInt(sc.nextLine()) - 1;

		System.out.print("day of month: ");
		int dayOfMonth = Integer.parseInt(sc.nextLine());

		System.out.print("hour of day: ");
		int hourOfDay = Integer.parseInt(sc.nextLine());

		System.out.print("minute: ");
		int minute = Integer.parseInt(sc.nextLine());

		System.out.print("second: ");
		int second = Integer.parseInt(sc.nextLine());

		Calendar readyOn = new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);

		System.out.print("Enter order description: ");
		String text = sc.nextLine();

		System.out.print("Is this order important? y/n ");
		boolean important = sc.nextLine().equalsIgnoreCase("y") ? true : false;

		Order order = new Order(readyOn, text, important);
		if (sys.addOrder(order)) {
			System.out.println("order added: " + order);
		} else {
			System.out.println("order NOT added, alrady exist: " + order);
		}

	}

}
