package com.shristi.inherdemos;

import java.util.Scanner;

public class ATMMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance =1000;
		
		System.out.println("Select account type");
		System.out.println("1 Savings");
		System.out.println("2 Current");
		int type = scanner.nextInt();
		
		if(type==2) {
			
			Account account = new Current(balance);
			
			System.out.println("Choose operation");
			System.out.println("1 Withdraw");
			System.out.println("2 Deposit");
			System.out.println("3 Balance");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the withdrawl amount");
				int amount = scanner.nextInt();
				account.withdraw(amount);
				break;	
			
			case 2:
				System.out.println("Enter the Deposite amount");
				int amount2 = scanner.nextInt();
				account.deposite(amount2);
				break;
			case 3:
				System.out.println("Balance: "+account.getbalance());
				
			
			}
		}
		
		
		else if(type==1) {
			
			Account account = new Savings(balance);
			
			System.out.println("Choose operation");
			System.out.println("1 Withdraw");
			System.out.println("2 Deposit");
			System.out.println("3 Balance");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the withdrawl amount");
				int amount = scanner.nextInt();
				account.withdraw(amount);
				break;	
			
			case 2:
				System.out.println("Enter the Deposite amount");
				int amount2 = scanner.nextInt();
				account.deposite(amount2);
				break;
			case 3:
				System.out.println("Balance: "+account.getbalance());
			
			}
		}else {
			System.out.println("Select a Valid Type");
		}
		
		scanner.close();
	}

}
