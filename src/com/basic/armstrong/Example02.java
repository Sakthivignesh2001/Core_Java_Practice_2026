package com.basic.armstrong;

/*
 * Check Armstrong number
 */
public class Example02 {

	public static void main(String[] args) {

		int num = 153;
		int original = num;

		// count the digits
		int count = String.valueOf(num).length();

		int sum = 0;

		while (num > 0) {
			int last = num % 10;
			sum += Math.pow(last, count);
			num = num / 10;
		}

		if (sum == original) {
			System.out.println("The value is armstrong");
		} else {
			System.out.println("The value is not an armstrong");
		}
	}

}
