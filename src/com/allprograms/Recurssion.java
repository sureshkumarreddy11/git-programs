package com.allprograms;
class C{
	void m1() {
	System.out.println("m1 method");
	m2();
	}
	void m2() {
		System.out.println("m1 method");
		m1();
		
		}
}

public class Recurssion {

	public static void main(String[] args) {
	C c1=new C();
	c1.m1();

	}

}
