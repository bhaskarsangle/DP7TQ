package com.basics;

public class Prime {

	public static void main(String[] args) {
           int n=7;
           boolean check=true;
        for (int i = 2; i <n; i++) {
			if (n%i==0) {
				check=false;
				break;
			}
		}
        if (check) {
			System.out.println("is prime number");
		} else {
			System.out.println("isnot prime number");

		}
	}

}
