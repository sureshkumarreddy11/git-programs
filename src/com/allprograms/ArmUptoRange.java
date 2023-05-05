package com.allprograms;

import java.util.Scanner;

public class ArmUptoRange {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);;
	System.out.println("Enter any number");
	int x=sc.nextInt();

	for(int i=1;i<=x;i++) {
		int sum=0,num=i;
	while(num>0){	
	int r=num%10;
	sum=sum+r*r*r;
	num/=10;	
	}
	if(i==sum) {
	System.out.println(i);
	}
	}
	}
}
	



