package Recurssion.com;
class C{
public static void printNum(int i,int n,int sum) {
if(i==n) {
sum=sum+i;
System.out.println(sum);
return;
}	
sum=sum+i;
printNum(i+1,n,sum);
System.out.println(i);
	
}
}
public class SumOfNAt {

	public static void main(String[] args) {
	C c1=new C();
	c1.printNum(1, 5, 0);

	}

}
