package com.main.bean.aliasdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.main.alias.beans.TransportServices;

public class ClientTest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\main\\alias\\common\\application-context.xml"));
		TransportServices transportservice=factory.getBean("transportservices",TransportServices.class);
		transportservice.dispatch(00);
	}
	
}
