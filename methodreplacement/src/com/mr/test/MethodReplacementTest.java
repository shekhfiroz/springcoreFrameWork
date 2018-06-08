package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.PlanFinder;

public class MethodReplacementTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/mr/common/application-context.xml"));
		PlanFinder planFinder = factory.getBean("planfinder", PlanFinder.class);
		String pf=planFinder.findPlans(20, 500038, 2, 1);
		System.out.println(pf);

	}

}
