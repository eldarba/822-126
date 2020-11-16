package core.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import core.app.beans.MyBean;

@Configuration
@ComponentScan
public class AppConfig {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			System.out.println("nothing");
			ctx.getBean(MyBean.class);
		}

	}

}
