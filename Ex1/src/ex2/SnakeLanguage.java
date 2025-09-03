package ex2;

import java.util.Scanner;

public class SnakeLanguage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi, What do you want to translate to Snake Language?");
		
		String input = scanner.nextLine();
		
		String translatedInput = "";
		
		for (int i = 0; i < input.length(); i++) {
			if("aeiouAEIOU".contains(String.valueOf(input.charAt(i)))) {
				translatedInput = translatedInput + input.charAt(i) + "s" + input.charAt(i);
			} else {
				translatedInput += input.charAt(i);
			}
		}

		System.out.println("Translation: " + translatedInput);
	}

}
