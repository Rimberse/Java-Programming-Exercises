package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

import io.github.rimberse.Java_Programming_Exercises.Pair;

//Exercise: defining iterables
public class StringPairIterator implements Iterator<String> {	// Not generic class, but the interface is generic
	Pair<String, String> stringPairs;
	private boolean leftIterated = false;
	private boolean rightIterated = false;
	
	public StringPairIterator(Pair<String, String> stringPairs) {
		this.stringPairs = stringPairs;
	}

	/**
	 * Returns <code>true</code> if StringPairIterator has more elements: either <code>left</code> or <code>right</code>
	 */
	@Override
	public boolean hasNext() {
		if (!leftIterated || !rightIterated)
			return true;
		
		return false;
	}

	/**
	 * Returns either <code>left</code> or <code>right</code> element.
	 * @throws NoSuchElementException if both left and right elements were already iterated
	 */
	@Override
	public String next() {
		if (!leftIterated) {
			leftIterated = true;
			return stringPairs.getLeft();
		} else if (!rightIterated) {
			rightIterated = true;
			return stringPairs.getRight();
		} else {
			throw new NoSuchElementException("No element to return");
		}
	}
}