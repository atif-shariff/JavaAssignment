package com.assigments;

import java.util.Scanner;

public class PrimeNumber {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }

	 public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false; 
	        }
	        if (number <= 3) {
	            return true;
	        }
	        if (number % 2 == 0 || number % 3 == 0) {
	            return false;
	        }

	        return true;
	    }
	}
