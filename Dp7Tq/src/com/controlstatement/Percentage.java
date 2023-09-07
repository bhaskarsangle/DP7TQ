package com.controlstatement;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name...");
		String name = sc.next();

		System.out.println("Enter your marks of sub1...");
		double sub1 = sc.nextDouble();
		System.out.println("Enter your marks of sub2...");
		double sub2 = sc.nextDouble();
		System.out.println("Enter your marks of sub3...");
		double sub3 = sc.nextDouble();
		System.out.println("Enter your marks of sub4...");
		double sub4 = sc.nextDouble();
		System.out.println("Enter your marks of sub5...");
		double sub5 = sc.nextDouble();

		double sum = sub1 + sub2 + sub3 + sub4 + sub5;
		double per = (sum / 500) * 100;
		if (per >= 35) {
			System.out.println(name + " has scored " + per + "% Congratulations!! passed and Promted");
		} else {
			System.out.println(name + " has scored " + per + "% you have failed!!Try hard next time");

		}
		sc.close();
	}

}
