package com.allprograms;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=sc.nextInt();
		int sum,n,i;
		for(n=1;n<=limit;n++) {
			sum=0;
		for(i=1;i<n;i++) {
			if(n%i==0) {
			sum=sum+i;
			
			}
			
		}
		if(n==sum) {
		System.out.println(sum);	
		}
		}

	}

}
