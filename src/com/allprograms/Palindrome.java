package com.allprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int sum=0,c,rev=0,temp=num;

	while(num>0){
	rev=(rev*10)+num%10;
	sum=sum+rev;
	num/=10;
	}
	
	if(temp==rev) {
	System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}


	}



}