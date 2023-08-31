package com.training.scan;

import java.util.Scanner;

public class Grestest {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.print("Enter the first Number");
		int x = in.nextInt();
		System.out.print("Enter the Second Number");
		int y= in.nextInt();
		System.out.print("Enter the Third Number");
		int z = in.nextInt();
		
		int greatest = (x > y && x > z) ? x : (y > z) ? y : z;

        System.out.println("Greatest Number: " + greatest);
        in.close();
	}

}
