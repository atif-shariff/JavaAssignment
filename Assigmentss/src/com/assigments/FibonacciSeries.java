package com.assigments;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = in.nextInt();
        

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series (first " + n + " terms): ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            
           
        }
        in.close();
    }
}
