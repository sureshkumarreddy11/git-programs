import java.util.Scanner;

public class LargestPrime {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	for(int i=n;i>=m;i--) {
	if(i<=1)continue;
	boolean flag=true;
	for(int j=2;j<=i/2;j++) {
	if(i%j==0) {
	flag=false;
	break;
	}
	}
	if(flag) {
	System.out.println(i);
	break;
	}
	}	
	}

	}

