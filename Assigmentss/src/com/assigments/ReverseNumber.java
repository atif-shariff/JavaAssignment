package com.assigments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = in.nextInt();
        in.close();

        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}






