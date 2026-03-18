package com.basic.count.sumdigit;

/*
 * Sum of digits of a number
 */
public class Example02 {

	public static void main(String[] args) {

		int num = 12121;

		int sum = 0;

		while (num != 0) {
			int last = num % 10;
			sum = sum + last;
			num = num / 10;
		}

		System.out.println(sum);
	}
}
