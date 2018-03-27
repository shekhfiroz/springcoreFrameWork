package com.bic.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bic.beans.Car;

public class App {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bic/common/application-context.xml"));
		Car car = factory.getBean("car", Car.class);
		System.out.println(car);

	}
}
