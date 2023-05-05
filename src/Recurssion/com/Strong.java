package Recurssion.com;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter A number");
int n=sc.nextInt();
if(checkStrong(n)==n) {
	System.out.println("Strong");
	}else {
	System.out.println("Not Strong");
	}
}
	
public static int Fact(int n) {
if(n==0)return 1;
return n*Fact(n-1);
}
static int checkStrong(int n) {
int fact=1,sum=0;
int rem=n%10;
checkStrong(n/10);
fact=Fact(rem);
sum+=fact;
return sum;

}
}



