package app.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.core.beans.Person;

public class App {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")){
			Person p = ctx.getBean("thePerson", Person.class);
			System.out.println(p);
			
		}

	}

}
