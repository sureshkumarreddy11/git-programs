package com.jspabsract;

interface A{  
void a();  
void b();  
void c();  
void d();  
}  
  
abstract class B implements A{  
public void c(){System.out.println("I am c");}  
}  
  
class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
public class CanHaveProvideInterface {

	public static void main(String[] args) {
	A a1=new M();
	a1.a();
	a1.b();
	a1.d();
	a1.b();

	}

}
