package io.github.rimberse.Java_Programming_Exercises.flows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Objects;

import com.google.common.collect.Lists;

public class Person {
	private final String firstName;
	private final String lastName;
	
	public static Person given(String firstName, String lastName) {
		final Person person = new Person(firstName, lastName);
		return person;
	}
	
	private Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false;
		
		final Person person = (Person) obj;
		return this.firstName.equals(person.firstName) && this.lastName.equals(person.lastName);
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

	public static List<Person> readPersons(Reader reader) throws IOException {
		List<Person> persons = Lists.newArrayList();
		final StringBuilder sb = new StringBuilder();
		String firstN = null;
		String lastN = null;
		
		while (true) {
			final int read = reader.read();
			
			if (read == -1) {
				lastN = sb.toString();
				persons.add(new Person(firstN, lastN));
				break;
			}
			
			final char character = (char) read;
			sb.append(character);
			
			if (character == '\r') {
				reader.read();
			}
			
			if (Character.isWhitespace(character) && firstN == null) {
				sb.setLength(sb.length() - 1);
				firstN = sb.toString();
				sb.setLength(0);
			} else if (Character.isWhitespace(character) && lastN == null) {
				sb.setLength(sb.length() - 1);
				lastN = sb.toString();
				sb.setLength(0);
			}
			
			if (firstN != null && lastN != null) {
				persons.add(new Person(firstN, lastN));
				firstN = null;
				lastN = null;
			}
		}
		
		return persons;
	}
}
