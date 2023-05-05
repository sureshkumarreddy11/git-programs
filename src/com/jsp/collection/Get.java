package com.jsp.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Get {

	public static void main(String[] args) {
	ArrayList a2=new ArrayList();
	a2.add(10);
	a2.add(30);
	a2.add(20);
	a2.add(40);
	//a2.set(0, 11);
	//System.out.println(a2);
	//System.out.println(a2.get(3));
	Collections.sort(a2);
	System.out.println(a2);
	
	}

}
