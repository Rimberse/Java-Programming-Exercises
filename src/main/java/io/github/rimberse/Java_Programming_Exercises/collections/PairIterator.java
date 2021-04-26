package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

import io.github.rimberse.Java_Programming_Exercises.Pair;



//Exercise: defining iterables
public class PairIterator<E> implements Iterator<E> {		// this class is generic
	Pair<E, E> pairs;
	private boolean leftIterated = false;
	private boolean rightIterated = false;
	
	public PairIterator(Pair<E, E> pairs) {
		this.pairs = pairs;
	}
	
	/**
	 * Returns <code>true</code> if PairIterator has more elements: either <code>left</code> or <code>right</code>
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
	public E next() {
		if (!leftIterated) {
			leftIterated = true;
			return pairs.getLeft();
		} else if (!rightIterated) {
			rightIterated = true;
			return pairs.getRight();
		} else {
			throw new NoSuchElementException("No element to return");
		}
	}
}