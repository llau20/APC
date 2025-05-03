package a2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
	
	/** 
	 * returns true if the two strings are anagrams of each other
	 */
	public static boolean isAnagram(String a, String b) {
		// TODO: implement using countLetters()
		int[] countsA = countLetters(a);
		int[] countsB = countLetters(b);
		
		//System.out.println(Arrays.toString(countsA));
		//System.out.println(Arrays.toString(countsB));
		
		return Arrays.equals(countsA, countsB);
	}
	
	/**
	 * Helper method to count how many times each letter (a--z) appears
	 */
	
	public static int[] countLetters(String s) {
		int[] counts = new int[26];
		//TODO: fill array with letter frequencies
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') {
				counts[0]++;
				continue;
			} else if(s.charAt(i) == 'b') {
				counts[1]++;
				continue;
			} else if(s.charAt(i) == 'c') {
				counts[2]++;
				continue;
			}else if(s.charAt(i) == 'd') {
				counts[3]++;
				continue;
			}else if(s.charAt(i) == 'e') {
				counts[4]++;
				continue;
			}else if(s.charAt(i) == 'f') {
				counts[5]++;
				continue;
			}else if(s.charAt(i) == 'g') {
				counts[6]++;
				continue;
			}else if(s.charAt(i) == 'h') {
				counts[7]++;
				continue;
			}else if(s.charAt(i) == 'i') {
				counts[8]++;
				continue;
			}else if(s.charAt(i) == 'j') {
				counts[9]++;
				continue;
			}else if(s.charAt(i) == 'k') {
				counts[10]++;
				continue;
			}else if(s.charAt(i) == 'l') {
				counts[11]++;
				continue;
			}else if(s.charAt(i) == 'm') {
				counts[12]++;
				continue;
			}else if(s.charAt(i) == 'n') {
				counts[13]++;
				continue;
			}else if(s.charAt(i) == 'o') {
				counts[14]++;
				continue;
			}else if(s.charAt(i) == 'p') {
				counts[15]++;
				continue;
			}else if(s.charAt(i) == 'q') {
				counts[16]++;
				continue;
			}else if(s.charAt(i) == 'r') {
				counts[17]++;
				continue;
			}else if(s.charAt(i) == 's') {
				counts[18]++;
				continue;
			}else if(s.charAt(i) == 't') {
				counts[19]++;
				continue;
			}else if(s.charAt(i) == 'u') {
				counts[20]++;
				continue;
			}else if(s.charAt(i) == 'v') {
				counts[21]++;
				continue;
			}else if(s.charAt(i) == 'w') {
				counts[22]++;
				continue;
			}else if(s.charAt(i) == 'x') {
				counts[23]++;
				continue;
			}else if(s.charAt(i) == 'y') {
				counts[24]++;
				continue;
			}else if(s.charAt(i) == 'z') {
				counts[25]++;
				continue;
			}
		}
		
		return counts;
	}
	
	/**
	 * Print only letters that appear in the string with their counts.
	 */
	public static void printLetterCounts(String s) {
		// TODO: implement nicely formatted output
		int[] counts = countLetters(s);
		
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0) {
				System.out.println((char)('a' + i) + ": " + counts[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Get two strings from the user
		System.out.println("Enter the first string: ");
		String word1 = scanner.nextLine();
		
		System.out.println("Enter the second string: ");
		String word2 = scanner.nextLine();
		
		// TODO: Process the strings here (ignore spaces, case)   ?? verstehe nicht was man hier machen soll
		
		System.out.println("Are they anagrams? " + isAnagram(word1, word2));		
		
		printLetterCounts(word1);
	}

}
