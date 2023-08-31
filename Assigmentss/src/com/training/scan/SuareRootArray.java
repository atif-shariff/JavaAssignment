package com.training.scan;

import java.util.Arrays;
import java.util.Scanner;

public class SuareRootArray {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] marks = new int[4];
        int[] squareMarks = new int[4];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the array element " + i + ": ");
            marks[i] = in.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            squareMarks[i] = marks[i] * marks[i];
        }

        System.out.println("Squared array: " + Arrays.toString(squareMarks));

        in.close();
    }
}
