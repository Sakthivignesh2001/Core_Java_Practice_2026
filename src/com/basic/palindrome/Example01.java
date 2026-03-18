package com.basic.palindrome;

/*
 * Check if a number is palindrome
 */

public class Example01 {

	public static void main(String[] args) {

		int num = 12121;
		int original = num;

		int rev = 0;

		while (num > 0) {
			int last = num % 10; // get last digit
			rev = rev * 10 + last; // add last digit
			num = num / 10; // remove last digit
		}

		if (original == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not an palindrome");
		}

		// 2.
		String value = String.valueOf(original);

		String rev2 = new StringBuilder(value).reverse().toString();

		if (value.equals(rev2)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not an palindrome");
		}

		// 3.

		char[] charArray = value.toCharArray();

		String rev3 = "";

		for (int i = charArray.length - 1; i >= 0; i--) {
			rev3 = rev3 + charArray[i];
		}

		if (value.equals(rev3)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not an palindrome");
		}

	}

}
