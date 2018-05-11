package com.cpe.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.cpe.beans.Address;
import com.cpe.editor.CustomPropertyEditorRegistar;
import com.cpe.editor.GeoLocationPropertyEditor;

public class CustomPropertyTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cpe/commom/application-context.xml"));
		// configurable inpl
		((ConfigurableListableBeanFactory) factory).addPropertyEditorRegistrar(new CustomPropertyEditorRegistar());

		Address address = factory.getBean("address", Address.class);
		System.out.println(address);
	}

}
