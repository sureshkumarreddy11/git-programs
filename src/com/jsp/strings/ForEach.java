package com.jsp.strings;

public class ForEach {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int size=a.length;
	int sum=0;
	for(int arr:a) {
	sum+=arr;
	
	}
	System.out.println(sum);

	}

}
