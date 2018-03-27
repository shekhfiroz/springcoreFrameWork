package com.fsp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.fsp.beans.IMessageConverter;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanfactory = new XmlBeanFactory(new ClassPathResource("com/fsp/commom/application-context.xml"));
		/*// System.out.println(beanfactory.getBean("htmlmessagewriter").getClass());
		messagewriter messageconverter =beanfactory.getBean("pdfmessagewriter",messagewriter.class);
		System.out.println("before calling converted message---");
		String cMessage = messageconverter.convert("welcome to Spring First Programme");
		System.out.println("After converted message");
		System.out.println(cMessage);*/

	}

}
