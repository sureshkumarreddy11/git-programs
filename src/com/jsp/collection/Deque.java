package com.jsp.collection;

import java.util.ArrayDeque;

public class Deque {

	public static void main(String[] args) {
	ArrayDeque d1=new ArrayDeque();
	d1.addFirst(10);
	d1.addLast(20);
	d1.addFirst(30);
	d1.addLast(40);
	System.out.println(d1);
	System.out.println(d1.pollFirst());
	System.out.println(d1.pollLast());
	
	

	}

}
