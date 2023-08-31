package com.assigments;

import java.util.Scanner;

public class SumAndAverage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] marks = new int[5];
		
		for(int i=0; i<marks.length;i++) {
			marks[i]=in.nextInt();
		}
		
		int sum =0;
		
		for(int i :marks) {
			sum+=i;
		}
		System.out.println("Sum: "+sum);
		double average=sum/marks.length;
		System.out.println("Avg: "+average);
		in.close();
	}

}
