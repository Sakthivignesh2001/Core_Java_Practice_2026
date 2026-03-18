package com.basic.factorial;

import java.util.Scanner;

/*
 * Find factorial of a number
 */

public class Example02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number to get a factorial:: ");
		int value = input.nextInt();

		System.out.println("The factorial value is :: " + factorial(value));

		input.close();

	}

	private static int factorial(int value) {

		if (value == 0 || value == 1) {
			return 1;
		}

		return value * factorial(value - 1);
	}

}
