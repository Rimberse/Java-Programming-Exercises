package io.github.rimberse.Java_Programming_Exercises.equality_and_hash_codes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Sock sock1 = new Sock(14, "black");
		Sock sock2 = new Sock(5, "White");
		Sock sock3 = new Sock(14, "black");
		Sock sock4 = new Sock(14, "Black");
		
		assertEquals(sock1, sock3);
		assertNotEquals(sock1, sock2);
		assertNotEquals(sock1, sock4);
		
		assertEquals(sock1.hashCode(), sock3.hashCode());
		assertNotEquals(sock1.hashCode(), sock2.hashCode());
		assertNotEquals(sock1.hashCode(), sock4.hashCode());

		Sock a = new Sock(5, "Red");
		Sock b = new Sock(5, "Red");
		Sock c = new Sock((int) (Math.random() * 25), "Blue");
		
		assertEquals(a, b);
		assertNotEquals(a, c);
		
		Set<Sock> lhs = new LinkedHashSet<>();
//		LinkedHashSet maintains an insertion order, meaning that every element points to the next
//		element within the set
		lhs.add(a);
		lhs.add(c);
		
		System.out.println(lhs.contains(a));
//		Returns true since a is already stored in it, a's instance variable are exactly the same,
//		set doesn't differentiate a and b, they are the same
		System.out.println(lhs.contains(b));
		System.out.println(lhs.contains(c));
	}
}