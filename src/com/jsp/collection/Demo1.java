package com.jsp.collection;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	System.out.println(a);
	ArrayList a1=new ArrayList();
	a1.add(30);
	a1.add(40);

	System.out.println(a.removeAll(a1));
	System.out.println(a.addAll(a1));
	
	



	}

}
