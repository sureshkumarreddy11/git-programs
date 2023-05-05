package com.jsp.arrays;

public class BinarySearch {

	public static void main(String[] args) {
	int [] a= {7,14,23,43,55,66,77,88,99,100,101};
	System.out.println(search(a,101));
	System.out.println(search(a,19));

}
public static int search(int []a,int ele) {
	int start=0,end=a.length-1;
	while(start<=end) {
	int mid=(start+end)/2;
	if(ele==a[mid])return mid;
	else if(ele<a[mid])end=mid-1;
	else start=mid+1;
	
	}
return-1;
	}
}
