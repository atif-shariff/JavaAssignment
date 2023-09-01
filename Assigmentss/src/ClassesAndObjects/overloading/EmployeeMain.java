package com.shristi.overloading;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee Name");
		String name = scanner.next();

		System.out.println("Enter the Employee designation");
		String designation = scanner.next();

		Employee employee = new Employee(name, designation);

		if (designation.equals("Programmer")) {
			double ProgrammerBonus = employee.calBonus(1000);
			System.out.println("Employee Name: " + name);
			System.out.println("Programmer Bonus: " + ProgrammerBonus);

		}
		Employee employee2 = new Employee(name, designation);

		if (designation.equals("Manager")) {

			double ManagerBonus = employee2.calBonus(1000, 500);
			System.out.println("Employee Name: " + name);
			System.out.println("Manager Bonus: " + ManagerBonus);

		}

		Employee employee3 = new Employee(name, designation);

		if (designation.equals("Director")) {
			double directorBonus = employee3.calBonus(1000, 500, 1000);
			System.out.println("Employee Name: " + name);
			System.out.println("Director Bonus: " + directorBonus);

		}

		else {
			System.out.println("No Bonus");
		}

		scanner.close();

	}
}
