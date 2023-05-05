package com.allprograms;
class Demo{
	public  void m1() {
	System.out.println("hii");	
	}
	public  void m2() {
		System.out.println("hii");	
		}
}
public class Methods {

	public static void main(String[] args) {
	Demo d=new Demo();
	d.m1();
	d.m2();
	new Demo().m1();
	new Demo().m2();

	}

}
