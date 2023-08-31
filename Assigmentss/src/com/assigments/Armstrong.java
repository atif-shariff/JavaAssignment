package com.assigments;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int number = in.nextInt();
		in.close();
		
		if (isArmsStrongNumber(number)) {
			System.out.println(number + " is a Armstrong number");
		} else {
			System.out.println(number + " is a not Armstrong number");
		}

	}
	

	private static boolean isArmsStrongNumber(int number) {
		int originalnumber = number;
		int numberofDigits = countDigit(number);
		int sum = 0;

		while (number != 0) {
			int digit = number % 10;
			sum += Math.pow(digit, numberofDigits);
			number /= 10;
		}
		return sum == originalnumber;
	}

	private static int countDigit(int number) {
		int count = 0;
		while (number != 0) {
			number /= 10;
			count++;
		}
		return count;
	}
	

}
