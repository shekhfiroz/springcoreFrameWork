package com.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bic.beans.Car;

public class App {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\bi\\commons\\application-context.xml"));
		Car car=new Car();
		Car car1=new Car();
		Car car2=new Car();
		car = factory.getBean("car",Car.class);
		car1=factory.getBean("car1",Car.class);
		car2=factory.getBean("car2",Car.class);
		System.out.println("old version :"+car);
		System.out.println("updated version :"+car1);
		System.out.println("latest version :"+car2);
		
	}
}
