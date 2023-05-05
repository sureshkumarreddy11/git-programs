package com.jsp.collection;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(100);
	a1.add(200);
	a1.add(300);
	a1.add(400);
	System.out.println(a1);
	//a1.remove(100);
	Object o=new Integer(100);
	a1.remove(o);
	System.out.println(a1);
	

	}

}
