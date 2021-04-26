package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.List;
import java.util.Optional;

public interface EasyMap {
	
	public static EasyMap create() {
		final EasyMapImpl easyMap = new EasyMapImpl();
		return easyMap;
	}
	
	public void put(String lastName, Person person);
	public Optional<Person> get(String key);
	public List<Person> valuesOrdered();
	public void printContent();
}
