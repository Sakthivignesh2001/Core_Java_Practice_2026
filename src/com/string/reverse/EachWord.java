package com.string.reverse;

/*
 * Reverse each word in a sentence
 * 
 * input: "Good eve sakthi vignesh"
 * 
 * output: "vignesh sakthi eve Good"
 */

public class EachWord {

	public static void main(String[] args) {

		String value = "Good eve sakthi vignesh";
		String reverse = "";

		String[] split = value.split(" ");

		for (int j = split.length - 1; j >= 0; j--) {
			reverse = reverse + split[j] + " ";
		}

		System.out.println(reverse);

	}

}
