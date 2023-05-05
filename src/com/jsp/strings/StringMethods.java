package com.jsp.strings;

public class StringMethods {

	public static void main(String[] args) {
	String s1=new String("Java");
	System.out.println(s1.length());
	System.out.println(s1.charAt(2));
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.startsWith("Ja"));
	System.out.println(s1.endsWith("va"));
	System.out.println(s1.equals("Java"));
	System.out.println(s1.equalsIgnoreCase("java"));
	

	}

}
