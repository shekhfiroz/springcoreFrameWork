package com.main.beansalias.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.main.beanalias.beans.Toy;

public class TestBa {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/main/beanalias/common/application-context.xml"));
		Toy toy = factory.getBean("toy",Toy.class);
		System.out.println(toy);
		
		String[] getAlias = factory.getAliases("toy"); 
		for (String name : getAlias) {
		System.out.println(name);
		 
	}
	}

}
