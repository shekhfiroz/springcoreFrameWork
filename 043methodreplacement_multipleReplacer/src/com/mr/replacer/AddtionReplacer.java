package com.mr.replacer;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

public class AddtionReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object target, Method method, Object[] arg) throws Throwable {

		System.out.println("inside addition replcer");
		if (method.getName().equals("addition")) {
			System.out.println("if executed");
		}
		return "addtion replacer...";
	}
}
