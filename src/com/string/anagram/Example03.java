package com.string.anagram;

import java.util.Arrays;

public class Example03 {

	public static void main(String[] args) {

		String value1 = "Lis ten";
		String value2 = "Silen t";

		boolean anagram = Arrays.equals(value1.replaceAll(" ", "").toLowerCase().chars().sorted().toArray(),
				value2.replaceAll(" ", "").toLowerCase().chars().sorted().toArray());

		if (anagram)
			System.out.println("Anagram");
		else
			System.out.println("Not an Anagram");

	}

}
