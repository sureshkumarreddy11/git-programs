package com.multithreading;
class Myrunnable implements Runnable {

	@Override
	public void run() {
	for(int i=1;i<=5;i++) {
	System.out.println(i);
	}
		
	}
	
}
public class ThreadclassImplements {

	public static void main(String[] args) {
	Myrunnable m=new Myrunnable();
	Thread t1=new Thread(m);
	t1.run();
	System.out.println("main");
	}

}
