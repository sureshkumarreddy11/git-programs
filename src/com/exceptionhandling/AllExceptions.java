package com.exceptionhandling;

public class AllExceptions {

	public static void main(String[] args) {
	int a[]= {10,20,30,40};
	//int a=10;
	//int b=0;

try {
	System.out.println(a[10]);
	}
		//catch(ArrayIndexOutOfBoundsException e){
		//	System.out.println(e.getMessage());
		//	System.out.println("Array block");
catch(Exception e) {
	System.out.println("Array");
}
			
	
//catch(ArithmeticException e){
	//System.out.println(e.getMessage());
	//System.out.println("Arithemetic block");
	//}
finally {
	System.out.println("Finally Block");
}

	}	

}
