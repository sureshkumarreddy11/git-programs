package Recurssion.com;
class AB{
public static void main(int i) {
System.out.println(i);
if(i==3)
return;
	main(++i);
	main(i+1);
//System.out.println("m1 ends");
//System.out.println("m1 ends");
}

}

public class M1 {

	public static void main(String[] args) {
	AB ab=new AB();
	ab.main(1);


	}

}
