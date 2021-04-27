package io.github.rimberse.Java_Programming_Exercises;

public class DiceUser {
	public static void main(String[] args) {
		TripletOfDice triplet = rollOnce();
		
		System.out.println("The die number 1 is a " + triplet.getFirstDie());
		System.out.println("The die number 2 is a " + triplet.getSecondDie());
		System.out.println("The die number 3 is a " + triplet.getThirdDie());
	}
	
	public static TripletOfDice rollOnce() {
		return new TripletOfDice(6);
	}
}