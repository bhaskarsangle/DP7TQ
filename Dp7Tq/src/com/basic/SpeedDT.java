package com.basic;

import java.util.Scanner;

public class SpeedDT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter covered Distance ...");
		int distance = sc.nextInt();
		System.out.println("Enter hours...");
		double time = sc.nextDouble();
		
		double  speed=(distance/time);
		System.out.println("your car speed is "+speed+"km/hr");
		sc.close();
	}

}
