package com.multithreading;
class Mythread1 extends Thread{
/*public void run() {
for(int i=1;i<=3;i++) {
System.out.println("ChildThread");
}
}*/

}
public class Threadclass {

	public static void main(String[] args) {
	Mythread1 m= new Mythread1();
	m.start();
	for(int i=1;i<=3;i++) {
		System.out.println("Main method");
		}

	}

}
