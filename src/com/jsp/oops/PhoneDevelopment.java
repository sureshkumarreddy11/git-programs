package com.jsp.oops;
import java.util.Scanner;
class Jio{
	String simName;
	public Jio(String simName) {
		this.simName = simName;
	}
	public void callingjio() {
		System.out.println("Call throgh "+simName+" and also use internet");
		}
	}
class Airtel{
		String simName;

		public Airtel(String simName) {
			this.simName = simName;
		}
		public void callingairtel() {
			System.out.println("Call throgh "+simName+" but not use internet");
			}
		
}
class Battery{
	String batteryName;

	public Battery(String batteryName) 
	{
		this.batteryName = batteryName;
	}
}
class Phone{
String phName;
Jio j1;
Airtel a1;
Battery b1;


public Phone(String phName,Battery b1) {
	
	this.phName = phName;
	this.b1 = b1;
}


public void call() {
Scanner sc=new Scanner(System.in);
System.out.println("1.Jio\n2.Airtel\n");
int selectSim=sc.nextInt();
switch(selectSim) {
case 1:Jio j1=new Jio("Jio");
j1.callingjio();
break;
case 2:Airtel a1=new Airtel("Airtel");
a1.callingairtel();


}


}
}

public class PhoneDevelopment {

	public static void main(String[] args) {
	Phone p=new Phone("Redmi",new Battery("Lion)"));
	p.call();


	}
}

