package com.main.nbf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;

import com.main.nbf.beans.ChainParent;
import com.main.nbf.beans.MotorChild;

public class Testnbf {
	public static void main(String[] args) {

		@SuppressWarnings("deprecation")
		BeanFactory parentfactory = new XmlBeanFactory(
				new ClassPathResource("com/main/nbf/common/parent-application-context.xml"));
		BeanFactory childfactory = new XmlBeanFactory(
				new ClassPathResource("com/main/nbf/common/child-application-context.xml"), parentfactory);
		MotorChild motor = childfactory.getBean("motor", MotorChild.class);
		System.out.println(motor);
	}
}
