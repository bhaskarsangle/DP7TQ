package com.controlstatement;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number...");
		int num = sc.nextInt();

		if (num % 5 == 0 && num % 11 == 0) {
			System.out.println(num + " is divisible by 5 and 11");
		} else {
			System.out.println(num + " isnot divisible by 5 and 11");

		}
		sc.close();
	}

}
