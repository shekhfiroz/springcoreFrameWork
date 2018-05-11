package com.fb.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalenderBeanFactory implements FactoryBean<Calendar> {
	private int year;
	private int month;
	private int day;
	public CalenderBeanFactory(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public Calendar getObject() throws Exception {
		// creating calender class object
		Calendar calender = Calendar.getInstance();
		calender.set(year, month, day);
		return calender;
	}

	@Override
	public Class<?> getObjectType() {
		return Calendar.class;
	}
	@Override
	public boolean isSingleton() {
		return true;
	}

}
