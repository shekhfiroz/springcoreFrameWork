package com.main.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Radio implements BeanFactoryAware {
	private IReceiver ireceiver;
	private BeanFactory beanFactory;
	private String beanid;

	public Radio(String beanid) {
		this.beanid = beanid;
	}

	public void tune(Double frequency) {

		ireceiver = beanFactory.getBean(beanid, IReceiver.class);
		ireceiver.receiver(frequency);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

}