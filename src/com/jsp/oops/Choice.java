package com.jsp.oops;

import java.util.Scanner;

class Dem{
public void  add(int a,int b) {
	int c=a+b;
	System.out.println(c);

}
public void sub(int a,int b) {
int c=a-b;
System.out.println(c);

}
public void div(int a,int b) {
	int c=a%b;
	System.out.println(c);


}
public void mul(int a,int b) {

	int c=a*b;
	System.out.println(c);
}


	
}

public class Choice {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1.add\n2.sub\n3.mul\n4.div");
	System.out.println("Enter Your Choice");
	int ch=sc.nextInt();
	Dem d1=new Dem();
	switch(ch) {
	case 1:
	d1.add(10, 20);
	break;
	case 2:
	d1.sub(10, 20);
	break;
	case 3:
	d1.mul(10, 20);
	break;
	case 4:
	d1.div(10, 20);
	break;
	
	
	}

}
}
