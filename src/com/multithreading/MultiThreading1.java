package com.multithreading;
class Demo1 extends Thread{
@Override
public void run() {
System.out.println("Run");
for(int i=1;i<=10;i++) {
System.out.println(i);
}
}
}

public class MultiThreading1 {

	public static void main(String[] args) {
		Demo1 t1=new Demo1();
		t1.run();
		for(int i=1;i<=5;i++) {
		System.out.println(i);	
		}
		}

	}


