import java.util.Stack;

public class Balance {

	public static void main(String[] args) {
	System.out.println(isbalance("[({})]"));

	}
	 static boolean isbalance(String s) {
	Stack<Character>stack=new Stack<Character>();
	for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(c=='['||c=='{'|c=='(') {
	stack.push(c);
		
	}
	else if(c==']'||c=='}'|c==')') {
	if(stack.isEmpty()||!pair(stack.pop(),c))
	return false;
	
	}
	}
	return stack.isEmpty();
	}
	
	public static boolean pair(char c1,char c2) {
	if(c1=='['&&c2==']')return true;
	if(c1=='{'&&c2=='}') return true;
	if(c1=='('&& c2==')') return true;
	return false;
			
	
	
	}

}
