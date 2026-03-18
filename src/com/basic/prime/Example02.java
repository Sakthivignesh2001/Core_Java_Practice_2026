package com.basic.prime;

import java.util.Scanner;

/*
 * Check if number is prime
 */

public class Example02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number to check prime or not:: ");
		int n = scan.nextInt();

		boolean isPrime = true;

		if (n <= 1) {
			isPrime = false;
		}

		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime ? "The number is prime" : "The number is not a prime");

		scan.close();
	}

}
