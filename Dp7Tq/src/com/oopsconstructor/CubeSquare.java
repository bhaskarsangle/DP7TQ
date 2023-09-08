package com.oopsconstructor;

import java.util.Scanner;

public class CubeSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number....");
		int num = sc.nextInt();
		int numCube = cube(num);
		int numSquare = square(num);
		System.out.println("number cube: "+numCube);
		System.out.println("number Square: "+numSquare);
		sc.close();
	}

	static int cube(int num) {
		int total = num * square(num);
		return total;
	}

	static int square(int num) {
		int numSquare = num * num;
		return numSquare;
	}

}
