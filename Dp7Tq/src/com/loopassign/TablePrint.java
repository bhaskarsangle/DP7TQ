package com.loopassign;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number ....");
      int no=sc.nextInt();
      
      for (int i = 1; i <=10; i++) {
		  int table=no*i;
		  System.out.println(table);
	}
	}

}
