package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import app.core.aspects.StatisticsAspect;
import app.core.dao.company.CompanyDao;
import app.core.dao.coupon.CouponDao;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class SpringApp {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringApp.class)) {
			CompanyDao companyDao = ctx.getBean(CompanyDao.class);
			CouponDao couponDaoDao = ctx.getBean(CouponDao.class);
			// invoke methods
			companyDao.addCompany(111, "Tadiran");
			companyDao.sayHello();

			couponDaoDao.addCoupon();
			couponDaoDao.doWork();

			companyDao.getX();
			companyDao.getX();

			StatisticsAspect stat = ctx.getBean(StatisticsAspect.class);
			System.out.println("get counter = " + stat.getGetCounter());

		}

	}

}
