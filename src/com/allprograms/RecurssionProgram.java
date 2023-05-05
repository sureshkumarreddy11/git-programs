package com.allprograms;

import java.util.Scanner;

class D{
	int fact(int n) {
		if(n==0)return 1;
		int x=n*fact(n-1);
		return x;
	}
}

public class RecurssionProgram {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int n=sc.nextInt();
D d1=new D();
int res=d1.fact(n);
System.out.println(res);
	}

}
