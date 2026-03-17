package com.string.anagram;

import java.util.Arrays;

public class Example01 {

	public static void main(String[] args) {

		String value1 = "Listen";
		String value2 = "Silent";

		value1 = value1.replaceAll(" ", "");
		value2 = value2.replaceAll(" ", "");

		value1 = value1.toLowerCase();
		value2 = value2.toLowerCase();

		char[] c1 = value1.toCharArray();
		char[] c2 = value2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not an Anagram");
		}

	}

}
