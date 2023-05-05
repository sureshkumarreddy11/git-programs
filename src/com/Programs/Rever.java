package com.Programs;

import java.util.Scanner;

public class Rever {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number first number:");
	int n1=sc.nextInt();
	System.out.println("Enter number Second number:");
	int n2=sc.nextInt();
	for(int i=n1;i<n2;i++) {
	int rev=0,n=i;
	while(n>0) {
	int rem=n%10;
	rev=(rev*10)+rem;
	n/=10;
	}
	if(rev==i) {
	System.out.println(i);
	}
	}
	
	}

}
