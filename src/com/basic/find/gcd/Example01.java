package com.basic.find.gcd;

/*
 * Find GCD of two numbers
 */
public class Example01 {

	public static void main(String[] args) {

		int a = 36;
		int b = 60;

		while (b != 0) {
			int temp = b;
			System.out.println("temp: " + b);
			b = a % b;
			System.out.println("b: " + b);
			a = temp;
			System.out.println("a: " + b);
		}

		System.out.println(a);
	}

}
