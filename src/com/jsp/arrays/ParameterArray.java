package com.jsp.arrays;

public class ParameterArray {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	modify(a);
	for(int n:a) {
		System.out.println(n);
	}
	
	

	}
public static void modify(int []x ) {
for(int i=0;i<x.length;i++) {
x[i]=x[i]+1;
}

}
}
