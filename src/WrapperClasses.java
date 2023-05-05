
public class WrapperClasses {

	public static void main(String[] args) {
	int i=89;
	Integer  i1=new Integer(i);//or Integer.valueOf(i);//(boxing 1.1 to 1.4)
	Integer i2=i;//autoboxing//
	System.out.println(i1);
	int d=i1.intValue();//unboxing;//1.5version
	int d1=i1;//auto-unboxing

	}

}
