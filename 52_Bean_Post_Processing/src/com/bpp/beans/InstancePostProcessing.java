package com.bpp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import com.bpp.test.BppTest;

public class InstancePostProcessing implements BeanPostProcessor {
	

	@Override
	public Object postProcessAfterInitialization(Object obj, String rocket) throws BeansException {
		BppTest.instance++;
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String rocket) throws BeansException {
		return obj;
	}

}
