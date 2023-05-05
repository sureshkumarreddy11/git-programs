package com.jsp.strings;

public class CountSymNumSp {

	public static void main(String[] args) {
	String s="katapa@13";
	int alphabet=0;
	int number=0;
	int symbol=0;
	for(int i=0;i<=s.length();i++) {
	char ch=s.charAt(i);
	if(ch>='A'&& ch<='Z'||ch>='a'&& ch<='z') {
		alphabet++;
	}
	else if(ch>='0'&& ch<='9') {
		number++;
	}
	else {
		symbol++;
	
	}
	System.out.println(alphabet);
	System.out.println(symbol);
	System.out.println(number);

	}

	}
}