package ex3;

import java.util.Scanner;

public class PizzaDeluxe {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] toppings = {"Salami", "Pineapple", "Cheese", "Spinach", "Garlic"};
		
		double[] prices = {1.0, 1.5, 1.0, 0.8, 0.5};
		
		System.out.println("Welcome to Pizza Deluxe! This is our menu:");
		System.out.println();
		
		// Print all toppings with their prizes
		
		for(int i = 0; i < toppings.length; i++) {
			System.out.println((i+1)+ " " + toppings[i] + " " + prices[i]);
		}
		
		
		double totalPrice = 0.0;
		String funnyMessage = "";
		
		System.out.println();
		System.out.println("Choose your toppings! (e.g., 1 3 4): ");
		String input = scanner.nextLine();
		String[] choices = input.split(" ");
		
		//Interpret all entries in choices as integer
		//Look up the prices and add them up
		//Look up the toppings / combinations for a funny message
		
		for(int i = 0; i<choices.length; i++) {
			totalPrice += prices[Integer.parseInt(choices[i])-1];
		}
		
		if(totalPrice > 4.00) {
			funnyMessage += "High roller! ";
		}
		
		//print the total price and the funny message
		System.out.println(funnyMessage);
		System.out.println("The total price is " + totalPrice);
		
		
	}

}
