package com.main.beanscope.test;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.main.beanscope.beans.Bike;

public class BeanScopeTest {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("inside main");

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\main\\beanscope\\common\\application-context.xml"));
		Bike bike = factory.getBean("bike", Bike.class);
		Bike sportsbike = factory.getBean("sportsbike", Bike.class);
		System.out.println("Comparing the bikes....." + bike.equals(sportsbike));

	}
}
