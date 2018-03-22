package com.main.alias.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class AliasTest {
  BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\main\\alias\\common\\application-context.xml"));
 }
