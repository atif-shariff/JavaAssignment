package com.training.quest2;


import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		//Employee employee = new Employee()
		List<Employee> employees = Arrays.asList(
			    new Employee("Atif", 101, "Bangalore"),
			    new Employee("Ahmed", 102, "Mysore"),
			    new Employee("Jack", 103, "Hydrabad"),
			    new Employee("Rose", 104, "Manipur"),
			    new Employee("Sid", 105, "Bangalore")
			);
		for(Employee employee:employees) {
			//System.out.println(employee.getEmployeeID()+" : "+employee.getName());
			
			if(employee.getCity().equals("Bangalore")) {
				System.out.println(employee.getEmployeeID()+" : "+employee.getName());
			}
		}
		
		

	}

}
