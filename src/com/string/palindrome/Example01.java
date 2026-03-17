package com.string.palindrome;

public class Example01 {

	public static void main(String[] args) {

		String value1 = "Madam";
		String value2 = "";

		value1 = value1.replaceAll("[^a-zA-Z]", "");
		value1 = value1.toLowerCase();
		
		for (int i = value1.length() - 1; i >= 0; i--) {
			value2 = value2 + value1.charAt(i);
		}

		if (value1.equals(value2)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
