package com.jsp.oops;
abstract class F
{
public abstract void m1(); 
public abstract void m2();
public  void m3()
{
System.out.println("m3()defined for A class");
}
}
class G extends F
{
	@Override
	public void m1(){
	System.out.println("m1() defined from Ch");	
	}
	@Override
	public void m2(){
		System.out.println("m2() defined from Ch");	
		}
	
	public void m4(){
		System.out.println("m4() defined from Ch");	
		}
}

	

public class AbstractClass {

	public static void main(String[] args) {
	F f1=new G();//
	f1.m1();
	f1.m2();
	f1.m3();
	((G)f1).m4();
	
	
	
	
	

	}

}
