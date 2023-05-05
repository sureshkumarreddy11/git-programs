package com.jsp.strings;

public class Countnoofalphab {

	public static void main(String[] args) {
	String s1="aabbcccddd";
	String s2="";
	char a[]=s1.toCharArray();
	int i=0,count;
	char c;
	while(i<a.length) {
	
	c=a[i];
	count=1;
	while(i<a.length-1&& a[i+1]==c) {
		count++;
		i++;
		
	}
	s2=s2+count+c;	
	i++;
	}
	
System.out.println(s2);
	}

}
