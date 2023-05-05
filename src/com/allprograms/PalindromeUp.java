package com.allprograms;

import java.util.Scanner;

public class PalindromeUp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int n1=sc.nextInt();
	System.out.println("Enter Second number");
	int n2=sc.nextInt();
	System.out.println("Palindrome numbers are:");
	for(int i=n1;i<=n2;i++) {
	int rev=0,n=i,r;
	while(n>0) {
	r=n%10;
	rev=rev*10+r;
	n/=10;
	
	}
	if(rev==i) {
	System.out.println(i+"");
		
	}	
		
	}


	}

}
