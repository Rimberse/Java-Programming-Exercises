package io.github.rimberse.Java_Programming_Exercises.objects_interfaces_generics;

public class SubtractionQuestion implements IntQuestion {
	private int a, b;  // The numbers in the problem.

    public SubtractionQuestion() { // constructor
        a = (int)(Math.random() * 100 + 1);
        b = (int)(Math.random() * 50);
        
        while (b > a) {
        	b = (int)(Math.random() * 50);
        }
    }

	@Override
	public String getQuestion() {
		return "What is " + a + " - " + b + " ?";
	}

	@Override
	public int getCorrectAnswer() {
		return a - b;
	}
}