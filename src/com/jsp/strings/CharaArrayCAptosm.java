package com.jsp.strings;

public class CharaArrayCAptosm {

	public static void main(String[] args) {
	String s1="WELCOME";
	char a[]=s1.toCharArray();
	int size=a.length;
	int i=0;
	while(i!=size) {
	a[i]=(char)(a[i]+32);
	i++;
	}
	System.out.println(s1);	
	System.out.println(a);
	}

	
}
