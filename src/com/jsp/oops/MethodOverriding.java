package com.jsp.oops;
class C
{
public static void m1() {
System.out.println("Parent");
}
}
class D extends C{
public static void m1() {
System.out.println("Child");	
}
}

public class MethodOverriding {

	public static void main(String[] args) {
		C c=new C();//run time object 
		c.m1();
		D d=new D();//run time object 
		d.m1();
		C c1=new D();//run time object 
		c1.m1();
	

	}

}
