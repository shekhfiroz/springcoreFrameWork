package com.ccd.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ccd.beans.Product;

public class CCTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("/core.com.main.constructorconfusion/src/main/java/com/ccd/common/application-context.xml"));
		Product product = factory.getBean("product", Product.class);
		System.out.println(product);
	}

}
