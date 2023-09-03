package com.training.quest2;

public class InterMain {

	public static void main(String[] args) {
		IScientific iScientific = new ScientificCalc();
		
		iScientific.add(5, 6);
		iScientific.difference(5, 6);
		iScientific.product(5, 6);
		iScientific.divide(5, 6);
	}

}
