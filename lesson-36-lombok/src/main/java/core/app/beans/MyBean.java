package core.app.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyBean implements BeanNameAware, BeanFactoryAware {

	{
		System.out.println(">>> MyBean CTOR");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(">>> MyBean aware of it's name: " + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(">>> MyBean aware of it's factory: " + beanFactory);
	}

}
