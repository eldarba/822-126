package app.core.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import app.core.session.SessionContext;

@Component
@Aspect
public class LoginAspect {

	@Autowired
	private SessionContext sessionContext;

	@Around("controllerMethods() && ! login()")
	public Object loginAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(">>> this is advice for a controller method");
		Object[] args = jp.getArgs();
		String token = null;
		if (args.length > 0 && args[0] instanceof String) {
			token = (String) args[0];
		}
		if (token != null && sessionContext.getSession(token) != null) {
			return jp.proceed();
		} else {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "you are not logged in");
		}
	}

	@Pointcut("execution(* app.core.controllers.*.*(..))")
	public void controllerMethods() {

	}

	@Pointcut("execution(* app.core.controllers.*.login(..))")
	public void login() {

	}

}
