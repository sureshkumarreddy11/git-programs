
public class WrapperClasses1 {

	public static void main(String[] args) {
int a=10;//initializing primitive type
Integer obj=new Integer(100);//initializing non primitive type
System.out.println(a);
System.out.println(obj);
int b=15;
Integer obj1=new Integer(b);//converting primitive type to non primitive type
System.out.println(b);//auto boxing
Integer obj2=new Integer(150);
int b2=obj2;//auto unboxing
System.out.println(b2);
String name="Suresh";
System.out.println(name);
String name1=new String("Suresh");
System.out.println(name1);
int a3=100;
Integer i1=new Integer(a3);
System.out.println(i1);

	}

}
