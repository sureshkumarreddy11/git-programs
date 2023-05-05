package com.exceptionhandling;

public class ArithemeticEception1 {

	public static void main(String[] args) {
		System.out.println("Main start");
		int a=10;
		int b=2;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			
			b=5;
			
		}
		System.out.println(b);	
		System.out.println("Main end");

	}

}
