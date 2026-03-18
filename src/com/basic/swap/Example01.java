package com.basic.swap;

public class Example01 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a);
		System.out.println(b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
	}

}
