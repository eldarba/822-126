package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Product;
import app.core.exceptions.ProductWebsiteException;
import app.core.services.ProductService;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ProductsWebsiteSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ProductsWebsiteSpringApplication.class, args);

		ProductService service = ctx.getBean(ProductService.class);

		try {
			service.create(new Product(1, "Bread", 10, 150));
			service.create(new Product(2, "Pie", 25, 30));
			service.create(new Product(3, "Pizza", 30, 1000));
			service.create(new Product(4, "Milk", 17, 50));
//			service.create(new Product(5, "Potatos", 5.80, 700));
			System.out.println("products ready");
		} catch (ProductWebsiteException e) {
			e.printStackTrace();
		}
	}

}
