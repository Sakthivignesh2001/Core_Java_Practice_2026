package com.basic.factorial;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number to get a factorial:: ");
		int value = input.nextInt();

		int factorial = 1;
		for (int i = 1; i <= value; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("The factorial value is :: " + factorial);

		input.close();

	}

}
