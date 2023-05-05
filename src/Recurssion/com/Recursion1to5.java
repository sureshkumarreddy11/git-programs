package Recurssion.com;


class B{
public static void printSum(int n) {
if(n>10)
return;
System.out.println(n);
printSum(n+1);

}
}
public class Recursion1to5 {

	public static void main(String[] args) {
	B b1=new B();
	b1.printSum(1);

	}

}
