package com.main.test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.main.beans.House;

public class DependencyCheckTest {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/main/common/application-context.xml"));
		House house = (House) factory.getBean("house", House.class);
		System.out.println(house);
	}
}
