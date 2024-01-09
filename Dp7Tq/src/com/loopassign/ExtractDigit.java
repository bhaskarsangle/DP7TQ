package com.loopassign;

import java.util.Scanner;

public class ExtractDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number....");
		int no = sc.nextInt();

		int number = countNumber(no);
		System.out.println(no + " reduce to digit " + number);
		sc.close();
	}

	static int countNumber(int no) {
		int sum = 0;
		while (no > 0 || sum > 9) {

			if (no == 0) {
				no = sum;
				sum = 0;
			}

			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}

		return sum;
	}

}
