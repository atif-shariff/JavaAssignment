package com.training.scan;

import java.util.Scanner;

public class SmallestofThreeNumber {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int x = in.nextInt();
	        System.out.print("Enter the second number: ");
	        int y = in.nextInt();
	        System.out.print("Enter the third number: ");
	        int z = in.nextInt();

	        int smallest = (x < y && x < z) ? x : (y < z) ? y : z;

	        System.out.println("Smallest Number: " + smallest);

	        in.close();
	    }
}
	


