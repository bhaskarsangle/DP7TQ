package com.trial;

import java.util.Scanner;

public class DemoAbstract {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter numner...");
		int no = sc.nextInt();
		int sum = 0;

		while (no > 0) {
			boolean flag = true;
			for (int i = 1; i < no; i++) {
				if (no % i == 0) {
					flag = false;
				}
			}
			if (flag == true) {
				sum = sum + no;
			}
		}
		
		System.out.println(sum);
	}

}
