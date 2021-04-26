package io.github.rimberse.Java_Programming_Exercises.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.github.rimberse.Java_Programming_Exercises.Pair;

class PairIteratorTests {
	
	@Test
	void testPairIteratorNextWithPair23() {
		Pair<Integer, Integer> pair = new Pair<>(2, 3);
		PairIterator<Integer> pairIterator = new PairIterator<>(pair);
		assertTrue(pairIterator.hasNext());
		assertEquals(2, pairIterator.next());
		assertTrue(pairIterator.hasNext());
		assertEquals(3, pairIterator.next());
		assertFalse(pairIterator.hasNext());
	}
}