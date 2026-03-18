package com.basic.palindrome;

/*
 * Check if a number is palindrome
 */

public class Example03 {

	public static void main(String[] args) {

		int num = 12121;

		// 3.
		
		String value = String.valueOf(num);

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
