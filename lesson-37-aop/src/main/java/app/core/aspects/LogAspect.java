package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LogAspect {

	@Before("execution(* *(..))") // pointcut expression
	public void logAll(JoinPoint jp) {
		System.out.println(">>> Log All advice. joinpoint: " + jp.getSignature().getName());
	}

	/*
	 * PointCut Expression parts:
	 * 
	 * 1. pointcut designator: execution()
	 * 
	 * 2. method modifiers - if not specified - any modifier
	 * 
	 * 3. return type ---MUST
	 * 
	 * 4. declaring type - pacage + class
	 * 
	 * 5. method identifier ---MUST
	 * 
	 * 6. parameters ---MUST
	 * 
	 * ()-no params
	 * 
	 * (*) one parameter of any type
	 * 
	 * (..) zero or more of any type
	 * 
	 * 7. throws declaration - if not specified - any or not throwing
	 * 
	 */
	@Before("execution(public void app.core.dao.company.CompanyDao.addCompany(int, String) throws RuntimeException)")
	public void logSpecific() {
		System.out.println(">>> Log specific advice");
	}

	// parts of names are also posible
	@Before("execution(* add*(..))")
	public void logAddMethods() {
		System.out.println(">>> Log add methods");
	}

}
