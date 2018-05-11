package com.main.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware {
	private IEngine engine;
	private String beanId;
	private BeanFactory factory;

	public Car(String beanId) {
		System.out.println("Car Constructor.....");
		this.beanId = beanId;
	}
	public void run() {
		engine = factory.getBean(beanId, IEngine.class);
		engine.start();
		System.out.println("running now...");
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory");
		this.factory=factory;
	}

}
