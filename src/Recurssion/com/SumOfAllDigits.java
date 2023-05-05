package Recurssion.com;

public class SumOfAllDigits {

	public static void main(String[] args) {
	System.out.println(digits(6245));

	}
	static int digits(int n) {
	if(n<=9)return n;
	return n%10+digits(n/10);
	}

}
