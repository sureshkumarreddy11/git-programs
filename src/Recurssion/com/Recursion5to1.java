package Recurssion.com;
class A{
public static void printNum(int n) {
	if(n==0)
	return;
	System.out.println(n);
	printNum(n-1);
}
}

public class Recursion5to1 {

	public static void main(String[] args) {
	A a1=new A();
	a1.printNum(5);

	}

}
