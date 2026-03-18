package com.basic.armstrong;

/*
 * Check Armstrong number
 */
public class Example01 {

	public static void main(String[] args) {

		int num = 123;
		int temp = num;

		// count the digits
		int count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;
		}

		int sum = 0;

		temp = num;

		while (temp > 0) {

			int last = temp % 10;
			int power = 1;

			for (int i = 0; i < count; i++) {
				power = power * last;
			}

			sum = sum + power;
			temp = temp / 10;
		}

		if (num == sum) {
			System.out.println("Armstorng");
		} else {
			System.out.println("Not an armstrong");
		}

	}

}
