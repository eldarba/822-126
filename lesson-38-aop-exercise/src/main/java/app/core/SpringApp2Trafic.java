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
public class SpringApp2Trafic {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringApp2Trafic.class)) {

			LoginManager lm = ctx.getBean(LoginManager.class);

			// first we must login
			System.out.println("are we logged in? " + lm.isLogged());
			lm.login("name", "password");
			System.out.println("are we logged in? " + lm.isLogged());

			// use business methods that requires authorization
			CompanyDao companyDao = ctx.getBean(CompanyDao.class);

			companyDao.addCompany(new Company(1L, "AAA"));
			companyDao.addCompany(new Company(2L, "BBB"));
			companyDao.addCompany(new Company(3L, "CCC"));
//
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
