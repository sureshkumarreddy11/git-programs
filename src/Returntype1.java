class Yellow{
int sum(int a,int b){
	int sum=a+b;
	return sum;
}
int square(int a) {
	int square=a*a;
	return square;
}
}
public class Returntype1 {
public static void main(String[] args) {
Yellow y=new Yellow();
int res=y.sum(10,20 );
System.out.println(res);
int res1=y.square(10);
System.out.println(res1);
}
	
}
	


	


