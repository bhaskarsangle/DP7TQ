package com.loopassign;

public class Pattern1 {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = 3; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}