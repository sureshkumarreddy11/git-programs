package com.jsp.strings;

public class DoWhile {

	public static void main(String[] args) {
	int i=0,sum=0;
	int a[]= {10,20,30,40,50};
	int size=a.length;
	do {
	sum+=a[i];
	i++;
	}while(i!=size);
System.out.println(sum);
}
}

