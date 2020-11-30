package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import app.core.dao.company.Company;
import app.core.dao.company.CompanyDao;

@Configuration // if you want bean methods
@ComponentScan // scan classes with @Component
@EnableAspectJAutoProxy // activate AOP proxy
public class SpringApp {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringApp.class)) {

			CompanyDao companyDao = ctx.getBean(CompanyDao.class);
			companyDao.addCompany(new Company(1L, "AAA"));
			companyDao.addCompany(new Company(2L, "BBB"));
			companyDao.addCompany(new Company(3L, "CCC"));

			System.out.println(companyDao.getAllCompanies());
		}

	}

}
