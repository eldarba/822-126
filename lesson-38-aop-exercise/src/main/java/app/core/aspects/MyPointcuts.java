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

}
