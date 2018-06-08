package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.bpp.beans.ConnectionFactory;

public class BppTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bpp/common/application-context.xml"));
		System.out.println("we are replacing the metadata inside the IOC metaData... by reading the properties file");
		
		BeanFactoryPostProcessor bfpp = factory.getBean("ppc", BeanFactoryPostProcessor.class);
		bfpp.postProcessBeanFactory((ConfigurableListableBeanFactory) factory);

		ConnectionFactory cf = factory.getBean("connectionFactory", ConnectionFactory.class);
		System.out.println(cf);
	}

}
