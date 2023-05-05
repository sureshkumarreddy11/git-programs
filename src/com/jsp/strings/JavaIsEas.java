package com.jsp.strings;

public class JavaIsEas {

	public static void main(String[] args) {
	String s1="java is easy";
	String[] arr=s1.split(" ");
	String temp="";
	for(int i=0;i<=s1.length();i++) {
		
	temp+=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase()+" ";
		}
	System.out.println(temp.trim());
	}

	}


