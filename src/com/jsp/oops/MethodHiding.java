package com.jsp.oops;
class A
{
public static void m1() {
System.out.println("Parent");
}
}
class B extends A{
public static void m1() {
System.out.println("Child");	
}
}
public class MethodHiding {

	public static void main(String[] args) {
	A a=new A();//refrecence type
	a.m1();
	B b=new B();//refrecence type
	b.m1();
	A a1=new B();//refrecence type
	a1.m1();
	//method hiding resolution based on refrence type

	}
}


