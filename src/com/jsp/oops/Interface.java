package com.jsp.oops;
interface Laptop{
public void copy();
public void paste();
public void cut();
}
class N implements Laptop{
public void copy() {
System.out.println("Copy code");
	
}
public void paste() {
	System.out.println("Paste Code");	
}
public void cut() 

{
	System.out.println("Cut Code");
}



}

public class Interface {

	public static void main(String[] args) {
	Laptop lp=new N();
	lp.cut();
	lp.copy();
	lp.paste();
	
	}

}
