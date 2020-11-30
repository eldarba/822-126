package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggerAspect {

	@Before("app.core.aspects.MyPointcuts.addOrDeleteOrLogin()")
	public void logAddRemoveLoginAdvice() {
		System.out.println(">>>Logger Advice: add/delete/login");
	}

}
