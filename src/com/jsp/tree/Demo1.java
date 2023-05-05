package com.jsp.tree;

import com.jsp.arrays.BinarySearch;

public class Demo1 {

	public static void main(String[] args) {
	BinarySearchTree b=new BinarySearchTree();
	
	System.out.println(b.add(50));
	System.out.println(b.add(20));
	System.out.println(b.add(10));
	System.out.println(b.add(30));
	System.out.println(b.add(60));
	System.out.println(b.add(90));
	b.levelOrder();
	
	
	

	}


}
