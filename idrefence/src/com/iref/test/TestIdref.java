package com.iref.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.irefbeans.Car;

public class TestIdref {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/iref/common/application-context.xml"));
		Car car = factory.getBean("car", Car.class);
		car.drive();
	}

}
