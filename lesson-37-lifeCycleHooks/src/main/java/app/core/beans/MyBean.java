package app.core.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements BeanNameAware, BeanFactoryAware {

	public String beanName;

	public MyBean() {
		System.out.println(">>> MyBean CTOR");
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println(">>> MyBean BeanNameAware");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(">>> MyBean BeanFactoryAware");
	}

	@PostConstruct
	public void myBeanInit() {
		System.out.println(">>> MyBean @PostConstruct method");
	}

}
