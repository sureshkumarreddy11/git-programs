package com.jsp.iterator;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	Iterator i=a.iterator();
	while(i.hasNext()) {
	System.out.println(i.next());
	}
	System.out.println("_________");
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	ListIterator i1=a1.listIterator();
	while(i1.hasPrevious()) {
		System.out.println(i1.previous());
		}
	

	}

}
