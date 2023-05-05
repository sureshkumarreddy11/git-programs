import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Queue {
public static void main(String[] args) {
int a[]= {1,2,2,4,5,5,3,3};
/*for(int i=0;i<a.length-1;i++) {
for(int j=i+1;j<a.length;j++) {
if(a[i]==a[j]&&(i!=j)) {
System.out.println(a[j]+"");
}*/
Set s=new HashSet();
for(int n:a) {
if(s.add(n)==false) {
System.out.println(n);
}
}
}
}