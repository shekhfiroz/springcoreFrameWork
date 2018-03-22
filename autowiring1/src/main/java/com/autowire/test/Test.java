package com.autowire.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.autowire.beans.Robot;

public class Test {
BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/autowire/common/application-context.xml"));
Robot robot=factory.getBean("robot",Robot.class);
System.out.print(robot);
}
