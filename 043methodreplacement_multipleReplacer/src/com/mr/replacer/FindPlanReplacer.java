package com.mr.replacer;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlanReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object target, Method method, Object[] arg) throws Throwable {

		System.out.println("inside replcer");
		if (method.getName().equals("findPlans")) {
			System.out.println("age  :" + arg[0]);
			System.out.println("zipCode:" + arg[1]);
			//System.out.println("coverageType :" + arg[2]);
			//System.out.println("networkType :" + arg[3]);
		}
		return "jeevan Saral" + "  " + "jeevan rekha";
	}
}
