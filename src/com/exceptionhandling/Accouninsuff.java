package com.exceptionhandling;

public class Accouninsuff {
private int balance;

public int getBalance() {
	return balance;
}

public Accouninsuff(int balance) {
	this.balance = balance;
}
public void withdrawl(int amount) throws InsufficientException {
	if(balance<amount) {
throw new InsufficientException("InsufficientException");
	}
balance-=amount;


	

	}

}
