package com.main.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.main.beans.Address;
import com.main.beans.Area;

public class PandCTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/main/common/application-context.xml"));
		Address fac = factory.getBean("address", Address.class);
		System.out.println(fac);

		// Area area = factory.getBean("area", Area.class);
		// System.out.println(area);

	}

}
