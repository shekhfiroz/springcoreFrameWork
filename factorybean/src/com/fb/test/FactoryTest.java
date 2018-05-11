package com.fb.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fb.beans.CalenderBeanFactory;
import com.fb.beans.Reminder;

@SuppressWarnings("deprecation")
public class FactoryTest {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/fb/common/application-context.xml"));
		/*Reminder rem = factory.getBean("reminder", Reminder.class);
		System.out.println(rem.hashCode());
		Reminder rem2 = factory.getBean("reminder",Reminder.class);
		System.out.println(rem2.hashCode());
		rem.reminder();*/
		Calendar cal = factory.getBean("calfact", Calendar.class);
		System.out.println(cal.hashCode());
		Calendar cal1 = factory.getBean("calfact", Calendar.class);
		System.out.println(cal1.hashCode());
	}

}
