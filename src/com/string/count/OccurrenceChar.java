package com.string.count;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Count occurrence of each character
 */

public class OccurrenceChar {

	public static void main(String[] args) {

		String value = "Programming";

		value = value.replaceAll(" ", "").toLowerCase();

		// way-01 : using hashmap

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : value.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);

		// way-02 : using array

		int[] count = new int[26];

		for (char c : value.toCharArray()) {
			count[c - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.out.print((char) (i + 'a') + "=" + count[i] + ", ");
			}
		}
		System.out.println();

		// way-03 : using stream api

		Map<Character,Long> collect = value.chars().mapToObj((a) -> (char) a)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(collect);

	}

}
