package com.jsp.regularexpressions;

public class NumberPAttern {

	public static void main(String[] args) {
int n=353,sum=0;

for(int i=1;i<=n;i++) {
n=i;
while(n>0) {
int rem=n%10;
int c=rem*rem*rem;
sum+=c;
n/=10;
}
if(n==i) {
	System.out.println(i);
	}
}



	}

}
