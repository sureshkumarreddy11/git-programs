package com.jsp.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pasw=sc.next();
		String regex="(?=.*[@,$,&,#])(?=.*[0-9])(?=.*[A-Z]).{5,10}";

		Pattern p=Pattern.compile("regex");
		Matcher m=p.matcher(pasw);
		System.out.println(m.matches());


	}

}
