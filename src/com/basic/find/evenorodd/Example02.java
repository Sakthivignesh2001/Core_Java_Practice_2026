package com.basic.find.evenorodd;

import java.util.stream.Stream;

/*
 * Check even or odd
 */
public class Example02 {

	public static void main(String[] args) {

		int a = 9;

		long count = Stream.of(a).filter((x) -> x % 2 == 0).count();

		if (count == 1) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}
}
