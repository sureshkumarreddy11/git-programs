package com.allprograms;

import java.util.Scanner;

public class Automorphic {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sq=n*n;
int count=0,p,num=n;
while(n!=0) {
count++;
n/=10;
}
p=(int)Math.pow(10, count);	
int rem=sq%p;
if(rem==num)
	System.out.println("Automorphic");else System.out.println("Not Automorphic");
	
}
}


