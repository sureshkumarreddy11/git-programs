
public class TestWrapper {
	public static void calc(int num) {
		num=num*5;
		System.out.println("Num:"+num);
	
	}

	public static void main(String[] args) {
	
		int num=10;
	
		System.out.println("Num:"+num);

		calc(num);
		System.out.println("Num:"+num);

	}

}
