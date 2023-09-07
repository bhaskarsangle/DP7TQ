package com.controlstatement;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your EUnit....");
		double unit = sc.nextDouble();
		double bill;
		if (unit <= 50) {
			bill = unit * 0.50;
		} else if (unit <= 150) {
			bill = (50*0.50)+((unit-50) * 0.75);

		} else if (unit <= 250) {
			bill =(50*0.50)+(100*0.75)+ ((unit-150) * 1.20);

		} else {
			bill =(50*0.50)+(100*0.75)+(100*1.20)+ ((unit-250) * 1.50);

		}
		double surcharge = bill * 0.2;
		double totalBill = bill + surcharge;
		System.out.println("Total eBill is " + totalBill);

		sc.close();
	}

}
