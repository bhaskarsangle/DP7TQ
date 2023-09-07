package com.controlstatement;

import java.util.Scanner;

public class Calculators {

	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("which operation you want to perform...");
		System.out.println("1: addition ");
		System.out.println("2: subtraction");
		System.out.println("3: multi ");
		System.out.println("4: div ");

		int choice = sc.nextInt();
		if (choice == 1) {
			int sum = num1 + num2;
			System.out.println(sum);
		}
		if (choice == 2) {
			int sum = num1 - num2;
			System.out.println(sum);
		}
		if (choice == 3) {
			int sum = num1 * num2;
			System.out.println(sum);
		}
		if (choice == 4) {
			int sum = num1 / num2;
			System.out.println(sum);
		}
		sc.close();
	}

}
