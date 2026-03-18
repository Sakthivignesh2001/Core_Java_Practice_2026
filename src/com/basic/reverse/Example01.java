package com.basic.reverse;

public class Example01 {

	public static void main(String[] args) {

		int num = 12345;
		int rev = 0;

		System.out.println("Before:: " + num);

		while (num > 0) {
			int last = num % 10;
			rev = rev * 10 + last;
			num = num / 10;
		}
		
		System.out.println("After:: " + rev);

	}

}
