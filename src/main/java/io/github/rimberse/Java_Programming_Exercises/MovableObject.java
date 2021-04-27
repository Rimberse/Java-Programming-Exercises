package io.github.rimberse.Java_Programming_Exercises;

public interface MovableObject {
	
	public boolean canAccelerate();
	public void accelerate();
	public double getTimeToMove(double distance);
	public void brake();
}