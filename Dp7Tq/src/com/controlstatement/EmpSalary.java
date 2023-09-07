package com.controlstatement;

import java.util.Scanner;

public class EmpSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary...");
		double bsal = sc.nextDouble();
		double gSal, hra, da;
		if (bsal <= 10000) {
			hra = bsal * 0.2;
			da = bsal * 0.8;
		} else if (bsal>10000 && bsal <= 20000) {
			hra = bsal * 0.25;
			da = bsal * 0.9;
		} else {
			hra = bsal * 0.3;
			da = bsal * 0.95;
		}
		gSal = bsal + hra + da;
		System.out.println("GrossSalary is " + gSal);
		sc.close();

	}

}
