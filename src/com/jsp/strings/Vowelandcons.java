package com.jsp.strings;

public class Vowelandcons {

	public static void main(String[] args) {
	String s="Brahmanandham";
	String v="aeiouAEIOU";
	int vowel=0,cons=0;
	for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	if(v.contains(ch+""))
		vowel++;
	else 
		cons++;
		
	}
	System.out.println("vowel count " +vowel);
	System.out.println("cons count " +cons);

	}

}
