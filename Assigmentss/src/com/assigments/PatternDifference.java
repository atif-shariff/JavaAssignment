package com.assigments;

public class PatternDifference {
	public static void main(String[] args) {
        int rows = 4;

        int currentNumber = 1; // Initialize the current number

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }
}