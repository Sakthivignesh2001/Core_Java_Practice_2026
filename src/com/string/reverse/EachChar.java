package com.string.reverse;

/* Reverse each char in a sentence
 * input : Good bye
 * output: eyb dooG
 */

public class EachChar {

	public static void main(String[] args) {

		String value = "Good bye";
		String reverse = "";
		
		for (int i = value.length() - 1; i >= 0; i--) {
			reverse = reverse + value.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
