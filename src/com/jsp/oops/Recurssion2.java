package com.jsp.oops;

public class Recurssion2 {

	public static void main(String[] args) {
		System.out.println(sum(12345));
	

	}
	public static int sum(int n) {
		if(n==0)return 0;
		int a=n%10+sum(n/10);
		if(a>9) 
		{
		return sum(a);
		}
		return a;
	}

	}


