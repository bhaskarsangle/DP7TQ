package com.basic;

import java.util.Scanner;

public class StudentPer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks of sub1...");
		double sub1 = sc.nextDouble();
		System.out.println("Enter your marks of sub2...");
		double sub2 = sc.nextDouble();
		System.out.println("Enter your marks of sub3...");
		double sub3 = sc.nextDouble();

		double sum = sub1 + sub2 + sub3;
		double per = (sum * 100) / 300;
		System.out.println("percentage is " + per);
		sc.close();
	}

}
