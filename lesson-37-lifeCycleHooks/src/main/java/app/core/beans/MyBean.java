package app.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(">>> MyBean afterPropertiesSet method");
	}

	@PreDestroy
	public void myBeanDestroy() {
		System.out.println(">>> MyBean @PreDestroy method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(">>> MyBean DisposableBean.destroy");

	}

}
