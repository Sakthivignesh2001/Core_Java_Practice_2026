package com.basic.count.sumdigit;

/*
 * Sum of digits of a number
 */
public class Example01 {

	public static void main(String[] args) {

		int num = 12121;

		int sum = 0;

		String value = String.valueOf(num);

		for (char c : value.toCharArray()) {
			sum = sum + (c - '0');
		}

		System.out.println(sum);
	}
}
