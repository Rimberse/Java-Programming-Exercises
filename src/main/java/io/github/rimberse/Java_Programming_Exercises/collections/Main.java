package io.github.rimberse.Java_Programming_Exercises.collections;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Predicate;

import com.google.common.base.Optional;

import io.github.rimberse.Java_Programming_Exercises.Pair;

public class Main {
	public static void main(String[] args) {
//		Exercise: defining iterables
		/*Pair<String, String> stringPair = new Pair<>("String 1", "String 2");
		StringPairIterator stringPairIterator = new StringPairIterator(stringPair);
		
		Pair<Integer, Integer> intPairs = new Pair<>(25, 77);
		PairIterator<Integer> pairIterator = new PairIterator<>(intPairs);
		
//		Pair<Double, Double> doublePairs = new Pair<>(13.77d, 89.35d);
//		HomogeneousPair<Double> doublePairIterator = new HomogeneousPair<>(doublePairs);
		
		HomogeneousPair<String> homogenousPairs = new HomogeneousPair<>("Left", "Right");
		
		while (stringPairIterator.hasNext()) {
			System.out.println(stringPairIterator.next());
		}
		
		while (pairIterator.hasNext()) {
			System.out.println(pairIterator.next());
		}
		
//		for (double d : doublePairIterator) {
//			System.out.println(d);
//		}
		
		for (String string : homogenousPairs) {
			System.out.println(string);
		}*/
		
//		Exercise 10.4
		/*Collection<Integer> list = new ArrayList<>();
		
		for (int i = 0; i <= 25; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
//		Predicates.remove(list, new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer t) {
//				if (t < 5)
//					return true;
//				return false;
//			}
//		});
		Predicates.remove(list, number -> number < 5);
		System.out.println(list);
		
		Predicates.retain(list, number -> number < 21);
		System.out.println(list);
		
		System.out.println(Predicates.collect(list, number -> number < 11));
		System.out.println(Predicates.find(new ArrayList<>(list), number -> number > 5));*/
		
//		Exercise 7.6
		/*File file = new File("textFile.txt");
		Set<String> set = new TreeSet<>();
		
		try (Scanner reader = new Scanner(file)) {
			
			while (reader.hasNext()) {
				String word = reader.next().toLowerCase();
				if (word.contains("\'")) {
					int index = word.indexOf("\'");
					
					if (!Character.isLetter(word.charAt(index - 1)) || !Character.isLetter(word.charAt(index + 1)))
						word = word.split("\'")[0];
					
				} else if (word.contains(",")) {
					word = word.split("\\,")[0];
				} else if (word.contains(".")) {
					if (Character.isLetter(word.charAt(0)))
						word = word.split("\\.")[0];
				} else if (word.contains("?")) {
					word = word.split("\\?")[0];
				} else if (word.contains("!")) {
					word = word.split("\\!")[0];
				} else if (word.contains("(")) {
					word = word.split("\\(")[1];
				} else if (word.contains(")")) {
					word = word.split("\\)")[0];
				} else if (word.contains("\"")) {
					if (Character.isLetter(word.charAt(0)))
						word = word.split("\"")[0];
					else
						word = word.split("\"")[1];
				}
				
				set.add(word);
			}
		} catch (FileNotFoundException e) {
			throw new IllegalStateException(e);
		}
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("uniqueWords.txt")))) {
			for (String word : set) {
				writer.write(word);
				writer.newLine();
			}
		
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}*/
		
//		Exercise 10.2
		/*try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Please write your numbers for two sets within [], "
						+ "separated by a desired operation ('+', '-' or '*') or type 'quit' to stop:");
				String line = scanner.nextLine();
				if (line.equalsIgnoreCase("quit"))
					break;
				
				if (line.charAt(0) != '[')
					throw new InputMismatchException("Input rule violation!");
			
				String firstNumbers = line.split("\\]")[0].replace("[", "");
				char operation = line.split("\\]")[1].split("\\s")[1].charAt(0);
				String secondNumbers = line.split("\\]")[1].split("\\[")[1];
				
				Set<Integer> firstSet = new TreeSet<>();
				Set<Integer> secondSet = new TreeSet<>();
				
				for (String number : firstNumbers.split("\\,")) {
					int n = Integer.parseInt(number.trim());
					if (n < 0)
						throw new InputMismatchException("No negative integers are allowed!");
					firstSet.add(n);
				}
				
				for (String number : secondNumbers.split("\\,")) {
					int n = Integer.parseInt(number.trim());
					if (n < 0)
						throw new InputMismatchException("No negative integers are allowed!");
					secondSet.add(n);
				}
				
				switch(operation) {
				case '+':
					firstSet.addAll(secondSet);
					break;
				case '-':
					firstSet.removeAll(secondSet);
					break;
				case '*':
					firstSet.retainAll(secondSet);
					break;
				default:
					throw new UnsupportedOperationException("Not supported operation");
				}
				
				System.out.println("Input                                 Output\n"
						+ "-------------------------           -------------------\n"
						+ line +            "              " + firstSet);
			}
		}*/
		
		
//		Exercise 7.1
		/*List<Integer> result = createListContainingRandomNumbers(50, 50);
		result.sort((n1, n2) -> n1.compareTo(n2));
		System.out.println(result);
		System.out.println(createListContainingRandomNumbers(16, 15));*/
		
		
//		Exercise 7.5
		/*try (Scanner scanner = new Scanner(System.in)) {
			List<Double> realNumbers = new ArrayList<>();
			
			System.out.println("Please enter a sequence of positive real numbers, type 0 to end:");
			
			while (scanner.hasNextDouble()) {
				double input = scanner.nextDouble();
				
				if (input == 0d)
					break;
				else if (input < 0d)
					throw new InputMismatchException("Only positive numbers are allowed!");
				else
					realNumbers.add(input);
			}
			
			realNumbers.sort((n1, n2) -> n1.compareTo(n2));
			System.out.println(realNumbers);
		}*/
		
		
//		Exercise: using collections
//		SetUnion setUnion = new SetUnion();
//		System.out.println("Type integer values for the first set, typing 0 will result in aborting taking input:");
//		Set<Integer> firstSet = setUnion.getIntegerValuesFromUser();
//		System.out.println("Type integer values for the second set, typing 0 will result in aborting taking input:");
//		Set<Integer> secondSet = setUnion.getIntegerValuesFromUser();
//		System.out.println(firstSet);
//		System.out.println(secondSet);
//		System.out.println(setUnion.getSetUnion(firstSet, secondSet));
		
		
//		Exercise 10.1
//		PhoneDirectory directory = new PhoneDirectory();
//		System.out.println(directory.getNumber("John"));
//		directory.putNumber("John", "+1 2345 948");
//		System.out.println(directory.getNumber("John"));
//		directory.putNumber("John", "+42 12345 094");
//		System.out.println(directory.getNumber("John"));
//		directory.putNumber("Chris", "+0 12345 2354");
//		System.out.println(directory.getNumber("Chris"));
		
		
		// EasyMap exercise
//		Person p1 = Person.given("Clark", "Kent");
//		Person p2 = Person.given("Bruce", "Wayne");
//		Person p3 = Person.given("Thomas", "Wayne");
//		Person p4 = Person.given("Arthur", "Curry");
//		
//		EasyMap map = EasyMap.create();
//		map.put("Kent", p1);
//		map.put("Wayne", p2);
//		
//		try {
//			map.put("Wayne", p3);
//		} catch (IllegalArgumentException e) {
//			System.out.println(e);
//		}
//		
//		map.put("Curry", p4);
//		System.out.println(map.get("Kent"));
//		System.out.println(map.get("Allen"));
//		System.out.println(map.get("Wayne"));
//		
//		map.printContent();
//		System.out.println(map.valuesOrdered());
		
		
//		Exercise 10.3
		HashTable<String, String> table = HashTable.create();
		if (table.size() != 0)
			throw new IllegalStateException();
		
		table.put("One", "Lorem ipsum......");
		table.put("Two", "Some random string here");
		table.put("Three", "sadasdfasdasdsadfbdbfdbdb");
		
		System.out.println(table.get("One"));
		System.out.println(table.get("Four"));
		
		System.out.println(table.constainsKey("Three"));
		table.remove("Three");
		System.out.println(table.constainsKey("Five"));
		System.out.println(table.constainsKey("Three"));
		
		if (table.size() != 2)
			throw new IllegalStateException();
		
		
		HashTable<Integer, Integer> tableInt = HashTable.create();
		tableInt.put(1, 12345);
		tableInt.put(2, 67890);
		tableInt.put(3, 342458454);
		
		System.out.println(tableInt.get(2));
		System.out.println(tableInt.get(4));
		
		System.out.println(tableInt.constainsKey(1));
		tableInt.remove(1);
		System.out.println(tableInt.constainsKey(1));
	}
	
	public static List<Integer> createListContainingRandomNumbers(int numberOfInts, int maxValue) {
		if (numberOfInts > maxValue)
			throw new IllegalArgumentException("Can't have " + numberOfInts + " different integers from 1 to " + maxValue);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < numberOfInts; i++) {
			int randomNumber = 1 + (int) (Math.random() * maxValue);
			
			while (numbers.contains(randomNumber)) {
				randomNumber = 1 + (int) (Math.random() * maxValue);
			}
			
			numbers.add(randomNumber);
		}
		
		return numbers;
	}
}