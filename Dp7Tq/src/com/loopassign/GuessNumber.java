package com.loopassign;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter RandomNumber.....");
	    int randomNumber=scanner.nextInt();

		int minNumber = 1;  
		int maxNumber = 50;  
 
		int numberOfTries = 0;
		int guess=0;

		 
		while (guess != randomNumber) {
			System.out.print("Enter your guess: ");
			guess = scanner.nextInt();
			numberOfTries++;

			if (guess < minNumber || guess > maxNumber) {
				System.out.println("Please guess a number within the specified range.");
			} else if (guess < randomNumber) {
				System.out.println(" Try again....");
			} 

		System.out.println(" You guessed the number " + randomNumber + " correctly in " + numberOfTries
				+ " tries.");
		scanner.close();
	}

	}
}

