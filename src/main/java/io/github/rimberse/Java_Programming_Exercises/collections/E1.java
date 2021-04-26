package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.Set;

public interface E1 {
	/**
	 * Lets the user enter integer values. 0 as an input forces the method to stop taking values
	 * @return Set<Integer>
	 */
	public Set<Integer> getIntegerValuesFromUser();
	
	
	/**
	 * Returns a union of two sets
	 * @param firstSet
	 * @param secondSet
	 * @return Set<Integer>
	 */
	public Set<Integer> getSetUnion(Set<Integer> firstSet, Set<Integer> secondSet);
}