package com.allprograms;

import java.util.Scanner;

public class ArmStr {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter n number");
int n=sc.nextInt();
int r,c,sum=0,temp=n;
while(n>0) {
r=n%10;
c=r*r*r;
sum=sum+c;
n/=10;
}
if(temp==sum)System.out.println("Armstrong");
else System.out.println("Not Armstrong ");
}
	
}


