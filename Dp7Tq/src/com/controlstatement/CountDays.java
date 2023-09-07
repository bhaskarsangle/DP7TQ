package com.controlstatement;

import java.util.Scanner;

public class CountDays {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter month....");
     int months=sc.nextInt();
     if (months==1||months==3||months==5||months==7||months==8||months==10||months==12) {
		System.out.println("31 days in this months");
	} else if (months==2||months==4||months==6||months==9||months==11) {
		System.out.println("28 days in this months");
	} else {
		System.out.println("Enter a valid number between 1 to 12....");
	}
     sc.close();
	}

}
