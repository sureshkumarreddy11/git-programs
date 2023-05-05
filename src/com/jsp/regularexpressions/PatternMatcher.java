package com.jsp.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {

	Pattern p=Pattern.compile("[a*]");
	Matcher m=p.matcher("abaaaaaaa");
	int count=0;
	while(m.find()) {
		count++;
		System.out.println(m.start()+"....."+m.end()+"...."+m.group());
	}
	System.out.println("No of occurences"+count);
}

}
