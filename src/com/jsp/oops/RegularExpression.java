package com.jsp.oops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
	Pattern p=Pattern.compile("a");
	Matcher m=p.matcher("abczaba");
	//int count=0;
	while(m.find()) {
		//count++;
		System.out.println(m.start());
		System.out.println(m.end());
		System.out.println(m.group());
	}
}}