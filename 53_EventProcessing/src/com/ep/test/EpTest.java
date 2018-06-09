package com.ep.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.beans.EditCityHandler;

public class EpTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com\\ep\\common\\application-context.xml");
		EditCityHandler ech=context.getBean("editcityhandler",EditCityHandler.class);
		ech.updateCity(1, "chennai");
	}

}

