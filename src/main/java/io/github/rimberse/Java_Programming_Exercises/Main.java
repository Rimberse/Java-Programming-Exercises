package io.github.rimberse.Java_Programming_Exercises;

import java.io.IOException;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
//		Exercise: Generic pair
		/* Pair<String, Integer> pairSI = new Pair<>();
		pairSI.setContents("Kerim", 20 + (int) (Math.random() * 10));
//		System.out.println(pairSI.getLeft());
//		System.out.println(pairSI.getRight());
		
		double d1 = Math.random() < 0.5d ? 0 : 1;
		double d2 = Math.random() < 0.5d ? 0 : 1;
		Pair<Double, Double> pairDD = new Pair<>(d1, d2);
//		System.out.println(pairDD.getLeft());
//		System.out.println(pairDD.getRight());
		
		show(pairSI);
		show(pairDD);
		
		Pair<Pair<String, Integer>, Pair<Double, Double>> pair = new Pair<>(pairSI, pairDD);
		show(pair);*/
		
//		Pair<Integer, Double> pairNumbers = Pair.withDifferentElements((int) (Math.random() * 10) + 1, Math.random() * 100);
//		System.out.println(pairNumbers);
//		Pair<String, String> pairString = Pair.withSameElements("Lorem ipsum...");
//		System.out.println(pairString);
		
		
//		Exercise: Predicate
		/*Predicate<String> predicateEven = new Predicate<>() {

			@Override
			public boolean test(String string) {
				if (string.length() % 2 == 0)
					return true;
				
				return false;
			}
		};
		
		Predicate<String> predicateOdd = string -> (string.length() % 2 != 0);
		
		System.out.println(predicateEven.test("True"));
		System.out.println(predicateEven.test("False"));
		System.out.println(predicateOdd.test("Truee"));
		System.out.println(predicateOdd.test("Falsee"));*/
		
		
//		Exercise: Car string
		Car car = new Car("Vaz", "2107");
//		If we don't override it's toString method, it calls the Object's default version, which prints it's address in memory
//		System.out.println(car);				// no point in calling it's toString method, its triggered automatically
//		After overriding the default implementation it will return what we defined in it's method body
		System.out.println(car);
		Object car2 = new Car(); 		// the version in Car gets called. The compiler just calls the first implementation it
		System.out.println(car2.toString());	// finds, otherwise it goes up in the hierarchy till it finds the implementation in Object
		
		
//		Exercise: Checked exceptions
		try {
			System.out.println(drawRandomNumber());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static <L, R> void show(Pair<L, R> pair) {
		System.out.println(pair.getLeft().toString());
		System.out.println(pair.getRight().toString());
	}
	
	public static int drawRandomNumber() throws IOException {
		if (Math.random() < 0.5)
			throw new IOException();
	
		return (int) (Math.random() * 11); 
	}
}