package com.main.core.ci.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;

import com.main.core.ci.beans.PaymentService;
import com.main.core.ci.beans.Wallet;

public class CiTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com/main/core/ci/commom/application-context.xml"));
		PaymentService paytm1 = factory.getBean("payment", PaymentService.class);
		paytm1.bill("bill", "7685", 456.6f);

	}

}
