package com.icic.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.icicidirect.handler.StockHandler;

public class IfmiTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/icicdirect/common/application-context.xml"));
		StockHandler handler = factory.getBean("stockhandler", StockHandler.class);
		System.out.println(handler.getstockprice("cipla"));
	}
}
