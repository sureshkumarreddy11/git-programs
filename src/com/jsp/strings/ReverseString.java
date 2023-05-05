package com.jsp.strings;

public class ReverseString {

	public static void main(String[] args) {
	System.out.println(rev("mom"));

	}
	static String rev(String s) {
		char [] a=s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j) {
		char t=a[i];
		a[i]=a[j];
		a[j]=t;
		i++;
		j--;
			
		}
		return new String(a);
		}
		}


