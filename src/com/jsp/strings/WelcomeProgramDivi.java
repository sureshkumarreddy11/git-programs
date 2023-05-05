package com.jsp.strings;

public class WelcomeProgramDivi {

	public static void main(String[] args) {
	String s1="welcome";
	for(int i=0;i<=s1.length();i++) {
	int j=i+3;
	if(j<=s1.length()) {
	System.out.println(s1.substring(i,j));
	
	}

	}

}
}