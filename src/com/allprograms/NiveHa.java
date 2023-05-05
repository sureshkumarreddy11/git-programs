package com.allprograms;

import java.util.Scanner;

public class NiveHa {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  number:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		int sum=0,temp=n;
	while(n>0) {
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
	}
	if(temp%sum==0)System.out.println("Niven");
	else System.out.println("Not niven");

	}
	}
}