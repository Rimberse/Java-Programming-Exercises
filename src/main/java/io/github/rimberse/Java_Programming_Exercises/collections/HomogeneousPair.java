package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

import io.github.rimberse.Java_Programming_Exercises.Pair;

/*public class HomogeneousPair<E> implements Iterable<E> {
	private Pair<E, E> pairs;
	
	public HomogeneousPair(Pair<E, E> pairs) {
		this.pairs = pairs;
	}

	/**
	 * Returns a <code>PairIterator<E></code> over elements of type E
	 */
	/*@Override
	public Iterator<E> iterator() {			// compiles at runtime, since the instance implements this interface
		return new PairIterator<>(pairs);
	}
}*/

public class HomogeneousPair<E> extends Pair<E, E> implements Iterable<E> {
	
	public HomogeneousPair(E left, E right) {
		super(left, right);
	}

	@Override
	public Iterator<E> iterator() {
		return new PairIterator<>(this);
	}
}