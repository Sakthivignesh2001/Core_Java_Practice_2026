package com.basic.find.largest;

/*
 * Find largest of three numbers
 */

public class Example01 {

	public static void main(String[] args) {

		int a = 10;
		int b = 30;
		int c = 20;

		if (a >= b && a >= c) {
			System.out.println("Largest number is :: " + a);
		} else if (b >= a && b >= c) {
			System.out.println("Largest number is :: " + b);
		} else {
			System.out.println("Largest number is :: " + c);
		}
	}

}
