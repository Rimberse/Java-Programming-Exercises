package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
	/**
	 * Removes every object, obj, from coll for which pred.test(obj) is true. 
	 * (This does the same thing as coll.removeIf(pred).)
	 * @param <T>
	 * @param coll
	 * @param pred
	 */
	public static <T> void remove(Collection<T> coll, Predicate<T> pred) {
		List<T> newColl = new ArrayList<>(coll);
		
		for (T obj : newColl) {
			if (pred.test(obj))
				coll.remove(obj);
		}
	}
	 
	/**
	 * Removes every object, obj, from coll for which pred.test(obj) is false. 
	 * (That is, retain the objects for which the predicate is true.)
	 * @param <T>
	 * @param coll
	 * @param pred
	 */
	public static <T> void retain(Collection<T> coll, Predicate<T> pred) {
		List<T> newColl = new ArrayList<>(coll);
		
		for (T obj : newColl) {
			if (!pred.test(obj))
				coll.remove(obj);
		}
	}
	   
	/**
	 * Returns a List that contains all the objects, obj, 
	 * from the collection, coll, such that pred.test(obj) is true.
	 * @param <T>
	 * @param coll
	 * @param pred
	 * @return
	 */
	public static <T> List<T> collect(Collection<T> coll, Predicate<T> pred) {
		List<T> newColl = new ArrayList<>();
		
		for (T obj : coll) {
			if (pred.test(obj))
				newColl.add(obj);
		}
		
		return newColl;
	}
	   
	/**
	 * Returns the index of the first item in list for which the predicate is true, if any. 
	 * If there is no such item, returns -1.
	 * @param <T>
	 * @param list
	 * @param pred
	 * @return
	 */
	public static <T> int find(ArrayList<T> list, Predicate<T> pred) {
		for (T obj : list) {
			if (pred.test(obj))
				return list.indexOf(obj);
		}
		
		return -1;
	}
}