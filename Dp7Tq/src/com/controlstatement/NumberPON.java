package com.controlstatement;

import java.util.Scanner;

public class NumberPON {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number..");
		int no = sc.nextInt();

		if (no>= 0) {
			System.out.println(no + " is Positive");
		} else {
			System.out.println(no + "is Negative");
		}
		sc.close();
	}

}
