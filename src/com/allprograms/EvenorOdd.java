package com.allprograms;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n%2==0)System.out.println("Even number is:"+n);
		else System.out.println("Odd number is:"+n);

		}

	}


