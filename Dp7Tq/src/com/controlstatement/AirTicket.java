package com.controlstatement;

import java.util.Date;
import java.util.Scanner;

public class AirTicket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Airlines name...");
		String flightName = sc.next();
		System.out.println("Enter your name...");
		String userName = sc.next();
		System.out.println("Enter Depart place...");
		String departName = sc.next();
		System.out.println("Enter Destination name...");
		String destName = sc.next();
		System.out.println("Enter coupan code if you have.....");
		int coupanName = sc.nextInt();

		double ticket = 35000;
		Date d=new Date();
		
 
		if (coupanName == 45541) {
			System.out.println("We are providing you 10% discount");
			double ticketBill = ticket * 0.1;
			System.out.println("you saved "+ticketBill+" on your ticket");
			System.out.println("you ticket is booked on date: "+d);

			double AmountTotal=ticket-ticketBill;
			System.out.println("Your total flightBill= " + AmountTotal);
		} else {
			System.out.println("you dont have any coupan code...");

			System.out.println("Your total flightBill= " + ticket);
		}

		System.out.println("Enjoy Journey!!....");
		sc.close();

	}

}
