package com.basic;

import java.util.Scanner;

public class FindChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter char....");
		char ch = sc.next().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("It is  char...");
 		} else if (ch >= '0' && ch <= '9') {
			System.out.println("it is Digit");

		} else {
			System.out.println("It is SpecialChar...");

		}
		System.out.println("==============");
		int ascii=ch;
		System.out.println("Ascii value of ch is "+ascii);
		sc.close();
	}

}
