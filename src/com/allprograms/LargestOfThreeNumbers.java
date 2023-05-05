package com.allprograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number");
	int n1=sc.nextInt();
	System.out.println("Enter Second number");
	int n2=sc.nextInt();
	System.out.println("Enter Third number");
	int n3=sc.nextInt();
	if(n1>n2 && n1>n3)
	System.out.println("n1 is largest");
	else if(n2>n3 && n2>n1) {
		System.out.println("n2 is Second largest");
	}
	else if(n3>n1 && n3>n2) {
			System.out.println("n3 is third largest");
	}

	}

}
