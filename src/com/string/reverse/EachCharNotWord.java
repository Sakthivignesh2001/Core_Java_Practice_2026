package com.string.reverse;

/*
 * input: "Good bye sakthi"
 * 
 * output: "dooG eyb ihtkas"
 */

public class EachCharNotWord {

	public static void main(String[] args) {

		String value = "Good bye sakthi";
		String reverse = "";

		String[] split = value.split(" ");

		for (int i = 0; i < split.length; i++) {
			String word = split[i];
			for (int j = word.length() - 1; j >= 0; j--) {
				reverse = reverse + word.charAt(j);
			}
			reverse = reverse + " ";
		}

		System.out.println(reverse);

	}

}
