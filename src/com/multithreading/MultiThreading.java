package com.multithreading;
class Demo extends Thread{
@Override
public void run() {
System.out.println("Run");
for(int i=1;i<=10;i++) {
System.out.println(i);
}
}
}
public class MultiThreading {

	public static void main(String[] args) {
	Demo t1=new Demo();
	t1.start();
	for(int i=1;i<=5;i++) {
	System.out.println(i);	
	}
	}
}

