package io.github.rimberse.Java_Programming_Exercises;

/**
 * This class manages triplet of dices
 */
public class TripletOfDice {
	private int firstDie;
	private int secondDie;
	private int thirdDie;
	private int sides;
	
	/**
	 * Constructor accepts as argument number that can appear on the sides of the dice
	 * @param sides - number of sides on a dice
	 */
	public TripletOfDice(int sides) {
		if (sides < 1 || sides > 6)
			throw new IllegalArgumentException("The dice sides can only be number between 1 and 6");
		
		this.sides = sides;
		rollAllDice();
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public int getFirstDie() {
		return firstDie;
	}

	public void setFirstDie(int firstDie) {
		this.firstDie = firstDie;
	}

	public int getSecondDie() {
		return secondDie;
	}

	public void setSecondDie(int secondDie) {
		this.secondDie = secondDie;
	}

	public int getThirdDie() {
		return thirdDie;
	}

	public void setThirdDie(int thirdDie) {
		this.thirdDie = thirdDie;
	}
	
	/**
	 * Rolls one of the dices.
	 * @param dieNumber - determines the die which needs to be rolled
	 */
	public void rollOneDie(int dieNumber) {
		switch (dieNumber) {
		case 1:
			firstDie = (int) (Math.random() * sides) + 1;
			break;
		case 2:
			secondDie = (int) (Math.random() * sides) + 1;
			break;
		case 3:
			thirdDie = (int) (Math.random() * sides) + 1;
			break;
		default:
			throw new IllegalArgumentException("There are only three dices!");
		}
	}

	/**
	 * Rolls all of the dices
	 */
	public void rollAllDice() {
		firstDie = (int) (Math.random() * sides) + 1;
		secondDie = (int) (Math.random() * sides) + 1;
		thirdDie = (int) (Math.random() * sides) + 1;
	}
}