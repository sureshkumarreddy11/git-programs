package com.jsp.twodimensional;

import java.util.Scanner;

public class Dynamic2Array {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter rows:");
		int rows=sc.nextInt();
		System.out.println("Enter cols:");
		int cols=sc.nextInt();
		int[][] arr=new int[rows][cols];
	for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
	arr[i][j]=sc.nextInt();
	}
	}
	System.out.println("Entered Array Elements Are:");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]+" ");
	
	}
System.out.println();
	}
	}
	
}
