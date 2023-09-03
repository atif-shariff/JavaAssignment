package com.training.quest4;

import java.util.function.Supplier;

public class Uppercase {

	public static void main(String[] args) {
		String input ="Atif";
		Supplier<String>name=()->input.toUpperCase();
		System.out.println(name.get());	

	}

}
