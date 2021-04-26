package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.Objects;

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
	public String toString() {
		return firstName + " " + lastName;
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
		return firstName.equals(person.firstName) && lastName.equals(person.lastName);
	}
}
