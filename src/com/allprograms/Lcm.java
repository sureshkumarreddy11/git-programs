package com.allprograms;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A Number:");
	int a=sc.nextInt();
	System.out.println("Enter B Number:");
	int b=sc.nextInt();
	int g=0;
	for(int i=1;i<=b;i++){
	if(a%i==0 && b%i==0) {
	g=i;
	
	}
	}
	int lcm=a*b/g;
	System.out.println(lcm);
	}
	
	}


