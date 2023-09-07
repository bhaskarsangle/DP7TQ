package com.logOopsTest;

public class Fibonnaci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		int sum = 0;
		for (int i = 1; i < 20; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(sum+" ");
		}
		
	}

}
