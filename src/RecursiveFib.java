    
 class G{
	  static int n1=0,n2=1,n3=0;      
	     static void printFibo(int num){      
	        if(num>0){      
	             n3 = n1 + n2;      
	             n1 = n2;      
	             n2 = n3;      
	             System.out.print(" "+n3);     
	             printFibo(num-1);      
	         }      
	     } 
	 
     
public class RecursiveFib {

	public static void main(String[] args) {
	G a=new G();
	a.printFibo(50);
	}

}
}
