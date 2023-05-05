
public class Revrse {

	public static void main(String[] args) {
	String s1="Java";
	int i=0,j=s1.length()-1;
	while(i<j) {
	char [] a=s1.toCharArray();
	char temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	i++;
	j--;
	
	}
	System.out.println(s1);
	}

}
