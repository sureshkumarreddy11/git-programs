package com.jsp.arrays;

public class A {
public static void main(String[] args) {
int a[]= {10,20,30,40,50};
/*int sum=0;
for(int i=0;i<a.length;i++) {
sum=sum+a[i];
}
System.out.println(sum);
}
}*/
int sum=0;
for(int n:a)	{
sum+=n;

}
System.out.println(sum);
	}
}
