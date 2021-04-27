package io.github.rimberse.Java_Programming_Exercises;

public class GenericMovable implements MovableObject {
	private int speed = 60;		// in km/h

	@Override
	public boolean canAccelerate() {
		return true;
	}

	@Override
	public void accelerate() {
		speed += 10;
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
		speed -= 10;
	}
}