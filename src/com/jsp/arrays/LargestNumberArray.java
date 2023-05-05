package com.jsp.arrays;

public class LargestNumberArray {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int large=a[0];
	for(int i=1;i<a.length;i++)
	if(large<a[i]) {
	large=a[i];



}
	System.out.println(large);
}}