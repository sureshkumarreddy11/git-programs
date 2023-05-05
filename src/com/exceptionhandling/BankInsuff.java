package com.exceptionhandling;

public class BankInsuff {

	public static void main(String[] args) {
	int amount=5000;
	Accouninsuff a=new Accouninsuff(10000);
	try {
		a.withdrawl(5000);
		System.out.println("withdrwalDone" +amount);
		System.out.println("current balance" +a.getBalance());
	
	} catch (InsufficientException e) {
		System.out.println(e.getMessage());

	}

}
}
