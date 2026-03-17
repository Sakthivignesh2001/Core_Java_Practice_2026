package com.string.anagram;

public class Example02 {

	public static void main(String[] args) {

		String value1 = "Lis ten";
		String value2 = "Silen t";

		String noSpaceValue1 = "";
		String noSpaceValue2 = "";
		for (int i = 0; i < value1.length(); i++) {
			if (value1.charAt(i) != ' ') {
				noSpaceValue1 = noSpaceValue1 + value1.charAt(i);
			}
		}
		for (int i = 0; i < value2.length(); i++) {
			if (value2.charAt(i) != ' ') {
				noSpaceValue2 = noSpaceValue2 + value2.charAt(i);
			}
		}

		String lowerValue1 = "";
		String lowerValue2 = "";

		for (int i = 0; i < noSpaceValue2.length(); i++) {
			if (noSpaceValue1.charAt(i) >= 'A' && noSpaceValue1.charAt(i) <= 'Z') {
				lowerValue1 = lowerValue1 + (char) (noSpaceValue1.charAt(i) + 32); // Difference between uppercase and
																					// lowercase = 32
			} else {
				lowerValue1 = lowerValue1 + noSpaceValue1.charAt(i);
			}
		}

		for (int i = 0; i < noSpaceValue2.length(); i++) {
			if (noSpaceValue2.charAt(i) >= 65 && noSpaceValue2.charAt(i) <= 91) {
				lowerValue2 = lowerValue2 + (char) (noSpaceValue2.charAt(i) + 32);
			} else {
				lowerValue2 = lowerValue2 + noSpaceValue2.charAt(i);
			}
		}

		char[] c1 = new char[lowerValue1.length()];
		char[] c2 = new char[lowerValue2.length()];

		for (int i = 0; i < lowerValue1.length(); i++) {
			c1[i] = lowerValue1.charAt(i);
		}
		for (int i = 0; i < lowerValue2.length(); i++) {
			c2[i] = lowerValue2.charAt(i);
		}

		int n1 = c1.length - 1;
		int n2 = c1.length - 1;

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1 - i; j++) {
				if (c1[j] > c1[j + 1]) {
					char temp = c1[j];
					c1[j] = c1[j + 1];
					c1[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < n2 - i; j++) {
				if (c2[j] > c2[j + 1]) {
					char temp = c2[j];
					c2[j] = c2[j + 1];
					c2[j + 1] = temp;
				}
			}
		}

		boolean isAnagram = true;

		if (c1.length != c2.length) {
			isAnagram = false;
		} else {
			for (int i = 0; i < c1.length - 1; i++) {
				if (c1[i] != c2[i]) {
					isAnagram = false;
					break;
				}
			}
		}

		System.out.println(isAnagram ? "Anagram" : "Not an Anagram");

		System.out.println(noSpaceValue1);
		System.out.println(noSpaceValue2);
		System.out.println(lowerValue1);
		System.out.println(lowerValue2);
		for (char c : c1) {
			System.out.print(c);
		}
		System.out.println();
		for (char c : c2) {
			System.out.print(c);
		}

	}

}
