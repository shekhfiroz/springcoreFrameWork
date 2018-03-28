package com.main.test;

import com.main.singletondp.Processor;

public class Test2 {

	public static void main(String[] args) {
		Processor pro = new Processor();
		System.out.println(pro.hashCode());

		System.out.println("--------------------------------------");

		Processor pro1 = new Processor();
		System.out.println(pro1.hashCode());

		System.out.println("--------------------------------------");

		Processor pro2 = new Processor();
		System.out.println(pro2.hashCode());

		System.out.println("--------------------------------------");

		Processor pro3 = new Processor();
		System.out.println(pro3.hashCode());
	}

}
