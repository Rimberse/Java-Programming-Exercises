package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetUnion implements E1 {
	private static Scanner scanner = new Scanner(System.in);
	
	@Override
	public Set<Integer> getIntegerValuesFromUser() {
		Set<Integer> set = new TreeSet<>();			// new LinkedHashSet<>();

		int value = 0;
			
		if (scanner.hasNextInt()) {
			while (scanner.hasNextInt()) {
				value = scanner.nextInt();
					
				if (value == 0)
					break;
					
				set.add(value);
			}
		} else {
			String input = scanner.nextLine();
			String[] numbers = input.split("\\,");
				
			for (String number : numbers) {
				value = Integer.parseInt(number.trim());
					
					
				if (value == 0) {
					break;
				}
					
				set.add(value);
			}
		}
		
		return set;
	}
	
	@Override
	public Set<Integer> getSetUnion(Set<Integer> firstSet, Set<Integer> secondSet) {
		firstSet.addAll(secondSet);
		return firstSet;
	}
}