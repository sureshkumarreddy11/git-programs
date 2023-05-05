package com.allprograms;
class A{
static A t;
private A(){
	
}


public static A getInstance() {
if(t==null)
t=new A();
return t;
}
}
public class Singlet {

	public static void main(String[] args) {
A a1=A.getInstance();
System.out.println(a1);

	}

}
