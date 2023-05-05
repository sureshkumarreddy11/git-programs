package Recurssion.com;

public class Arm {

	public static void main(String[] args) {
	System.out.println(Arm(153));

	}
static int Arm(int n) {
if(n==0)return 0;
return (n%10)*(n%10)*(n%10)+Arm(n/10);

}
}
