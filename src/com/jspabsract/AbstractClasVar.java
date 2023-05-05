package com.jspabsract;
abstract class Variables{
	abstract void run();
	final int a=10;
	static int b=20;
	
	
}
class Var extends Variables{
void run() {
	System.out.println(a);
	System.out.println(b);
}
	
}

public interface AbstractClasVar {
public static void main(String[] args) {
Var v=new Var();
v.run();
}	

}
