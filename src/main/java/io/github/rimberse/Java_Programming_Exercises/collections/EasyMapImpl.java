package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import java.util.Optional;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset.Entry;

public class EasyMapImpl implements EasyMap {
	private Map<String, Person> persons;
	
	protected EasyMapImpl() {
		this.persons = Maps.newLinkedHashMap();
	}

	@Override
	public void put(String lastName, Person person) {
		if (lastName == null || person == null || persons.entrySet().stream().anyMatch(p -> p.getKey().equals(lastName)))
			throw new IllegalArgumentException("Paramets are null or not unique!");
		
		persons.put(lastName, person);
	}

	@Override
	public Optional<Person> get(String key) {
		if (key == null)
			throw new IllegalArgumentException("Key is null!");
		
		return Optional.ofNullable(persons.get(key));
	}
	
	@Override
	public List<Person> valuesOrdered() {
		final List<Person> values = persons.values().stream().collect(Collectors.toList());
		values.sort(new MyComparator());
		
		return ImmutableList.copyOf(values);
	}
	
	@Override
	public void printContent() {
		persons.forEach((key, value) -> System.out.println("Last name: " + key + ", Person: " + value));
	}
}
