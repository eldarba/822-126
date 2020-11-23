package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class StatisticsAspect {

	private int getCounter;
	private int setCounter;

	public int getGetCounter() {
		return getCounter;
	}

	public int getSetCounter() {
		return setCounter;
	}

	@Before("app.core.aspects.MyPointcuts.getters()")
	public void countGetterAdvice() {
		getCounter++;
	}

	@Before("app.core.aspects.MyPointcuts.setters()")
	public void countSetterAdvice() {
		setCounter++;
	}

}
