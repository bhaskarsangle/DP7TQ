package com.controlstatement;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You can vote...");
		} else {
			System.out.println("you cannot vote....");
		}
		System.out.println("Rest of Code");
		sc.close();
	}

}
