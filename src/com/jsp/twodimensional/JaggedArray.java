package com.jsp.twodimensional;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr1[][] =new int [3][];
	
	arr1[0]=new int[3];
	arr1[1]=new int[5];
	arr1[2]=new int[6];
	
	System.out.println("Enter array elements are");
	for(int i=0;i<arr1.length;i++) {
	for(int j=0;j<arr1[i].length;j++) {
	arr1[i][j]=sc.nextInt();
	}
	}
	System.out.println("Entered array elements are:");
	for(int i=0;i<arr1.length;i++) {
	for(int j=0;j<arr1[i].length;j++) {
	System.out.print(arr1[i][j]+" ");
	}
	System.out.println("");	
	}
	

	}

}
