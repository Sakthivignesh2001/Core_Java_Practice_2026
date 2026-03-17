package com.string.count;

import java.util.Arrays;

/*
 * Count words in a string
 *  
 * Input:  "Hello sakthi from CM office"
 * Output: 5
 */

public class Word {

	public static void main(String[] args) {

		String word = "Hello sakthi from CM office";

		String[] split = word.split(" ");

		System.out.println(split.length);

		// way-02 stream api

		long count = Arrays.stream(word.split(" ")).count();

		System.out.println(count);
	}

}
