package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import app.core.aspects.StatistcsAspect;
import app.core.dao.company.Company;
import app.core.dao.company.CompanyDao;
import app.core.login.LoginManager;

@Configuration // if you want bean methods
@ComponentScan // scan classes with @Component
@EnableAspectJAutoProxy // activate AOP proxy
public class SpringApp2 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringApp2.class)) {

			LoginManager lm = ctx.getBean(LoginManager.class);

			// first we must login
			lm.login("name", "password");

			CompanyDao companyDao = ctx.getBean(CompanyDao.class);

			companyDao.addCompany(new Company(1L, "AAA"));
			companyDao.addCompany(new Company(2L, "BBB"));
			companyDao.addCompany(new Company(3L, "CCC"));
			System.out.println("==============================");
			try {
				System.out.println(companyDao.getAllCompanies());
			} catch (Exception e) {
				System.out.println("main app cought exception " + e);
			}

			StatistcsAspect stats = ctx.getBean(StatistcsAspect.class);
			System.out.println("getters count: " + stats.getInvokGetcounter());
		}

	}

}
