package com.allprograms;

import java.util.Scanner;

public class Stro {



	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int n=sc.nextInt();{
	int sum=0,temp=n;
	while(n>0) {
	int rem=n%10;
	int fact=1;
	for(int i=1;i<=rem;i++) {
	fact=fact*i;
	}
	sum=sum+fact;
	n/=10;
	}
	if(temp==sum)System.out.println("Strong");else
	System.out.println("Not Strong");
	}	
	}
}
