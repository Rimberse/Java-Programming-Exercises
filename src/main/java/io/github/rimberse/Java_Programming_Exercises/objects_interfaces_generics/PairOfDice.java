package io.github.rimberse.Java_Programming_Exercises.objects_interfaces_generics;

/**
 * Exercise 5.1:
 * Class can be used to generate two dices randomly, assign the value to one of the dices or to get their current value.
 * <p>
 * Printing the instantiated object will result in displaying the value on each of the dices.
 * <p>
 * Also provided a method to count how many times it takes to roll a desired value
 */
public class PairOfDice {
	private int die1;
	private int die2;
	private int rollCount;
	
	public PairOfDice() {
		roll();
	}
	
	public PairOfDice(int die1, int die2) {
		this.die1 = die1;
		this.die2 = die2;
	}
	
	public void roll() {
	    die1 = (int) (Math.random() * 6) + 1;
	    die2 = (int) (Math.random() * 6) + 1;
	    rollCount++;
    }
	
	public void setDie1(int die1) {
		this.die1 = die1;
		checkDiceValues();
	}
	
	public void setDie2(int die2) {
		this.die2 = die2;
		checkDiceValues();
	}
	
	public int getDie1() {
		return die1;
	}
	
	public int getDie2() {
		return die2;
	}
	
	public void setRollCount(int rollCount) {
		this.rollCount = rollCount;
	}
	
	public int getRollCount() {
		return rollCount;
	}

	@Override
	public String toString() {
		return "First die | Second die\n--------- | ----------\n    " + die1 + "     |     " + die2;
	}
	
	public void checkDiceValues() {
		if (die1 < 1 || die1 > 6 || die2 < 1 || die2 >6)
			throw new IllegalArgumentException("Value of a die can only be between 1 and 6");
	}
	
	public int countRollsToGet(int desiredValue) {
		int count = 0;
		
		while (true) {
			if (die1 + die2 == desiredValue)
				return count;
			
			roll();
			count++;
		}
	}
}