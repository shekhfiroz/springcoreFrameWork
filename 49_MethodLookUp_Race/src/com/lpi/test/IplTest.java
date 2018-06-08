package com.lpi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lpi.beans.Container;

public class IplTest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/lpi/common/application-context.xml"));
		Container container = factory.getBean("container", Container.class);
		container.requestHandler("Data_1");
		container.requestHandler("Data_2");
	}

}
