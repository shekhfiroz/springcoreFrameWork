package com.main.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.main.beans.Radio;

public class RadioTest {
	public static void main(String[] args) {
		BeanFactory beanfactory=new XmlBeanFactory(new ClassPathResource("com\\main\\common\\application-context.xml"));
		Radio radio=beanfactory.getBean("radio",Radio.class);
		radio.tune(98.3);
		
		
	}
}
