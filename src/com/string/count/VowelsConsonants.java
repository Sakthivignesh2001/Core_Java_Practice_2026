package com.string.count;

/*
 * Count vowels and constants
 */

public class VowelsConsonants {

	public static void main(String[] args) {

		String value = "Hello Master";

		value = value.replaceAll(" ", "").toLowerCase();

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
			} else {
				consonants++;
			}
		}

		System.out.println("Vowels:: " + vowels);
		System.out.println("consonants :: " + consonants);

	}

}
