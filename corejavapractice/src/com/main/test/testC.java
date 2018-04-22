package com.main.test;

import corejavapractice.testA;

public class testC  extends testA{
public static void main(String[] args) {
	testA a=new testA();
	testC c=new testC();
	System.out.println("test C named package");
	System.out.println(a.getClass().getCanonicalName());
	System.out.println(c.getClass().getCanonicalName());
}	

}
