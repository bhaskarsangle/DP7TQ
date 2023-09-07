package com.basic;

import java.util.Scanner;

public class Practical {

	public static void main(String[] args) {

//		char cha = 'z';
//		char cha2 = (char) (cha - 32);
//		System.out.println(cha2);
//		
//		System.out.println("===================");
//
//		char ch = 'M';
//		char ch2 = (char) (ch + 32);
//		System.out.println(ch2);

		System.out.println("===================");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			char chName = (char) (ch + 32);
			System.out.println("small char := "+chName);
		} else if (ch >= 'a' && ch <= 'z') {
			char chName = (char) (ch - 32);
			System.out.println("Capital char := "+chName);

		} else {
			System.out.println("Enter a valid Charac.......@");
		}
		sc.close();

	}

}
