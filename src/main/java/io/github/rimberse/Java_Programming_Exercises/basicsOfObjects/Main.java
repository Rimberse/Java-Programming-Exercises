package io.github.rimberse.Java_Programming_Exercises.basicsOfObjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner scan;
	
	public static void main(String[] args) {
		init();
		
//		exercise2_2();
//		exercise2_3();
//		exercise2_4();
//		exercise2_5();
//		exercise2_6();
//		exercise2_7();
//		exercise3_1();
//		exercise3_2();
//		exercise3_3();
//		exercise3_4();
//		exercise3_5();
		exercise3_6();
		
		terminate();
	}
	
	public static void init() {
		if (scan == null)
			scan = new Scanner(System.in);
	}
	
	public static void terminate() {
		if (scan != null)
			scan.close();
	}
	
	public static void exercise2_2() {
		 int[] dices = new int[2];
		 dices[0] = rollDice();
		 dices[1] = rollDice();
		 
		 System.out.println("The first die comes up " + dices[0]);
		 System.out.println("The second die comes up " + dices[1]);
		 System.out.println("Your total roll is " + (dices[0] + dices[1]));
	}
	
	public static void exercise2_3() {
		 System.out.println("Enter your name:");
		 String name = scan.nextLine().toUpperCase();
		 System.out.println("Hello, " + name + ", nice to meet you!");
	}
	
	public static void exercise2_4() {
		System.out.println("Enter the amount of quarters you have:");
		int quarters = scan.nextInt();
		System.out.println("Enter the amount of dimes you have:");
		int dimes = scan.nextInt();
		System.out.println("Enter the amount of nickels you have:");
		int nickels = scan.nextInt();
		System.out.println("Enter the amount of pennies you have:");
		int pennies = scan.nextInt();
		
		System.out.println("You have: " + ((pennies * 0.01) + (nickels * 0.05) + (dimes * 0.1) + (quarters * 0.25)) + "$");
	}
	
	public static void exercise2_5() {
		System.out.println("How many egges do you have?:");
		int eggs = scan.nextInt();
		int dozenEggs = eggs / 12;
		int leftOverEggs = eggs % 12;
		System.out.println("Your number of eggs is " + dozenEggs + " dozen eggs and " + leftOverEggs + " are left over");
		
		// extended version
		int grossEggs = eggs / 144;
		dozenEggs = (eggs - grossEggs * 144) / 12;
		leftOverEggs = (eggs - grossEggs * 144) - dozenEggs * 12;
		System.out.println("Your number of eggs is " + grossEggs + " gross, " + dozenEggs + " dozen, and " + leftOverEggs);
	}
	
	public static void exercise2_6() {
		System.out.println("Please enter your First name and Last name, separated by a space:");
		String input = scan.nextLine();
		String[] words = input.split("\\s");
		
		String firstName;
		String lastName;
		
		if (words.length == 2) {
			firstName = words[0];
			lastName = words[1];
		} else {
			throw new IllegalArgumentException("More than two words were entered");
		}
		
		System.out.println("Your first name is " + firstName + ", which has " + firstName.length() + " characters");
		System.out.println("Your last name is " + lastName + ", which has " + lastName.length() + " characters");
		System.out.println("Your initials are " + Character.toUpperCase(firstName.charAt(0)) + "" + Character.toUpperCase(lastName.charAt(0)));
	}
	
	public static void exercise2_7() {
		File file = new File("testdata.txt");
		
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			throw new IllegalStateException(e.getStackTrace() + "\nFile hasn't been found");
		}
		
		String studentName = "";
		int[] studentGrades = new int[3];
		int i = 0;
		
		if (scan.hasNextLine())
			studentName = scan.nextLine();
		
		while(scan.hasNextLine()) {
			studentGrades[i] = scan.nextInt();
			i++;
		}
		
		int average = 0;
		for (int grade : studentGrades) {
			average += grade;
		}
		
		System.out.printf("Student's name: %s, average grade: %.2f", studentName, (double) average / studentGrades.length);
	}
	
	public static void exercise3_1() {
		int nbRolls = 0;
		int dice1;
		int dice2;
		
		do {
			dice1 = rollDice();
			dice2 = rollDice();
			nbRolls++;
		} while (dice1 != 1 || dice2 != 1);
		
		System.out.println("Total amount of rolls taken: " + nbRolls);
	}
	
	public static void exercise3_2() {
		int[] integers = new int[10000];
		List<List<Integer>> divisors = new ArrayList<>();
		
		for (int i = 0; i < integers.length; i++) {
			integers[i] = i + 1;
			divisors.add(new ArrayList<>());
			
			for (int j = 1; j <= integers[i] / 2; j++) {
				if (integers[i] % j == 0) {
					divisors.get(i).add(j);
				}
			}
			
			divisors.get(i).add(integers[i]);
		}
		
		int largestNbDivisorsNumber = 0;
		int nbDivisors = 0;
		List<Integer> alternatives = new ArrayList<>();
		
		for (int integer : integers) {
			if (divisors.get(integer - 1).size() > nbDivisors) {
				nbDivisors = divisors.get(integer - 1).size();
				largestNbDivisorsNumber = integer;
			} else if (divisors.get(integer - 1).size() == nbDivisors) {
				alternatives.add(integer);
				
				if (alternatives.size() > 1 && divisors.get(alternatives.get(alternatives.size() - 2)).size() != nbDivisors) {
					alternatives.clear();
				}
				
				alternatives.add(integer);
			}
			
//			System.out.println("Number |" + integer + "| - divisors: " + divisors.get(integer - 1));
		}
		
		System.out.println("Among integers between 1 and 10000,\nThe maximum number of divisors was " + nbDivisors + 
				"\nNumbers with that many divisors include:\n" + largestNbDivisorsNumber);
		
		for (int integer : alternatives) {
			System.out.println(integer);
		}
	}
	
	public static void exercise3_3() {
		while(true) {
			// Exception is caught if any of the two numbers entered contain a period,
			// they should contain a comma instead, since we are in EU
			System.out.println("Enter first number:");
			double firstNumber = scan.nextDouble();
			if (firstNumber == 0)
				break;
			System.out.println("Enter an operator:");
			char operator = scan.next().charAt(0);
			System.out.println("Enter second number:");
			double secondNumber = scan.nextDouble();
			if (secondNumber == 0 && operator == '/')
				continue;
			double result = 0;
			
			switch(operator) {
			case '+':
				result = firstNumber + secondNumber;
				break;
			case '-':
				result = firstNumber - secondNumber;
				break;
			case '*':
				result = firstNumber * secondNumber;
				break;
			case '/':
				result = firstNumber / secondNumber;
				break;
			default:
				throw new IllegalArgumentException();
			}
			
			System.out.printf("Result: %.2f\n", result);
		}
	}
	
	public static void exercise3_4() {
		String input = scan.nextLine();
		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				System.out.print(input.charAt(i));
					
			} else if (Character.isWhitespace(input.charAt(i))) {
				System.out.print("\n");
					
			} else if (Character.isLetter(input.charAt(i - 1)) && Character.isLetter(input.charAt(i + 1))) {
				System.out.print(input.charAt(i));
			}
		}
	}
	
	public static void exercise3_5() {
		File file = new File("sales.dat");
		
		try {
			scan = new Scanner(file);
		} catch(Exception e) {
			throw new IllegalStateException(e.getStackTrace() + "\nFile hasn't been found");
		}
		
		Double totalSales = 0d;
		int missingData = 0;
		
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] words = line.split(":");
			
			try {
				totalSales += Double.parseDouble(words[1]);
			} catch (@SuppressWarnings("unused") NumberFormatException e) {
				if (words[1].trim().equals("no report received"))
					missingData++;
			}
		}
		
		System.out.println("Total sales: " + totalSales);
		System.out.println("The number of cities with a missing data: " + missingData);
	}
	
	public static void exercise3_6() {
//		Already done in exercise3_2
		exercise3_2();
	}

	public static int rollDice() {
		return (int) (Math.random() * 6) + 1;
	}
}