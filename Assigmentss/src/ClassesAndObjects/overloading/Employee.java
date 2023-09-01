package com.shristi.overloading;

public class Employee {
	String name;
	String designation;
	
	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}
	
	double calBonus(double basicAllowance) {
		return basicAllowance;
		
	}
	double calBonus(double basicAllowance,double CarAllowance) {
		return (basicAllowance+CarAllowance);
	}
	
	double calBonus(double basicAllowance,double CarAllowance,double houseAllowance) {
		return (basicAllowance+CarAllowance+houseAllowance);
	}

}
