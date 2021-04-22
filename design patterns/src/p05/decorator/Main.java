package p05.decorator;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Beverage b1 = new Tea();
		Beverage b2 = new MilkDecorator(new Tea());
		Beverage b3 = new MilkDecorator(new CaramelDecorator(new Coffee()));
		Beverage b4 = new MilkDecorator(new MilkDecorator(new Tea()));

		List<Beverage> list = Arrays.asList(b1, b2, b3, b4);

		for (Beverage b : list) {
			System.out.println(b.getDescription() + " cost: " + b.getCost());
		}

	}

}
