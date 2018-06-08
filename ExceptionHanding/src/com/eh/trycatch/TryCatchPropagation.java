package com.eh.trycatch;

public class TryCatchPropagation {

	public static void main(String[] args)
	{
		try {
			System.out.println("Before Excetion");
			System.out.println(10 / 0);
			System.out.println("After Excetion");
		} 
		catch (Exception e) {
			System.out.println("Inside Catch");
			System.out.println("Opps...Output Should Be==>"+10/3);
			e.printStackTrace();
		}
	}
}
