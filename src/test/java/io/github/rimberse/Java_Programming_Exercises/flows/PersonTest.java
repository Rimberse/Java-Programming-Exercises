package io.github.rimberse.Java_Programming_Exercises.flows;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

public class PersonTest {
	
	@Test
	public void testReadPersons() throws IOException {
		final String person = "Jean-Luc\nPicard";
		StringReader reader = new StringReader(person);
		assertEquals(Person.given("Jean-Luc", "Picard"), Person.readPersons(reader).get(0), "Persons don't match");
	}
}
