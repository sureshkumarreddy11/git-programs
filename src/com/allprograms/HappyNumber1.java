package com.allprograms;

import java.util.Scanner;

public class HappyNumber1 {
 static int ishappy(int n) {
int sum=0;
while(n>0) {
int rem=n%10;
sum+=rem*rem;
n/=10;
}
return sum;
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	
	while(temp!=1&&temp!=4) {
	temp=ishappy(temp);
	}
	if(temp==1)System.out.println("H");else if(temp==4)System.out.println("Not h");
	}
	
	}
	


		
	
	


