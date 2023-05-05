
public class ExamStriBuf {

	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("welcome");
	StringBuilder sb1=new StringBuilder("welcome");
	System.out.println(sb.append("java"));
	System.out.println(sb.insert(4,"robo" ));
	System.out.println(sb.replace(4, 7, "sana"));
	System.out.println(sb.delete(4, 7));
	System.out.println(sb.length());
	System.out.println(sb.reverse());
	System.out.println(sb.charAt(4));
	System.out.println(sb.substring(7));
	System.out.println(sb1.append("java"));
	System.out.println(sb1.reverse());
	
	
	}
}

