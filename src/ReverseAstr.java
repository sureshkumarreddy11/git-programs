import java.util.Scanner;

public class ReverseAstr {

public static void main(String[] args) {
int a[]= {10,20,30,5,60};
int small=a[0],large=a[0];
for(int i=0;i<a.length;i++) {
if(small>a[i]) {
small=a[i];
}else if(large<a[i]) {
large=a[i];
}
}
System.out.println(a.toString());
System.out.println(small);
System.out.println(large);
}
}