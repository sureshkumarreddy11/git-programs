package com.allprograms;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num =sc.nextInt();
	int rem,bin=0,i=1;
	while(num>0) {
	rem=num%2;
	bin=(rem*i)+bin;
	num/=2;
	i=i*10;
	}
System.out.println(bin);

	}
}
