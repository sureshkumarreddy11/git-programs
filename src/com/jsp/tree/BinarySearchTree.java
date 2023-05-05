package com.jsp.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
private Node root=null;
private int count=0;
boolean flag=false;
public boolean add(int k) {
root=addNode(root,k);
return flag;
}
public Node addNode(Node n,int k) {
if(n==null) {
n=new Node(k);
flag=true;
count++;
return n;

}
if(k<n.key) {
n.left=addNode(n.left,k);
}
if(k>n.key) {
n.right=addNode(n.right,k);
}
else {
	flag=false;
}
return n ;

}
public void levelOrder() {
Queue<Node> q=new LinkedList<Node>();
if(root!=null)q.add(root);
while(!q.isEmpty()) {
Node n=q.poll();
System.out.println(n.key+" ");
if(n.left!=null)q.add(n.left);
if(n.right!=null)q.add(n.right);
}


}
}



