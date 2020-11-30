package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LogAspect {

	@Before("app.core.aspects.MyPointcuts.addOrDelete()")
	public void logAddRemoveAdvice() {
		System.out.println(">>>Logger Advice: add/delete");
	}

}
