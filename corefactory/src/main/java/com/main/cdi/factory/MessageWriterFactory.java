package com.main.cdi.factory;

import java.io.FileInputStream;
import java.util.Properties;

import com.main.cdi.beans.HtmlMessageWriterImpl;

public class MessageWriterFactory {
	public static Object createMessageWriterFactory(String LClassName) throws Exception {
		System.out.println("LClassName..." + LClassName);
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\springdevelopment\\springcore\\corefactory\\src\\main\\java\\com\\main\\cdi\\common\\Appclasses.properties");
		props.load(fis);

		String className = props.getProperty(LClassName);
		System.out.println("className..." + className);
		
		Class<?> clazz = Class.forName(className);
		
		Object obj = clazz.newInstance();
		
		if (obj.equals("messagewriter.class"))
			return new MessageWriterFactory();
		else if (obj.equals("messageconverter.class"))
			return new HtmlMessageWriterImpl();
		return obj;
	}
}
