package com.training.quest1;

public class ShapeMain {
	public static void main(String[] args) {
		Shape shape = (x,y)->System.out.println("Rectangle "+(x*y));
		shape.area(2, 4);
		
		shape = (x,y)->System.out.println("Triangle "+(x*y*0.5));
		shape.area(2, 4);
		
//		shape = (x,y)->System.out.println("Square"+(x*1*0.5));
//		shape.area(2);
		
		System.out.println("Square "+Shape.area(2));
		
	}

}
