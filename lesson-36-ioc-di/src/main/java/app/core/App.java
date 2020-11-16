package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Person;
import app.core.beans.School;

public class App {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			
			System.out.println("spring app started");
			
			Person p = ctx.getBean("thePerson", Person.class);
			p.setId(101);
			System.out.println(p);

			Person pStandard = ctx.getBean("standardPerson", Person.class);
			pStandard.setId(102);
			System.out.println(pStandard);
			
			School school = ctx.getBean(School.class);
			school.add(p);
			school.add(pStandard);
			
			System.out.println("=================");
			School theSchool = ctx.getBean(School.class);
			System.out.println(theSchool.getPerson(103));

		}

	}

}
