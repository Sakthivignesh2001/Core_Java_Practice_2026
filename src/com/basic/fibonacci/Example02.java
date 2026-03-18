package com.basic.fibonacci;

import java.util.Scanner;

/*
 * Print Fibonacci series
 */

public class Example02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the value to get the fibonacci:: ");
		int value = input.nextInt();

		for (int i = 0; i < value; i++) {
			System.out.println(fibonnaci(i) + ", ");
		}

		input.close();

	}

	private static int fibonnaci(int value) {

		if (value <= 1)
			return value;

		return fibonnaci(value - 1) + fibonnaci(value - 2);
	}

}
