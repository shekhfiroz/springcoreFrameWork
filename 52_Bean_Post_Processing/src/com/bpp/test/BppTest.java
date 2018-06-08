package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.bpp.beans.InstancePostProcessing;
import com.bpp.beans.Robot;
import com.bpp.beans.Rocket;

@SuppressWarnings("deprecation")
public class BppTest {
	public static int instance;

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bpp/common/application-context.xml"));

		InstancePostProcessing ipp = factory.getBean("ipp", InstancePostProcessing.class);
		((ConfigurableListableBeanFactory) factory).addBeanPostProcessor(ipp);

		Rocket rocket = factory.getBean("rocket", Rocket.class);
		System.out.println("rocket_instance  "+instance);
		//we are counting how many times ioc container is called
		Robot robot = factory.getBean("robot", Robot.class);
		System.out.println("robot_instance  "+instance);
	}

}
