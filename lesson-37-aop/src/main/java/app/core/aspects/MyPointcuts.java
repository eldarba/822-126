package app.core.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

	@Pointcut("execution(* get*(..))")
	public void getters() {

	}

	@Pointcut("execution(* set*(..))")
	public void setters() {

	}

}
