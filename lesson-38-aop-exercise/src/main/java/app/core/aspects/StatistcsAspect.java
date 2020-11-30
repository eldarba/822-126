package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class StatistcsAspect {

	private int invokGetcounter;

	public int getInvokGetcounter() {
		return invokGetcounter;
	}

	@Before("app.core.aspects.MyPointcuts.appGetters()")
	public void countGetterAdvice(JoinPoint jp) {
		System.out.println("++++++++++++++ getter invoked: " + jp.getSignature().getName());
		this.invokGetcounter++;
	}

}
