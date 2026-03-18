package com.basic.prime;

import java.util.Scanner;

/*
 * Check if number is prime
 */

public class Example01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number to check prime or not:: ");
		int value = input.nextInt();

		boolean isPrime = true;

		if (value <= 1) {
			isPrime = false;
		}

		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime ? "The number is prime" : "The number is not a prime");

		input.close();
	}

}
