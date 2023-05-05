package com.jsp.practice;

public class REverseString {

	public static void main(String[] args) {
	/*String s1="java is easy";
	String s="";
	char[] arr=s1.toCharArray();
	for(int i=arr.length-1;i>=0;i--) {
	s+=s1.charAt(i);
	}
System.out.println(s);*/
	System.out.println(rev("mom"));
		}
	static boolean rev(String s) {
	char[] ch=s.toCharArray();
	int i=0,j=ch.length-1;
	while(i<j) {
	if(ch[i]!=ch[j])return false;
	i++;
	j--;
	
	
	}
	return true;

}
}
