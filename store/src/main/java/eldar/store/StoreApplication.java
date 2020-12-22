package eldar.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import eldar.store.entities.Basket;
import eldar.store.services.Store;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(StoreApplication.class, args);

		Store store = ctx.getBean(Store.class);
		{
//			Basket basket = new Basket("David");
//			basket.addItem(new Item("Milk", 5, 2));
//			basket.addItem(new Item("Bread", 8, 1));
//
//			store.addBasket(basket);
		}

		{
//			Item item = new Item("AAA", 100, 5);
//			store.addItem(1, item);
		}

		{
//			store.deleteBasket(2);
		}
		{
//			Item item = store.getItem(52);
//			System.out.println(item);
		}

		{
			Basket basket = store.getBasketByItem2(2);
			System.out.println(basket);
		}
	}

}
