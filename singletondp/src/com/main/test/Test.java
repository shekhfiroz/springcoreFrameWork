package com.main.test;

import com.main.singletondp.Processor;

public class Test {

	public static void main(String[] args) {
       Processor pro=Processor.createObject();
       System.out.println(pro.hashCode());
      
       System.out.println("--------------------------------------");
       
       Processor pro1=Processor.createObject();
       System.out.println(pro1.hashCode());
       
       System.out.println("--------------------------------------");
       
       Processor pro2=Processor.createObject();
       System.out.println(pro2.hashCode());
       
       System.out.println("--------------------------------------");
       
       Processor pro3=Processor.createObject();
       System.out.println(pro3.hashCode());
	}
	

}
