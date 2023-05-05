package com.jsp.strings;

public class CharArayASma {

	public static void main(String[] args) {
	String s1="welcome";
	char arr[]=s1.toCharArray();
	int i=0;
	int size=arr.length;
	while(i!=size) {
	arr[i]=(char)(arr[i]-32);
	i++;
	}
	System.out.println(s1);
	System.out.println(arr);
	}

}
