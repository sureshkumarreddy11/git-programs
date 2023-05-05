package com.allprograms;
class B{

int add(int a,int b) {
int c=a+b;
return c;
}
int sub(int a,int b) {
int c=a-b;
return c;
}
int mul(int a,int b) {

int c=a*b;
return c;
}
int div(int a,int b) {
int c=a/b;
return c;
}

public class NonVoidMethod {

	public static void main(String[] args) {
	B b=new B();
	System.out.println(b.add(10,20));
	System.out.println(b.sub(10,20));
	System.out.println(b.mul(10,20));
	System.out.println(b.div(10,20));

	}

}
}
