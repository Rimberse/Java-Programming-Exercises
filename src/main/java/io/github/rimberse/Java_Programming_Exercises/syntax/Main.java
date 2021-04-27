package io.github.rimberse.Java_Programming_Exercises.syntax;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
//		Short exercices
		/* 1. Assign your first name to a variable and use it to print Hello <your-first-name>. */
//		String firstName = "Kerim";
//		System.out.println("Hello " + firstName);

		/* 2. Assign your age to a variable and use it to print <your-age> is my age! */
//		int age = 20 + new Random().nextInt(11);
//		System.out.println(age + " is my age!");

		/* 3. Assign each digit of your age to different variables; use them to print <your-age> is my age! */
//		int secondDigit = age % 10;
//		int firstDigit = age / 10;
//		System.out.println(firstDigit + "" + secondDigit + " is my age!");

		/* 4. Create a boolean variable whose value is true, another one whose value is false,
		and use them to create an expression that evaluates to true and one that evaluates to false */
//		boolean exp1 = true && false;
//		boolean exp2 = true || false;

		/* 5. Assign any number you like to an integer variable. Create an expression that evaluates to true if, and only if,
		that variable equals your age. (Test it by changing the value of the variable and running the expression again.) */
//		int randInt = getRandomNumber(100);
//		System.out.println(randInt == age);
//		int anotherRandInt = getRandomNumber(50);
//		System.out.println(anotherRandInt == age);

		/* 6. Assign the value "true" to a variable of type String. Create an expression that evaluates to true if, and only if,
		the value of that variable is equal to the String "true". Use the method s1.equals(s2) to test for equality of two strings s1 and s2. */
//		String stringBoolean = "true";
//		if (stringBoolean.equals("true")) {
//			System.out.println("Passed...");
//		}
		
		
//		Methods
		/* 1. Assign 4659 and 23 to variables, and show the result of multiplying these variables */
//		multiplyTwoNumbers(4659, 23);

		/* 2. Compute and show the greatest divisor of 4659 that is different than 4659 (use the % operator and a loop) */
//		for (int i = 4658; i > 0; i--) {
//			if (4659 % i == 0) {
//				System.out.println(i);
//				break;
//			}
//		}

		/* 3. Define a method that computes and show the greatest divisor of 4659 that is different than 4659 */
//		greatestDivisorOf4659();

		/* 4. Define a method that accepts an integer parameter and returns its greatest divisor except itself;
		use it to show the greatest divisor of 4659. */
//		greatestDivisor(4659);
		
		
//		Exercise: Varargs
//		We have to always pass an expected format type as a first argument, the second argument gets formatted as indicated
		System.out.println(String.format("Hello %s!", "there"));
		
		String date = Calendar.getInstance().getTime().toString().split(":")[0];
		date = date.substring(0, date.length() - 2).trim();
		String time = Calendar.getInstance().getTime().toString();
		time = time.substring(time.indexOf(":") - 2).split("\\s")[0].trim();
		System.out.println(String.format("Current date: %s, Current time: %s", date, time));
		
		System.out.println(String.format("Rolled three random numbers: %d | %.3f | %.5f", 
				(int) (Math.random() * 100), (Math.random() * 10000), (Math.random() * 100000)));
	}
	
	public static int getRandomNumber(int maxValue) {
		return (int)(Math.random() * maxValue);
	}
	
	public static int multiplyTwoNumbers(int a, int b) {
		return a * b;
	}
	
	public static void greatestDivisorOf4659() {
		int number = 4658;

		while (true) {
			if (4659 % number == 0) {
				System.out.println(number);
				break;
			}
			number -= 1;
		}
	}
	
	public static int greatestDivisor(int number) {
		int n = number - 1;

		while (true) {
			if (number % n == 0) {
				return n;
			}
			n -= 1;
		}
	}
}