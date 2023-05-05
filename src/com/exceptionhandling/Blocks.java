package com.exceptionhandling;


public class Blocks {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		try {
		System.out.println(a[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch Block");
		}finally {
			System.out.println("Finally Block");
		}

	}

}
