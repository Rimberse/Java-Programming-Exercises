package io.github.rimberse.Java_Programming_Exercises.objects_interfaces_generics;

import io.github.rimberse.Java_Programming_Exercises.objects_interfaces_generics.IntQuestion;

public class AdditionQuestion implements IntQuestion {
    private int a, b;  // The numbers in the problem.

    public AdditionQuestion() { // constructor
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    @Override
	public String getQuestion() {
        return "What is " + a + " + " + b + " ?";
    }

    @Override
	public int getCorrectAnswer() {
        return a + b;
    }
}