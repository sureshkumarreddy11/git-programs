package com.jsp.strings;

public class ReverseStringAn {

	public static void main(String[] args) {
	System.out.println(rev("amma"));

	}
	public static String rev(String s) {
	String s1="";
	for(int i=s.length()-1;i>=0;i--) {
	s1=s1+s.charAt(i);
	}
return s1;
	
	}

}
