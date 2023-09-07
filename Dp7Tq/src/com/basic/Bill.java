package com.basic;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your qty...");
		int qty = sc.nextInt();
		System.out.println("Enter price...");
		float price = sc.nextFloat();

		float bill = (qty * price);
		System.out.println("Your Bill is " + bill);

		// int pBill=(int) (qty*price);
		// System.out.println(pBill);
		sc.close();
	}

}
