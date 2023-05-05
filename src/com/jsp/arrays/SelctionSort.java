package com.jsp.arrays;

public class SelctionSort {

	public static void main(String[] args) {
	int a[]= {4,6,8,9,11};
	sort(a);
	for(int n:a) {
		System.out.println(n);
		}
	}

	
	public static void sort(int a[]) {
	for(int i=0;i<a.length-1;i++) {
	int index=i;
   for(int j=i+1;i<a.length;j++) {
	   if(a[j]<a[index]) 
		   index=j;
	   
   }
	   if(i!=index) {
	 int temp=a[i];
	a[i]=a[index]  ;
	a[index]=temp;
			
		}	
	}
		
	}
	}


