package com.jsp.oops;
class De{
int i;
public De(int i) {
	this.i=i;

}
public boolean eqauls(Object obj)
		
{
De a=(De)obj;// FirstDown Casting
return this.i==a.i;
//boolean b=this.i==a.i;//Compare
//return b;


}

}
class De1{

}

public class TestEquals {

	public static void main(String[] args) {
		De a1=new De(10);
		De a2=new De(10);
		System.out.println(a1==a2);// check address
		System.out.println(a1.equals(a2));// check address
		De1 d=new De1();
		System.out.println(a1.equals(d));
		
	
		}

}
