interface Inter{
public static final int a=15;
public abstract void m1();	
}
interface Inter2 extends Inter{
public static final int b=10;
public abstract void m2();	
}
class Inter3 implements Inter,Inter2{
public void m1() {
System.out.println("interface");	
}
public void m2() {
System.out.println("interface 1");	
}
}

public class Interface {

	public static void main(String[] args) {
	Inter3 in=new Inter3();
	in.m1();
	in.m2();
	System.out.println(in.a);
	System.out.println(in.b);
	

	}

}
