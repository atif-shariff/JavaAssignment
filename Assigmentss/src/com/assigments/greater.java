package com.assigments;

import java.util.Scanner;

public class greater {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int[] arr = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.print("Enter the Array Elements " + (i + 1) + ":");
			arr[i] = in.nextInt();
		}

		int greater = 0;

		for (int i : arr) {
			if (i > greater) {
				greater = i;
			}
		}

		System.out.print("Greatest Element in a Array: " + greater);
		
		
		in.close();
	}

}
