package app.core.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

	@Pointcut("execution(* add*(..))")
	public void add() {
	}

	@Pointcut("execution(* delete*(..))")
	public void delete() {
	}

	@Pointcut("add() || delete()")
	public void addOrDelete() {
	}

	@Pointcut("add() || delete()|| login()")
	public void addOrDeleteOrLogin() {
	}

	@Pointcut("execution(boolean app.core.login.LoginManager.login(..))")
	public void login() {
	};

	// sub packages is ..
	@Pointcut("execution(* app.core.*..*.*(..))")
	public void allAppMethods() {
	}

	@Pointcut("execution(* app.core.login.LoginManager.*(..))")
	public void loginMgrMethods() {
	}

	@Pointcut("allAppMethods() && ! loginMgrMethods()")
	public void allAppMethodsButLogin() {
	}

	@Pointcut("execution(* app.core.*..*.get*(..))")
	public void appGetters() {
	}

}
