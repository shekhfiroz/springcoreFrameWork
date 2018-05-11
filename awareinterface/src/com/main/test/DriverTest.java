package com.main.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.main.beans.Car;

public class DriverTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\main\\common\\application-context.xml"));
		Car car = factory.getBean("car", Car.class);
		car.run();
	}

}
