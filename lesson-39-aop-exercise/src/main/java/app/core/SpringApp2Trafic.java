package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import app.core.login.LoginManager;
import app.core.services.TraficService;

@Configuration // if you want bean methods
@ComponentScan // scan classes with @Component
@EnableAspectJAutoProxy // activate AOP proxy
public class SpringApp2Trafic {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringApp2Trafic.class)) {

			LoginManager lm = ctx.getBean(LoginManager.class);

			lm.login("name", "password");

			TraficService traficService = ctx.getBean(TraficService.class);
			System.out.println(traficService.getClass());

			try {

//				String msg = traficService.fetchTraficFoecast();
				System.out.println(traficService.fetchTraficFoecast());
			} catch (Exception e) {
				System.out.println(e);
			}

			System.out.println("#################");
			traficService.fetchTraficFoecastAnnotated();

			System.out.println("END");

		}

	}

}
