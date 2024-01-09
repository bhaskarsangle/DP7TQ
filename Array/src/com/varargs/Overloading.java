package com.varargs;

public class Overloading {

	public static void main(String[] args) {
	//	display(2, 3);
	//	displayMe(3,'A');
		int arr[]= {2,3};
		int arr1[]= {3,5};
		display(arr,arr1);
	}
	static void display(int[]...a) {
		for (int[] i : a) {
			System.out.print(i + " ");
		}
	}
	static void display(int... a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	static void display(String... a) {
		for (String i : a) {
			System.out.print(i + " ");
		}
	}
	static void displayMe(int c,char ...e) {
		System.out.println(c);
		for (char i : e) {
			System.out.print(i + " ");
		}
	}


}
