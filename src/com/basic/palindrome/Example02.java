package com.basic.palindrome;

/*
 * Check if a number is palindrome
 */

public class Example02 {

	public static void main(String[] args) {

		int num = 12121;

		// 2.
		String value = String.valueOf(num);

		String rev2 = new StringBuilder(value).reverse().toString();

		if (value.equals(rev2)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not an palindrome");
		}

	}

}
