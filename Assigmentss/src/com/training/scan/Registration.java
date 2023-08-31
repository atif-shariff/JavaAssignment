package com.training.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name to register: ");
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
            System.out.println("You are Registered");
        } else {
            System.out.println("Name is not unique");
        }

        in.close();
    }
}
