package com.jsp.practice;

public class Demo {
public static void sort(int a[]) {
if(a.length==1)return;
int [] left=new int [a.length/2];
int [] right=new int [a.length-left.length];
for(int i=0;i<=a.length;i++) {
	left[i]=a[i];
}
for(int j=0;j<=a.length;j++) {
	right[j]=a[j+a.length];
}
sort(left);
sort(right);
merge(left,right,a);


}
private static void merge(int a[],int b[],int c[]) {
int i=0,j=0,k=0;
while(i<a.length&&j<a.length) {
if(a[i]<a[j]) {
c[k++]=a[i++];
}
else {
c[k++]=a[j++];
}
while(i<a.length) {
c[k++]=a[i++];
}
while(j<a.length) {
c[k++]=b[j++];
}
}

	
}
}
