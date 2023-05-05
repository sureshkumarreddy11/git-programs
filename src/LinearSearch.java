
public class LinearSearch {
public static void main(String[] args) {
int a[]= {1,2,3,4,7,0};
System.out.println(sort(a,10,0,a.length-1));	
}
public static int sort(int a[],int ele,int start,int end) {

if(start<=end)return-1; {
int mid=(start+end)/2;
if(ele==a[mid])return mid;
else if(ele<a[mid]) {
return sort(a,ele,start,mid-1);
}



}
return-1;
}
}
