package io.github.rimberse.Java_Programming_Exercises.collections;

import java.util.List;

import com.google.common.collect.Lists;

public class HashTable<K, V> {
	
	private class Entry<Key, Value> {
		private Key key;
		private Value value;
		
		Entry(Key key, Value value) {
			this.key = key;
			this.value = value;
		}
		
		public Key getKey() {
			return this.key;
		}
		
		public Value getValue() {
			return this.value;
		}
	}
	
	private List<Entry<K, V>> list;
	
	public static <K, V> HashTable<K, V> create() {
		final HashTable<K, V> hashTable = new HashTable<>();
		return hashTable;
	}
	
	private HashTable() {
		this.list = Lists.newLinkedList();
	}
	
	public V get(K key) {
//		return list.get(key.hashCode()).getValue();
		
		for (Entry<K, V> entry : list) {
			if (entry.getKey().equals(key))
				return entry.getValue();
		}
		
		return null;
	}
	
	public void put(K key, V value) {
//		for (Entry<K, V> entry : list) {
//			if (entry.getKey().equals(key)) {
//				entry.setValue(value);
//				return;
//			}
//		}
		
		Entry<K, V> entry = new Entry<>(key, value);
		list.add(entry);
	}
	
	public void remove(K key) {
		for (Entry<K, V> entry : list) {
			if (entry.getKey().equals(key)) {
				list.remove(entry);
				break;
			}
		}
	}
	
	public boolean constainsKey(K key) {
		for (Entry<K, V> entry : list) {
			if (entry.getKey().equals(key))
				return true;
		}
		
		return false;
	}
	
	public int size() {
		return list.size();
	}
}
