package com.jsp.oops;
class Act{
String name;

@Override
public String toString() {
	return "Act [name=" + name + "]";
}

public Act(String name) {
	super();
	this.name = name;
}
	
}

public class Com {

	public static void main(String[] args) {
	Act a=new Act("Suresh");
	System.out.println(a);


	}

}
