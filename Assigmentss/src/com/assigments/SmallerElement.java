package com.assigments;

import java.util.Scanner;

public class SmallerElement {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);

		int[] arr = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.print("Enter the Array Elements " + (i + 1) + ":");
			arr[i] = in.nextInt();
		}

		int smaller = arr[0];

		for (int i : arr) {
			if (smaller > i) {
				smaller = i;
			}
		}

		System.out.print("Smallest Element in an Array: " + smaller);
		
		in.close();	
	}

}
