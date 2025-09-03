package ex1;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		int numberToGuess = (int)(Math.random()*20)+1;
		Scanner scanner = new Scanner(System.in);
		// Variables that manage the game's state
		System.out.println("Welcome to Guess the Number where you guess a random number between 1 and 20! How many attempts do you need? ");
		
		Scanner sattempts = new Scanner(System.in);
		int attempts = sattempts.nextInt();
		

		//TODO: Loop until the correct guess or 5 attempts are used
		// Give hints: "Too high", "Too low"
		// Print win/ lose message
		
		for(int i=0; i<attempts; i++) {
			System.out.println("Guess the number! " + (attempts-i) + " attempts left: ");
			
			int input = scanner.nextInt();
			
			if(input > 20 || input < 1) {
				System.out.println("Only between 1 and 20!");	
			}else {
			
				if(input == numberToGuess) {
					System.out.println("Correct! And you only needed " + (i+1) + " attempts! Nice job!");
					break;
				} else if (input > numberToGuess) {
					System.out.println("Too high!");
				} else {
					System.out.println("Too low!");
				}
			}
			if(i == attempts-1) {
				System.out.println("No attempts left, game over! The number was " + numberToGuess);
				break;
			}
		}	
		scanner.close();
		sattempts.close();
	}

}
