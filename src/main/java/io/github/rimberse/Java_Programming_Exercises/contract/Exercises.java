package io.github.rimberse.Java_Programming_Exercises.contract;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercises {
	private static Scanner scanner;
	
	/**
	 * Initializes an instance variable with a Scanner object
	 */
	public static void init() {
		scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		init();
		
//		Eclipse console points to the line where the method calls caught an exception
//		randomFail();
//		randomFail();
//		randomFail();
		
//		Same thing also applies here
//		while (true) {
//			randomFailImpersonator();
//		}
		
//		System.out.println(printCapitalized(getInputString()));
		
//		System.out.println(convertToDecimal(getInputString()));
		
//		System.out.println(simulateRolling(getInputInteger()));
		
//		rollingExperiment(getInputIntegers());
		
		fillMosaicWithRandomColors();
		
		kill();
	}
	
	public static void randomFail() {
		double rand = Math.round(Math.random() * 2);
		
		if (rand == 1)
			throw new IllegalStateException();
	}
	
	public static void randomFailImpersonator() {
		randomFail();
		
		int rand = (int) (Math.random() * 101);
		if (rand <= 50)
			throw new IllegalStateException();
	}
	
	public static String getInputString() {
		System.out.println("Please insert a line which needs to be evaluated:");
		return scanner.nextLine();
	}
	
	public static int getInputInteger() {
		System.out.println("Please insert a number which needs to be evaluated:");
		return scanner.nextInt();
	}
	
	public static List<Integer> getInputIntegers() {
		List<Integer> numbers = new ArrayList<>();
		
		System.out.println("Please insert numbers which need to be evaluated:");
		while (scanner.hasNextInt()) {
			numbers.add(scanner.nextInt());
		}
		
		return numbers;
	}
	
	/**
	 * <strong>Exercise 4.1</strong>
	 * <p>
	 * Method accepts as an argument a String and returns a capitalized version of the same String
	 * <p>
	 * @param text The original String which needs to be capitalized
	 * @return <strong>String</strong> The capitalized String
	 * @throws IllegalArgumentException If the provided input String contains an alphanumeric values
	 * <p>
	 * {@code} <strong>An example</strong>: Input String <i>| Now is the time to act! |</i> would be transformed into
	 * an output String <i>| Now Is The Time To Act! |</i>
	 * <p>
	 * @author Kerim H.
	 */
	public static String printCapitalized(String text) {
		String[] words = text.split("\\s");
		StringBuilder sb = new StringBuilder();
		
		for (String word : words) {
			char firstLetter = word.charAt(0);
			
			if (Character.isLetter(firstLetter)) {
				sb.append(Character.toUpperCase(firstLetter));
				sb.append(word.substring(word.indexOf(firstLetter) + 1));
			} else {
				throw new IllegalArgumentException("Only text containing letters are allowed, not applicable to any alphanumeric characters or digits");
			}
			
			sb.append(" ");
		}
		
		return sb.toString();
	}
	
	/**
	 * <strong>Exercise 4.2</strong>
	 * <p>
	 * Converts a given hexadecimal string to decimal value
	 * @return <strong>int</strong> - calculated decimal value
	 */
	public static int convertToDecimal(String str) {
		int value = 0;
		for (int i = 0; i < str.length(); i++ ) {
			int hexValue =  hexValue(str.charAt(i));
			if (hexValue != -1)
				value = value * 16 + hexValue(str.charAt(i));
			else
				throw new IllegalArgumentException("Only hexadecimal digits are allowed!");
		}
		
		return value;
	}
	
	/**
	 * <strong>Exercise 4.2</strong>
	 * <p>
	 * Returns a decimal representation of a given character
	 * @return <strong>int</strong> - decimal value
	 */
	public static int hexValue(char hexValue) {
		
		switch (Character.toUpperCase(hexValue)) {
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		case 'A':
			return 10;
		case 'B':
			return 11;
		case 'C':
			return 12;
		case 'D':
			return 13;
		case 'E':
			return 14;
		case 'F':
			return 15;
		default:
			return -1;
		}
	}
	
	/**
	 * <strong>Exercise 4.3</strong>
	 * <p>
	 * Rolls a dice and returns a randomly generated number
	 * @return <strong>int</strong> - roll value
	 */
	public static int rollDice() {
		Random random = new Random();
		int rand = 1 + random.nextInt(6);
		return rand;
	}
	
	/**
	 * <strong>Exercise 4.3</strong>
	 * <p>
	 * Rolls two dices until the total of these dices won't be equal to the provided number.
	 * @throws IllegalArgumentException if the the provided value is incorrect
	 * @return <strong>int</strong> - how many rolls it took to obtain the total
	 */
	public static int simulateRolling(int desiredTotal) {
		if (desiredTotal < 2 || desiredTotal > 12)
			throw new IllegalArgumentException("Provided value can't be obtained as a total of 2 dice rolls");
		
		int i = 0;
		
		while (true) {
			int dice1 = rollDice();
			int dice2 = rollDice();
			
			if (dice1 + dice2 == desiredTotal)
				return i;
			
			i++;
		}
	}
	
	/**
	 * <strong>Exercise 4.4</strong>
	 * <p>
	 * Calls simulateRolling method 10000 times
	 * @return <strong>double</strong> - average number of the attempts took to roll the desired total
	 */
	public static double avgNumberRolls(int desiredTotal) {
		double avg = 0d;
		
		for (int i = 0; i < 10000; i++) {
			avg += simulateRolling(desiredTotal);
		}
		
		return avg / 10000;
	}
	
	/**
	 * <strong>Exercise 4.4</strong>
	 * <p>
	 * Calls avgNumberRolls method for each total provided in a list as an argument. Prints the average number of attempts for each total
	 */
	public static void rollingExperiment(List<Integer> desiredTotals) {
		System.out.println("Total On Dice     Average Number of Rolls\n"
						 + "-------------     -----------------------");
		
		for (int total : desiredTotals) {
			System.out.println("       " + total + "               " + avgNumberRolls(total));
		}
	}
	
	/**
	 * <strong>Exercise 4.7</strong>
	 * <p>
	 * 
	 */
	public static void fillMosaicWithRandomColors() {
		// Left for later, cannot continue due to the problem with JavaFX (Black Screen appearing when the application is launched)
	}
	
	/**
	 * Closes scanner
	 */
	public static void kill() {
		scanner.close();
	}
}