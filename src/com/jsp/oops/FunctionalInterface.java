package com.jsp.oops;

interface Inter {
	void m1();

	default public void m2() {
		System.out.println("Iam default interface");
	}

	static public void staticMethod() {
		System.out.println("Iam static method interface");
	}
}
class E implements Inter
{
@Override
public void m1() {
System.out.println("m1 implemented");	
}
}
public class FunctionalInterface 
{
public static void main(String[] args) {
Inter i=new E();
i.m1();
i.m2();
Inter.staticMethod();
}

}
