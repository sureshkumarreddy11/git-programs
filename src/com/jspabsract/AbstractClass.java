package com.jspabsract;
abstract class Bike{
abstract void run();
void run1() {
System.out.println("non abstract method");
	
}

}
class Honda extends Bike{
void run() {
	System.out.println("Runing safety");
}
void run1() {
System.out.println("Non abstract method implementation");
}	
}

public class AbstractClass {

	public static void main(String[] args) {
	Bike ob=new Honda();
	ob.run();
	ob.run1();

	}

}
