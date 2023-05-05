package com.exceptionhandling;

public class NullPointerException1 {

	public static void main(String[] args) {
	String s=null;
	System.out.println("Main Start");
	try {
	System.out.println(s.length());
	}
	catch(NullPointerException n) {
		System.out.println("Handled");
		
	}
	
System.out.println("MAin end");
	}

}
