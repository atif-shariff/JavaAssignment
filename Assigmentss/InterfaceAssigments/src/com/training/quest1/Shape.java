package com.training.quest1;

public interface Shape {
	void area(int x, int y);
	
	static int area(int x) {
		return (x*x);
	}

}
