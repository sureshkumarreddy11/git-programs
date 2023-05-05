package Recurssion.com;
class B1{
	public static void m1(int a,int b,int n) {
	if(n==0) {
	return;
	}
	int c=a+b;
	System.out.println(c);
	m1(b,c,n-1);
	}
}

public class fib1 {

	public static void main(String[] args) {
	int a=0,b=1;
	System.out.println(a);
	System.out.println(b);
	int n=7;
	B1 a1=new B1();
	a1.m1(a, b, n-2);

	}

}
