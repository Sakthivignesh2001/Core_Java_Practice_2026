package com.basic.fibonacci;

import java.util.Scanner;

/*
 * Print Fibonacci series
 */

public class Example01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value to get the fibonacci:: ");
		int value = input.nextInt();
		
		int a = 0;
		int b = 1;
		
		System.out.print(a + ", " + b);
		
		for(int i = 2 ; i < value ; i++) {
			
			int c = a + b;
			
			System.out.print(", "+c);
			
			a = b;
			b = c;
			
		}
		
		input.close();
		
	}

}
