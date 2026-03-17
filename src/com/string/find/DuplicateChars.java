package com.string.find;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * Find duplicate characters in string
 */

public class DuplicateChars {

	public static void main(String[] args) {

		String name = "Mal-ay|a La.m";

		name = name.replaceAll("[^a-zA-Z]", "").toLowerCase();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : name.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println(map);

		for (char c : name.toCharArray()) {
			if (map.get(c) > 1) {
				System.out.print(c + ", ");
			}
		}
		System.out.println();

		// way-02 array

		int[] count = new int[26];

		for (char c : name.toCharArray()) {
			count[c - 'a']++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 1) {
				System.out.print((char) (i + 'a') + ", ");
			}
		}
		
		System.out.println();
		
		// way-03 using set
		
		Set<Character> unique = new HashSet<>();
		Set<Character> duplicate = new HashSet<>();
		
		for(char c : name.toCharArray()) {
			if(!unique.add(c)) {
				duplicate.add(c);
			}
		}
		
		System.out.println(duplicate);
		

	}

}
