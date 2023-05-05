package Recurssion.com;
class M{
public static void fib(int a,int b,int n) {
if(n==0) {
return;
}
int c=a+b;
System.out.println(c);
fib(b,c,n-1);
}
}
public class Fib {

	public static void main(String[] args) {
	int a=0,b=1;
	System.out.println(a);
	System.out.println(b);
	int n=10;
	M m1=new M();
	m1.fib(0,1,n-2);
	}

}
