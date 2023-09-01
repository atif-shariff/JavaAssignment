package com.shristi.inherdemos;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Amount for withdraw");
		} else if (amount > balance) {
			balance -= amount;
			double Interest = amount * 0.09;
			balance -= Interest;
			System.out.println("Withdrawn Succesful");
			System.out.println("You have been charged for over withdrawal of amount: " + Interest);
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
