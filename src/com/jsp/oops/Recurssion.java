package com.jsp.oops;
public class Recurssion {


	public static void main(String[] args) {
	int n=4085;
	if(n==4085)
	{
	System.out.println("Strong");
	}
	else
	{
	System.out.println("Not Strong");

	}
	}
	

public static int isStrong(int n) {
	if(n==0)return 0;
	return fact(n%10)+isStrong(n/10);
	


}
public static int fact(int n) {
	if(n==0)return 1;
	return n*fact(n-1);
	
	
}
}
