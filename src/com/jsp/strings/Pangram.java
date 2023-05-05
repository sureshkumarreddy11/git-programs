package com.jsp.strings;

public class Pangram {

	public static void main(String[] args) {
	String s=	"the quick brown fox jumps over a lazy dog";
	System.out.println(pangram(s.toLowerCase()));
	}
	static  boolean pangram(String s) {
	if(s.length()<26)return false;
	else 
	for(char c='a';c<='z';c++) {
	if(s.indexOf(c)<0) {
		return false;
		
	}
	}
	  
		
		return true;
	}
}
	

