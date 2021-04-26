package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getLastName().compareTo(p2.getLastName());
	}
}
