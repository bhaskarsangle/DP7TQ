package com.basic;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name....");
		String name = sc.next();
		System.out.println("enter your age....");
		int age = sc.nextInt();
		System.out.println("enter your gender....");
		char gender = sc.next().charAt(0);

		System.out.println("my name is " + name);
		System.out.println("my age is " + age);
		System.out.println("gender is " + gender);
		sc.close();
	}

}
