import java.util.*;

public class ArrayEleDu {
	public static void main(String[] args) {
		/*int a[]= {10,20,30,40,20,40,50};
for(int i=0;i<a.length-1;i++) {
	for(int j=i+1;j<a.length;j++) {
	if(a[i]==a[j]&& (i!=j)) {
	System.out.println(a[j]+" ");
Set s=new HashSet();
for(int n:a) {
if(s.add(n)==false) {
System.out.println(n);
}*/
	String s="success";
	String temp="";
	for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(!temp.contains(c+"")) {
	temp+=c;
	
	}
	}
	System.out.println(temp);

	}
}

