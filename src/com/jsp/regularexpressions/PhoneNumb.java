package com.jsp.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumb {

	public static void main(String[] args) {
	Pattern p=Pattern.compile("([a-z])([a-z])\\2");
	Matcher m=p.matcher("aabbccddffdd");
	while(m.find()) {
	System.out.println(m.group());
	}
	}

}
