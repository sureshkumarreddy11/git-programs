package com.allprograms;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sqrt,sum=0,rem,temp;
	System.out.println("Enter number");
	int n=sc.nextInt();
	temp=n;
	sqrt=n*n;
	while(sqrt!=0){
	rem=sqrt%10;
	sum+=rem;
	sqrt/=10;
	}
if(temp==n) {
	System.out.println("Neon Number" +sum);
}
else System.out.println("Not Neon Number" +sum);
	}

}
