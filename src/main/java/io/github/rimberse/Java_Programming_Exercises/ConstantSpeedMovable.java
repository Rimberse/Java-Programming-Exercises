package io.github.rimberse.Java_Programming_Exercises;

public class ConstantSpeedMovable implements MovableObject {
	private int speed = 60;		// in km/h
	
	// both methods accelerate and brake throw an exception,
	// since this object supposed to move at constant speed

	@Override
	public boolean canAccelerate() {
		return false;
	}

	@Override
	public void accelerate() throws IllegalStateException {
		if (!canAccelerate())
			throw new IllegalStateException("This object can't accelerate!");
	}

	// if an object doesn't move, then there is no point in calculating
	// time it takes to get to the destination at a given speed (because that would simply return an Infinity)
	@Override
	public double getTimeToMove(double distance) throws IllegalStateException {		// in km
		if (speed != 0)
			return distance / speed;												// in hours
		
		throw new IllegalStateException("Object doesn't move");
	}
	
	@Override
	public void brake() {
		if (!canAccelerate())
			throw new IllegalStateException("This object can't brake");
	}
}