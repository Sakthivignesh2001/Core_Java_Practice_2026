package com.basic.count.digit;

/*
 * Count number of digits in a number
 */
public class Example01 {

	public static void main(String[] args) {

		int num = 121212;
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}

}
