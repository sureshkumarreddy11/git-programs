package Patterns;

import java.io.InputStream;
import java.util.Scanner;

public class pat1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<=5;i++) {
	for(int j=0;j<=i;j++) {
	System.out.print("*");
	}
	for(int k=0;k<=2*i-1;k++)	{
	System.out.println(" ");
	}
	}
	System.out.println();

	}
}
