package com.jsp.strings;

public class StringOccurance {

	public static void main(String[] args) {
	String s="Suresh";
	while(s.length()>0) {
	char ch=s.charAt(0);
	String s1=s.replace("s","");
	int count=s.length()-s1.length();
	System.out.println(count);
	
	
	
	}
	
	}

	}


