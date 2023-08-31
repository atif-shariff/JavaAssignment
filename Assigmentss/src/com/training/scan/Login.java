package com.training.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter username to login: ");
        String username = in.next();
        
        String[] names = {"Atif", "Bharath", "Aqib", "Jack"};
        boolean isUnique = true;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(username)) {
                isUnique = false;
                break;
            }
        }

        if (isUnique) {
            System.out.println("Invalid username");
        } else {
            System.out.println("You are logged");
        }

        in.close();
    }
}