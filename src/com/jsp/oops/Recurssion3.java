package com.jsp.oops;

public class Recurssion3 {

	public static void main(String[] args) {
	System.out.println(count(12345));


	}
	public static int count(int n) {
		if(n==0)return 0;
		return 1+count(n/10);
		
	}

}
