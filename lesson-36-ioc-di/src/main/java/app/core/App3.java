package app.core;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import app.core.beans.vehicles.Vehicle;

public class App3 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			int count = ctx.getBeanDefinitionCount();
			System.out.println("beans count: " + count);

			String[] beansNames = ctx.getBeanDefinitionNames();
			System.out.println(Arrays.toString(beansNames));

			String[] arr = ctx.getBeanNamesForType(Vehicle.class);
			System.out.println("== all vehicles");
			System.out.println(Arrays.toString(arr));

			System.out.println("===============");
			Map<String, Object> map = ctx.getBeansWithAnnotation(Component.class);
			for (Entry<String, Object> entry : map.entrySet()) {
				System.out.println(entry);
			}

		}

	}

}
