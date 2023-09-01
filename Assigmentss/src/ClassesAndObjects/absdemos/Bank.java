package com.shristi.absdemos;

public abstract class Bank {
	double balance;

	public void Account(double balance) {
		this.balance = balance;
	}

	abstract void withdraw(double amount);

	abstract void deposite(double amount) ;

	double getbalance() {
		return balance;
	}

}

