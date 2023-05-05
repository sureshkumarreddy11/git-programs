package com.exceptionhandling;

public class Exceptions {

	public static void main(String[] args) {
		try {
			System.out.println("Inner try");
			int b=10/0;
		}finally {
			System.out.println("Inner final");
		}

	
	}
}
