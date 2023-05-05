import java.util.EmptyStackException;

public class ArrayList {
private Object []a=new Object[5];
private int p=0;
public void add(Object e) {
if(p>=a.length)increase();
a[p++]=e;
}
public int size() {
return p;
}
public void increase() {
Object temp[]=new Object[a.length+3];
for(int i=0;i<size();i++) {
temp[i]=a[i];
}
a=temp;
}
public boolean isEmpty() {
return size()==0;
}
public Object pop() {
if(isEmpty()) {
throw new EmptyStackException();
}
Object e=a[--p];
a[p]=null;
return e;

}
public Object peek() {
if(isEmpty()) {
	throw new EmptyStackException();
}
return a[p-1];
}


}
