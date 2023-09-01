package com.shristi.absdemos;

public class Savings extends Bank {

	public Savings(double balance) {
		super();
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Amount for withdraw");
		} else if (amount > balance) {
			System.out.println("Insufficient balance");
		} else {
			balance -= amount;
			System.out.println("Withdrawn Succesful");
		}
	}

	void deposite(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Ammount for deposite");
		} else {
			balance += amount;
			System.out.println("Amount Deposited");

		}

	}

}
