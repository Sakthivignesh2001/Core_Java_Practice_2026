package com.basic.reverse;

public class Example02 {

	public static void main(String[] args) {

		int[] num = { 5, 2, 9, 6, 3, 1, 7 };

		for(int i : num) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}

	}

}
