package com.jsp.strings;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
a[i]=sc.nextInt();
		
	}
	
	System.out.println("Elements");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
				
			}

	}

}
