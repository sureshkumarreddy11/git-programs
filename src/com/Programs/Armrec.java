package com.Programs;
class A{
	int Arm(int num) {
	int s=0;
	s+=num%10*num%10*num%10+Arm(num/10);
	return s;
	}
}

public class Armrec {

	public static void main(String[] args) {
	A a1=new A();
	a1.Arm(153);
	System.out.println(a1);


	}

}
