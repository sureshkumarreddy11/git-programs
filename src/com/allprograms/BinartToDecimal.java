package com.allprograms;

import java.util.Scanner;

public class BinartToDecimal {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int rem,dec=0,i=1; 
	while(num>0) {
	rem=num%10;
	dec=dec+rem*i;
	i=i*2;
	num/=10;
	
	}
	System.out.println(dec);

	}

}
