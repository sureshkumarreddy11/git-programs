package com.jsp.arrays;

public class Interviw2 {

	public static void main(String[] args) {
	int a[]= {10,20,30};
	m1(a);
	for(int n:a)
		System.out.println(n);
	}
static void m1(int[] a) {
	for(int i=0;i<a.length;i++) {
		a[i]++;
	}
	
}
	}


