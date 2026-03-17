package com.string.palindrome;

public class Example02 {

	public static void main(String[] args) {

		String value1 = "M,a:d a -m";
		String value2 = "";

		value1 = value1.replaceAll("[^a-zA-Z]", "");

		String lowercaseValue = "";

		for (int i = 0; i < value1.length(); i++) {
			if (value1.charAt(i) >= 65 && value1.charAt(i) <= 91) {
				lowercaseValue = lowercaseValue + (char) (value1.charAt(i) + 32);
			} else {
				lowercaseValue = lowercaseValue + value1.charAt(i);
			}
		}

		for (int i = lowercaseValue.length() - 1; i >= 0; i--) {
			value2 = value2 + lowercaseValue.charAt(i);
		}

		if (lowercaseValue.equals(value2)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}
}
