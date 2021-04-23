package com.tribepad.jordan.game.fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

	static Scanner scan = new Scanner(System.in);
	
	static int won = 0;
	static int turn = 0;
	static int count = 0;
	static String fizzBuzz = "0";
	static String replay = "y";
	
	static String playerOneInput = " ";

	
	public static void main(String[] args) {
		System.out.println("Welcome to Jordan's FizzBuzz");
		System.out.println("----------------------------");
		
		while (replay.toLowerCase().equals("y")) {
			System.out.println("Player one goes first");
			turn = 1; won = 0; count = 0;
			while (won == 0) {
				++count; fizzBuzz = fizzBuzz(count);
				if (turn == 1) {
					playerOne(fizzBuzz);
				} 
				else if (turn == 2) {
					playerTwo(fizzBuzz);
				}
				else {
					System.out.println("Issue with turn, terminating game");
					won = 1;
				}
			}
			if (won == 1 && turn == 1) {
				System.out.println("Congratulations player one, you win!");
			} 
			else if (won == 1 && turn == 2) {
				System.out.println("Congratulations player two, you win!");
			}
			System.out.println("Thanks for playing!");
			System.out.println("Type Y if you'd like to play again");
			
			replay = scan.nextLine();
			System.out.println("Type Y if you'd like to play again");
		}
	}

	public static void playerOne(String fizzBuzz) {
//		System.out.println("Testing: " + fizzBuzz);
		playerOneInput = scan.nextLine();

		if (playerOneInput.equals(fizzBuzz)) {
			System.out.println(playerOneInput);
		} 
		else {
			won = 1;
			System.out.println("Incorrect, the correct answer was " + fizzBuzz);
		}
		turn = 2;
	}

	public static void playerTwo(String fizzBuzz) {
		System.out.println("Computer says " + fizzBuzz);
		turn = 1;
	}
	
	public static String fizzBuzz(int count) {
			if ((count % 3 == 0) && (count % 5 == 0)) {
//				System.out.println("FizzBuzz");
				return "FizzBuzz";
			}
			else if (count % 3 == 0) {
//				System.out.println("Fizz");
				return "Fizz";
			} 
			else if (count % 5 == 0) {
//				System.out.println("Buzz");
				return "Buzz";
			}
			else {
//				System.out.println(count);
				return String.valueOf(count);
			}
//			++count;
	}
}
