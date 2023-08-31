package com.assigments;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = in.nextInt();

		int fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.printf("Factorial of " + number + ":" + fact);

		in.close();
	}

}
