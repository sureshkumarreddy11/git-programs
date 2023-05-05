package com.jspabsract;

abstract class Bank{
abstract int getRateOfInterest();
}
class Bob extends Bank{
int getRateOfInterest(){
return 5;
}
}
class Sbi extends Bank{
int getRateOfInterest(){
return 7;
}
}
class Hdfc extends Bank{
int getRateOfInterest() {
return 10;
}
}


public class BankInte {

	public static void main(String[] args) {
	Bank b;
	b=new Sbi();
	System.out.println("Rate of interset "+b.getRateOfInterest());
	b=new Hdfc();
	System.out.println("Rate of interset "+b.getRateOfInterest());
	
}
}
