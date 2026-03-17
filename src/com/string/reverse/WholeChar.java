package com.string.reverse;

/*
 * Reverse the whole char in a sentence
 */

public class WholeChar {
	
	public static void main(String[] args) {
		
		String value = "Good bye";
		
		String reverse = new StringBuilder(value).reverse().toString();
		
		System.out.println(reverse);
	}

}
