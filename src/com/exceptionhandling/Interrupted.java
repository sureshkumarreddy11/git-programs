package com.exceptionhandling;

public class Interrupted {

	public static void main(String[] args) {

	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		System.out.println("I");
	}
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		System.out.println("I");
	}
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		System.out.println("I");
	}

	}

}
