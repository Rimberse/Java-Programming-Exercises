package io.github.rimberse.Java_Programming_Exercises.equality_and_hash_codes;

import java.util.Objects;

public class Sock {
	private int size;
	private String color;
	
	public Sock(int size, String color) {
		this.size = size;
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(size, color);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Sock))
			return false;
		
		Sock sock = (Sock) obj;
		return this.size == sock.size && this.color == sock.color;
	}

	@Override
	public String toString() {
		return "Sock size = " + size + ", color = " + color;
	}
}