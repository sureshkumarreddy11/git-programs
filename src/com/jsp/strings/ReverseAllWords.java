package com.jsp.strings;

public class ReverseAllWords {

	public static void main(String[] args) {
	String s="Java is easy language";
	String res="";
	char a[]=s.toCharArray();
	int i=a.length-1,j=a.length-1;
	while(i>=0) {
	while(i>=0&&a[i]!=' ') i--;
	int k =i+1;
	String temp="";
	while(k<=j) {
	temp=temp+a[k];
	k++;
	}
	res+=temp;
	if(i>=0)res+=" ";
		i--;
	j=i;

	
	}
System.out.println(res);
	}

}
