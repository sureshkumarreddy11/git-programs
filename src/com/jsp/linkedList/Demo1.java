package com.jsp.linkedList;

import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(0, 60);
	l.add(0, 80);
	
	System.out.println(l);
	for(int i=0;i<l.size();i++) {
	l.get(i);
	}

	}

}
