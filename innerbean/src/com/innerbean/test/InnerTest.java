package com.innerbean.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.innerbean.beans.Bbycycle;

public class InnerTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/innerbean/common/application-context.xml"));
		Bbycycle cycle = factory.getBean("bycycle", Bbycycle.class);
		System.out.println(cycle);
	}

}
