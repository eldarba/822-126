package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import app.core.login.LoginManager;

@Component
@Aspect
@Order(2)
public class LoginAspect {

	@Autowired
	private LoginManager loginManager;

	@Before("app.core.aspects.MyPointcuts.allAppMethodsButLogin()")
	public void loginCheckAdvice() throws Exception {

		if (!loginManager.isLogged()) {
			throw new Exception("You are not logged in");
		}

	}
}
