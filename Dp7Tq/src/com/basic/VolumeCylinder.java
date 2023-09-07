package com.basic;

import java.util.Scanner;

public class VolumeCylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius....");
		int rad = sc.nextInt();
		System.out.println("enter height....");
		int height = sc.nextInt();

		double volume = Math.PI * rad * rad * height;
		System.out.println("volume of cylinder " + volume);
		sc.close();
	}

}
