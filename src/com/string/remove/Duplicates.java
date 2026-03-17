package com.string.remove;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Remove duplicate characters
 */

public class Duplicates {

	public static void main(String[] args) {

		String name = "Vandhe madharam";

		name = name.replaceAll("[^a-zA-Z]", "").toLowerCase();

		// way-01 : set

		Set<Character> set = new LinkedHashSet<>();

		for (char c : name.toCharArray()) {
			set.add(c);
		}

		System.out.println(set);

		String result = "";

		for (char c : set) {
			result = result + c;
		}

		System.out.println(result);

		// way-02 array

		boolean[] b = new boolean[26];

		String value = "";

		for (char c : name.toCharArray()) {
			if (!b[c - 'a']) {
				b[c - 'a'] = true;
				value = value + c;
			}
		}

		System.out.println(value);
	}

}
