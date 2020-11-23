package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.core.beans.MyBean;

@Configuration
@ComponentScan
public class SpringApp {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringApp.class)) {
			MyBean bean = ctx.getBean(MyBean.class);
			System.out.println(bean.beanName);

		}

	}

}
