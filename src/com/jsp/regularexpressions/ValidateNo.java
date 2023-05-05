package com.jsp.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String phn=sc.next();
	String regex="[6-9][0-9]{9}";

	Pattern p=Pattern.compile("regex");
	Matcher m=p.matcher(phn);
	System.out.println(m.matches());

	}

}
