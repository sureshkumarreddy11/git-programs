interface Iter1{
static int a=10;
final int b=20;
void m1();
void m2();
}
class Be implements Iter1{
@Override
public void m1() {
System.out.println("B class");
	
}

@Override
public void m2() {
System.out.println("B class");
	
}

}
class Test{
	public static void main(String[] args) {
	Iter1 i1=new Be();
	System.out.println(i1.a);
	System.out.println(i1.b);
	i1.m1();
	i1.m2();
	}
}