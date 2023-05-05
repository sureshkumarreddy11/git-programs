package Recurssion.com;
class D{
static int fact(int n) {
	if(n==1)return 1;
	int x =n*fact(n-1);
	return x;
	}
	

}

public class Facrorial {

	public static void main(String[] args) {
	D d1=new D();
	int res=d1.fact(5);
	System.out.println(res);

	}

}
