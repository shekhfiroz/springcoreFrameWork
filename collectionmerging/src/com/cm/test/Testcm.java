package com.cm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cm.beans.Courses;

public class Testcm {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cm/common/application-context.xml"));
		Courses courses = factory.getBean("ece", Courses.class);
		System.out.println(courses);

	}

}
