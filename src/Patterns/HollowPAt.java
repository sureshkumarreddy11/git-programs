package Patterns;

public class HollowPAt {

	public static void main(String[] args) {
	for(int i=1;i<=10;i++)
	{
	for(int j=1;i<=10-i;i++)
	{
		System.out.print("");	
		}
for(int k=1;k<=2*i-1;k++) {
if(k==1||k==2*i-1||k==10) {
System.out.print("*");}
else {
	System.out.print("");
	
}
	System.out.println();
}
}
		
	}
	}

