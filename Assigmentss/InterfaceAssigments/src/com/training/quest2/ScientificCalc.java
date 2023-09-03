package com.training.quest2;

public class ScientificCalc extends BasicCalculator implements IScientific {

	@Override
	public void square(int x) {
		System.out.println("Square "+(x*x));

	}

	@Override
	public void cube(int x) {
		System.out.println("Square "+(x*x*x));

	}

}
