package com.jsp.strings;

public class SpaceCapi {

	public static void main(String[] args) {
	String s1="Welcome TO Java";
	char c[]=s1.toCharArray();
	int i=0;
	c[0]=(char)(c[0]-32);
	int size=s1.length();
	i=1;
	while(i!=size) {
	if(c[i]!=' ') {
	c[i+1]=(char)(c[i+1]+32);
	
	}
	i++;
	}
System.out.println(s1);
System.out.println(c);
	}
}


