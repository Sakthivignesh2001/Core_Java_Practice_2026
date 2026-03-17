package com.string.find;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Find first non-repeated character
 */

public class NonRepeatingChar {

	public static void main(String[] args) {

		String name = "Mal-ay|a La.m";

		name = name.replaceAll("[^a-zA-Z]", "").toLowerCase();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : name.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println(map);

		for (char c : name.toCharArray()) {
			if (map.get(c) == 1) {
				System.out.println(c);
				break;
			}
		}

		// way-02 using array

		int[] count = new int[26];

		for (char c : name.toCharArray()) {
			count[c - 'a']++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] == 1) {
				System.out.println((char) (i + 'a'));
				break;
			}
		}

		// way-03 array

		int[] arr = new int[26];

		for (char c : name.toCharArray()) {
			arr[c - 'a']++;
		}

		for (char c : name.toCharArray()) {
			if (arr[c - 'a'] == 1) {
				System.out.println(c);
				break;
			}
		}

	}

}
