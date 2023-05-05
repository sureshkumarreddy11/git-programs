package com.jsp.collection;
import java.util.*;
public class Queue {

	public static void main(String[] args) {
	PriorityQueue q=new PriorityQueue();
	q.add(40);
	q.add(10);
	q.add(30);
	q.add(20);
	System.out.println(q);
	while(!q.isEmpty()) {
	System.out.println(q.poll());
	
		
	}

	}

}
