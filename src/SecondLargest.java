
public class SecondLargest {

	public static void main(String[] args) {
	int a[]= {5,8,2,7,1,9,4};
	int s1=a[0];
	int s2=a[0];
	for(int i=0;i<a.length;i++) {
	if(a[i]>s1) {
	s2=s1;
	s1=a[i];
	
	}else if(a[i]>s2||s1==s2) {
	s2=a[i];
	}
	}
	System.out.println(s2);
	
	}

	}


