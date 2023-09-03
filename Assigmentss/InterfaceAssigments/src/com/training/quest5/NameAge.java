package com.training.quest5;

import java.util.function.BiConsumer;

public class NameAge {

	public static void main(String[] args) {
		BiConsumer<String, Integer> biConsumer = (name, age) -> {
			if (name.equals("Admin") & age > 30) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}

		};

		biConsumer.accept("Admin", 35);

	}

}