package app.core.aspects;

import java.util.Collection;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import app.core.dao.company.Company;

@Component
@Aspect
@Order(1)
public class LoggerAspect {

// ========== handling the exception by rethrow it on
//	@Around("execution(String fetchTraficFoecast())")
//	public Object aroundFetchTraficAdvice(ProceedingJoinPoint jp) throws Throwable {
//		System.out.println(">>> around-before on method: " + jp.getSignature().getName());
//		Object res = null;
//		try {
//			res = jp.proceed(); // let the business method run
//			System.out.println(">>> around-after on method: " + jp.getSignature().getName());
//		} catch (Exception e) {
//			System.out.println("Aspect found that there was some error in the service");
//			throw e;
//		}
//		return res;
//	}
// ========== handling the exception by providing solution in the advice
	@Around("execution(String fetchTraficFoecast())")
	public Object aroundFetchTraficAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(">>> around-before on method: " + jp.getSignature().getName());
		Object res = null;
		try {
			res = jp.proceed(); // let the business method run
			System.out.println(">>> around-after on method: " + jp.getSignature().getName());
		} catch (Exception e) {
			res = "Just drive away [this msg is from the aspect]";
		}
		return res;
	}

	@Before("app.core.aspects.MyPointcuts.addOrDeleteOrLogin()")
	public void logAddRemoveLoginAdvice() {
		System.out.println(">>>Logger Advice: add/delete/login");
	}

	@After("execution(* app.core.dao.company.CompanyDao.getAllCompanies(..))")
	public void findCompaniesAfterFinalyAdvice(JoinPoint jp) {
		System.out.println(">>>AfterFinalyAdvice on method: " + jp.getSignature().getName());
	}

	@AfterReturning(pointcut = "app.core.aspects.MyPointcuts.collectionGetters()", returning = "col")
	public void getCollectionAdvice(JoinPoint jp, Collection<?> col) {
		for (Object e : col) {
			System.out.println(e);
			if (e instanceof Company) {
				Company company = (Company) e;
				company.setName(company.getName().toLowerCase());
			}
		}
	}

	@AfterThrowing(pointcut = "app.core.aspects.MyPointcuts.collectionGetters()", throwing = "t")
	public void getCollectionFailedAdvice(JoinPoint jp, Throwable t) {
		System.out.println(">>> getCollectionFailedAdvice on " + jp.getSignature().getName() + "- ex " + t);
	}

}
