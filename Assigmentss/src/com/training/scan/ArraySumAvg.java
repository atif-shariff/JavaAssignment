package com.training.scan;

import java.util.Scanner;

public class ArraySumAvg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] marks = new int[4];
		
		for (int i = 0; i < marks.length; i++) {
			System.out.print("Enter the array element "+i+" :"+"");
			marks[i]=in.nextInt();
				
		}
		
		int sum = 0;//use for each
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		System.out.println("Sum of Marks: "+sum);
		
		System.out.println("Avg of Marks: "+(sum/marks.length));
		in.close();
  }
}
