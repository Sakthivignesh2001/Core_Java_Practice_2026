package com.basic.prime;

import java.util.Scanner;

/*
 * Print prime numbers from 1 to N
 */

public class Example03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number :: ");
		int n = scan.nextInt();

		for (int i = 2; i <= n; i++) {
			
			boolean isPrime = true;

			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(i + ", ");
			}
		}
		scan.close();
	}

}
