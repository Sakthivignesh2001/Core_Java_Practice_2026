package com.basic.find.lcm;

/*
 * Find LCM of two numbers
 */

public class Example01 {
	public static void main(String[] args) {

		int a = 18;
		int b = 36;
		int x = a, y = b;
		
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		
		int gcd = x;
		
		int lcm = (a*b)/gcd;
		
		System.out.println(lcm);
	}

}
