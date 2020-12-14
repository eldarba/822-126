package app.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import app.core.a.MyBean;

@SpringBootApplication
public class Lesson42SpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Lesson42SpringBootApplication.class, args);
		System.out.println("ApplicationContext is ready");

		MyBean myBean = ctx.getBean(MyBean.class);
		myBean.greet();

		System.out.println("============");
		String user = ctx.getBean("user", String.class);
		System.out.println(user);

		System.out.println("============");
		String password = ctx.getBean("password", String.class);
		System.out.println(password);

	}

	// inject value from properties file
	@Bean
	public String user(@Value("${db.user.name}") String val) {
		return val; // returns the injected value
	}

	@Bean
	public String password(@Value("${db.user.password}") String val) {
		return val;
	}

}
