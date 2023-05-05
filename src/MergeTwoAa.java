import java.util.Scanner;

public class MergeTwoAa {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int count=0;
for(int i=2;i<=a;i++) {
for(int j=1;j<i;j++) {
if(i%j==0) {
count++;
}
else if(count==2) {
	System.out.println(i);
}
	}
}
}}
