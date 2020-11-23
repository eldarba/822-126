package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Before("execution(* *(..))") // point
	public void logAll() {
		System.out.println(">>> Log All advice");
	}

	/*
	 * PointCut Expression parts:
	 * 
	 * 1. pointcut designator: execution()
	 * 
	 * 2. method modifiers - if not specified - any modifier
	 * 
	 * 3. return type
	 * 
	 * 4. declaring type - pacage + class
	 * 
	 * 5. method identifier
	 * 
	 * 6. parameters
	 * 
	 * 7. throws declaration - if not specified - any or not throwing
	 * 
	 */
	@Before("execution(public void app.core.dao.company.CompanyDao.addCompany(int, String) throws RuntimeException)")
	public void logSpecific() {
		System.out.println(">>> Log specific advice");
	}

}
