package com.jsp.linkedList;

public class SingleLinkedList {
private Node first=null;
private int count=0;
private Exception IndexOutOfBoundsException;
public void add(Object e) {
if(first==null) {
first=new Node(e,null);
count++;
return;

}
Node curr=first;
while(curr!=null){
curr=curr.next;
	
}
curr.next=new Node(e,null);
count++;
}
public int size() {
	return count;
}
public Object get(int index) throws Exception {
if(index<=-1||index>size()) {
	throw IndexOutOfBoundsException;
}
Node curr=first;
for(int i=0;i<=index;i++) {
curr=curr.next;
	
}
return curr.ele;


}
public void add(int index,Object e) throws Exception {
		if(index<=-1||index>size()) {
			throw IndexOutOfBoundsException;	
		}
		if(index==0) {
		first=new Node(e,first);
		count++;
		return;
		}
		Node curr=first;
		for(int i=0;i<index;i++) {
		curr=curr.next;
			
		}
		curr.next=new Node(e,curr.next);
		count++;

	}
}
