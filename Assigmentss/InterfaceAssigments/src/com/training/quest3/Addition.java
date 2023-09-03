package com.training.quest3;

import java.util.function.Consumer;

public class Addition {

	public static void main(String[] args) {
		Consumer<Integer> add = result -> System.out.println(result);
		
		int x = 12;
		int y = 23;
		
		
		add.accept(x+y);
	}

}
