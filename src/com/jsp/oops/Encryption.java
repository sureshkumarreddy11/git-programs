package com.jsp.oops;

public class Encryption {

	public static void main(String[] args) {
	String s="java";

	int n=2;
	System.out.println(encrypt(s,n));

	}
	static String encrypt(String s,int n) {
	char a[]=new char[26];
	char ch='a';
	for(int i=0;i<26;i++){
		a[i]=ch;
		ch++;
	
	}
	String s1="";
	for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	int index=c-'a';
	index+=n;
	s1+=a[index%26];
	
	}
		return s1;
	}

}
