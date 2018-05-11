package com.main.sfi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.main.sfi.beans.Reminder;

public class StaticFactoryTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com\\main\\sfi\\common\\application-context.xml"));
		Reminder remainder = factory.getBean("remainder", Reminder.class);
		remainder.schedulemeeting();

	}

}
