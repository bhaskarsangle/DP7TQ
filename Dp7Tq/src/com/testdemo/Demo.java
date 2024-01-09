package com.testdemo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
 		boolean flag = true;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {

				flag = false;
				break;
			} else {

				flag = true;
			}
			
		}
		if (flag == true) {
			System.out.println("prime no");
		}else {
			System.out.println(" not a prime no");

		}
		
		

	}

}
