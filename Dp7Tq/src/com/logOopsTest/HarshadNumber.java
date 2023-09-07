package com.logOopsTest;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number...");
		int no = sc.nextInt();
		int temp = no;
		int sum = 0;
		while (no > 0) {
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;

		}
		if (temp % sum == 0) {
			System.out.println(temp + " no is Harshad");
		} else {
			System.out.println(temp + " no isnot Harshad");
		}
		sc.close();

	}

}
