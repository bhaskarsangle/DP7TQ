package com.basics;

import java.util.Scanner;

public class FIndElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number.....");
		int no = sc.nextInt();
		int arr[] = { 5, 78, 45, 34, 78 };

		if (findNum(arr, no))
			System.out.println("no is present in array");
		else
			System.out.println("no is not present in array");
	sc.close();
	}
	

	static boolean findNum(int[] ar, int no) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == no) {
				return true;
			}
		}

		return false;
	}

}
