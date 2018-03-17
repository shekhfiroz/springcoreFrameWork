package com.ccd.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ccd.beans.Account;
import com.ccd.beans.Product;
import com.ccd.beans.Project;

public class CCTest {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ccd/common/application-context.xml"));
		Project project = factory.getBean("project", Project.class);
		System.out.println(project);

		/*
		 * Product product=factory.getBean("product", Product.class);
		 * System.out.println(product);
		 */

		/*
		 * Account account = factory.getBean("account", Account.class);
		 * System.out.println(account);
		 */

	}

}
