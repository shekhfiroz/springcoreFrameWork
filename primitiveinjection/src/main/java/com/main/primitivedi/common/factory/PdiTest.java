package com.main.primitivedi.common.factory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.main.primitivedi.beans.Address;

public class PdiTest {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/main/primitivedi/common/application-context.xml"));
		Address address=factory.getBean("address",Address.class );
		System.out.println(address);
		
	}

}
