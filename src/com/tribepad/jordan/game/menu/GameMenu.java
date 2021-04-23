package com.tribepad.jordan.game.menu;

import java.util.Scanner;

import com.tribepad.jordan.game.fizzbuzz.*;
import com.tribepad.jordan.game.tictactoe.*;

public class GameMenu {

	static Scanner scan = new Scanner(System.in);

	static String userInput = " ";
	
	public static void main(String[] args) {
		System.out.println("Welcome to Jordan's Game collection");
		System.out.println("-----------------------------------");
		
		menu();
		menuSelect();
	}

	public static void menu() {
		System.out.println("1. TicTacToe");
		System.out.println("2. FizzBuzz");
		System.out.println("3. Rock, Paper, Scissors");	
	}
	
	public static void menuSelect() {
		userInput = scan.nextLine();
		
		switch(userInput) {
		case "1" :
			System.out.println("Loading TicTacToe");
			com.tribepad.jordan.game.tictactoe.TicTacToe.main(null);
			break;
		case "2" :
			System.out.println("Loading FizzBuzz");
			com.tribepad.jordan.game.fizzbuzz.FizzBuzz.main(null);
			break;
		case "3" :
			System.out.println("Loading Rock, Paper, Scissors");	
			break;
		default:
			System.out.println("It's brok");	
			break;
		}		
	}
}
